/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(String a, String b){
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        return i + j;
    }
}

