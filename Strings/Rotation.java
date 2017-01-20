package Strings;

public class Rotation {
    public static void main(String[] args) {
        String s1 = "Ravindrababuravula";
        String s2 = "avulaRavindrababur";
        if(s1.length() != s2.length()) {
            System.out.println("s2 is not rotated version of s1");
        }else {
            String s3 = s1 + s1;
            if(s3.contains(s2)) {
                System.out.println("s2 is a rotated version of s1");
            } else {
                System.out.println("s2 is not rotated version of s1");
            }
        }
    }
}