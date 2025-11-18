public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        char[] prime = new char[n + 1];
        prime[0] = 'F';
        prime[1] = 'F';
        for (int i = 2; i < n; i++) {
            prime[i] = 'T';
        }
        int p = 2;
        while (p * p <= n) { //כל עוד התנאי של הנוסחה מתקיים
            int i = 0;
            while (prime[p] == 'F' && p <= n) { //להכניס את זה אחרי הוויל הראשון
                p++;
            }
            if (p > n) break;
             //בודקת את המכפלה ומשנה עבור כל ערך שכזה ללא נכון
            for (int j = p * p; j <= n; j += p) {
                prime[j] = 'F';
                }
            p++;
            } 
                       
        
        System.out.println("Prime numbers up to " + n +":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 'T') {
                System.out.println(i);
                count++;
            }
        }
        int r = (count * 100) / (n);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + r + "% are primes)");
    }
    
}