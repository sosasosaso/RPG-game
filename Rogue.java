class Rogue extends Character{
  private int agility;
  private int dexterity;

  public Mage (String name, int health){
    super(name, health);
    this.intelligence = 120;
    this.spellPower = 200;
  }
  
public void castSpell(Character target){
  if(getMana() >= 20){
    setMana(getMana() - 20);
    target.setHealth(getHealth() - 20);
    System.out.println(getName() + " casted a spell on " + target.getName() + ". " + getName() + "'s mana is now: " + getMana());
  }else{
    System.out.println("Characer is not powerful enough to cast a spell");
  }
}
  
public void levelUp(){
   super.levelUp();
        this.intelligence += 5;
        this.spellPower += 5;
    System.out.println(getName() + "'s intelligence is now: " + this.intelligence);
    System.out.println(getName() + "'s spell power is now: " + this.spellPower);
 }
}
