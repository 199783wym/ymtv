package com.cdut.ym;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.text.SimpleDateFormat;

public class AspectLogin implements MethodInterceptor{
    ServiceImp serviceImp;

    public ServiceImp getServiceImp() {
        return serviceImp;
    }

    public void setServiceImp(ServiceImp serviceImp) {
        this.serviceImp = serviceImp;
    }


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //检查身份是否能登录

        if(!serviceImp.checkLoin(serviceImp.getUser())){
            System.exit(0);
        }
        Object object=methodInvocation.proceed();

        //登录成功记录到日志
        serviceImp.wrLog();
        return object;
    }
}
