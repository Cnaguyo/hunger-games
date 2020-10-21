package com.catherine.hunger.game;

// inherit attributes from super

/** The type District contestant. */
public class DistrictContestant extends Contestant {

  private static final int BONUS_DEFENCE = 50;

  /**
   * Instantiates a new District contestant.
   *
   * @param healthLevel the health level
   * @param attackLevel the attack level
   * @param defenseLevel the defense level
   * @param isAlive the is alive
   * @param isWoman the is woman
   */
  DistrictContestant(
      int healthLevel, int attackLevel, int defenseLevel, boolean isAlive, boolean isWoman) {
    super(
        "district contestant",
        attackLevel,
        defenseLevel + BONUS_DEFENCE,
        healthLevel,
        isAlive,
        isWoman);
  }
}
