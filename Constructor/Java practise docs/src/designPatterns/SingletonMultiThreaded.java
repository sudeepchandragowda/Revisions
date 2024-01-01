package designPatterns;

public class SingletonMultiThreaded {
    private static SingletonMultiThreaded object;
    private SingletonMultiThreaded() {
    }
    public static SingletonMultiThreaded getObject(){
        if (object == null) {
            synchronized (SingletonMultiThreaded.class) {
                if (object == null) {
                    object = new SingletonMultiThreaded();
                }
            }
        }
        return object;
    }
}
