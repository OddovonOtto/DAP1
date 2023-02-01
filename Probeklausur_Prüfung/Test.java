public class Test {
    public static void run() {
        All all = new All();
        Most most = new Most();
        Special special = new Special();
        Top x = new Middle();
        Top y = new Bottom();
        Middle z = new Bottom();
        x.m( most );
        x.m( special );
        y.m( all );
        y.m( special );
        z.m( all );
        z.m( most );
        System.out.println(1/2);
        
        System.out.println(1>=2);
    } 
}