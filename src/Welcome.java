public class Welcome {
    int n1;
    int n2;
    public Welcome(int n1,int n2)
    {
        System.out.println("am from constructor");
        this.n1=n1;
        this.n2=n2;
    }
    public void add()
    {
        System.out.println("am from method");
        int result=n1+n2;
        System.out.println(result);
    }
}
