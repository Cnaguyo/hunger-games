package com.catherine.hunger.game;

/** The type Contestant. */
public class Contestant {
  //  Create all the Attributes

  private String contestantType;
  private int attackLevel;
  private int defenseLevel;
  private int healthLevel;
  private boolean isAlive;
  private boolean isWoman;

  // empty constructor(needed to create a new instance)
  //  return types while methods do

  /**
   * Instantiates a new Contestant.
   *
   * @param attackLevel the attack level
   * @param defenseLevel the defense level
   * @param healthLevel the health level
   */
  public Contestant(int attackLevel, int defenseLevel, int healthLevel) {}

  /**
   * Instantiates a new Contestant.
   *
   * @param contestantType the contestant type
   * @param attackLevel the attack level
   * @param defenseLevel the defense level
   * @param healthLevel the health level
   * @param isAlive the is alive
   * @param isWoman the is woman
   */
  public Contestant(
      String contestantType,
      int attackLevel,
      int defenseLevel,
      int healthLevel,
//      Every contestant is Alive.
      boolean isAlive,
      boolean isWoman) {

    this.contestantType = contestantType;
    this.attackLevel = attackLevel;
    this.defenseLevel = defenseLevel;
    this.healthLevel = healthLevel;
    this.isAlive = isAlive;
    this.isWoman = isWoman;
  }

  // Getters & Setters
  // these will be used to protect my data

  /**
   * Gets contestant type.
   *
   * @return the contestant type
   */
  public String getContestantType() {
    return contestantType;
  }

  /**
   * Sets contestant type.
   *
   * @param contestantType the contestant type
   */
  public void setContestantType(String contestantType) {
    this.contestantType = contestantType;
  }

  /**
   * Gets attack level.
   *
   * @return the attack level
   */
  public int getAttackLevel() {
    return attackLevel;
  }

  /**
   * Sets attack level.
   *
   * @param attackLevel the attack level
   */
  public void setAttackLevel(int attackLevel) {
    this.attackLevel = attackLevel;
  }

  /**
   * Gets defense level.
   *
   * @return the defense level
   */
  public int getDefenseLevel() {
    return defenseLevel;
  }

  /**
   * Sets defense level.
   *
   * @param defenseLevel the defense level
   */
  public void setDefenseLevel(int defenseLevel) {
    this.defenseLevel = defenseLevel;
  }

  /**
   * Gets health level.
   *
   * @return the health level
   */
  public int getHealthLevel() {
    return healthLevel;
  }

  /**
   * Sets health level.
   *
   * @param healthLevel the health level
   */
  public void setHealthLevel(int healthLevel) {
    this.healthLevel = healthLevel;
  }

  /**
   * Is alive boolean.
   *
   * @return the boolean
   */
  public boolean isAlive() {
    return isAlive;
  }

  /**
   * Sets alive.
   *
   * @param alive the alive
   */
  public void setAlive(boolean alive) {
    isAlive = alive;
  }

  /**
   * Is is woman boolean.
   *
   * @return the boolean
   */
  public boolean isIsWoman() {
    return isWoman;
  }

  /**
   * Sets is woman.
   *
   * @param isWoman the is woman
   */
  public void setIsWoman(boolean isWoman) {
    this.isWoman = isWoman;
  }

  /**
   * Gets gender.
   *
   * @return the gender
   */
  public String getGender() {
    if (isWoman) {
      return "Female";
    } else {
      return "Male";
    }
  }

  /**
   * Decrease health.
   *
   * @param decrease the health decrease
   */
  public void decreaseHealth (int decrease) {
    this.healthLevel = this.healthLevel - decrease;
  }

  @Override
  public String toString() {
    return "Contestant{" +
        "contestantType='" + contestantType + '\'' +
        ", attackLevel=" + attackLevel +
        ", defenseLevel=" + defenseLevel +
        ", healthLevel=" + healthLevel +
        ", isAlive=" + isAlive +
        ", isWoman=" + isWoman +
        '}';
  }
}
