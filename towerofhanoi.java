public class towerofhanoi {
   
    public static void toh(int n, String src, String help, String dest) {
        if(n==1) {
            System.out.println("Transfer of disk " + n + " from " + src + " to " + dest);
            return;
        }
        toh(n-1, src, dest, help);
        System.out.println("Transfer of disk " + n + " from " + src + " to " + dest);
        toh(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n=3;
        toh(n, "S", "H", "D");

    }
}
 //                  TOWER OF HANOI                   time complexity -->   O(2^n)

