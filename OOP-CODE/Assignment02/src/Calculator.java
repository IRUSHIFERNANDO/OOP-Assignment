public class Calculator {
    int result;

    public void Addition(int x,int y){
        result=x+y;
        System.out.println(x+"+"+y +"="+(x+y));
    }
    public void Subtraction(int x,int y){
        result=x-y;
        System.out.println(x+"-"+y +"="+ (x-y));
    }
    public void Multiplication(int x,int y){
        result=x*y;
        System.out.println(x+"*"+y+"=" +(x*y));
    }
    public void Division(int x,int y){
        result=x/y;
        System.out.println(x+"/"+y+"="+ (x/y));
    }
}


