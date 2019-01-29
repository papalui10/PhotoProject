package pixLab.classes;
import java.awt.Color;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testLeftRight()
  {
	  Picture nuggets = new Picture("koala.jpg");
	  nuggets.explore();
	  nuggets.shiftLeftRight(300);
	  nuggets.explore();
  }
  
  public static void testUpDown()
  {
	  Picture nuggets = new Picture("koala.jpg");
	  nuggets.explore();
	  nuggets.shiftUpDown(-300);
	  nuggets.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("koala.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture nuggets = new Picture("koala.jpg");
    nuggets.edgeDetection(10);
    nuggets.explore();
  }
  
  public static void testZeroRed()
  {
	  Picture nuggets = new Picture("koala.jpg");
	  nuggets.explore();
	  nuggets.zeroRed();
	  nuggets.explore();
  }
  
  public static void testChromakey()
  {
	  Picture source = new Picture("background.jpg");
      Picture background = new Picture("beetlejuice.jpg");
      source.explore();
	  background.explore();
	  source.chromaKey(background, new Color(215, 200, 212));
	  source.explore();
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("ada.jpg");
	  
	  Picture message = new Picture("hide.jpg");
	  source.explore();
	  message.explore();
	  source.hidePicture(message);
	  source.explore();
	  source.revealPicture();
	  source.explore();
  }
  
  public static void testGlitchIt()
  {
	  Picture source = new Picture("beach.jpg");
	  source.explore();
	  source.glitchIt(0, source, 0, 0);
	  source.explore();
	  
	  
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testLeftRight();
    //testUpDown();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testZeroRed();
	  
	testGlitchIt(); 
  }
}