package com.han.facade.base.proxy.config;

import com.han.allcommom.muis.NameValue;
import com.han.allcommom.muis.facade.FacadeI;
import com.han.allcommom.muis.logUtil.LoggUtil;
import com.han.allcommom.threadLocal.SysThreadLocal;
import com.han.facade.base.proxy.config.demo.Facade;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.omg.CORBA.NamedValue;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.IntroductionAdvisor;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Wuj
 * @Description:
 * @DateTime: 2023/8/27 00:41
 **/
@Configuration
@Slf4j
public class InvokeProxyConfig implements ApplicationContextAware {


    @Bean
    public BeanNameAutoProxyCreator beanNameAutoProxyCreator( ) {


        String[] postProcessorNames =  applicationContext.getBeanNamesForType(Facade.class, true, false);
        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//        //设置要创建代理的那些Bean的名字
        beanNameAutoProxyCreator.setBeanNames(postProcessorNames);
//        //设置拦截链名字(这些拦截器是有先后顺序的)
        beanNameAutoProxyCreator.setInterceptorNames("introductionAdvisor");
        return beanNameAutoProxyCreator;
    }




    @Bean
    public Facade facade(){
        return new Facade();
    }


    @Bean
    public MethodInterceptor methodInterceptor() {
        return new MethodInterceptor() {
            @Override
            public Object invoke(MethodInvocation invocation) throws Throwable {
                long startTimeMillis = System.currentTimeMillis();
                Object[] arguments = invocation.getArguments();
                Object retObj = null ;
                try {
                    retObj =  invocation.proceed();
                    return retObj;
                }catch (Throwable ex) {
                   throw ex;
                }finally {
                    long endTimeMillis = System.currentTimeMillis();
                    LoggUtil.warn(log,"invoke-"+invocation.getMethod().getName(),
                            NameValue.builder("system-id", SysThreadLocal.getSysAppId()),
                            NameValue.builder("time",endTimeMillis-startTimeMillis),
                            NameValue.builder("param",arguments),
                            NameValue.builder("retObj",retObj));
                }
            }
        };

    }

    @Bean
    public IntroductionAdvisor introductionAdvisor() {
        return new IntroductionAdvisor() {
            @Override
            public Class<?>[] getInterfaces() {
                return new Class[0];
            }

            @Override
            public Advice getAdvice() {
                return methodInterceptor();
            }

            @Override
            public boolean isPerInstance() {
                return false;
            }

            @Override
            public ClassFilter getClassFilter() {
                return new ClassFilter() {
                    @Override
                    public boolean matches(Class<?> clazz) {
//                        return  clazz.isAssignableFrom(FacadeI.class);
                        return FacadeI.class.isAssignableFrom(clazz);
                    }
                };
            }

            @Override
            public void validateInterfaces() throws IllegalArgumentException {

            }
        };
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(InvokeProxyConfig.class);
        Facade facade =  (Facade)applicationContext.getBean("facade");
        facade.say("12");

    }

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext =  applicationContext;
    }
}
