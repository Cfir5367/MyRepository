public class Main{
    public static void main(String[] args){
    int n =700;
    long[] arr = new long[n+1];
    }
    //fibonachi
    //1 1 2 3 5 8 13 21 34 55 89 ....
    public static int fibNotGood(int n){//פונקציה שמוצאת מספר במיקום מסויים,אך יש בה בעיה כי אם נחפש למשל מיקום 700 המחשב יקרוס
        if(n <= 2)
            return 1;
        return fibNotGood(n-1) + fibNotGood(n-2);   
    }
    public static long fib(int n , long[] arr){
        if(n <= 2)
            return 1;
        long result;
        if(arr[n] == 0){//it means i have yet computed this n problem
            result = fib(n-1 ,arr) + fib(n-2 ,arr);
            arr[n] = result;
        }else{//i have already solved this problem before
        result = arr[n];
    }
        return result;
    }
    public static long fibB(int n){
        long[] arr = new long[n];
        arr[0] = 1;
        if(n >= 2)
            arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];   
        }
        return arr[n - 1];
    }
    public static long fibC(int n){
        long a =1;
        long b = 1;
        long c = a + b;
        for (int i = 2; i < n; i++){
            a = c;
            c = b + c;
            b = a;
        }
        return b;
    }

    public static boolean unitTesting(){//דוגמה לבדיקת יחידה
        if(fib(7) != 13) return false;
        if(fib(8) != 21) return false;
       
        return true;
    }
}