/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author liz10
 */
public class Pikachu extends Pokemon // extends keyword allows for inheritance. 
                                    // intheritence is where you share the public interface of the super class
                                    //this allows for a sub class super class relationship
{    
    public Pikachu()
    {
        super(35,55,40,90);//missing SP attack and SP defense
    }
    
    public Pikachu(int inputHP, int inputAttack, int inputDefense, int inputSpeed)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed);
    } 
    
    
    /*private int attack(Pokemon anyPoorPokemon)
    {
        return anyPoorPokemon.getHP() - (this.getAttack()-anyPoorPokemon.getDefense());
    }*/
    
    public void thunderbolt(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((90*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    public void quickAttack(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((40*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
     
    public void voltTackle(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((120*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    public void ironTale(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((100*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
      
    
   /* @override
    public String toString()
    {
        Pikachu pk = new Pikachu();
        System.out.println(pk);
    }*/
}
