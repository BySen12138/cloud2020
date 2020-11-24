package com.bysen.springcloud.lb;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyLB
 * @Author Bysen
 * @Date 2020/10/12 20:44
 * @Description TODO
 * @Version 1.0
 **/
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int curent;
        int next;
        do{
            curent = this.atomicInteger.get();
            next = curent>=Integer.MAX_VALUE?0:curent+1;
        }while (!this.atomicInteger.compareAndSet(curent,next));
        System.out.println("=======================next: "+next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement()% serviceInstances.size();
        return serviceInstances.get(index);
    }
}
