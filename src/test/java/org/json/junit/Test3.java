package org.json.junit;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;
import org.json.XML.KeyTrans;

public class Test3 {
	public static void main(String[] args) throws IOException {
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
		
		
		String xmlStr =
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				        "<addresses xmlns:xsi=\"http://www.w3.org/2020/XMLSchema-instance\"" +
				        "   xsi:noNamespaceSchemaLocation='test.xsd'>\n" +
				        "   <address>\n" +
				        "       <name>[CDATA[Joe &amp; T &gt; e &lt; s &quot; t &apos; er]]</name>\n" +
				        "       <street>Yale street 1224</street>\n" +
				        "       <ArrayOfNum>1.3, 2.4, 3, 4, 5</ArrayOfNum>\n" +
				        "   </address>\n" +
				        "</addresses>";
        Reader reader = new StringReader(xmlStr);
        String replaceStr = "{\"ArrayOfNum\":\"changed, 2.4, 3, 4, 5.2\"}";
        JSONObject replaceJsonObject = new JSONObject(replaceStr);
		JSONPointer jsonPointer = new JSONPointer("/addresses/address");
		JSONObject jsonObject = XML.toJSONObject(reader, jsonPointer, replaceJsonObject);
	    System.out.println(jsonObject.toString());
	}
}
