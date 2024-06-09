package com.uber.email_service.application;

import com.uber.email_service.adapters.EmailSenderGateway;
import com.uber.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private com.uber.email_service.adapters.EmailSenderGateway EmailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.EmailSenderGateway.sendEmail(to, subject, body);

    }
}
