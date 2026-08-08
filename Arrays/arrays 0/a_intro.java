class a_intro{
    public static void main(String[] args){
        int[] arr = {5,6,8,9,10};


        //accessing
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(" ");


        //updating
        arr[2] =20;
        System.out.println(arr[2]);
        System.out.println(" ");

        //printing all the elements at once.
        for(int i =0;i<=4;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println(" ");
        System.out.println(" ");

        //array length
        System.out.print(arr.length);

    }
}