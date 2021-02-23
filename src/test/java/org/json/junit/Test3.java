package org.json.junit;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;
import org.json.XML.KeyTrans;

public class Test3 {
	public static void main(String[] args) throws Exception {
//		// Example of User
//	    class AddPrefixKeyTrans implements KeyTrans {
//			@Override
//			public String trans(String key) {
//				String result = "swe262_" + key;
//		        return result.substring(0, result.length());
//			}
//	    }
////		toJSONObject
//	    String xmlStr =
//	    		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
//	    		        "<addresses xmlns:xsi=\"http://www.w3.org/2020/XMLSchema-instance\"" +
//	    		        "   xsi:noNamespaceSchemaLocation='test.xsd'>\n" +
//	    		        "   <address>\n" +
//	    		        "       <name>[CDATA[Joe &amp; T &gt; e &lt; s &quot; t &apos; er]]</name>\n" +
//	    		        "       <street>Yale street 1224</street>\n" +
//	    		        "       <ArrayOfNum>1.3, 2.4, 3, 4, 5</ArrayOfNum>\n" +
//	    		        "   </address>\n" +
//	    		        "</addresses>";
//	    Reader reader = new StringReader(xmlStr);
//	    Reader reader2 = new StringReader(xmlStr);
//	    KeyTrans KeyTrans = new AddPrefixKeyTrans();
//        JSONObject jsonObject = XML.toJSONObject(reader, KeyTrans);
//        System.out.println(jsonObject.toString());
//        JSONObject jsonObject2 = XML.toJSONObject(reader2);
//        System.out.println(jsonObject2.toString());
//        
//        String result = jsonObject.toString(4); 
//		try {
//			FileWriter file;
//			file = new FileWriter("D:\\2021Winter\\262Programming Styles\\original2edit.json");
//			file.write(result);
//	    	file.flush();
//	    	file.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		String result2 = jsonObject2.toString(4); 
////		try {
////			FileWriter file;
////			file = new FileWriter("D:\\2021Winter\\262Programming Styles\\original.json");
////			file.write(result2);
////	    	file.flush();
////	    	file.close();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
//		String simple =
//                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
//                        "<addresses xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""+
//                        "   xsi:noNamespaceSchemaLocation='test.xsd'>\n"+
//                        "   <address>\n"+
//                        "       <name>Joe Tester</name>\n"+
//                        "       <street>[CDATA[Baker street 5]</street>\n"+
//                        "       <NothingHere/>\n"+
//                        "       <TrueValue>true</TrueValue>\n"+
//                        "       <FalseValue>false</FalseValue>\n"+
//                        "       <NullValue>null</NullValue>\n"+
//                        "       <PositiveValue>42</PositiveValue>\n"+
//                        "       <NegativeValue>-23</NegativeValue>\n"+
//                        "       <DoubleValue>-23.45</DoubleValue>\n"+
//                        "       <Nan>-23x.45</Nan>\n"+
//                        "       <ArrayOfNum>1, 2, 3, 4.1, 5.2</ArrayOfNum>\n"+
//                        "   </address>\n"+
//                        "</addresses>";
//	    Reader reader3 = new StringReader(simple);
//        JSONObject jsonObject3 = XML.toJSONObject(reader3);
//        String result3 = jsonObject3.toString(4); 
//		try {
//			FileWriter file;
//			file = new FileWriter("D:\\2021Winter\\262Programming Styles\\simple.json");
//			file.write(result3);
//	    	file.flush();
//	    	file.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Reader reader4 = new StringReader(simple);
//        JSONObject jsonObject4 = XML.toJSONObject(reader4, KeyTrans);
//        String result4 = jsonObject4.toString(4); 
//		try {
//			FileWriter file;
//			file = new FileWriter("D:\\2021Winter\\262Programming Styles\\test.json");
//			file.write(result4);
//	    	file.flush();
//	    	file.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		String xmlStr =
//				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
//				        "<addresses xmlns:xsi=\"http://www.w3.org/2020/XMLSchema-instance\"" +
//				        "   xsi:noNamespaceSchemaLocation='test.xsd'>\n" +
//				        "   <address>\n" +
//				        "       <name>[CDATA[Joe &amp; T &gt; e &lt; s &quot; t &apos; er]]</name>\n" +
//				        "       <street>Yale street 1224</street>\n" +
//				        "       <ArrayOfNum>1.3, 2.4, 3, 4, 5</ArrayOfNum>\n" +
//				        "   </address>\n" +
//				        "</addresses>";
//        Reader reader = new StringReader(xmlStr);
//        String replaceStr = "{\"ArrayOfNum\":\"changed, 2.4, 3, 4, 5.2\"}";
//        JSONObject replaceJsonObject = new JSONObject(replaceStr);
//		JSONPointer jsonPointer = new JSONPointer("/addresses/address");
//		JSONObject jsonObject = XML.toJSONObject(reader, jsonPointer, replaceJsonObject);
//	    System.out.println(jsonObject.toString());
	    
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

//    	JSONObject jsonObject = XML.toJSONObject("<title>The Three-Body Problem</title><author>Cixin Liu</author><year>2016</year>");
//    	List<Object> listUnderTest = jsonObject.toStream().map(node -> node.getValue()).collect(Collectors.toList());
//    	List<Object> listExpected = new ArrayList<>();
//    	listExpected.add((Object) "2016");
//    	listExpected.add((Object) "Cixin Liu");
//    	listExpected.add((Object) "The Three-Body Problem");
//    	System.out.println(listExpected);
//    	System.out.println(listUnderTest);

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
		
		
		// there should be no space between
//    	JSONObject jsonObject = XML.toJSONObject(
//    	                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
//    	                        "<addresses xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""+
//    	                        "   xsi:noNamespaceSchemaLocation='test.xsd'>\n"+
//    	                        "   <address>\n"+
//    	                        "       <name>Joe Tester</name>\n"+
//    	                        "       <street>[CDATA[Baker street 5]</street>\n"+
//    	                        "       <NothingHere/>\n"+
//    	                        "       <TrueValue>true</TrueValue>\n"+
//    	                        "       <FalseValue>false</FalseValue>\n"+
//    	                        "       <NullValue>null</NullValue>\n"+
//    	                        "   </address>\n"+
//    	                        "</addresses>");
    	JSONObject jsonObject = XML.toJSONObject(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
                        "<addresses id = \"9450\">\n"+
                        "   <address>\n"+
                        "       <name>Joe Tester</name>\n"+
                        "       <street>[CDATA[Baker street 5]</street>\n"+
                        "       <NothingHere/>\n"+
                        "       <TrueValue>true</TrueValue>\n"+
                        "       <FalseValue>false</FalseValue>\n"+
                        "       <NullValue>null</NullValue>\n"+
                        "   </address>\n"+
                        "</addresses>");
    	System.out.println(jsonObject);
    	
    	System.out.println("================== The top-level key is :    ");
    	jsonObject.toStream().map(node -> node.getKey()).forEach(System.out::println);
    	List<Object> listUnderTest = jsonObject.toStream().map(node -> node.getValue()).collect(Collectors.toList());
    	System.out.println(listUnderTest);
    	
    	List<Object> listUnderTest2 = jsonObject.toStream().filter(node -> node.getKey().equals("id")).map(node -> node.getValue()).collect(Collectors.toList());
    	System.out.println(listUnderTest2);
	}
}
