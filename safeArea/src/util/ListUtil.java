package util;

import java.util.List;

public class ListUtil {
	//集合为空
 public static boolean isEmpty(List list){
	   if(list==null||list.size()==0)
		   return true;
	   return false;
 }
 //集合不为空
 public static boolean isNotEmpty(List list){
	   return isEmpty(list)!=true;
}
	//集合为空
public static boolean isEmpty(Object[] list){
	   if(list==null||list.length==0)
		   return true;
	   return false;
}
//集合不为空
public static boolean isNotEmpty(Object[] list){
	   return isEmpty(list)!=true;
}
}
