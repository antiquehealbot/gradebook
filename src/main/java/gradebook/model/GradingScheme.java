package gradebook.model;

/**
  * Representing a GradingScheme object, leaving as an interface
  * open for extension and modification for users.
  *
  * This class implements the "Abstract Factory" Design Pattern.
  * This class provieds an interface for creating a family of
  * GradingScheme objects with diffreent ways to calculate
  * scores.
  */

public interface GradingScheme {

    double calAvgDroppingLowestScore();

    double calAvgReplacingLowestScore();

}
