public class demo{
    public static void main(String[] args) {
        int a = 5;
        int b = 6; 
        int c = 7;

        System.out.println(++a);
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(--c);
        System.out.println(c--);
        System.out.println(++a + ++b + ++c);
        System.out.println(a++ + b++ + c++);
        System.out.println(a-- - b-- - c--);
        System.out.println(--a - --b - --c);


    }
}