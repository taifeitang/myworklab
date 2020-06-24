package com.wdx.mapper;


import com.wdx.entity.SubmitInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/*
挂号模块的Mapper
 */
@Repository
public interface RegisterMapper {
    /**
    * @Description: 挂号失败后更新挂号信息表的挂号状态为 0 表示挂号失败
    * @Param: [registId, orderId, paymentFlowId]
    * @return: int
    * @Author: wdx
    * @Date: 2020/6/16
    */
    int updateSubmitFail(String registId);
    /**
    * @Description:获取插入挂号信息表的外键id 一共5个
    * @Param: []
    * @return: SubmitInfo
    * @Author: wdx
    * @Date: 2020/6/16
    */
    SubmitInfo getSubmitInfo(@Param("patientId") String patientId, @Param("userId") String userId);

     /**
     * @Description: 挂号成功后，更新挂号信息表
     * @Param: [RegisterNo, JZNo, regist_id, order_id, payment_flow_id]
     * @return: int
     * @Author: wdx
     * @Date: 2020/6/16
     */
    int updateSubmit(String RegisterNo, String JZNo, String registId);
    /**
    * @Description: 初始化时往挂号信息表插入数据
    * @Param: [submitInfo]
    * @return: int
    * @Author: wdx
    * @Date: 2020/6/17
    */
    int addSubmitInfo(@Param("submitInfo") SubmitInfo submitInfo,
                      @Param("orderNo") String orderNo, @Param("hisOrderNum") String hisOrderNum,
                      @Param("hisAsRowid") String hisAsRowid, @Param("VisitTime") String VisitTime);
    /**
    * @Description: 判断是否是定时器二次写入 D
    * @Param: [orderId]
    * @return: java.lang.String regist_id
    * @Author: wdx
    * @Date: 2020/6/17
    */
    String isReAdd(String orderId);

    int lockPayment(String paymentFlowId);

}
