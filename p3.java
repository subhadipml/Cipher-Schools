import java.util.ArrayList;
import java.util.Scanner;

class Secret
{
    void Asia(String s1)
    {
        String temp="";
        for(int i=0;i<s1.length();i++)
        {
            int ascii=s1.charAt(i);
            if(ascii>=97 && ascii<=122)
            {
                ascii+=2;
                if(ascii>122)
                {
                    ascii-=123;
                    ascii+=97;
                }
                temp+=(char)ascii;
            }
            else
            {
                System.out.println("Invalid");
                return;
            }

        }
        System.out.println(temp);
    }
    void UnitedStates(String s1)
    {
        String temp="";
        for(int i=0;i<s1.length();i++)
        {
            int ascii=s1.charAt(i);
            temp+=ascii+".";
        }
        System.out.println(temp);
    }
    void Dubai(String s1)
    {
        String temp="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            temp+=s1.charAt(i);
        }
        System.out.println(temp);
    }
}
public class p3 extends Secret {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p3 a=new p3();
        ArrayList<String>l1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String s1=sc.next();
            l1.add(s1);
        }
        ArrayList<Integer>l2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            l2.add(val);
        }
        for(int i=0;i<n;i++)
        {
            if(l2.get(i)==0)
            {
                a.Asia(l1.get(i));
            }
            else if(l2.get(i)==1)
            {
                a.UnitedStates(l1.get(i));
            }
            else
            {
                a.Dubai(l1.get(i));
            }
        }
    }
}