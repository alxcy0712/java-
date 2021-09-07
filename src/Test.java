
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


public class Test {
    public static void pushIntoStack( Stack<Integer> s , String str){
        for(int i = 0 ; i < str.length() ; i++){
            Integer digital = Integer.valueOf(str.charAt(i))-48;
            s.push(digital);
        }
    }
    public static String solve (String s, String t) {
        // write code here
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        pushIntoStack(s1,s);
        pushIntoStack(s2,t);
        boolean isPositive = false;
        Stack<Integer> res = new Stack<>();
        while(!s1.isEmpty() && !s2.isEmpty()){
            Integer num1 = s1.pop();
            Integer num2 = s2.pop();
            Integer num = num1+num2;
            if(isPositive){
                num++;
            }
            if(num >= 10){
                isPositive = true;    //positive
                num-=10;
            }else{
                isPositive = false;
            }
            res.push(num);
        }
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                Integer num = s2.pop();
                if(isPositive){
                    num++;
                }
                if(num >= 10){
                    isPositive = true;
                    num-=10;
                }else{
                    isPositive = false;
                }
                res.push(num);
            }
        }else{
            while(!s1.isEmpty()){
                Integer num = s1.pop();
                if(isPositive){
                    num++;
                }
                if(num >= 10){
                    isPositive = true;
                    num-=10;
                }else{
                    isPositive = false;
                }
                res.push(num);
            }
        }
        if(isPositive){
            res.push(Integer.valueOf(1));
        }

        StringBuilder sb = new StringBuilder();
        while(!res.isEmpty()){
            sb.append(  res.pop().toString()  );
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        String s1 = "99";
        String s2 = "1";
        System.out.println( solve(s1,s2)  );
    }
}