public class Main {
    public static void main(String[] args) {
        ReverseString string = new ReverseString();
        String str = "Hi my name is Diana";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + string.reverse(str));
        System.out.println("Reversed String Method 2: " + string.reverse2(str));
    }
}