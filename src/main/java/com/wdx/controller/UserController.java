package com.wdx.controller;


import com.wdx.entity.SubmitInfo;
import com.wdx.entity.User;
import com.wdx.mapper.RegisterMapper;
import net.sf.json.JSONObject;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wdx
 * @since 2020-06-17
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    RegisterMapper registerMapper;
   @RequestMapping("unLock")
    public boolean unLock() {
        return true;
    }
    @RequestMapping("/showUser")
    public User get(@RequestBody User user){

       return user;

    }


    @RequestMapping("/submit")
    public JSONObject get(HttpServletRequest request){
//        String orderNo =request.getParameter("orderNo");
//        String hisOrderNum=request.getParameter("hisOrderNum");
//        String hisAsRowid =request.getParameter("hisAsRowid");
//        String VisitTime=request.getParameter("VisitTime");
//        String patientId=request.getParameter("patientId");
//        String userId=request.getParameter("userId");
        String orderNo ="00744006475N";
        String hisOrderNum="1212121";
        String hisAsRowid ="12231";
        String VisitTime="2020-06-20";
        String patientId="8779204";
        String userId="53c2a4c6-2e28-4b5a-a96a-2377e9268e51";
        SubmitInfo submitInfo=registerMapper.getSubmitInfo(patientId,userId);
        if(!(submitInfo==null)){
            System.out.println(submitInfo.toString());
        }
        int i=registerMapper.addSubmitInfo(submitInfo,orderNo,hisOrderNum,hisAsRowid,VisitTime);
        System.out.println("addSubmitInfo:"+i);
        String s=registerMapper.isReAdd(orderNo);
        System.out.println("isReAdd:"+s);
       // int j=registerMapper.updateSubmit("wqeq2121","1232","1231");
        //registerMapper.updateSubmitFail("1231");
        //System.out.println("updateSubmit:"+j);
        return new JSONObject();

    }
}
