package gradebook.model;

/**
  * Representing a GradingScheme object, leaving as an interface
  * open for extension and modification for users
  */

public interface GradingScheme {

    double calAvgDroppingLowestScore();

    double calAvgReplacingLowestScore();

}