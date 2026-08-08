//arraylist is the dynamic array .arrays are fixed size.
//  To solve this problem we use arraylist.

import java.util.*;
public class a_arraylist{
public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(23);
    arr.add(27);
    arr.add(7);
    arr.add(4);
    arr.add(12);

    //To Access
    System.out.println(arr.get(2));

    //To Update
    arr.set(3,50);
    System.out.println(arr.get(3));
    
    //method 1 to print arraylist.
    System.out.println(arr); //not traversing the array in this way

    //method 2 to print arraylist.
    int n = arr.size();
    for(int i=0;i<n;i++){
        System.out.print(arr.get(i) + " ");
    }

    System.out.println(" ");

    //method 3 to print arraylist.
    for(int ele : arr){
        System.out.print(ele+" ");
        }

    //current : 23 27 7 50 12
    arr.add(78); //23 27 7 50 12 78       added in the last.
    arr.add(1,100); // 23 100 27 7 50 12 78     to add at particular index give index no 
    // and add indexing will change but not good optimize thing.not used often during coding.

    //to remove
    arr.remove(arr.size()-1);   //to remove last index

    //to reverse
    Collections.reverse(arr);

    

}
}