public class CompareLive {
	
    public static String compareprod(String CurrentURL) throws Exception {
		String convertCurrentURL ="";
	    if (CurrentURL.startsWith("http://setonstage.zeondemo.com")) {
	    	convertCurrentURL= CurrentURL.replaceFirst("http://setonstage.zeondemo.com", "http://www.seton.com") ;
		} else if (CurrentURL.startsWith("setonstage.zeondemo.com")) {
			convertCurrentURL= CurrentURL.replaceFirst("setonstage.zeondemo.com", "http://www.seton.com") ;
		}
	    
	    return convertCurrentURL;
	
	}
	
	
	
	//public static String compareprod(String CurrentURL) {
	//}



}
