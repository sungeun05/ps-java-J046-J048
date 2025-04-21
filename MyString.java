import java.util.Scanner;

class MyString{
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

    public static void main(String[] args){
        MyString l = new MyString();

        Scanner s = new Scanner(System.in);

        String s1;
        String s2;

        s1 = s.nextLine();
        s2 = s.nextLine();

        int n = 0;

        n = l.whichFirst(s1,s2);

        if(n == 1)
            System.out.printf("1 %s",s1);
        else if(n == 2)
            System.out.printf("2 %s",s2);

    }
}