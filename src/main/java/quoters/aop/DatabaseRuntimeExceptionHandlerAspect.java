package quoters.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import quoters.DatabaseRuntimeException;

@Component
@Aspect
public class DatabaseRuntimeExceptionHandlerAspect {
    @Value("${dbaMailList}")
    private String[] dbaMailingList;

    @Around(value = "execution(* quoters.dao.*.*(..))")
    public void afterThrow(ProceedingJoinPoint pjp) throws Throwable{
        try {
            pjp.proceed();
        } catch (DatabaseRuntimeException ex) {
            for (String mailAddress : dbaMailingList) {
                System.out.println("Email sent to: " + mailAddress + ", the exception message is: " + ex.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
