import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String inputStr =  "abc"; //输入字符串

        String[] splitStrArr = inputStr.split(""); //拆分 

        String result = inputStr;

        boolean Successflag = false; //标记成功

        //循环每个字符,这些字符是用来构造新字符串
        for(int i=0;i<splitStrArr.length;i++)
        {
            //列举所有可能的添加位置,然后循环构造新字符串
            for(int j=0;j<inputStr.length()+1;j++) {
                if (!validateStr(result)) {
                    result = constructString(splitStrArr[i], inputStr,j);
                    continue;
                }else{
                    System.out.println("Success:" + result);
                    Successflag = true;
                    return;
                }
            }
        }

        System.out.println("Success?: " + Successflag);

    }

     //检测当前字符串是否回文串
    public static boolean validateStr(String inputstr){

        if (inputstr == null)
            return false;

        String[] arrStr = inputstr.split("");
        int loop = arrStr.length/2;

        int i=0 ,j = 0;
        j = arrStr.length;

        for(i=0;i<loop;i++){
              //判断每个字符是否对称
            if(arrStr[i].equals(arrStr[j-i-1])){ 
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

   //尝试构造新字符串
    public static String constructString(String addchar, String orginStr, int i){

        String result;

        if(i<0||i>orginStr.length()){
            return "false";
        }

        if(i==0)
        {
            result = addchar + orginStr;

        }else if(i==orginStr.length())
        {
            result = orginStr+addchar;

        }
        else
        {
            result = orginStr.substring(0, i) + addchar + orginStr.substring(i, orginStr.length());

        }

        return result;
    }
}