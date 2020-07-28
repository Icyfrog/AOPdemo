import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CompareInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object result = null;
        String stu_name = methodInvocation.getArguments()[0].toString();
        if (stu_name.equals("test1")) {
            result = methodInvocation.proceed();
        }
        else {
            System.out.println("这个不是test1,没有进入到proceed函数里面!");
        }
        return result;
    }
}
