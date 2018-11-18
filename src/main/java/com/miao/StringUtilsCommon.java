package com.miao;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName StringUtilsCommon
 * @Description
 * @Author wangzhen
 * @Date 2018/11/18 上午9:39
 **/
public class StringUtilsCommon {

    public static void main(String[] args) {

        /*1.字符串以prefix开始*/
        System.out.println(StringUtils.startsWith("sssdf", ""));//返回true
        System.out.println(StringUtils.startsWith("sssdf","ss"));//返回true
        System.out.println(StringUtils.startsWith("sssdf","f"));//返回false
        System.out.println(StringUtils.startsWith("sssdf","sssdf"));//返回true

        /*2.字符串以prefix开始,不区分大小写*/
        System.out.println("字符串以prefix开始,不区分大小写:");
        System.out.println(StringUtils.startsWithIgnoreCase("sssdf","Ss"));//返回true

        /*3.字符串以数组中的字符串开始*/
        System.out.println("字符串以数组中的字符串开始");
        System.out.println(StringUtils.startsWithAny("aabcde",new String[]{"g","f"})); //返回false
        System.out.println(StringUtils.startsWithAny("aabcde",new String[]{"g","aa"}));//返回true

        /*4.字符串以suffix结束*/
        System.out.println("字符串以suffix结束");
        System.out.println(StringUtils.endsWith("aabcde","d"));//返回false
        System.out.println(StringUtils.endsWith("aabcde","e"));//返回true
        System.out.println(StringUtils.endsWithIgnoreCase("aabcde","De"));//返回true
        System.out.println(StringUtils.endsWithIgnoreCase("", ""));//返回true


        /*5.替换字符串:把text中的searchString替换成replacement，max是最大替换次数，默认是替换所有*/
        System.out.println("替换字符串");
        System.out.println(StringUtils.replaceOnce("sshhhss","ss","p"));
        System.out.println(StringUtils.replace("sshhhss","ss","p"));
        System.out.println(StringUtils.replace("sshhhsshss","ss","777",2));
        System.out.println(StringUtils.replaceChars("sshhhs", "ss", "p"));
        /*输出：
        * phhhss
            phhhp
            777hhh777hss
            pphhhp*/

        /*6.按照数组进行替换，位置要匹配，数组长度要相等;暂时没发现下面replaceEach和replaceEachRepeatedly二者的区别*/
        StringUtils.replaceEach("www.baidu.com", new String[]{"baidu", "com"}, new String[]{"taobao", "net"});//结果是：www.taobao.net
        StringUtils.replaceEach("www.baidu,baidu.com", new String[]{"baidu", "com"}, new String[]{"taobao", "net"});//结果是：www.taobao,taobao.net
        StringUtils.replaceEachRepeatedly("www.baidu.com", new String[]{"baidu", "com"}, new String[]{"taobao", "net"});//结果是：www.taobao.net

        /*7.比较两个字符串是否相等,如果两个均为null，则也认为相等*/
        StringUtils.equals("", "");//结果是true
        StringUtils.equals(null, null);//结果是true
        StringUtils.equals("", null);//结果是false
        StringUtils.equals(null, "");//结果是false
        StringUtils.equalsIgnoreCase("ss", "Ss");//不区分大小写--结果是true


        /*8.返回searchChar在字符串中第一次出现的位置,如果searchChar没有在字符串中出现，则返回-1*/
        StringUtils.indexOf("sdfsfsfdsf", "4");/*结果是-1*/
        StringUtils.indexOf("sdfsfsfdsf", "f");/*结果是2*/

//查找searchChar在字符串中最后一次出现的索引*/
        StringUtils.lastIndexOf("aFkyk", "k");//结果是4
        StringUtils.lastIndexOf("aFkyk", "");//结果是1

        /*9.找出字符数组searChars第一次出现在字符串中的位置*/
        StringUtils.indexOfAny("sdsfhhl0", "f");//结果是3
        StringUtils.indexOfAny("sdsfhhl0", new String[]{"f", "0"});//结果是3
        StringUtils.indexOfAny("sdsfhhl0", new String[]{"t", "j"});//结果是-1
        StringUtils.indexOfAny("sdsfhhl0", new String[]{"t", "j", ""});//结果是3
        StringUtils.lastIndexOfAny("aFkyk", new String[]{"aFkyk", "k"});//找出字符数组searChars最后一次出现在字符串中的位置--结果是5


        /*10.找出字符串中不在字符数组searchars中的第一个字符出现的位置(从0位开始)
         *如果都在，返回-1
         **/
        StringUtils.indexOfAnyBut("sdsfhhl0", "h");//结果是0
        StringUtils.indexOfAnyBut("sdsfhhl0", "s");//结果是1
        StringUtils.indexOfAnyBut("aa", "aa");//结果是-1

        /*11.统计参数1和参数2开始部分共有的字符个数*/
        StringUtils.indexOfDifference("sdsfdsf", "s");//结果是1
        StringUtils.indexOfDifference(new String[]{"sdsfdsf", "s"});//结果是1

        /*12.去掉参数2在参数1开始部分共有的字符串*/
        StringUtils.difference("灌灌灌灌", "灌灌灌灌啊啊");//结果是：啊啊

        /*13.查找，不区分大小写,没有找到返回-1*/
        StringUtils.indexOfIgnoreCase("aFabbSSdd", "f");//返回1
        StringUtils.indexOfIgnoreCase("aFabbSSdd", "f", 2);//从指定位置开始查找，不区分大小写--返回-1
        StringUtils.indexOfIgnoreCase("aFabbSSdd", "f", 1);//返回1
        StringUtils.lastIndexOfIgnoreCase("", "");
        StringUtils.lastIndexOfIgnoreCase("", "", 2);

        /*14.截取指定位置的字符串*/
        StringUtils.substring("dskabcee", 3);
        /*结果是：abcee*/

        StringUtils.substring("dskabcee", 3, 5);
        /*结果是：ab*/

        /*15.截取指定字符串之前的内容*/
        StringUtils.substringBefore("dskeabcee", "e");
        /*结果是：dskeabce*/

        StringUtils.substringBeforeLast("dskeabcee", "e");//一直找到最后一个指定的字符串
        /*结果是：dskeabce*/

        StringUtils.substringAfter("dskeabcedeh", "");
        /*结果是：dskeabcedeh*/

        StringUtils.substringAfterLast("dskeabcedeh", "");
        /*结果是：*/

        /*16.截取参数2和参数3中间的字符*/
        StringUtils.substringBetween("dskeabcedeh", "ds");
        /*结果是：null*/
        StringUtils.substringBetween("dskeabcedeh", "ds", "e");
        /*结果是：k*/
        StringUtils.substringsBetween("dskeabcedeh", "ds", "e");//以数组方式返回参数2和参数3中间的字符串
        /*结果是：[keabce]*/

        /*1.分割字符串,可以设定得到数组的长度，但一般情况下不要设定，这样会发生冲突*/
        StringUtils.split("y5y,4454,545");//默认是按，来分割
        StringUtils.split("aaaa#sss", "#");
        /*结果是：[aaaa,sss]*/

        StringUtils.split("aaaa#sss#", "#", 2);

        /*2.按不同类型进行分割字符串*/
        StringUtils.splitByCharacterType("aa3444张三Bcss");
        /*结果是：[aa,3444,张三,a,B,css,B]*/

        StringUtils.splitByCharacterTypeCamelCase("");
        /*结果是：[aa,3444,张三,a,Bcss,B]*/

        /*3.分割字符串，""不会被忽略,可以设置分割字符串的数组长度*/
        StringUtils.splitByWholeSeparator("aaaa#sss#", "#");//""不会被忽略
        /*结果是：[aaaa,sss,]StringUtils.split结果是：[aaaa,sss]*/

        StringUtils.splitByWholeSeparator("aaaa#sss#ggg", "#");//
        /*结果是：[aaaa,sss,ggg]*/

        StringUtils.splitByWholeSeparator("aaaa#sss#ggg", "");//按空格分割
        /*结果是：[aaaa#,sss#ggg]*/

        StringUtils.splitByWholeSeparator("aaaa#sss#", "#", 2);//2设定返回数组的最大长度
        /*结果是：[aaaa,sss#]*/

        /*4.分割字符串，""不会被忽略,可以设置分割字符串的数组长度*/
        StringUtils.splitByWholeSeparatorPreserveAllTokens("sddssfsfasfsaf", null);
        /*结果是：[sddssf,sfasfsaf,]*/

        StringUtils.splitByWholeSeparatorPreserveAllTokens("sddssfsfasfsaf", "");
        /*结果是：[sddssf,sfasfsaf,]*/

        /*5.同上*/
        StringUtils.splitPreserveAllTokens("");
        StringUtils.splitPreserveAllTokens("", "");
        StringUtils.splitPreserveAllTokens("", "", 3);


    }
}
