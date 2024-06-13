class Character{
  private String name;
  private int health;
  private int mana;
  private int level;

public Character (String name, int health){
  this.name = name;
  this.health = health;
  this.mana = 100;
  this.level = 1;
}
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }

  public void setHealth(int health){
    this.health = health;
  }
  
  public int getHealth(){
    return health;
  }

  public void setMana(int mana){
    this.mana = mana;
  }
  
  public int getMana(){
    return mana;
  }

  public void setLevel(int level){
    this.level = level;
  }
  
  public int getLevel(){
    return level;
  }
  
  public void attack(Character target){
    System.out.println(getName() + " attacks " + target);
  }

  public void castSpell(Character target){
    System.out.println(getName() + " casts a spell on " + target);
  }
  
  public void levelUp(){
    this.health += 5;
    this.level++;
    this.mana += 10;
    System.out.println(getName() + "levels up to level " + this.level);
    System.out.println("health: " + this.health);
    System.out.println("mana: " + this.mana);
  
  }
}
  
