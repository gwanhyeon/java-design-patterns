package StrategyPattern;
public class GameCharacter {
    // 접근
    private Weapon weapon;

    // 교환점
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if(weapon == null){
            System.out.println("Hand Attack!");
        }else {
            weapon.attack();
        }
    }
}
