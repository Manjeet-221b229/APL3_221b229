public class Singleton{
    public static int count=0;
    private static Singleton unique_instance;
    private Singleton(){
        count++;
    }
    public static Singleton get_instance()
    {
        if(unique_instance==null)
        {
            unique_instance=new Singleton();
        }
        return unique_instance;
    }
}