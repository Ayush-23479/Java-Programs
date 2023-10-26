public class array_ps {
    public static void main(String[] args) {

        //Problem 1
//        float [] marks = {23.434f,34.2f, 42.0f};
//        float sum=0;
//        for (float e:marks
//             ) {
//            sum=sum+ e;
//
//        }
//        System.out.println("The value of sum is " + sum);

        //Problem2
//        float [] marks = {23.434f,34.2f, 42.0f};
//        float num =23.434f;
//        boolean isInArray = false;
//        for (float e:marks
//             ) {
//            if (num == e) {
//                isInArray = true;
//                break;
//            }
//
//            }
//        if (isInArray ) {
//            System.out.println("The value is present in the array");
//        }
//        else {
//            System.out.println("The value is not present in the array");
//        }

        //Problem 3
//        float [] marks = {23.434f,34.2f, 42.0f};
//        float sum=0;
//        for (float e:marks
//        ) {
//            sum=sum+ e;
//
//        }
//        System.out.println("The value of average marks is " + sum/ marks.length);


        //Problem 4
//        int [][] mat1={{1,1,1},{1,1,1}};
//        int [][] mat2={{2,2,2},{2,2,2}};
//        int [][] result={{0,0,0},{0,0,0}};
//
//
//        for (int i = 0; i < mat1.length; i++) {//row number
//            for (int j = 0; j <mat1[i].length ; j++) {//column number
//                System.out.println(result[i][j]);
//                result[i][j]= mat1[i][j]+ mat2[i][j];
//
//            }
//        }
//        //Printing the elements of a 2-D Array
//        for (int i = 0; i < mat1.length; i++) {//row number
//            for (int j = 0; j < mat2.length; j++) {//column number
//                System.out.println(result[i][j]+ " ");
//                result[i][j]= mat1[i][j]+ mat2[i][j];
//            }
//
//        }

        //Problem 5
//        int [] arr= {1,2,3,4,5};
//        int l = arr.length;
//        int n =Math.floorDiv(1,2);
//        int temp;
//
//        for (int i = 0; i < n; i++) {
//            temp =arr[i];
//            arr[i]= arr[l-i-1];
//            arr[l-i-1]= temp;
//        }
//        for (int e:arr
//             ) {
//            System.out.println(e + " ");
//        }

//        //Problem 6
//        int [] arr= {2,423,242,54,3,29};
//        int max =0;
//        for (int e:arr
//             ) {
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println("The maximum value of intger is  " + max);

        //Problem 7
        boolean isSorted= true;
        int [] arr= {2,2,23,2424,43,3,3};
        for (int i = 0; i < arr.length-1; i++) {
          if (arr[i]>arr[i+1]){
              isSorted = false;
              break;
          }
        }
        if (isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }
   }
}
