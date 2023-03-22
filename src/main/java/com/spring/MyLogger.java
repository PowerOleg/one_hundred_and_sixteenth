package com.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyLogger {
//    @Before(value = "execution(public void getMessage())")            //тожесамое что ниже
//    @Before("logginPoinCup()")             //это pointCut - тут прописывается куда вставлять //* * - значит с любым типом доступа и возвращает что угодно



    @Before(value = "execution(* * .getMessage(..))")             //это pointCut - тут прописывается куда вставлять //* * - значит с любым типом доступа и возвращает что угодно
    public void logBefore(JoinPoint joinPoint) {
    System.out.println("This is my logger.log()");
    System.out.println(joinPoint.getSignature()); //это чтобы был доступ к содержимому окружения метода куда вставляем
                                                    //    и к примеру щас это возвращает имя метода
}



@AfterReturning(value="execution(public String getName())", returning = "retVal")
    public void logAfter(Object retVal) {
    System.out.println("----------------------");
    System.out.println(retVal);
    System.out.println("----------------------");
}
}










//    @Pointcut(value = "execution(* * .getMessage(..))")
//    public void logginPoinCup() {                           //метод нужен для передачи PointCut в @Before
//                                                            // не понятно почему метод ничего не делает
//        System.out.println("logginPoinCup");
//    }