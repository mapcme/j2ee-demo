package com.mapc.j2ee.threadpool;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.http.HttpUtil;
import com.sun.deploy.net.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @desc: TODO
 * @author: duchao
 * @date: 2019/12/25 15:50
 */
@Slf4j
//@RestController
public class ThreadPoolController {

    //@GetMapping("/")
    public void test(){

    }


    public static void main(String[] args) {
        //构建一个线程池，正常线程数量为5，最大线程数据为10，等待时间200  
        RestTemplate restTemplate = new RestTemplate();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,20,200, TimeUnit.MINUTES,new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    MerchantApplyVO vo=new MerchantApplyVO();
                    vo.setMerchantName("商家1111111111");
                    vo.setMerchantContactName("晓明");
                    vo.setMerchantContactPhone("12345678900");
                    vo.setAddress("北京");
                    vo.setSubjectType("personal");
                    vo.setIdcardName("卡名称");
                    vo.setIdcardNumber("410121231231251235152");
                    vo.setIdcardFrontImg("http://asdfqqwire.jpg");
                    vo.setIdcardHoldImg("http://asdfqqwire.jpg");
                    vo.setProvinceCode("450000");
                    vo.setProvinceName("河南省");
                    vo.setCityCode("450000");
                    vo.setCityName("郑州市");
                    vo.setCountryCode("450000");
                    vo.setCountryName("中原区");
                    vo.setEmail("124456@qq.com");

                    String result=restTemplate.postForObject("https://test.api.dingdingzn.com/mapp/merchant/apply",vo,String.class);
                    //String result=new RestTemplate().postForObject("http://localhost:9443/mapp/merchant/apply",vo,String.class);
                    log.info("----------{}",result);
                }
            });
        }
        threadPoolExecutor.shutdown();
    }

}
