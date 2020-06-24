package com.wdx;

import com.wdx.entity.Bs;
import com.wdx.entity.Stock;
import com.wdx.entity.User;
import com.wdx.mapper.StockMapper;
import com.wdx.mapper.UserCodeMapper;
import com.wdx.mapper.UserMapper;
import com.wdx.service.UserService;
import net.sf.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MyworklabApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StockMapper stockMapper;
    @Autowired
    private  UserCodeMapper userCodeMapper;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        int i=stockMapper.updateStock("88.88","1");
        System.out.println("affected row:"+i);
        Stock stock = new Stock();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateformat.parse("2016-6-19");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println(dateformat.format(date));
        stock.setTime(date);
        stock.setBoardType("科创板");
        stock.setCode("7121912");
        stock.setName("恒生电子");
        stock.setPrice(new BigDecimal("2012.12"));
        stock.setStartPrice(new BigDecimal("20.21"));
        int j=stockMapper.saveStock(stock);
        System.out.println(j);


        /**List<Stock> list=stockMapper.getList();
        for (Stock stock : list) {
            System.out.println(stock);
        }
        Map m=stockMapper.getById(1L);
        Map map=stockMapper.getId(4L);
        Object price = m.get("price");
        price.toString();
       System.out.println( "我是price："+new BigDecimal(price.toString()));
        System.out.println(m);
        System.out.println(map);
        Bs bs=stockMapper.get(1L);
        System.out.println(bs);*/
    }

    @Test
    void TestUser() {
        stockMapper.selectById(1);
        User user=userMapper.get(1L);
        //User user1=userMapper.selectById(2);
        //Stock stock=null;
        ////JSONObject obj=new JSONObject();
        System.out.println("wdx"+user.getCreateTime());
        //System.out.println("lff:"+user1.getCreateTime());
        System.out.println("我是json："+user);
    }
    @Test
    void TestUserCode() {
        //User user=userMapper.get(1L);
        User user=userMapper.getByName("wdx");
        System.out.println(user);
        //userCodeMapper.addUserCode(user,"213131");
        boolean flag=true;
        JSONObject object=new JSONObject();
        object.put("flag",flag);
        object.put("flag2","true");
        System.out.println(object.get("flag"));
        System.out.println(object.get("flag2"));
    }
    @Test
    void TestJson() {
        boolean flag=true;
        JSONObject object=new JSONObject();
        object.put("flag",flag);
        object.put("flag2","true");
        object=userService.getJ(object);
        System.out.println(object.get("flag2"));
        System.out.println(object.get("flag"));
        System.out.println(object.get("name"));
    }
    @Test
    void Test() {

        JSONObject object=new JSONObject();
        object.put("flag2","true");
        JSONObject object1=new JSONObject();
        object1=object;
        //object=userService.getJ(object);
        System.out.println(object1.get("flag2"));

    }


}
