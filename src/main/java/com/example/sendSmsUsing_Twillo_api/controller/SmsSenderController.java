package com.example.sendSmsUsing_Twillo_api.controller;

import com.example.sendSmsUsing_Twillo_api.Services;
import com.example.sendSmsUsing_Twillo_api.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class SmsSenderController {
    private final Services services;

    @Autowired
    public SmsSenderController(Services services) {
        this.services = services;
    }

    @PostMapping
    public void smdSms(@Valid @RequestBody SmsRequest smsRequest) {
        services.sendSms(smsRequest);
    }
}
