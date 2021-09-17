package kata;


public class Capitalized {
    public static String camelCase(String str) {
        if(str.isEmpty() == true){
            return "";
        }
        String[] split = str.replaceAll("\\s+"," ").trim().split(" ");
        String result=""; 
        for(String a : split){
          result +=  a.substring(0,1).toUpperCase() + a.substring(1);
             
        }


        return result.replaceAll(" ", "");
    }
    /*Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. 
     *All words must have their first letter capitalized without spaces.
     *
     *For instance:
     *
     *camelCase("hello case"); // => "HelloCase"
     * camelCase("camel case word"); // => "CamelCaseWord"
    */
    
}
