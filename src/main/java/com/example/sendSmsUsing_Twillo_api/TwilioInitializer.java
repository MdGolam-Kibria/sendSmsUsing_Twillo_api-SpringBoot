package com.example.sendSmsUsing_Twillo_api;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {
    private final static Logger logger = LoggerFactory.getLogger(TwilioInitializer.class);
    private final TwilioConfigaration twilioConfigaration;
    @Autowired
    public TwilioInitializer(TwilioConfigaration twilioConfigaration) {
        this.twilioConfigaration = twilioConfigaration;
        Twilio.init(
                 twilioConfigaration.getAccountSid(),
                twilioConfigaration.getAuthToken()
        );
        logger.info("Twilio Initialized... with account sid {}"+twilioConfigaration.getAccountSid());//for get a  log..
    }


}
