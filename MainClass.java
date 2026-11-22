import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene; 
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;      
import javafx.geometry.Pos;      
import javafx.event.EventHandler; 
import javafx.event.ActionEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
 

public class MainClass extends Application {
  //fields
   
   //lebel declarations
   private static Label plateAppearancesLabel; 
   private static Label atBatsLabel;
   private static Label runsLabel;
   private static Label hitsLabel;
   private static Label singlesLabel;
   private static Label doublesLabel;
   private static Label triplesLabel;
   private static Label homerunsLabel;
   private static Label totalBasesLabel;
   private static Label extraBaseHitsLabel;
   private static Label runsBattedInLabel;
   private static Label stolenBasesLabel;
   private static Label caughtStealingLabel;
   private static Label basesOnBallsLabel;
   private static Label hitByPitchLabel;
   private static Label sacrificeHitsLabel;
   private static Label strikeoutsLabel;
   private static Label ballInPlayOutsLabel;
   private static Label reachedOnErrorLabel;
   private static Label stolenBasePercentageLabel;
   private static Label baseOnBallsPercentageLabel;
   private static Label strikeoutPercentageLabel;
   private static Label battingAverageLabel;
   private static Label onBasePercentageLabel;
   private static Label sluggingPercentageLabel;
   private static Label onBasePlusSluggingLabel;
   private static Label weightedOnBaseAverageLabel;
   private static Label battingAverageOnBallsInPlayLabel;
   
   //button control variables
   private int clickCountR = 0;
   private int clickCount1B = 0; 
   private int clickCount2B = 0;
   private int clickCount3B = 0;
   private int clickCountHR = 0;
   private int clickCountRBI = 0;
   private int clickCountSB = 0;
   private int clickCountCS = 0;
   private int clickCountBB = 0;
   private int clickCountHBP = 0;
   private int clickCountSAC = 0;
   private int clickCountK = 0;
   private int clickCountBIPO = 0;
   private int clickCountROE = 0;  
   
