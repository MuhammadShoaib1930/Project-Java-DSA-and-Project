package MainPackages;

public class javaPatterns {

    public void rectangle(int n){
        for(int i = 0; i< n; i++){
            for(int j = 0; j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void hollowRectangle(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n;j++){
                if(i==0 || i==n-1|| j==0||j==n-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public void halfPyramid(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0; j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void invertedHalfPyramid(int n){
        for(int i = 0; i<n;i++){
            for(int j = n;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void invertedHalfPyramidRotatedBy180Deg(int n){
        for(int i = 0; i<n;i++){
            for(int j = n-1; j>i;j--){
                System.out.print("   ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public void halfPyramidWithNumbers(int n){
        for(int i = 1; i<n;i++){
            for(int j = 1; j<i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    public void invertedHalfPyramidWithNumbers(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    public void floydTriangle(int n){
        int temp = 1;
        for(int i = 1; i<n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" "+(temp++)+" ");
            }
            System.out.println();
        }
    }
    public void triangle0And1(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" "+((i+j+1)%2)+" ");
            }
            System.out.println();
        }
    }
}
class AdvancedPattern{
    public void butterfly(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(" * ");
            }
            for(int k = 1; k<=n-i;k++){
                System.out.print("      ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" * ");
            }
            for(int j = 1;j<=i*2;j++){
                System.out.print("   ");
            }
            for(int j = 1;j<=n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void solidRhombus(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j= 1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public void numberPyramid(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("  "+i+" ");
            }
            System.out.println();
        }
    }
    public void palindromic(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(" "+(i-j+1)+" ");
            }
            for(int j = 2; j<=i;j++){
                System.out.print(" "+(j)+" ");
            }
            System.out.println();

        }
    }
    public void diamond(int n){
        for(int i= 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j = 1;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i= n-1;i>=1;i--){
            for(int j = 1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j = 1;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
class Searching{
    public int binarySearch(int[] arr, int left , int right,int key){
        int mid = (left+right)/2;
        while (left < right) {
            if(arr[mid]<key){
                left = mid ;
            }else if(arr[mid] > key){
                right = mid;
            }else{
                return mid;
            }
            mid = (left + right)/2;
        }
        return -1;
    }
}
class ProblemsClass{
    // Find the factorial of a number.
    public long factorial(int n){
        if(n==0 || n==1) return 1;
        int solution = 1;
        for(int i = 1; i<=n;i++){
            solution*=i;
        }
        return solution;
    }
    //Write a function that calculates the Greatest Common Divisor of 2 numbers.
    public long gcd(long a, long b){
        do {
            if(a>b){
                b = b^a;
                a = b^a;
                b= b^a;
            }
            b = b%a;
        }while(a>0 && b>0);
        return (a>b)?a:b;
    }
}
class Sorting{
    public void bubbleSort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = 1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
    public void selectionSort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int smallValue = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[smallValue]>arr[j]){
                    smallValue = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallValue];
            arr[smallValue] = temp;
        }
    }
    public void insertionSort(int[] arr){
        for(int i  = 0; i<arr.length-1; i++){
            int j = i+1;
            while (j > 0 && arr[j]<arr[j-1]) {
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--; 
            }
        }
    }
}