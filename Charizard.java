public class Charizard extends Pokemon{
    
    public Charizard()
    {
        super(78,84,78,100);//missing SP attack and SP defense
    }
    
    public Charizard(int inputHP, int inputAttack, int inputDefense, int inputSpeed)
    {
        super(inputHP, inputAttack, inputDefense, inputSpeed);
    }
    //write methods to teach moves
    
    
    public void flamethrower(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((90*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    public void dragonClaw(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((80*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    
    public void aerialAce(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((60*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
    
    public void fireBlast(Pokemon anyPoorPokemon)
    {
        int resultingLife = anyPoorPokemon.getHP() - (((110*this.getAttack()/anyPoorPokemon.getDefense())/50)+2);
        anyPoorPokemon.setHP(resultingLife);
    }
    
}
