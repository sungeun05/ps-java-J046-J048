import java.util.Scanner;

class MyString2{
    MyString2(){

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

    public static String findLongestWord(String str){
        int max = 0;
        int count = 0;
        int k = 0;
        String s = "";

        for(int i=0; i<str.length(); i++)
            if(str.charAt(i) == ' '){
                if(max < count){
                    max = count;
                    k = i-count;
                }
                count = 0;
                continue;
            }
            else{
                count++;
            }
            
        for(int i = k; ;i++){
            if(str.charAt(i) == ' ')
                break;
            s += str.charAt(i);
        }

        return s;
    }

    public static void main(String[] args){
        MyString2 l = new MyString2();

        Scanner s = new Scanner(System.in);

        String s1;
        String s2;


        s1 = s.nextLine();

        s2 = l.findLongestWord(s1);

        int n = s2.length();

        System.out.printf("%s %d",s2,n);
    }
}