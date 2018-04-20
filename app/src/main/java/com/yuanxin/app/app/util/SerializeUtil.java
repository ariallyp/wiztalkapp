/*
 * Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.
 *
 * All rights reserved.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yuanxin.app.app.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.yuanxin.framework.exception.ServiceUncheckedException;

/**
 * 序列化工具。数据转换为redis识别的数据。
 */
public class SerializeUtil {

    /**
     * 将对象序列化为字节数组
     * 
     * @param object
     *            需要进行序列化的对象
     * @return byte[] 字节数组
     */
    public static byte[] serialize(Object object) {

        ObjectOutputStream oos = null;
        ByteArrayOutputStream baos = null;
        try {
            // 序列化
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            byte[] bytes = baos.toByteArray();
            return bytes;
        } catch (Exception e) {
            throw new ServiceUncheckedException("序列化错误", e);
        }
    }

    /**
     * 将字节数组反序列化为对象
     * 
     * @param bytes
     *            [] 需要反序列化的字节数组
     * @return Object 反序列化后的对象
     */
    public static Object unserialize(byte[] bytes) {
        if (bytes.equals(null)) {
            throw new NullPointerException();
        }
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            // 反序列化
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            throw new ServiceUncheckedException("反序列化错误", e);
        } finally {
            try {
                if (null != bais) {
                    bais.close();
                }
                if (null != ois) {
                    ois.close();
                }
            } catch (IOException e) {
                //不需要处理了
            }
        }
    }
}
