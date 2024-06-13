class Warrior extends Character{
  private int strength;
  private boolean armor;

  public Warrior (String name, int health){
    super(name, health);
    this.strength = 150;
    this.armor = true;
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
  this.strength += 10;
        System.out.println(getName() + "'s strength is now: " + this.strength);
 }
}
