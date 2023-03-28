package kuch;
public abstract class Animals {
    public void PrintInfo() {
        System.out.println(GetSound());
    }

    protected abstract String GetSound();
    public static void main(String args[]){  
        Animals obj;
        
       }  
}