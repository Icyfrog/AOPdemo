import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("这里是AfterAdvice的afterReturning方法");
    }
}
