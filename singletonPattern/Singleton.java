package singletonPattern;

import java.util.*;

/**
*   <p>
*       This is simple class to demonstrate Singleton Design Pattern
*   </p>
*
*   @Author: KatlegoM
*   Date: 23/08/2022 14H07
*
 */

 public class Singleton {
    private static Singleton instance = null;
    private static LinkedList<String> instanceID = new LinkedList<>(Arrays.asList( new String[]{"Test", "Test2"}));
    private static boolean firstThread = true;

    // This is to prevent the creation of Singleton Object outside it's scope.
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {

            // Demonstrates that the creation of this object is thread safe.

            if (firstThread) {
                firstThread = false;

                // Delay first thread a bit so that second thread can go on to creating
                // our instance
                Thread.currentThread();
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {}
            }

            synchronized(Singleton.class) {
                    if (instance == null) {
                        // Lazy instantiation, meaning we only create this instance when in demand
                        instance = new Singleton();
                        // instance.instanceID 
                    }
            }
            
        }
        return instance;
    }

    public String getInstanceID() {
        return instanceID.remove(0);
    }
 }
