package com.woda.run.Service;

import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.spring.SpringProcessEngineConfiguration;

public class TestActivitService {
    ProcessEngineConfiguration ss = new SpringProcessEngineConfiguration();

    public void setProcessEngineConfiguration(){
        ss.setJdbcDriver("");
        ss.setJdbcUrl("");
        ss.setJdbcUsername("");
        ss.setJdbcPassword("");
    }

}
