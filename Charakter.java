public class Charakter 
{
    //Variables
    String name;
    int health;
    int damage; 

    //Konstruktor
    Charakter(String name, int health, int damage)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    void showStats()
    {
        System.out.println("Name: "+this.name+"\nHealth: "+this.health+"\nDamage: "+this.damage);
    }
}
