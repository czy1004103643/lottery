package com.test.cache;

import java.net.URL;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhCacheGetTest {

	public static void main(String[] args) {
		URL url = EhCacheGetTest.class.getClassLoader().getResource(  
	             "com/npc/lottery/cache/ehcache.xml"); 
		 CacheManager manager=new CacheManager(url);
		 Cache cache= manager.getCache("oddsDistributedCache");
	
			 for (int i = 0; i < 500; i++) {
				 Element element = new Element("key"+i, "value"+i+"test11"); 
				 cache.put(element); 
				 System.out.println("缓存中增加数据：" + "key"+i + " = " + "value"+i+"test11");
			}
		while(true)
		{
		  try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		  //System.out.println(cache.getSize());
		//Element element1 = cache.get("key1");
		 //System.out.println(element1.getValue());
		
		 }
	} 
	
	/* mamager
  //取得Cache  
    Cache cache = manager.getCache("UserCache");  
     Element element = new Element("key1", "value1");  
     cache.put(element);  

     Element element1 = cache.get("key1");  */
//System.out.println(element1.getValue());  
	
}
