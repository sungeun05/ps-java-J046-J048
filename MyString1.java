import java.util.Scanner;

class MyString1{
    MyString(){

    }
    public static int whichFirst(String str1, String str2){
        int n = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.compareTo(str2)<0)
            n = 1;
        else if(str1.compareTo(str2)>0)
            n = 2;
        else
            n = 0;
        
            return n;
            
    }

    public static String removeSpaces(String str){
        String c = "";
        for(int i = 0; i<str.length(); i++)
            if(str.charAt(i) != ' ')
                c += str.charAt(i);

        return c;
                
    }

    public static void main(String[] args){
        MyString1 l = new MyString1();

        Scanner s = new Scanner(System.in);

        String s1;
        String s2;


        s1 = s.nextLine();

        s2 = l.removeSpaces(s1);

        System.out.printf("%s",s2);
    }
}