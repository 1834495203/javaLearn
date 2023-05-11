package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author GLaDOS
 * @date 2023/5/11 10:32
 */

@FeignClient("http://v.juhe.cn/joke/content/list.php")
public interface TestApi {

}
