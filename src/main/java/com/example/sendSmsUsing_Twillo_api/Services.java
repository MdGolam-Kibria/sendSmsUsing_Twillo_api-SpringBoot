package com.example.sendSmsUsing_Twillo_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Services {
    private final SmsSender smsSender;
        /*
        /ekhane @Qualifier dara ekta service arekta sevice er moddhe use kora hoise seta ei annotation dara service name ta bole diyechi
         */
    @Autowired
    public Services(@Qualifier("twilio") TwilioSmsSender twilioSmsSender) {
        this.smsSender = twilioSmsSender;
    }
    public void sendSms(SmsRequest smsRequest){
        smsSender.sendSms(smsRequest);
    }

}
