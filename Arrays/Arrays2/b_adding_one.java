import java.util.*;

class solution {
    public static ArrayList<Integer> ans(ArrayList<Integer> arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;

        for (int i = arr.size() - 1; i >= 0; i--) {

            if (arr.get(i) + carry <= 9) {
                ans.add(arr.get(i) + carry);
                carry = 0;
            } 
            else {
                ans.add(0);
                carry = 1;
            }
        }

        if (carry == 1) {
            ans.add(1);
        }

        Collections.reverse(ans);

        return ans;
    }
}

public class b_adding_one {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(9);

        ArrayList<Integer> result = solution.ans(arr);

        for (int element : result) {
            System.out.print(element + " ");
        }
    }
}