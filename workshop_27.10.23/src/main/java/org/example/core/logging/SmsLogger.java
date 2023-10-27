package org.example.core.logging;

public class SmsLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Sms'e loglama yapıldı : " + data);
    }
}
