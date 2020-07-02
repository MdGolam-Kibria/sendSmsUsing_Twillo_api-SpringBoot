package com.example.sendSmsUsing_Twillo_api;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("twilio")
public class TwilioSmsSender implements SmsSender {
    private final Logger logger = LoggerFactory.getLogger(TwilioSmsSender.class);
    private final TwilioConfigaration twilioConfigaration;

    public TwilioSmsSender(TwilioConfigaration twilioConfigaration) {
        this.twilioConfigaration = twilioConfigaration;
    }

    @Override
    public void sendSms(SmsRequest smsRequest) {
        //now we need to have a way to send sms
        if (isPhoneNumberValid(smsRequest.getPhoneNumber())){
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfigaration.getTrialNumber());
            String message = smsRequest.getMessage();

            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            logger.info("Send Sms {}"+smsRequest);
        }else {
            throw new IllegalArgumentException(
                    "Phone number [" + smsRequest.getPhoneNumber() + "] is not a valid number");
        }
    }

    private boolean isPhoneNumberValid(String phoneNumber) {//for check my phone number is valid or not

        return true;
    }
}
