
public class Squirtle extends Pokemon {
    
    public Squirtle()
    {
        super(44,48,65,43);  //missing SP attack and SP defense     
  
    }
    
    public Squirtle(int inputHP, int inputAttack, int inputDefense, int inputSpeed)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed);
    }
    
    public void waterGun(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((40*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
        
    
    public void tackle(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((40*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    public void hydroPump(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((110*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    
    public void aquaTail(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((90*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    
    
}
