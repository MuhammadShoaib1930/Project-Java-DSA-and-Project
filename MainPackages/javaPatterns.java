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
    public int  greatestCommonDivisor(int a, int b){
        return 0;
    }
    
}
class ClassTest{
    ClassTest(){
        ProblemsClass obj = new ProblemsClass();
        
    }
    
}