import java.util.*;
public class Create{
    public static void main(String[] args) {
        LinkedList<Integer> Value = new LinkedList<>();
        Value.add(5);
        Value.add(4);
        Value.add(3);
        Value.add(1);
         System.out.println(Value);
        for(int i=0;i<Value.size();i++){
            System.out.println(Value.get(i));
           
        }
    }
}