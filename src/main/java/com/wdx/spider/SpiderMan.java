package com.wdx.spider;

import org.apache.commons.lang.StringUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @program: myworklab
 * @description: 爬虫实验
 * @author: wdx
 * @create: 2020-06-30 14:39
 **/
public class SpiderMan {
    //要爬取的地址
    public  static  String url="https://baidu.com";
    public  static String filePath="D://img";
    public static  void main(String args[]) throws Exception {
        //链接到目标地址
        Connection connect = Jsoup.connect(url);
        URL url1 = new URL(url);
        //connect.header("cookie","__cfduid=dbceaacf82bfa0eb9a4cbd9a0ac3555891593622523");
         String referer = url1.getProtocol()+"://"+url1.getHost();
        //设置useragent,设置超时时间，并以get请求方式请求服务器Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Mobile Safari/537.36
        //Document document = connect.userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)").timeout(6000).ignoreContentType(true).get();
        Document document = connect.userAgent("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Mobile Safari/537.36").timeout(6000).ignoreContentType(true).header("Referer",referer).get();
        Thread.sleep(1000);
        //获取指定标签的数据,此处，元素的id为content_left
        System.out.println(document);
        Element elementById = document.getElementById("content_left");
        //输出文本数据
        //System.out.println(elementById.text());
        //System.out.println("_____________________");
        //输出html数据
        //System.out.println(elementById.html());
        //根据标签名获取所有图片链接
        Elements imgtag = document.getElementsByTag("img");
        //获取下标为0的图片元素
        Element element = imgtag.get(0);
        //获取下标为0的元素的src属性值
        String src = element.attr("src");
        System.out.println("giao"+src);
        //用来保存图片地址
        List<String> imgurlList = new LinkedList<String>();
        for (int j = 0; j < imgtag.size(); j++) {//遍历图片元素并将图片src的属性值存入imgurlList
            if (StringUtils.isNotEmpty(imgtag.get(j).attr("src"))&&imgtag.get(j).attr("src").startsWith("http")) {
                /**创建了一个固定大小为10的线程池
                ExecutorService executorService = Executors.newFixedThreadPool(10);
                final int i=j;
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(imgtag.get(i).attr("src"));
                        //将图片添加到imgurlList
                        imgurlList.add(imgtag.get(i).attr("src"));
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                });**/
               /** 创建了一个缓存的线程池
               ExecutorService pool = Executors.newCachedThreadPool();
                final int i=j;
                pool.execute(new Thread(){
                    public void run(){
                        System.out.println(imgtag.get(i).attr("src"));
                        //将图片添加到imgurlList
                        imgurlList.add(imgtag.get(i).attr("src"));
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                });*/
               /**创建了一个预定计划线程池，延迟一秒后执行线程任务
               ScheduledExecutorService spool = Executors.newScheduledThreadPool(5);
                final int i=j;
                spool.schedule(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(imgtag.get(i).attr("src"));
                        //将图片添加到imgurlList
                        imgurlList.add(imgtag.get(i).attr("src"));
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                    },1, TimeUnit.SECONDS);*/

                System.out.println(imgtag.get(j).attr("src"));
                //将图片添加到imgurlList
                imgurlList.add(imgtag.get(j).attr("src"));
            }
        }
        for (int i = 0; i < imgurlList.size(); i++) {//将图片保存到本地
            String url = imgurlList.get(i);
            ExecutorService pool = Executors.newFixedThreadPool(10);
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    downloadImages(filePath,url);
                    System.out.println(url);
                }
            });

        }

    }



    /**
     * 下载图片到指定目录
     *
     * @param filePath 要将文件保存起来的路径
     * @param imgUrl   爬取到的图片URL
     */
    public static void downloadImages(String filePath, String imgUrl) {
        // 若指定文件夹没有，则先创建
        File dir = new File(filePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        // 截取图片文件名
        String fileName = imgUrl.substring(imgUrl.lastIndexOf('/') + 1, imgUrl.length());
       // fileName=fileName.replaceAll("\\?","");//windows系统下文件名不可以包含？和%这些字符，所以替换成""
       fileName= fileName.replace("?","");
       fileName=fileName.replaceAll("%","");
        /*if(!fileName.contains(".")){
            fileName=fileName+".jpg";
        }*/
        try {
            // 文件名里面可能有中文或者空格，所以这里要进行处理为UTF-8编码格式解决中文乱码问题。但空格又会被URLEncoder转义为加号
            String urlTail = URLEncoder.encode(fileName, "UTF-8");
            // 因此要将加号转化为UTF-8格式的%20
            imgUrl = imgUrl.substring(0, imgUrl.lastIndexOf('/') + 1) + urlTail.replaceAll("\\+", "\\%20");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 图片保存的路径
        File file = new File(filePath + File.separator + fileName);

        try {
            // 获取图片URL
            URL url = new URL(imgUrl);
            // 获得连接
            URLConnection connection = url.openConnection();
            String referer = url.getProtocol()+"://"+url.getHost();
            connection.setRequestProperty("Referer", referer);
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Mobile Safari/537.36");
            // 设置10秒的相应时间
            connection.setConnectTimeout(10 * 1000);
            // 获得输入流
            InputStream in = connection.getInputStream();
            // 获得输出流
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
            // 构建缓冲区
            byte[] buf = new byte[1024];
            int size;
            // 写入到文件
            while (-1 != (size = in.read(buf))) {
                out.write(buf, 0, size);
            }
            out.close();
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}

