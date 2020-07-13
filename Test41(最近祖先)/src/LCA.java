import java.util.*;

public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while(a!=b){
            if(a>b)a= a/2;//是a的最近祖先
            if(a<b)b=b/2;//是b的最近祖先
        }
        //a和b的最近公共祖先
        return a;
    }
}