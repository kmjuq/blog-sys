package com.kmjuq.blog.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author mengjian.ke@hand-china.com 2020/12/9 06:57
 */
@RestController
public class ServerController {

    @Autowired
    @Qualifier("valueOperationsForStr")
    private ValueOperations<String,String> valueOperationsForStr;

    @RequestMapping("/rest")
    public ResponseEntity<String> restTemplate(){
        return ResponseEntity.ok("rest");
    }

    @RequestMapping("/exception")
    public ResponseEntity<String> exception(){
        throw new RuntimeException("123");
    }

}
