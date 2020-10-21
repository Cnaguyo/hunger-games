package com.catherine.hunger.game;

/** The type Game controller. */
public class GameController {

  public void createGame() {

    ContestantList contestantList = new ContestantList();
    contestantList.makeContestants();

    /*// fight method for 1 battle until 1 survivor!!
        int battleNumber = 1;
        while (contestantList.getNumberOfContestantsAlive() > 1) {

          System.out.println("\nBattle " + battleNumber);


        }
        if (contestantList.getNumberOfContestantsAlive() == 1) {
          System.out.println(
              "\nOnly one warrior is left. The winner is Warrior "
                  + contestantList.getContestantAlive()
                  + ". This contestant is now killed by President Snow... :(");
        }
      }*/
    int dayNumber = 1;
    while (contestantList.getNumberOfWarriorsAlive() > 1) {

      System.out.println("\nBattle Day Number " + dayNumber);

      contestantList.startBattle();
      contestantList.resetDay();

      if (contestantList.getNumberOfWarriorsAlive() > 1) {
        System.out.println(

                + contestantList.getNumberOfWarriorsAlive()
                + "  Warriors still Stand and will fight against each other in the coming Battles 'There will  only be 1 Winner' " );
      }
      dayNumber += 1;
    }

    if (contestantList.getNumberOfWarriorsAlive() == 1) {
      System.out.println(
          " Congratulations... The Winner is Warrior "
              + contestantList.getWarriorsAlive()

              + ", He is Eliminated by President SNOW...What a heartBreak!!! ");
      System.out.println(" WATCH OUT FOR SEASON 2 OF HUNGER GAMES. ");
    }
  }
}
