public class Singleton{
    public static int count=0;
    private static Singleton unique_instance=new Singleton();
    private Singleton(){
        count++;
    }
    public static Singleton get_instance()
    {
        return unique_instance;
    }
}