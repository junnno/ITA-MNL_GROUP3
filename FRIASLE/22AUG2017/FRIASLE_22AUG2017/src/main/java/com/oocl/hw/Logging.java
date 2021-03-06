package com.oocl.hw;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
	InetAddress thisIp;
   /** Following is the definition for a pointcut to select
      *  all the methods available. So advice will be called
      *  for all the methods.
   */
//   @Pointcut("execution(* SpringExampleAop.*.*(..))")
   @Pointcut("execution(* com.oocl.hw.*.*(..))")
   private void selectAll(){}

   /** 
      * This is the method which I would like to execute
      * before a selected method execution.
   */
   @Before("selectAll()")
   public void beforeAdvice(){
      System.out.println("Going to do method.");
   }
   /** 
      * This is the method which I would like to execute
      * after a selected method execution.
   */
   @After("selectAll()")
   public void afterAdvice(){
      System.out.println("method Done.");
   }

   /** 
      * This is the method which I would like to execute
      * when any method returns.
   */
   @AfterReturning(pointcut = "selectAll()", returning = "retVal")
   public void afterReturningAdvice(Object retVal){
      System.out.println("Returning:" + retVal.toString() );
   }

   /**
      * This is the method which I would like to execute
      * if there is an exception raised by any method.
   */
   @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
   public void AfterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("There has been an exception: " + ex.toString());
	}
   
   @After("selectAll()")
   public void afterAdviceTwo() throws UnknownHostException{
      System.out.println("Operation done on: " + new java.util.Date());
      System.out.println("Ip address and host is: " + InetAddress.getLocalHost());
   }
}