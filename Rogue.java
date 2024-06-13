class Rogue extends Character{
  private int agility;
  private int dexterity;

  public Mage (String name, int health){
    super(name, health);
    this.agility = 80;
    this.dexterity = 100;
  }
  
public void attack(Character target){
  if(getHealth() >= 10){
    setHealth(getHealth() - 10);
    target.setHealth(getHealth() - 10);
    System.out.println(getName() + " attacked " + target.getName() + ". " + getName() + "'s health is now: " + getHealth());
    System.out.println(target.getName() + "'s health is now: " + target.getHealth());
  }else{
    System.out.println("Characer is not powerful enough to attack");
  }
}
  
public void levelUp(){
  super.levelUp();
  this.agility += 5;
  this.dexterity += 5;
        System.out.println(getName() + "'s agility is now: " + this.agility);
        System.out.println(getName() + "'s dexterity is now: " + this.dexterity);
 }
}
