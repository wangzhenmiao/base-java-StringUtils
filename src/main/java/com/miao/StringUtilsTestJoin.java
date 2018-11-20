package com.miao;

import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StringUtilsTestJoin
 * @Description
 * @Author wangzhen
 * @Date 2018/11/18 上午9:31
 **/
public class StringUtilsTestJoin {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        String listjoin= StringUtils.join(list);
        String listjoin2=StringUtils.join(list,",");
        System.out.println("StringUtils.join(list):"+listjoin);
        System.out.println("StringUtils.join(list,\",\")："+listjoin2);

        StringBuffer sb=new StringBuffer();
        sb.append("x,y,z,2");
        String arrjoin=StringUtils.join(sb.toString().split(","));
        String arrjoin2=StringUtils.join(sb.toString().split(","),";");

        System.out.println(arrjoin);
        System.out.println(arrjoin2);

    }
}
