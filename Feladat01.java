public class Feladat01{
    public int feladat01(String[] szinek){
        int keverekek = 0;
        int n = szinek.length;
        for (int i = 2; i <= n; i++) {
            keverekek = keverekek + factorial(n)/(factorial(i)*factorial(n-i));
        }
        return keverekek;
    }
    public int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}