   public void start(Stage primaryStage) {
     //Set scene 
      
      //label initializations
      plateAppearancesLabel = new Label("Plate Appearances (PA): ");
      atBatsLabel = new Label("At Bats (AB): ");
      runsLabel = new Label("Runs (R): ");
      hitsLabel = new Label("Hits (H): ");
      singlesLabel = new Label("Singles (1B): ");
      doublesLabel = new Label("Doubles (2B): ");
      triplesLabel = new Label("Triples (3B): ");
      homerunsLabel = new Label("Homeruns (HR): ");
      totalBasesLabel = new Label("Total Bases (TB): ");
      extraBaseHitsLabel = new Label("Extra Base Hits (XBH): ");
      runsBattedInLabel = new Label("Runs Batted In (RBI): ");
      stolenBasesLabel = new Label("Stolen Bases (SB):");
      caughtStealingLabel = new Label("Caught Stealing (CS): ");
      basesOnBallsLabel = new Label("Bases on Balls (BB): ");
      hitByPitchLabel = new Label("Hit by Pitch (HBP): ");
      sacrificeHitsLabel = new Label("Sacrifice Hits (SAC): ");
      strikeoutsLabel = new Label("Strikeouts (K): ");
      ballInPlayOutsLabel = new Label("Ball In Play Outs (BIPO): ");
      reachedOnErrorLabel = new Label("Reached On Error (ROE): ");
      stolenBasePercentageLabel = new Label("Stolen Base Percentage (SB%): ");
      baseOnBallsPercentageLabel = new Label("Base on Balls Percentage (BB%): ");
      strikeoutPercentageLabel = new Label("Strikeout Percentage (K%): ");
      battingAverageLabel = new Label("Batting Average (BA): ");
      onBasePercentageLabel = new Label("On Base Percentage (OBP): ");
      sluggingPercentageLabel = new Label("Slugging Percentage (SLG): ");
      onBasePlusSluggingLabel = new Label("On Base Plus Slugging (OPS): ");
      weightedOnBaseAverageLabel = new Label("Weighted On Base Average (wOBA): ");
      battingAverageOnBallsInPlayLabel = new Label("Batting Average on Balls In Play (BABIP): ");
      
      //button objects
      Button runButton = new Button("R");
      Button singleButton = new Button("1B");
      Button doubleButton = new Button("2B");
      Button tripleButton = new Button("3B");
      Button hrButton = new Button("HR");
      Button rbiButton = new Button("RBI");
      Button sbButton = new Button("SB");
      Button csButton = new Button("CS");
      Button bbButton = new Button("BB");
      Button hbpButton = new Button("HBP");
      Button sacButton = new Button("SAC");
      Button kButton = new Button("K");
      Button bipoButton = new Button("BIPO");
      Button roeButton = new Button("ROE");
      
      //set button sizes
      runButton.setPrefSize(50, 50);
      singleButton.setPrefSize(50, 50);
      doubleButton.setPrefSize(50, 50);
      tripleButton.setPrefSize(50, 50);
      hrButton.setPrefSize(50, 50);
      rbiButton.setPrefSize(50, 50);
      sbButton.setPrefSize(50, 50);
      csButton.setPrefSize(50, 50);
      bbButton.setPrefSize(50, 50);
      hbpButton.setPrefSize(50, 50);
      sacButton.setPrefSize(50, 50);
      kButton.setPrefSize(50, 50);
      bipoButton.setPrefSize(50, 50);
      roeButton.setPrefSize(50, 50);
      
      //set button font
      runButton.setFont(new Font("Georgia", 12));
      singleButton.setFont(new Font("Georgia", 12));
      doubleButton.setFont(new Font("Georgia", 12));
      tripleButton.setFont(new Font("Georgia", 12));
      hrButton.setFont(new Font("Georgia", 12));
      rbiButton.setFont(new Font("Georgia", 12));
      sbButton.setFont(new Font("Georgia", 12));
      csButton.setFont(new Font("Georgia", 12));
      bbButton.setFont(new Font("Georgia", 12));
      hbpButton.setFont(new Font("Georgia", 12));
      sacButton.setFont(new Font("Georgia", 12));
      kButton.setFont(new Font("Georgia", 12));
      bipoButton.setFont(new Font("Georgia", 12));
      roeButton.setFont(new Font("Georgia", 12));
      
      
      
      
      //layout container obj 
      VBox vbox = new VBox(20); // Vertical layout with spacing
      vbox.setAlignment(Pos.CENTER);
      Label title = new Label("Baseball Stats Dashboard");
      title.setFont(new Font(24)); 
      Label userGuide = new Label("User Guide: Every click on a counting stat button will add one to that stat's total. See how each click effects the rest of your stats!");
      GridPane myGP = new GridPane ();
      myGP.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(2))));
      
      ColumnConstraints col1 = new ColumnConstraints();
      col1.setPrefWidth(200);
      col1.setMinWidth(200);
      col1.setMaxWidth(200);

      RowConstraints row1 = new RowConstraints();
      row1.setPrefHeight(100);
      row1.setMinHeight(100);
      row1.setMaxHeight(100);

      myGP.getColumnConstraints().add(col1);
      myGP.getRowConstraints().add(row1);
      
      vbox.getChildren().addAll(title, userGuide, myGP);      
      
      //add controls to the GridPane
      myGP.add( runButton, 1, 1);
      myGP.add( sbButton, 1, 2);
      myGP.add( bipoButton, 1, 3);
      myGP.add( bbButton, 1, 4);
      myGP.add( roeButton, 1, 5);
      myGP.add( singleButton, 1, 6);
      myGP.add( tripleButton, 1, 7);
      myGP.add( rbiButton, 2, 1);
      myGP.add( csButton, 2, 2);
      myGP.add( kButton, 2, 3);
      myGP.add( hbpButton, 2, 4);
      myGP.add( sacButton, 2, 5);
      myGP.add( doubleButton, 2, 6);
      myGP.add( hrButton, 2, 7);
      myGP.add( plateAppearancesLabel, 3, 1);
      myGP.add( atBatsLabel, 3, 2);
      myGP.add( hitsLabel, 3, 3);
      myGP.add( singlesLabel, 3, 4);
      myGP.add( doublesLabel, 3, 5);
      myGP.add( triplesLabel, 3, 6);
      myGP.add( homerunsLabel, 3, 7);
      myGP.add( totalBasesLabel, 4, 1);
      myGP.add( extraBaseHitsLabel, 4, 2);
      myGP.add( runsBattedInLabel, 4, 3);
      myGP.add( runsLabel, 4, 4);
      myGP.add( stolenBasesLabel, 4, 5);
      myGP.add( caughtStealingLabel, 4, 6);
      myGP.add( reachedOnErrorLabel, 4, 7);
      myGP.add( basesOnBallsLabel, 5, 1);
      myGP.add( hitByPitchLabel, 5, 2);
      myGP.add( sacrificeHitsLabel, 5, 3);
      myGP.add( strikeoutsLabel, 5, 4);
      myGP.add( ballInPlayOutsLabel, 5, 5);
      myGP.add( stolenBasePercentageLabel, 5, 6);
      myGP.add( baseOnBallsPercentageLabel, 5, 7);
      myGP.add( strikeoutPercentageLabel, 6, 1);
      myGP.add( battingAverageOnBallsInPlayLabel, 6, 2);
      myGP.add( battingAverageLabel, 6, 3);
      myGP.add( onBasePercentageLabel, 6, 4);
      myGP.add( sluggingPercentageLabel, 6, 5);
      myGP.add( onBasePlusSluggingLabel, 6, 6);
      myGP.add( weightedOnBaseAverageLabel, 6, 7); 
      
      //complete scene procedures 
      
      myGP.setPrefSize(600, 400); // Defines total layout size
      myGP.setGridLinesVisible(false); 
      Scene myScene = new Scene (vbox, 1200, 500); 
      primaryStage.setScene(myScene); 
      primaryStage.setTitle("Player Stat Keeper"); 
      primaryStage.show();
      

     //set event handling for each button 
      
      runButton.setOnAction(event->{
         clickCountR++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      singleButton.setOnAction(event->{
         clickCount1B++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      doubleButton.setOnAction(event->{
         clickCount2B++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      tripleButton.setOnAction(event->{
         clickCount3B++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      hrButton.setOnAction(event->{
         clickCountHR++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      rbiButton.setOnAction(event->{
         clickCountRBI++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      sbButton.setOnAction(event->{
         clickCountSB++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      csButton.setOnAction(event->{
         clickCountCS++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      bbButton.setOnAction(event->{
         clickCountBB++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      hbpButton.setOnAction(event->{
         clickCountHBP++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      sacButton.setOnAction(event->{
         clickCountSAC++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      kButton.setOnAction(event->{
         clickCountK++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      bipoButton.setOnAction(event->{
         clickCountBIPO++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      
      roeButton.setOnAction(event->{
         clickCountROE++;
         Player updatedStats = new Player (clickCountR, clickCount1B, clickCount2B, clickCount3B, clickCountHR, clickCountRBI, clickCountSB, clickCountCS, clickCountBB, clickCountHBP, clickCountSAC, clickCountK, clickCountBIPO, clickCountROE);
         updateLabels(updatedStats);  
      });
      




/*
            
      Label number = new Label("#13");
      Label name = new Label("Ronald Acuna Jr. ");
      Label position = new Label("RF"); 

      Image myImage = new Image("file:acuna.jpg", 100, 100, false, false); 
      ImageView myImageView = new ImageView (myImage);  

      */
      }
   // to update all labels after each event
   public static void updateLabels (Player pObject) {
      plateAppearancesLabel.setText("Plate Appearances (PA): " + pObject.getPlateAppearances());
      atBatsLabel.setText("At Bats (AB): "+ pObject.getAtBats());
      runsLabel.setText("Runs (R): "+ pObject.getRuns());
      hitsLabel.setText("Hits (H): "+ pObject.getHits());
      singlesLabel.setText("Singles (1B): " + pObject.getSingles());
      doublesLabel.setText("Doubles (2B): "+ pObject.getDoubles());
      triplesLabel.setText("Triples (3B): "+ pObject.getTriples());
      homerunsLabel.setText("Homeruns (HR): "+ pObject.getHomeruns());
      totalBasesLabel.setText("Total Bases (TB): "+ pObject.getTotalBases());
      extraBaseHitsLabel.setText("Extra Base Hits (XBH): "+ pObject.getExtraBaseHits());
      runsBattedInLabel.setText("Runs Batted In (RBI): "+ pObject.getRunsBattedIn());
      stolenBasesLabel.setText("Stolen Bases (SB):"+ pObject.getStolenBases());
      caughtStealingLabel.setText("Caught Stealing (CS): "+ pObject.getCaughtStealing());
      basesOnBallsLabel.setText("Bases on Balls (BB): "+ pObject.getBasesOnBalls());
      hitByPitchLabel.setText("Hit by Pitch (HBP): "+ pObject.getHitByPitch());
      sacrificeHitsLabel.setText("Sacrifice Hits (SAC): "+ pObject.getSacrificeHits());
      strikeoutsLabel.setText("Strikeouts (K): "+ pObject.getStrikeouts());
      ballInPlayOutsLabel.setText("Ball In Play Outs (BIPO): "+ pObject.getBallInPlayOuts());
      reachedOnErrorLabel.setText("Reached On Error (ROE): "+ pObject.getReachedOnError());
      stolenBasePercentageLabel.setText("Stolen Base Percentage (SB%): "+ pObject.getStolenBasePercentage());
      baseOnBallsPercentageLabel.setText("Base on Balls Percentage (BB%): "+ pObject.getBaseOnBallsPercentage());
      strikeoutPercentageLabel.setText("Strikeout Percentage (K%): "+ pObject.getStrikeoutPercentage());
      battingAverageLabel.setText("Batting Average (BA): "+ pObject.getBattingAverage());
      onBasePercentageLabel.setText("On Base Percentage (OBP): "+ pObject.getOnBasePercentage());
      sluggingPercentageLabel.setText("Slugging Percentage (SLG): "+ pObject.getSluggingPercentage());
      onBasePlusSluggingLabel.setText("On Base Plus Slugging (OPS): "+ pObject.getOnBasePlusSlugging());
      weightedOnBaseAverageLabel.setText("Weighted On Base Average (wOBA): "+ pObject.getWeightedOnBaseAverage());
      battingAverageOnBallsInPlayLabel.setText("Batting Average on Balls In Play (BABIP): "+ pObject.getBattingAverageOnBallsInPlay());
      
   }
   public static void main(String[] args) {
      launch(args); 
   }
}


/*
public class MainClass {
   public static void main(String[] args) {
      // constructor: public Player (String n, int r, int s, int d, int t, int hr, int rbi, int sb, int cs, int bb, int hbp, int sac, int k, int bipo, int roe)
      Player acuna = new Player ("Ronald Acuna Jr.", 149, 137, 35, 4, 41, 106, 73, 14, 80, 9, 3, 84, 514, 4); 
      System.out.println(acuna.toString());
   }
} 
*/