package 面向对象或基础;


public class 字符串 {

    /**
     * 字符串部分 String StringBuffer StringBuilder
     * @author liuxiaochen
     * @date 2021.6.24
     */

    public static void main(String[] args) {

        /** String */

        /**
         * String string = "abc"; 先在字符串池中寻找指向内容为abc的对象，有则直接指向，无则创建一个并指向
         * String string = new String("abc"); 不管在堆中有无内容为abc的对象，直接开辟新内存创建
         */
        //创建一个名为string1的字符串abc 赋值方法 "="
        String string1 = "abc";
        //创建一个名为string2的字符串abc 赋值方法 "="
        String string2 = "abc";
        //则string1和string2两个字符串内容相同、地址也相同 返回true
        System.out.println("String用'='赋值："+ (string1 == string2));

        //采用new方法的一定会开辟一块新的内存（堆）
        string1 = "ddd";
        string2 = new String("d")+"dd";
        //返回false
        System.out.println("String用'='和new赋值："+ (string1 == string2));

        //intern方法会在 字符串池 中查找是否存在相同字符串的地址，如果有直接指向，没有就仍指向原来指向的位置
        //由于new方法会构造两个字符串（一个在字符串池中，另一个在堆中），因此如果new出来的对象不intern，则永远不会相等==
        //string1是'='构建，intern之后仍指向原来的字符串池，而string2是new构建，则string2指向的是堆中，string1指向的是字符串池中，返回false
        System.out.println("string1 intern后："+(string1.intern() == string2));
        //string1是'='构建，string2 intern后指向了字符串池中，返回true
        System.out.println("string2 intern后："+(string1 == string2.intern()));
        //string中含有其他string的变量，则不会进入字符串池,采用引用的方法，只有静态字符串才会进入字符串池，返回false
        String str1 = "d";
        String str2 = str1+"dd";
        System.out.println("采用变量赋值："+ (string1.intern()==str2));

        /** StringBuffer*/
        System.out.println("——————————————————————————————————————————————");

        //构造一个StringBuffer类 初始容量为10
        StringBuffer stringBuffer = new StringBuffer(10);
        //向其中添加字符串hello
        stringBuffer.append("hello");
        System.out.println(stringBuffer);
        //capacity()方法返回StringBuffer类的容量
        System.out.println("StringBuffer容量："+stringBuffer.capacity());
        //length()方法返回StringBuffer类的
        System.out.println("StringBuffer长度："+stringBuffer.length());


        /** StringBuilder*/
        System.out.println("——————————————————————————————————————————————");

        StringBuilder stringBuilder = new StringBuilder(10);
        //大致同StringBuffer
    }
}
