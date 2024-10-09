
public class Ivysaur extends Pokemon {
   
    public Ivysaur()
    {
        super(60,62,63,60);  //missing SP attack and SP defense     
  
    }
    
    public Ivysaur(int inputHP, int inputAttack, int inputDefense, int inputSpeed)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed);
    }
    
    public void vineWhip(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((45*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    
    public void tackle(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((40*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    public void razorLeaf(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((55*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    public void seedBomb(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((80*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
}
