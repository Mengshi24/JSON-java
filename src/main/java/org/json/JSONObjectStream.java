package org.json;

import static org.junit.Assert.assertEquals;

import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import javax.xml.stream.*;
import javax.xml.stream.events.XMLEvent;

import org.junit.jupiter.api.Test;

public class JSONObjectStream {
	
//	final class MyEntry<K, V> implements Map.Entry<K, V> {
//	    private final K key;
//	    private V value;
//
//	    public MyEntry(K key, V value) {
//	        this.key = key;
//	        this.value = value;
//	    }
//
//	    @Override
//	    public K getKey() {
//	        return key;
//	    }
//
//	    @Override
//	    public V getValue() {
//	        return value;
//	    }
//	    
//
//	    @Override
//	    public V setValue(V value) {
//	        V old = this.value;
//	        this.value = value;
//	        return old;
//	    }
//	}
	
    public static void main(String[] args) throws Exception {
//    	String x = "{\"books\":[{\"isbn\":\"9781593275846\",\"title\":\"Eloquent JavaScript, Second Edition\",\"subtitle\":\"A Modern Introduction to Programming\",\"author\":\"Marijn Haverbeke\",\"published\":\"2014-12-14T00:00:00.000Z\",\"publisher\":\"No Starch Press\"},{\"isbn\":\"9781449331818\",\"title\":\"Learning JavaScript Design Patterns\",\"subtitle\":\"A JavaScript and jQuery Developer's Guide\",\"author\":\"Addy Osmani\",\"published\":\"2012-07-01T00:00:00.000Z\",\"publisher\":\"O'Reilly Media\"}]}";
//    	JSONObject obj=new JSONObject(x);
//
//    	
////    	JSONObject obj = XML.toJSONObject("<Books><book><title>AAA</title><author>ASmith</author></book><book><title>BBB</title><author>BSmith</author></book></Books>");
//    	System.out.println(obj);
//    	System.out.println("result1==================");
////    	obj.toStream().forEach(System.out::println);
//    	obj.toStream().forEach(o -> System.out.println(o));
//    	System.out.println("result filter==================");
//    	obj.toStream().filter(node -> node.equals("ASmith")).forEach(System.out::println);
//    	System.out.println("map filter==================");
//    	obj.toStream().map(node -> node).forEach(System.out::println);
    	
   	
//    	String x="{\"count\":25,\"rows\":[{\"id\":10,\"name\":\"xxx\"},{\"id\":11,\"name\":\"xyx\"}]}";
//    	JSONObject obj=new JSONObject(x);
//    	System.out.println(obj);
//    	
//    	System.out.println("result1==================");
//    	obj.toStream().forEach(System.out::println);
//    	
//    	System.out.println("result2==================");
//    	obj.toStream().map(node -> node.getKey()).forEach(System.out::println);
//    	
//    	System.out.println("result3==================");
//    	obj.toStream().filter(node -> node.getKey().equals("count")).forEach(System.out::println);
//
//////    	System.out.println("result==================");
//////    	obj.toStream().filter(node -> node.getKey().equals("count")).forEach(node -> node.setValue(new int[24]));
//
//    	int value = 5;   	
//    	System.out.println("result4==================");
//    	obj.toStream().filter(node -> node.getKey().equals("count")).forEach(node -> node.setValue(value));
//    	obj.toStream().forEach(System.out::println);
//    	System.out.println(obj);


   	
    	JSONObject jsonObject = XML.toJSONObject("<title>The Three-Body Problem</title><author>Cixin Liu</author><year>2016</year>");
    	List<Object> listUnderTest = jsonObject.toStream().map(node -> node.getValue()).collect(Collectors.toList());
    	List<Object> listExpected = new ArrayList<>();
    	listExpected.add((Object) "2016");
    	listExpected.add((Object) "Cixin Liu");
    	listExpected.add((Object) "The Three-Body Problem");
    	System.out.println(listExpected);
    	System.out.println(listUnderTest);


    	
    	
    	
//    	List<MyEntry<String, Object>> expectedResult = new ArrayList<MyEntry<String, Object>>();
//    	Map.Entry<String, Object> entryOne = new MyEntry<String, Object>("count", 25);
//    	
//    	expectedResult.add(entryOne);
//    	obj.toStream().forEach(System.out::println);
    	
    	// how to compare? collection from the stream
    	
//    	JSONObject obj = XML.toJSONObject("<Books><book><title>AAA</title><author>ASmith</author></book><book><title>BBB</title><author>BSmith</author></book></Books>");
//    	JSONObject obj = XML.toJSONObject("<book><title>AAA</title><author>ASmith</author></book><book><title>BBB</title><author>BSmith</author></book>");

//    	Predicate<Entry<String, String>> myPredicate = t -> keysForFiltering.contains(t.getKey());
    	
//    	System.out.println("result==================");
//    	obj.toStream().forEach(System.out::println);
//    	List<Entry<String, Object>> titles = obj.toStream().map(entry -> entry.getValue("title")).collect(Collectors.toList());
//    	List<Object> titles = obj.toStream().map(MyEntry::getValue("title")).collect(Collectors.toList());
//    	System.out.println("result==================");
//    	obj.toStream().filter(node -> node.getKey().equals("book")).forEach(System.out::println);

    	
    	
    	
    	
    	
//    	JSONArray arr=obj.getJSONArray("rows");
//    	StreamSupport.stream(arr.spliterator(), false)
//    	  .forEach(System.out::println);
//    	
//    	List<JSONObject> list = StreamSupport.stream(arr.spliterator(), false)
//                .map(val -> (JSONObject) val)
//                .filter(val -> val.getInt("id") == 11)
//                .collect(Collectors.toList());
//
//    	System.out.println(list);
    	


    }
	
	

    
}
