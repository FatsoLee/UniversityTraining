package util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringUtil {

	public static boolean isEmpty(String str){
		if("".equals(str)|| str==null){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isNotEmpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}
	
	//如果是数字的话，返回true
	public static boolean isNumber(String str) {
		 Pattern pattern = Pattern.compile("[0-9]*"); 
	     return pattern.matcher(str).matches(); 
	}
	
	public static boolean isNotZeroToTen(String str) {
		int a=Integer.parseInt(str);
		if (a<0 || a>10) {
			return true;
		} else {
			return false;
		}
	}
	
	public static List<String> getOnlyList(List<String> li){
        List<String> list = new ArrayList<String>();
        for(int i=0; i<li.size(); i++){
            String str = li.get(i);  //获取传入集合对象的每一个元素
            if(!list.contains(str)){   //查看新集合中是否有指定的元素，如果没有则加入
                list.add(str);
            }
        }
        return list;  //返回集合
    }
}
