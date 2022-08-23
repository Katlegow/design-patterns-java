package singletonPattern;

/**
*   <p>
*       This is simple class to test Singleton Design Pattern using threads
*   </p>
*
*   @Author: KatlegoM
*   Date: 23/08/2022 14H07
*
 */

 public class SingletonThreadTest implements Runnable {

    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println("Thread: " + System.identityHashCode(instance)); 
        System.out.println("Thread InstanceId: " + instance.getInstanceID());
    }
 }
