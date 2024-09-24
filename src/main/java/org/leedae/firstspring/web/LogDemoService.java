package org.leedae.firstspring.web;


import lombok.RequiredArgsConstructor;
import org.leedae.firstspring.common.MyLogger;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final ObjectProvider<MyLogger> myLoggeProvider;


    public void logic(String id) {
        MyLogger myLogger = myLoggeProvider.getObject();
        myLogger.log("service id = "+ id);
    }
}
