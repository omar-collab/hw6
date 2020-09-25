package com.company;

public class Main {

    public static void main(String[] args) {
        
            Hero hero = new Hero();
            hero.setDamage(30);
            hero.setHealth(200);


            Boss boss = new Boss();
            boss.setHealth(500);
            boss.setDamage(50);
            Weapon weapon = new Weapon();
            weapon.setMicroUzi("MicroUzi");
            weapon.setSubmachineGun("SubmachineGun");
            System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + "Оружие :" + weapon.getMicroUzi());
            System.out.println(hero.getHealth() + " " + hero.getDamage());
    }
}
