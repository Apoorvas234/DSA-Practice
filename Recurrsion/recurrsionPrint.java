public class recurrsionPrint{
    static void printNo(int n){
        //BaseCase
        if(n==0){
            return;
        }
        //Recursive Function
        //System.out.println(n);
        printNo(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        printNo(5);

    }
}