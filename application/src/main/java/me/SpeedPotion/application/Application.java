package me.SpeedPotion.application;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;

public class Application extends JavaPlugin {

    @Override
    public void onEnable() {
        getExperience();
        for(Why why : Why.values()){
            getReasons(why);
        }
        super.onEnable();
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
        experience.add("Learning basic AI development on Udemy");
        experience.add("I'm able to speak Spanish, English & Portuguese");

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
        SIMPLE("I thrive to create simple code so my fellow team mates can understand and expose vulnerabilities easily"),
        EFFICIENT("Before finishing the project, I proofread it and make sure it is efficient"),
        CLEAN("Having clean code will make my team mates and I improve our workflow");

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
     * Other thing I would like to point out working as a team... it's not as easy at looks but since I was young I've been taught
     * to work in teams. I know how I should respect my team mates and keep their ideas in mind and never take credit as an individual, but as a team.
     *
     * Thank you for taking the time to review my application and good luck to the applicants!
     */
}
