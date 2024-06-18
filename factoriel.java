public class factoriel {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factoriel(n));
    }
    public static int factoriel(int n) {
    if(n<=1){
        return 1;
    }
    else {
        return n * factoriel(n-1);
    }
    }
}


