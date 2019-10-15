

public class StringTester
{
    public static void main() {
        String weatherCondition = "severe thunderstorms";
        String mixed = "mixed rain and snow";
        String light = "light snow showers";
        String sleet = "sleet";
        String smoky = "smoky";
        String windy = "windy";
        String clear = "clear (night)";
        String sunny = "sunny";
        String heavy = "heavy snow";
        System.out.println(weatherCondition.length());
        System.out.println(weatherCondition.indexOf("thunder"));
        
        String str1 = mixed.substring(0,5);
        String str2 = light.substring(0,5);
        String str3 = sleet.substring(0);
        String str4 = smoky.substring(0);
        String str5 = windy.substring(0);
        String str6 = clear.substring(0,5);
        String str7 = sunny.substring(0);
        String str8 = heavy.substring(0,5);
        
        System.out.println(str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8);
        System.out.println(WeatherConditionals.getWeatherAdvice(72,"sunny"));
        System.out.println(WeatherConditionals.getHikingAdvice(67, 7, 30, "sunny")); 
    }
}
