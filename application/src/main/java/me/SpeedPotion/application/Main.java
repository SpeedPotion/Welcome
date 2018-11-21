package me.SpeedPotion.application;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        getExperience();
        for(Why why : Why.values()){
            getReasons(why);
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    /**
     *
     * @return A list of strings explaining my experience.
     *
     */
    public ArrayList<String> getExperience(){

        ArrayList<String> experience = new ArrayList<String>();

        experience.add("Java development for 4 years");
        experience.add("Basic HTML & CSS");
        experience.add("Great UI designer");
        experience.add("Fluent with Spigot/Bukkit API");
        experience.add("Capable of using Maven & learn whats needed for the job");
        experience.add("Able to have voice calls quite often");
        experience.add("Learning in Udemy basic AI development");
        experience.add("I can speak Spanish, English & Portuguese");

        return experience;
    }

    /**
     *
     * @param why Defines why I should be chosen.
     * @return a answer to why I should be chosen.
     *
     */
    public String getReasons(Why why){
        return why.getAnswer();
    }

    /**
     * I know how to use enums :p
     */
    public enum Why {
        SIMPLE("I thrive to make a simple code so my fellow teammates can understand and expose vulnerabilities easily"),
        EFFICIENT("Before finishing the project I read all the code and make sure it is efficient"),
        CLEAN("Having a clean code will make me and my teammates organise better our workflow.");

        String answer;

        Why(String answer){
            this.answer = answer;
        }

        public String getAnswer() {
            return answer;
        }
    }
    /**
     * My objective with this type of application was to show I know how to code, and some basic concepts everyone should know.
     * I'm honest so there is another side of the coin... I love coding, have time, and it would be awesome if I could make some extra
     * bucks from it, but... I know I can't do this alone, I will for sure need help, I will make stupid mistakes. But something I can assure you
     * is that I don't make the same mistakes twice, therefor I hope you liked my application and good luck to every applicant.
     */
}
