public class a_passing{
  public static void main(String[] args){
        int x[] = {5,6,7,8};
        System.out.println(x[2]);
        Change(x);
        System.out.println(x[2]);
  }

    public static void Change(int[] y){
        y[2] = 10;
    }

    }

// Java does NOT support pass by reference.
// Java is always pass by value.
// But…
// For arrays and objects, the “value” being
// passed is a reference (address-like thing).
// Here x is not the array itself
// So:

// x and y BOTH point to same array
// BUT y is NOT the original variable, it is a copy
// When you call method
// Change(x);

// Java copies that reference:

// x  ----> [5, 6, 7, 8]
//           ↑
//           |
//           y (copy of reference)

// So:

// x and y BOTH point to same array
// BUT y is NOT the original variable, it is a copy
// 👉 Java is pass-by-value
// 👉 For objects/arrays, the value passed is a reference copy
// 👉 So both variables point to same object → changes reflect

// Array = house 🏠
// x = house address on paper
// y = photocopy of same address