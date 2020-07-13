package com.wdx.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5
 * @author guonj
 */
public class MD5Util {
    public static final String charset_UTF8 = "UTF-8";

    static final int LOOKUPLENGTH = 64;


    /**
     * 按指定编码MD5加密
     * @Description: 按指定编码MD5加密
     * @param originstr
     * @param encoding
     * @return String
     */
    public static String ecodeByMD5(String originstr,String encoding) {
        String result = null;
        // 用来将字节转换成 16 进制表示的字符
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9','a', 'b', 'c', 'd', 'e', 'f' };
        if (originstr != null) {
            try {
                // 返回实现指定摘要算法的MessageDigest 对象
                MessageDigest md = MessageDigest.getInstance("MD5");
                // 使用utf-8编码将originstr字符串编码并保存到source字节数组
                if(encoding==null || encoding.trim().length()==0){
                    encoding="utf-8";
                }
                byte[] source = originstr.getBytes(encoding);
                md.update(source);
                byte[] tmp = md.digest();
                System.out.println("Tmp的长度"+tmp.length);
                char[] str = new char[32];
                for (int i = 0, j = 0; i < 16; i++) {
                    byte b = tmp[i];
                    str[j++] = hexDigits[b >>> 4 & 0xf];
                    str[j++] = hexDigits[b & 0xf];
                }
                result = new String(str);// 结果转换成字符串用于返回
            } catch (NoSuchAlgorithmException e) { // 当请求特定的加密算法而它在该环境中不可用时抛出此异常
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }




    public static void main(String[] args) throws Exception {
        //testEncryptAndSign();
        //testDecryptAndCheck();
        String content ="123456@Asd";
        //加密数据
        String md5Key = ecodeByMD5(content, charset_UTF8);
        System.out.println("ecodeByMD5-run: "+ md5Key);
        System.out.println("ecodeByMD5-run: "+ md5Key.length());

    }
}