package javamemorymanagement;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.setCharAt(2, 'X');
        System.out.println(sb);
    }
}
