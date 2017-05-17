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
	
	//��������ֵĻ�������true
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
            String str = li.get(i);  //��ȡ���뼯�϶����ÿһ��Ԫ��
            if(!list.contains(str)){   //�鿴�¼������Ƿ���ָ����Ԫ�أ����û�������
                list.add(str);
            }
        }
        return list;  //���ؼ���
    }
}
