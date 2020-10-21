package com.catherine.hunger.game;

/** The type Career contestant. */
public class CareerContestant extends Contestant {
  private static final int BONUS_ATTACK = 50;

  /**
   * Instantiates a new Career contestant.
   *
   * @param healthLevel the health level
   * @param attackLevel the attack level
   * @param defenseLevel the defense level
   * @param isAlive the is alive
   * @param isWoman the is woman
   */

  // call the super class methods to access the S constructor

  CareerContestant(
      int healthLevel, int attackLevel, int defenseLevel, boolean isAlive, boolean isWoman) {
    super(
        "Career Contestant",
        (attackLevel + BONUS_ATTACK),
        defenseLevel,
        healthLevel,
        isAlive,
        isWoman);
  }
}
