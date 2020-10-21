package com.catherine.hunger.game;

import java.util.ArrayList;

/** The type Contestant list. */
public class ContestantList extends ArrayList<Contestant> {

  /** The constant ATTACK_LEVEL. */
  public static final int ATTACK_LEVEL = 100;

  /** The constant HEALTH_LEVEL. */
  public static final int HEALTH_LEVEL = 120;

  /** The constant DEFENCE_STRENGTH. */
  public static final int DEFENCE_STRENGTH = 100;

  /** Instantiates a new Contestant list. */
  public ContestantList() {}

  /**
   * Gets number of warriors alive.
   *
   * @return the number of warriors alive
   */
  public int getNumberOfWarriorsAlive() {
    int numberAlive = 0;
    for (Contestant i : this) {
      if (i.isAlive()) {
        numberAlive += 1;
      }
    }
    return numberAlive;
  }

  /**
   * Gets warriors alive.
   *
   * @return the warriors alive
   */
  public int getWarriorsAlive() {
    int index = 1;
    for (Contestant i : this) {
      if (i.isAlive()) {
        index += indexOf(i);
      }
    }
    return index;
  }
  //  whenever i reaches 18,the loop increments  i by 1(i++)
  //  when i reaches 18(ie i< 18 is false

  /** Make contestants. */
  public void makeContestants() {
    boolean isWoman = false;
    for (int i = 0; i < 18; i++) {
      // for even number keeps it woman otherwise man
      this.add(
          new DistrictContestant(
              HEALTH_LEVEL,
              ((int) (Math.random() * ATTACK_LEVEL)),
              ((int) (Math.random() * DEFENCE_STRENGTH)),
              true,
              isWoman(i)));
    }
    for (int i = 0; i < 6; i++) {
      // for even number keep it woman otherwise man
      this.add(
          new CareerContestant(
              HEALTH_LEVEL,
              ((int) (Math.random() * ATTACK_LEVEL)),
              ((int) (Math.random() * DEFENCE_STRENGTH)),
              true,
              isWoman(i)));
    }

    int index = 0;
    for (Contestant x : this) {
      index++;

      System.out.println(
          "Warrior "
              + index
              + " is from "
              + x.getContestantType()
              + " has a Health level of "
              + x.getHealthLevel()
              + ", with an Attack level of "
              + x.getAttackLevel()
              + ", and "
              + "a Defense Strength of "
              + x.getAttackLevel()
              + ", Gender is  "
              + x.getGender()
              + " ");
    }
    System.out.println("There are the " + this.size() + " Warriors.");
  }

  private boolean isWoman(int i) {
    if (i % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  /** Start battle. */
  public void startBattle() {

    // you can't have similar values keep that in mind

    int firstOpponent = ((int) (Math.random() * 24)); // 0 -23

    // check if this contestant is still lives

    while (!this.get(firstOpponent).isAlive()) { // find is the chosen is alive
      firstOpponent = ((int) (Math.random() * 24)); // find another opponent from 0-23
    }
    int secondOpponent = ((int) (Math.random() * 24));

    // make sure you  // The fighter generated should be  alive and in good health

    while (firstOpponent == secondOpponent || !this.get(secondOpponent).isAlive()) {
      secondOpponent = ((int) (Math.random() * 24));
    }

    System.out.println(
        "\nWarrior "
            + (firstOpponent + 1)
            + " and Warrior "
            + (secondOpponent + 1)
            + ". The Rivals will battle for Championship....\n"
            + "Warrior "
            + (firstOpponent + 1)
            + " has an Attack of "
            + this.get(firstOpponent).getAttackLevel()
            + " and"
            + " a Defense of "
            + this.get(firstOpponent).getDefenseLevel()
            + ".\n"
            + "Warrior "
            + (secondOpponent + 1)
            + " has an Attack of "
            + this.get(secondOpponent).getAttackLevel()
            + " and"
            + " a Defense of "
            + this.get(secondOpponent).getDefenseLevel()
            + ".");

    while (this.get(firstOpponent).isAlive() && this.get(secondOpponent).isAlive()) {
      fightBegins(firstOpponent, secondOpponent);
    }
  }

  /**
   * Fight begins.
   *
   * @param firstOpponent the first opponent
   * @param secondOpponent the second opponent
   */
  public void fightBegins(int firstOpponent, int secondOpponent) {
    System.out.println("Warrior " + (firstOpponent + 1) + " is ready for Action.");

    if (this.get(firstOpponent).getAttackLevel() > this.get(secondOpponent).getDefenseLevel()) {
      int healthDecrease =
          (this.get(firstOpponent).getAttackLevel() - this.get(secondOpponent).getDefenseLevel());
      this.get(secondOpponent).decreaseHealth(healthDecrease);
      System.out.println(
          "warrior "
              + (secondOpponent + 1)
              + " loses the attack, and the Health level decreases to "
              + this.get(secondOpponent).getHealthLevel());
      if (this.get(secondOpponent).getHealthLevel() <= 0) {
        this.get(secondOpponent).setAlive(false);
        System.out.println("Warrior " + (secondOpponent + 1) + " dies.");
      }
    } else if (this.get(secondOpponent).getDefenseLevel()
        > this.get(firstOpponent).getAttackLevel()) {
      int healthDecrease =
          (this.get(secondOpponent).getDefenseLevel() - this.get(firstOpponent).getAttackLevel());
      this.get(firstOpponent).decreaseHealth(healthDecrease);
      System.out.println(
          "Warrior "
              + (firstOpponent + 1)
              + " loses the fight and his or her Health level decreases to "
              + this.get(firstOpponent).getHealthLevel());
      if (this.get(firstOpponent).getHealthLevel() <= 0) {
        this.get(firstOpponent).setAlive(false);
//        System.out.println("Warrior " + (firstOpponent + 1) + " is eliminated");
        System.out.println("Warrior " + (firstOpponent + 1) + ", has been eliminated");
      }

    } else {
      System.out.println(" Every Man for himself");
    }
  }
  // this method automatically re-sets a new day

  /** Reset day. */
  public void resetDay() {
    for (Contestant i : this) {
      if (i.isAlive()) {
        i.setHealthLevel(HEALTH_LEVEL);
      }
    }
  }
}
