package Tema4.POO_1;

public class Hero {
    // Si el número siempre es el mismo → ponerlo como constante
    // Ejemplos: edad mínima, daño mínimo, curación, límites, etc

    private static final int potion_Health = 10;
    private static final int rest_Health = 50;
    private static final int exp_Attack = 10;
    private static final int level_up_Exp = 50;
    private static final int health_extra_Level = 5;
    private static final int extra_Attack = 1;
    private static final int extra_Defense  = 1;
    private static final int min_Damage = 10;

    // Atributos
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    // Constructor vacío
    public Hero(){
        name = "";
        level = 0;
        health = 0;
        maxHealth = 0;
        experience = 0;
        attack = 0;
        defense = 0;
    }

    // Constructor con parametros
    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense){
        this.name=name;
        this.level=level;
        this.health=health;
        this.maxHealth=maxHealth;
        this.experience=experience;
        this.attack=attack;
        this.defense=defense;
    }

    // Getters y setters
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getlevel(){
        return level;
    }
    public void setlevel(int level) {
        this.level = level;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth(){
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExperience(){
        return experience;
    }
    public void setexperience(int experience) {
        this.experience = experience;
    }

    public int getAttack(){
        return attack;
    }
    public void setattack(int attack) {
        this.attack = attack;
    }

    public int getDefense(){
        return defense;
    }
    public void setdefense(int defense) {
        this.defense = defense;
    }


    // Metodos

    public void drinkPotion(){
        health = Math.min(health + potion_Health, maxHealth);
    }

    public void rest(){
        health = Math.min(health + rest_Health, maxHealth);
    }

    public void attack(Hero otroHeroe) {
        int damage = Math.max(this.attack - otroHeroe.defense, min_Damage);
        otroHeroe.health = Math.max(otroHeroe.health - damage, 0);
        this.experience += exp_Attack;
        if (this.experience >= level_up_Exp) {
            this.experience -= level_up_Exp;
            Level_Up_Exp();
        }
    }

    public void Level_Up_Exp(){
        level += 1;
        maxHealth += health_extra_Level;
        health = maxHealth;
        attack += extra_Attack;
        defense += extra_Defense;
    }

    // Imprime la información
    public void print() {
        System.out.println(this.toString());
    }

    // Devuelve información como texto
    public String toString() {
        return "Nombre: " + name + ", Nivel: " + level + ", Salud: " + health + ", MaximaSalud: " + maxHealth + ", Experiencia: " + experience + ", Ataque: " + attack + ", Defensa: " + defense;
    }
}
