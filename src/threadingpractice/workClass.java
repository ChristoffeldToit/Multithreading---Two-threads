package threadingpractice;

class werkClass implements Runnable 
{
    private int num1;
    private int result;
    private String name = "default";

    //This is our first thread//
    werkClass(int input) {
        num1 = input;
    }

    werkClass(String name, int input) 
    {
        this.name = name;
        num1 = input;
    }

    public int getGetal_1() 
    {
        return num1;
    }

    public int getResult() 
    {
        return result;
    }

    @Override
    public void run() 
    {
        result = 0;
        for(int count = 0; count < num1; count++){
            result = result + count;
            System.out.println(name + "thread 0 = " 
                            + count + " result = " + result);
        }
    }
    
}
