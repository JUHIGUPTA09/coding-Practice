import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class test {

	public static void main(String[] args) {
	String s1="juhi";
	String s2="rohit";
	String s="";
	String ss=null;
	LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
	mapingValue(map,s1);
	mapingValue(map,s2);
	System.out.println(map);
	for(Entry<Character,Integer> e:map.entrySet())
	{
		if(e.getValue()==1)
		{
			s=s+e.getKey();
		}
		
	}
	
	System.out.println("uncommon haracter:"+s.trim());
	
	//Uncommon character
	
	for(Entry<Character,Integer> e:map.entrySet())
	{
		if(e.getValue()>1)
		{
			ss=ss+e.getKey();
		}
		
	}
	
	System.out.println("common haracter:"+ss);
	
	}

  public static void mapingValue(LinkedHashMap<Character,Integer> map,String s)
  {
	  
    for(Character c:s.toCharArray())
    {
    	
    	if(map.containsKey(c))
    	{
    		map.put(c,map.get(c)+1);
    	}
    	else
    	{
    		map.put(c, 1);
    	}
    }
  }
	
	
}
