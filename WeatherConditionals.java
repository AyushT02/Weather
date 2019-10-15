
public class WeatherConditionals

{ 
   public static String getWeatherAdvice(int temperature, String description) 
   {
       boolean windy = false;
       if (description.indexOf("windy") >=0) {
           description.equals(windy);
           
        }
       if (temperature > 30 && description != "windy" && description != "snow") {
           return "It's safe to go outside, " + temperature + " degrees " + "and " + description;
        } else {
            return "Too windy or cold! Enjoy watching the weather through the window.";
            
        }
         
    }
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description) {
        String noHike = "It's too hot, cold, windy, or humid to hike today";
        String yesHike = "The weather seems good for a hike today";
        
        if (temperature >= 80 || temperature <= 50 || windchill >= 10 || humidity >= 60) {
         return noHike;    
        } else {
         return yesHike;   
        }
    }
}
