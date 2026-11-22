# Baseball Stats Tracker

A JavaFX desktop app that tracks a hitter's stats in real time. Each button records one event (a single, a walk, a strikeout, and so on), and the dashboard immediately recalculates the player's counting and rate stats, including advanced metrics like wOBA and BABIP.

## What it does

- **14 input buttons** for game events: R, 1B, 2B, 3B, HR, RBI, SB, CS, BB, HBP, SAC, K, BIPO (ball-in-play out), ROE (reached on error).
- **Live dashboard** that updates every stat after each click.
- **Derived stats** calculated from the inputs:

| Stat | Formula |
|---|---|
| Plate Appearances (PA) | 1B + 2B + 3B + HR + BB + HBP + SAC + K + BIPO + ROE |
| At Bats (AB) | PA − BB − HBP − SAC |
| Hits (H) | 1B + 2B + 3B + HR |
| Total Bases (TB) | 1B + 2·2B + 3·3B + 4·HR |
| Extra-Base Hits (XBH) | 2B + 3B + HR |
| Batting Average (BA) | H / AB |
| On-Base Percentage (OBP) | (H + BB + HBP) / PA |
| Slugging (SLG) | TB / AB |
| OPS | OBP + SLG |
| BABIP | (H − HR) / (AB − K − HR + SAC) |
| BB% / K% | BB / PA, K / PA |
| Stolen Base % (SB%) | SB / (SB + CS) |
| **wOBA** | (.69·BB + .72·HBP + .89·1B + 1.27·2B + 1.62·3B + 2.10·HR) / PA |

## How it's built

- **`Player.java`**: the model. It takes raw event counts and computes every derived stat in the constructor, with accessor methods that round rate stats to three decimals.
- **`MainClass.java`**: the JavaFX `Application`. It builds the layout (`VBox` + `GridPane`), tracks click counts, and uses event-driven handlers (lambdas on `setOnAction`) to rebuild a `Player` and refresh every label on each click.

Concepts used: object-oriented design (separating the model from the UI), encapsulation, event-driven programming, and JavaFX layout.

## Running it

Requires a JDK (11+) and the [JavaFX SDK](https://openjfx.io/).

```bash
# Point this at the lib folder of your JavaFX SDK download
export PATH_TO_FX=/path/to/javafx-sdk/lib

javac --module-path "$PATH_TO_FX" --add-modules javafx.controls *.java
java  --module-path "$PATH_TO_FX" --add-modules javafx.controls MainClass
```

## Author

Thomas Milam, BBA in Management Information Systems, Georgia College & State University (2027)
