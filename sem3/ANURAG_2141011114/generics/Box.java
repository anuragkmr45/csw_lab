package generics;

public class Box<T> {
    // where T describes the Type of the object use
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(String string){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + string.getClass().getName());
}

public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
       integerBox.set(new Integer(15));
        integerBox.inspect("some text"); 
}
}
