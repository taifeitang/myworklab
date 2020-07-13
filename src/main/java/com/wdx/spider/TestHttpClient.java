package com.wdx.spider;

/**
 * @program: myworklab
 * @description: HttpClient测试
 * @author: wdx
 * @create: 2020-07-01 11:35
 **/
import jdk.nashorn.internal.runtime.options.LoggingOption;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class TestHttpClient {
    //声明需要爬取的网址
    static String URL="http://www.baidu.com";
    private final static Logger logger = LoggerFactory.getLogger(TestHttpClient.class);
    //主函数入口
    public static void main(String args[]) throws IOException {
        //建立一个新的请求客户端
        CloseableHttpClient httpClient=HttpClients.createDefault();

        //使用HttpGet的方式请求网址
        HttpGet httpGet = new HttpGet(URL);


        //获取网址的返回结果
        CloseableHttpResponse response=null;
        try {
            response=httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取返回结果中的实体
        HttpEntity entity = response.getEntity();
        System.out.println("实体:"+entity);
        System.out.println("实体变字符串:"+entity.toString());
        System.out.println("实体Content:"+entity.getContent());
        System.out.println("实体ContentToString:"+entity.getContent().toString());
        System.out.println("实体ContentType:"+entity.getContentType());
        String html=EntityUtils.toString(entity,"UTF-8");
        Document document = Jsoup.parse(html);
        System.out.println("doccument:"+document);
        Elements a = document.getElementsByTag("a");
        for (Element i:a) {
            System.out.println(i.text());
            String href = i.attr("href");
            System.out.println("超链接："+href);

        }

    }
}

