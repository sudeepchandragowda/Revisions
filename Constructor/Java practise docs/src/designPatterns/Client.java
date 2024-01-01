package designPatterns;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
        Singleton s5 = Singleton.getInstance();

        SingletonMultiThreaded sm1 = SingletonMultiThreaded.getObject();
        SingletonMultiThreaded sm2 = SingletonMultiThreaded.getObject();
        SingletonMultiThreaded sm3 = SingletonMultiThreaded.getObject();
        SingletonMultiThreaded sm4 = SingletonMultiThreaded.getObject();


        s1.makeConnection();
        s1.makeConnection();
        s2.makeConnection();
        s1.makeConnection();
        s1.makeConnection();
        s5.makeConnection();
        s4.makeConnection();
    }
}
