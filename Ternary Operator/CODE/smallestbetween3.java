public class smallestbetween3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;   
        int c = 20;
        
        int result = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("The smallest between give numbers in : " + result);
    }
    
}
