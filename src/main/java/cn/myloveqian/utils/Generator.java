/*
 * Copyright ( c ) 2016 Heren Tianjin Corporation. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Heren Tianjin
 * Corporation ("Confidential Information").  You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with Heren Tianjin Corporation or a
 * Heren Tianjin authorized reseller (the "License Agreement").
 */

package cn.myloveqian.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by luoxiaoming on 15-8-19.
 */
public class Generator {
    public static String generatorNoticeId() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }

    public static String generatorId() {
        String id = UUID.randomUUID().toString().replace("-", "") + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
                + random(2);
        return id;
    }

    public static String random(int n) {
        if (n < 1 || n > 10) {
            throw new IllegalArgumentException("cannot random " + n + " bit number");
        }
        Random ran = new Random();
        if (n == 1) {
            return String.valueOf(ran.nextInt(10));
        }
        int bitField = 0;
        char[] chs = new char[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                int k = ran.nextInt(10);
                if ((bitField & (1 << k)) == 0) {
                    bitField |= 1 << k;
                    chs[i] = (char) (k + '0');
                    break;
                }
            }
        }
        return new String(chs);
    }

}
