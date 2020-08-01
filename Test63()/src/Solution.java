public class Solution {
    public String replaceSpace(StringBuffer str) {
        int count = 0;
        //计算空格的个数
        for (int i = 0; i < str.length();i++) {
            if(str.charAt(i) == ' ') {
               count++;
            }
        }
        int old_length = str.length() - 1;
        int new_length = count * 2 + str.length() - 1;
        //设置字符串的长度,原字符串的长度为old_length,新字符串的长度new_length
        str.setLength(new_length);
        while (new_length >= 0 && old_length >= 0){
            if (str.charAt(old_length) == ' ') {//当遇到空格时,替换为%20
                //把下标为new_length的位置用'0'替换
                str.setCharAt(new_length--,'0');
                //把下标为new_length的位置用'2'替换
                str.setCharAt(new_length--,'2');
                //把下标为new_length的位置用'%'替换
                str.setCharAt(new_length--,'%');
                old_length--;
            } else {
                ////把下标为old_length的字符的移动到下标为new_length的地方
                str.setCharAt(new_length,str.charAt(old_length--));
                new_length--;
            }
        }
        return str.toString();
    }
}