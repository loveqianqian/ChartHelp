package cn.myloveqian.utils;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>ProjectName:ChartHelp</p>
 * <p>Description:</p>
 *
 * @author:diaozhiwei
 * @data:2016/8/14
 */
public class SpiderUtils {

    private String companyUrl;

    private String downloadUrl;

    public SpiderUtils(String companyUrl, String downloadUrl) {
        this.companyUrl = companyUrl;
        this.downloadUrl = downloadUrl;
    }

    public String getPageContext(@NotNull String urlPath, @NotNull String... params) throws IOException {
        String paramsUrl = null;
        String realUrlPath = null;
        if (params.length > 0) {
            for (String param : params) {
                paramsUrl += param + "&";
            }
            assert paramsUrl != null;
            realUrlPath = companyUrl + urlPath + "?" + paramsUrl.substring(0, paramsUrl.length() - 1);
        } else {
            realUrlPath = companyUrl + urlPath;
        }
        URL url = new URL(realUrlPath);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("accept", "*/*");
        con.setRequestProperty("connection", "Keep-Alive");
        con.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
        con.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line;
        String result = "";
        while ((line = reader.readLine()) != null) {
            result += line;
        }
        return result;
    }

    public Set<String> getNextUrlPath(@NotNull String resources, @NotNull String patternStr, @Nullable
    String... replaceStr) {
        Pattern p = Pattern.compile(patternStr);
        Pattern pattern = Pattern.compile("<span title=\"\\S+?\" class=\"collection-name\">\\S+?</span>");
        Matcher m = p.matcher(resources);
        Matcher matcher = pattern.matcher(resources);
        while (matcher.find()) {
            String group = matcher.group();
            int startOf = group.indexOf(">");
            int endOf = group.indexOf("</");
            String replace = group.substring(startOf + 1, endOf);
            createFile(replace);
        }
        Set<String> list = new HashSet<>();
        while (m.find()) {
            if (replaceStr != null && replaceStr.length > 0 && !replaceStr[0].equalsIgnoreCase("")) {
                if (replaceStr.length == 1) {
                    list.add(m.group().replace(replaceStr[0], ""));
                } else {
                    list.add(m.group().replace(replaceStr[0], "").replace(replaceStr[1], ""));
                }
            } else {
                list.add(m.group());
            }
        }
        return list;
    }

    public List<String> getFilenameToCreate(@NotNull String resources) {
        List<String> nameList = new ArrayList<>();
        Pattern pattern = Pattern.compile("<span title=\"\\S+?\" class=\"collection-name\">\\S+?</span>");
        Matcher matcher = pattern.matcher(resources);
        while (matcher.find()) {
            String group = matcher.group();
            int startOf = group.indexOf(">");
            int endOf = group.indexOf("</");
            String replace = group.substring(startOf + 1, endOf);
            nameList.add(replace);
        }
        return nameList;
    }

    public void createFile(String fileName) {
        String str = "E:/myTest/";
        File file = new File(str + fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public Set<String> getDownloadUrl(@NotNull String resources, @NotNull String patternStr) {
        Pattern p = Pattern.compile(patternStr);
        Matcher m = p.matcher(resources);
        Set<String> list = new HashSet<>();
        while (m.find()) {
            list.add(String.format(downloadUrl, m.group().replace("<li class=\"", "").replace("\">", "")
                    .replace("_", "-")));
        }
        return list;
    }

    public void httpDownload(String httpUrl, String saveFile) {
        int read;
        InputStream inStream = null;
        FileOutputStream fs = null;
        try {
            URL url = new URL(httpUrl);
            URLConnection conn = url.openConnection();
            inStream = conn.getInputStream();
            fs = new FileOutputStream(saveFile);
            byte[] buffer = new byte[1204];
            while ((read = inStream.read(buffer)) != -1) {
                fs.write(buffer, 0, read);
            }
            fs.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String str = "E:/myTest/";
        SpiderUtils utils = new SpiderUtils("http://www.iconfont.cn", "http://www.iconfont" +
                ".cn/uploads/fonts/%s-.eps?color=272636&size=128");
        for (int i = 0; i < 35; i++) {
            String page = utils.getPageContext("/collections", "personal=1", "page=" + i);
            Set<String> nextUrlPath = utils.getNextUrlPath(page,
                    "<a href=\"/collections/show/\\S{0,6}\">", "<a href=\"", "\">");
            List<String> filenameToCreate = utils.getFilenameToCreate(page);
            int num = 0;
            for (String sub : nextUrlPath) {
                String numName = filenameToCreate.get(num);
                String subPage = utils.getPageContext(sub);
                Set<String> resultUrl = utils.getDownloadUrl(subPage, "<li class=\"font_\\S{0,8}\">");
                for (String result : resultUrl) {
                    utils.httpDownload(result, str + numName + "/" + numName + "_" + num + ".eps");
                }
                num++;
            }
        }
    }

}
