package threadingpractice;

public class ThreadingPractice 
{
    public static void main(String[] args) 
    {
        werkClass werkObject_0 = new werkClass("main", 13);
        werkClass werkObject_1 = new werkClass("first", 5);
        werkClass werkObject_2 = new werkClass(10);
        
        Thread instructor_1 = new Thread(werkObject_1);
        Thread instructor_2 = new Thread(werkObject_2);
        
        //Initiate second thread in run() method
        instructor_1.start();
        instructor_2.start();
        werkObject_0.run();
        
        for(int count = 0; count < 10; count++)
        {
            System.out.println("thread 1 = " + count);
        }  
        
        do
        {
            System.out.println("thread 1 is still alive");
        }
        while (instructor_1.isAlive());
        do
        {
            System.out.println("thread 2 is still alive");
        }
        while (instructor_1.isAlive());
        
        System.out.println("final = " +werkObject_1.getResult());
        System.out.println("final = " +werkObject_2.getResult());
    }   
}
