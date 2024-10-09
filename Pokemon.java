
//import java.util.Random;


public class Pokemon implements Pokeinterface {
    //Random random = new Random();
    private int hp;
    private int attack;
    private int speed;
    private int defense;
    private int spAttack;
    private int spDefense;
    
    public Pokemon(int userHP, int userAttack, int userDefense, int userSpeed)
    {
        hp = userHP;
        attack = userAttack;
        defense = userDefense;
        speed = userSpeed;     
    }
      
        
    public int getHP()
    {
        return hp;
    }
    
    public void setHP(int inputHP)
    {
        hp = inputHP;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public int getDefense()
    {
        return defense;
    } 
      
    public int getSpeed()
    {
        return speed;
    }
    
    @Override
    public int compareTo(Object whateverPokemon)//if pokemon 1 is faster the output is 1, if pokemon 2 is fater the output is -1, and if they are the same speed the output is 0. https://www.codejava.net/java-core/the-java-language/everything-you-need-to-know-about-interfaces-in-java
    {
        int x;
        
        if(this.getSpeed()>((Pokemon) whateverPokemon).getSpeed())
            x=1;
        else if(this.getSpeed()<((Pokemon) whateverPokemon).getSpeed())
            x=-1;
        else
            x=0;
        
        return x;
    }
    
    @Override
    public boolean equals(Object whateverPokemon)
    {
        //USE InstanceOf
        
        
        
        boolean same=false;
        
        if(this.getSpeed() == ((Pokemon) whateverPokemon).getSpeed()) //https://www.baeldung.com/java-type-casting
            same = true;
        if(this.getAttack() == ((Pokemon) whateverPokemon).getAttack())
            same = true;
        if(this.getDefense() == ((Pokemon) whateverPokemon).getDefense())
            same = true;
        if(this.getHP() == ((Pokemon) whateverPokemon).getHP())
            same = true;
       
        return same;
    }
    
    public void printThing()
    {
        //Sysouts can go here
    }
    
    public void printWeather()
    {
        //sys out
    }
    
    
}
