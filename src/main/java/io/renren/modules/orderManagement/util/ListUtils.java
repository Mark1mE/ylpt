package io.renren.modules.orderManagement.util;

import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/4/8 20:21
 */
public class ListUtils {
    public static String list2String(List<String> list) {
        StringBuffer str = new StringBuffer();
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String string = iterator.next();
            str.append(string);
            if(iterator.hasNext()){
                str.append(",");
            }
        }
        return str.toString();
    }
}
