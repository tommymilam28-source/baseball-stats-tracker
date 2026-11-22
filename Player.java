public class Player {
   private int plateAppearances; 
   private int atBats;
   private int runs; 
   private int hits;
   private int singles; 
   private int doubles; 
   private int triples; 
   private int homeruns;
   private int totalBases;
   private int extraBaseHits; 
   private int runsBattedIn; 
   private int stolenBases;
   private int caughtStealing;
   private int basesOnBalls;
   private int hitByPitch; 
   private int sacrificeHits;  
   private int strikeouts;
   private int ballInPlayOuts;
   private int reachedOnError;  
   private double stolenBasePercentage;
   private double baseOnBallsPercentage; 
   private double strikeoutPercentage;
   private double battingAverage;
   private double onBasePercentage;  
   private double sluggingPercentage;
   private double onBasePlusSlugging;
   private double weightedOnBaseAverage;
   private double battingAverageOnBallsInPlay;    
   
   public Player (int r, int s, int d, int t, int hr, int rbi, int sb, int cs, int bb, int hbp, int sac, int k, int bipo, int roe) {
      plateAppearances = s + d + t + hr + bb + hbp + sac + k + bipo + roe;
      atBats = plateAppearances - bb - hbp - sac; 
      runs = r; 
      hits = s + d + t + hr; 
      singles = s;
      doubles = d;
      triples = t;
      homeruns = hr;  
      totalBases = s + 2 * d + 3 * t + 4 * hr; 
      extraBaseHits = d + t + hr; 
      runsBattedIn = rbi; 
      stolenBases = sb; 
      caughtStealing = cs; 
      basesOnBalls = bb; 
      hitByPitch = hbp; 
      sacrificeHits = sac; 
      strikeouts = k;
      ballInPlayOuts = bipo;
      stolenBasePercentage = (double) sb / (sb + cs); 
      baseOnBallsPercentage = (double) bb / plateAppearances; 
      strikeoutPercentage = (double) k / plateAppearances; 
      battingAverageOnBallsInPlay = ((double) hits - (double) hr) /(atBats - k - hr + sac);
      battingAverage = hits /(double) atBats;
      onBasePercentage = (hits + bb + hbp) / (double) plateAppearances; 
      sluggingPercentage = totalBases/(double)atBats;
      onBasePlusSlugging = onBasePercentage + sluggingPercentage; 
      weightedOnBaseAverage = (.69 * (double) bb + .72 * (double) hbp + .89 * (double) s + 1.27 * (double) d + 1.62 * (double) t + 2.10 * (double) hr)/plateAppearances; 
   }
   
   //accessor methods for all stats
   public int getPlateAppearances () {
      return plateAppearances; 
   }
   
   public int getAtBats () {
      return atBats; 
   }
   
   public int getRuns () {
      return runs; 
   }
   
   public int getHits () {
      return hits; 
   }
   
   public int getSingles () {
      return singles; 
   }
   
   public int getDoubles () {
      return doubles; 
   }
   
   public int getTriples () {
      return triples; 
   }
   
   public int getHomeruns () {
      return homeruns; 
   }
   
   public int getTotalBases () {
      return totalBases; 
   }
   
   public int getExtraBaseHits () {
      return extraBaseHits; 
   }
   
   public int getRunsBattedIn () {
      return runsBattedIn; 
   }
   
   public int getStolenBases () {
      return stolenBases; 
   }
   
   public int getCaughtStealing () {
      return caughtStealing; 
   }
   
   public int getBasesOnBalls () {
      return basesOnBalls; 
   }
   
   public int getHitByPitch () {
      return hitByPitch; 
   }
   
   public int getSacrificeHits () {
      return sacrificeHits; 
   }
   
   public int getStrikeouts () {
      return strikeouts; 
   }
   
   public int getBallInPlayOuts () {
      return ballInPlayOuts; 
   }
   
   public int getReachedOnError () {
      return reachedOnError; 
   }
   
   public double getStolenBasePercentage() {
    return Math.round(stolenBasePercentage * 1000) / 1000.0;
   }

   public double getBaseOnBallsPercentage () {
    return Math.round(baseOnBallsPercentage * 1000) / 1000.0;      
   }
   
   public double getStrikeoutPercentage () {
    return Math.round(strikeoutPercentage * 1000) / 1000.0;  
   }
   
   public double getBattingAverageOnBallsInPlay () {
    return Math.round(battingAverageOnBallsInPlay * 1000) / 1000.0;  
   }
   
   public double getBattingAverage () {
    return Math.round(battingAverage * 1000) / 1000.0;  
   }
   
   public double getOnBasePercentage () {
    return Math.round(onBasePercentage * 1000) / 1000.0;  
   }
   
   public double getSluggingPercentage () {
     return Math.round(sluggingPercentage * 1000) / 1000.0; 
   }
   
   public double getOnBasePlusSlugging () {
     return Math.round(onBasePlusSlugging * 1000) / 1000.0; 
   }
   
   public double getWeightedOnBaseAverage () {
     return Math.round(weightedOnBaseAverage * 1000) / 1000.0; 
   }
   
   
   public String toString() {
        return "Name: \n" +
               "Plate Appearances (PA): " + plateAppearances + "\n" +
               "At Bats (AB): " + atBats + "\n" +
               "Runs (R): " + runs + "\n" +
               "Hits (H): " + hits + "\n" +
               "Singles (1B): " + singles + "\n" +
               "Doubles (2B): " + doubles + "\n" +
               "Triples (3B): " + triples + "\n" +
               "Homeruns (HR): " + homeruns + "\n" +
               "Total Bases (TB): " + totalBases + "\n" +
               "Extra Base Hits (XBH): " + extraBaseHits + "\n" +
               "Runs Batted In (RBI): " + runsBattedIn + "\n" +
               "Stolen Bases (SB): " + stolenBases + "\n" +
               "Caught Stealing (CS): " + caughtStealing + "\n" +
               "Bases on Balls (BB): " + basesOnBalls + "\n" +
               "Hit by Pitch (HBP): " + hitByPitch + "\n" +
               "Sacrifice Hits (SAC): " + sacrificeHits + "\n" +
               "Strikeouts (K): " + strikeouts + "\n" +
               "Ball In Play Outs (BIPO): " + ballInPlayOuts + "\n" +
               "Stolen Base Percentage (SB%): " + String.format("%.3f", stolenBasePercentage) + "\n" +
               "Base on Balls Percentage (BB%): " + String.format("%.3f", baseOnBallsPercentage) + "\n" +
               "Strikeout Percentage (K%): " + String.format("%.3f", strikeoutPercentage) + "\n" +
               "Batting Average on Balls In Play (BABIP): " + String.format("%.3f", battingAverageOnBallsInPlay) + "\n" +
               "Batting Average (BA): " + String.format("%.3f", battingAverage) + "\n" +
               "On Base Percentage (OBP): " + String.format("%.3f", onBasePercentage) + "\n" +
               "Slugging Percentage (SLG): " + String.format("%.3f", sluggingPercentage) + "\n" +
               "On Base Plus Slugging (OPS): " + String.format("%.3f", onBasePlusSlugging) + "\n" +
               "Weighted On Base Average (wOBA): " + String.format("%.3f", weightedOnBaseAverage);
    }   
   
   
   
   
   /*
   public String toString() {
      return String.format("Plate Appearances (PA): %d\n" +
                           "At Bats (AB): %d\n" +
                           "Runs (R): %d\n" +                          
                           "Hits (H): %d\n" +
                           "Singles (1B): %d\n" +
                           "Doubles (2B): %d\n" +
                           "Triples (3B): %d\n" +
                           "Homeruns (HR): %d\n" +
                           "Total Bases (TB): %d\n" +
                           "Extra Base Hits (XBH): %d\n" +
                           "Runs Batted In (RBI): %d\n" +
                           "Stolen Bases (SB): %d\n" +
                           "Caught Stealing (CS): %d\n" +
                           "Bases on Balls (BB): %d\n" +
                           "Hit by Pitch (HBP): %d\n" +
                           "Sacrifice Hits (SAC): %d\n" +
                           "Strikeouts (K): %d\n" +
                           "Ball In Play Outs (BIPO): %d\n" +
                           "Stolen Base Percentage (SB%%): %.3f\n" +
                           "Base on Balls Percentage (BB%%): %.3f\n" +
                           "Strikeout Percentage (K%%): %.3f\n" +
                           "Batting Average on Balls In Play (BABIP): %.3f\n" +
                           "Batting Average (BA): %.3f\n" +
                           "On Base Percentage (OBP): %.3f\n" +
                           "Slugging Percentage (SLG): %.3f\n" +
                           "On Base Plus Slugging (OPS): %.3f\n" +
                           "Weighted On Base Average (wOBA): %.3f"
                           , plateAppearances, atBats, runs, hits, singles, doubles, triples, homeruns, totalBases, 
                           extraBaseHits, runsBattedIn, stolenBases, caughtStealing, basesOnBalls, hitByPitch, sacrificeHits, strikeouts, 
                           ballInPlayOuts, stolenBasePercentage, baseOnBallsPercentage, strikeoutPercentage, 
                           battingAverageOnBallsInPlay, battingAverage, onBasePercentage, sluggingPercentage, 
                           onBasePlusSlugging, weightedOnBaseAverage);
                           */
                           /*
                           "Plate Appearances (PA): %d\n" +                           
                           "At Bats (AB): %d\n" +
                           "Runs (R): %d\n" +                          
                           "Hits (H): %d\n" +
                           "Singles (1B): %d\n" +
                           "Doubles (2B): %d\n" +
                           "Triples (3B): %d\n" +
                           "Homeruns (HR): %d\n" +
                           "Total Bases (TB): %d\n" +
                           "Extra Base Hits (XBH): %d\n" +
                           "Runs Batted In (RBI): %d\n" +
                           "Stolen Bases (SB): %d\n" +
                           "Caught Stealing (CS): %d\n" +
                           "Bases on Balls (BB): %d\n" +
                           "Hit by Pitch (HBP): %d\n" +
                           "Sacrifice Hits (SAC): %d\n" +
                           "Strikeouts (K): %d\n" +
                           "Ball In Play Outs (BIPO): %d\n" +
                           "Stolen Base Percentage (SB%%): %.3f\n" +
                           "Base on Balls Percentage (BB%%): %.3f\n" +
                           "Strikeout Percentage (K%%): %.3f\n" +
                           "Batting Average on Balls In Play (BABIP): %.3f" +
                           "Batting Average (BA): %.3f\n" +
                           "On Base Percentage (OBP): %.3f\n" +
                           "Slugging Percentage (SLG): %.3f\n" +
                           "On Base Plus Slugging (OPS): %.3f\n" +
                           "Weighted On Base Average (wOBA): %.3f"
                           , name, plateAppearances, atBats, runs, hits, singles, doubles, triples, homeruns, totalBases, 
                           extraBaseHits, runsBattedIn, stolenBases, caughtStealing, basesOnBalls, hitByPitch, sacrificeHits, strikeouts, 
                           ballInPlayOuts, stolenBasePercentage, baseOnBallsPercentage, strikeoutPercentage, 
                           battingAverageOnBallsInPlay, battingAverage, onBasePercentage, sluggingPercentage, 
                           onBasePlusSlugging, weightedOnBaseAverage);
   */
      
   
} 