package com.ecomshop.deskplus.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Author: Sheik Syed Ali
 */
@RestController
@RequestMapping("/api/v1/webhook")
public class MailReceiverController {

    private final Logger logger = LoggerFactory.getLogger(MailReceiverController.class);

    @RequestMapping(value = "/mg/receive", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Map<String, Object> mailgunReceiver(@RequestParam Map<String, Object> mailData){

        for (Map.Entry<String,Object> entry : mailData.entrySet()){
            System.out.println("[Sheik-mail-input]Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        return null;
    }
}
