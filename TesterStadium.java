//HW ADD NEW FEATURE TO POKEMON
//We will determine if 2 pokemon are the same
//     implement an override for .equals, compare their stats. Return true/false as needed. Test
//We will also determine if a pokemon has more speed than the other

//  Implement an interface. It has a compareTo(Object pokemon?)
   //   if a pokemon has more speed, returjn 1, equal speed, return 0, less speed, return -1
//Test
//I might need to use instanceOf to compare if they are the same class


public class TesterStadium {
 public static void main(String[] args)
 {
     //add a way to do random automated attacks/also let user choose attacks
     Pikachu bob = new Pikachu();
     Charizard jimmy = new Charizard();
     
     //Squirtle sunGlasses = new Squirtle();
     //Ivysaur brotherMan = new Ivysaur();
     boolean win=false;
     String winner = null;
     
     
     
     System.out.println("Battle Music Initialized");
     System.out.println("Jimmy HP:"+jimmy.getHP());
     System.out.println("Bob HP: "+bob.getHP()+"\n");
     //System.out.println("Squirtle HP: "+sunGlasses.getHP());
     //System.out.println("Ivysaur HP: "+brotherMan.getHP()+"\n");
     
     
     
     while(!win)
     {
         if(bob.equals(jimmy))
         {
            System.out.println("Bob and Jimmy are the same.");
         }
         else
            System.out.println("Bob and Jimmy are not the same.");
         
         
         if(bob.getHP()>0 && jimmy.getHP()>0)
         {
            bob.thunderbolt(jimmy);
            System.out.println("Bob attack Jimmy with thunderbolt!");
            System.out.println("Jimmy HP:"+jimmy.getHP()+"\n");
         }
         
         
         if(jimmy.compareTo(bob)==1)//https://www.codejava.net/java-core/the-java-language/everything-you-need-to-know-about-interfaces-in-java
         {
             System.out.print("Jimmy is faster!! ");
             jimmy.aerialAce(bob);
             System.out.println("Jimmy use aerial ace on Bob!!");
             System.out.println("Bob HP: "+bob.getHP());
             
             bob.voltTackle(jimmy);
             System.out.println("Bob use volt tackle on Jimmy!!");
             System.out.println("Jimmy HP: "+jimmy.getHP());
         }
         else if(jimmy.compareTo(bob)==-1)
         {
             System.out.print("Bob is faster!! ");
             bob.voltTackle(jimmy);
             System.out.println("Bob use volt tackle on Jimmy!!");
             System.out.println("Jimmy HP: "+jimmy.getHP());
             
             jimmy.aerialAce(bob);
             System.out.println("Jimmy use aerial ace on Bob!!");
             System.out.println("Bob HP: "+bob.getHP());
         }
         else
             System.out.print("Both pokemon are the same speed!! ");
             jimmy.aerialAce(bob);
             System.out.println("Jimmy use aerial ace on Bob!!");
             System.out.println("Bob HP: "+bob.getHP());
         
         
         
         
         
         if(bob.getHP()<=0 && jimmy.getHP()>0)
        {
            winner = "The winner is Jimmy!";
            System.out.println("Jimmy HP: "+jimmy.getHP());
            win = true; 
        }
        else if(bob.getHP()>0 && jimmy.getHP()<=0)
        {
            winner = "The winner is Bob!";
            System.out.println("Bob HP: "+bob.getHP());
            win = true;
        }
     
     }
     /*
     while(!win)
     {
        if(bob.getHP()>0 && jimmy.getHP()>0)
        {
            bob.thunderbolt(jimmy);
            System.out.println("Bob attack Jimmy with thunderbolt!");
            System.out.println("Jimmy HP:"+jimmy.getHP()+"\n");
        }
        
        if(jimmy.getHP()>0 && sunGlasses.getHP()>0)
        {
            jimmy.flamethrower(sunGlasses);
            System.out.println("Jimmy use flamethrower on Squirtle!!");
            System.out.println("Squirtle HP: "+sunGlasses.getHP()+"\n");
        }
        
        if(sunGlasses.getHP()>0 && brotherMan.getHP()>0)
        {
            sunGlasses.waterGun(brotherMan);
            System.out.println("Squirtle use water gun on Ivysaur!!");
            System.out.println("Ivysaur HP: "+brotherMan.getHP()+"\n");
        }
        
        if(brotherMan.getHP()>0 && bob.getHP()>0)
        {
            brotherMan.vineWhip(bob);
            System.out.println("Ivysaur use vine whip on Bob!!");
            System.out.println("Bob HP:"+bob.getHP()+"\n");
        }
        
        
        if(bob.getHP()>0 && sunGlasses.getHP()>0)
        {
            bob.ironTale(sunGlasses);
            System.out.println("Bob attack Squirtle with iron tale!");
            System.out.println("Squirtle HP:"+sunGlasses.getHP()+"\n");
        }
        
        if(jimmy.getHP()>0 && brotherMan.getHP()>0)
        {
            jimmy.dragonClaw(brotherMan);
            System.out.println("Jimmy use dragon claw on Ivysaur!");
            System.out.println("Ivysaur HP: "+brotherMan.getHP()+"\n");
        }
        
        if(sunGlasses.getHP()>0 && bob.getHP()>0)
        {
            sunGlasses.hydroPump(bob);
            System.out.println("Squirtle use hydro pump on Bob!!");
            System.out.println("Bob HP: "+bob.getHP()+"\n");
        }
        
        if(brotherMan.getHP()>0 && jimmy.getHP()>0)
        {
            brotherMan.seedBomb(jimmy);
            System.out.println("Ivysaur use seed bomb on Jimmy!!");
            System.out.println("Jimmy HP:"+jimmy.getHP()+"\n");
        }
        
        
        
        if(bob.getHP()<=0 && jimmy.getHP()<=0 && brotherMan.getHP()<=0 && sunGlasses.getHP()>0)
        {
            winner = "The winner is Squirtle!";
            System.out.println("Squirtle HP: "+sunGlasses.getHP());            
            win = true;
        }
        else if(bob.getHP()<=0 && jimmy.getHP()<=0 && brotherMan.getHP()>0 && sunGlasses.getHP()<=0)
        {
            winner = "The winner is Ivysaur!";
            System.out.println("Ivysaur HP: "+brotherMan.getHP());
            win = true;
        }  
        else if(bob.getHP()<=0 && jimmy.getHP()>0 && brotherMan.getHP()<=0 && sunGlasses.getHP()<=0)
        {
            winner = "The winner is Jimmy!";
            System.out.println("Jimmy HP:"+jimmy.getHP());
            win = true; 
        }
        else if(bob.getHP()>0 && jimmy.getHP()<=0 && brotherMan.getHP()<=0 && sunGlasses.getHP()<=0)
        {
            winner = "The winner is Bob!";
            System.out.println("Bob HP: "+bob.getHP());
            win = true;
        }
        //else
        //{
         //   winner= "It's a tie!";
          //  win = true;
        //}
     }        */   
         
     System.out.println("\n"+winner);
     
 }
}
