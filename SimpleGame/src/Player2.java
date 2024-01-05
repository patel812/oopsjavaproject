public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){
            this.health -= 20;
            if(this.health <= 0){
                this.health = 0;
                System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20. & New health is "+this.health);
            }
        }
            if (!armour){
            this.health -= 30;
            if(this.health <= 0){
                this.health = 0;
                System.out.println("Got hit by gun 1. Health is reduced by 30. & New health is "+this.health);
            }
        }
            if(this.health == 0){
                System.out.println(getName()+" is dead");
            }
        }


    @Override
    public void damageByGun2() {
    if (armour){
        this.health -= 20;
        if (this.health <= 0){
            this.health = 0;
            System.out.println("Armour is on. Got hit by gun 2. Health is reduced by 20."+" New health is "+this.health);
        }
    }
        if (!armour){
            this.health -= 40;
            if (this.health <= 0){
                this.health = 0;
                System.out.println("Got hit by gun 2. Health is reduced by 40. " +" New health is "+this.health);
            }
        }

        if(this.health == 0){
            System.out.println(getName()+" is dead");
        }
    }


    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isArmour() {
        return armour;
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }
}
