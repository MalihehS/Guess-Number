package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

@Named(value = "guessNumberBean")
@SessionScoped // If we use request scope instead of SessionScoped , Program can not remeber our guess 
public class GuessNumberBean implements Serializable {

    private final int RANDOMnUMBER;
    private int max = 10;
    private int min = 1;
    private int userguess;
    private String response;

    public int getRANDOMnUMBER() {
        return RANDOMnUMBER;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getUserguess() {
        return userguess;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setUserguess(int userguess) {
        this.userguess = userguess;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    

    public GuessNumberBean() {
        Random random = new Random();
        RANDOMnUMBER = random.nextInt(max) + 1;

    }

    public String getResponse(){
        if(userguess==RANDOMnUMBER){
             return "You guessed right!";
        }else if(userguess<RANDOMnUMBER){
                 return "Sorry, Too low";
        }else {
            return "Sorry, To high";
        }
    }
    
}
