import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Backend {
	
		    public static Map<String, List<String>> myData = new TreeMap<String, List<String>>();
		    
		    public static Encoder hi = new Encoder("messages");
		    
		  public static List<String> getMessage(String username)
		  {
		    return myData.get(username);
		  }

		  public static void addMessage(String username, String msg){
		    if(myData.containsKey(username)){
		    	hi.write(msg);
		    	myData.get(username).add(msg);
		    }
		    else{
		    	myData.put(username, new ArrayList<String>());
		    }
		  }

		  public static List<String> getUsers(){
			List<String> ff = new ArrayList<String>();
			ff.addAll(myData.keySet());
		    return ff;
		  

		}
}