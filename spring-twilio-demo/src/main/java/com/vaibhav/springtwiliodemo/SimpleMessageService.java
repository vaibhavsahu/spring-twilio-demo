package com.vaibhav.springtwiliodemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.twilio.Twilio;
import org.springframework.util.MultiValueMap;

@Service
public class SimpleMessageService {
    @Value("${app.twilio.account.sid}")
    private String ACCOUNT_SID;

    @Value("${app.twilio.account.auth-token}")
    private String AUTH_TOKEN;

    @Value("${app.twilio.account.phone-number}")
    private String FROM_NUMBER;

    public void send(SimpleMessage sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
                .create();
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

    }

    public void receive(MultiValueMap<String, String> smscallback) {
    }
}
