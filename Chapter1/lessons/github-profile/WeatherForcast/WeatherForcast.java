
/**
 * Write a description of class WeatherForcast here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherForcast
{
    public enum WeatherType {
        Sonny,
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy
    }
    public static void main(String[] args){
        
        int rainyDays = 0;
        WeatherType[] options = WeatherType.values();
        
        for(int day = 1; day <= 7; day++){
            int rndIndex = (int) (Math.random() * options.length);
            WeatherType today = options[rndIndex];
            
            System.out.println("Day "+day+": "+today);
            
            if (today == WeatherType.Rainy) {
                rainyDays++;
            }
            
            
        }
        System.out.println("There are "+rainyDays+" days of rin in the forecast.");
        
        System.out.println("All supported weather types: ");
        
        for (WeatherType w: WeatherType.values()){
            
        }
    
    }
    
    }
