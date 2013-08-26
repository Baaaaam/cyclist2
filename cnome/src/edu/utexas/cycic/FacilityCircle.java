package edu.utexas.cycic;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 * This class extends the Java Circle class. Used to represent the facility
 * on the CYCIC pane and contains all of the information assocaited with
 * the facility.
 * @author Robert
 *
 */
public class FacilityCircle extends Circle implements Serializable{
	String facilityType = "";
	Integer facTypeIndex = 0;
	ArrayList<Object> facilityData = new ArrayList<Object>();
	ArrayList<Object> facilityStructure = new ArrayList<Object>();
	ArrayList<FacilityCircle> childrenList = new ArrayList<FacilityCircle>();
	ArrayList<nodeLink> childrenLinks = new ArrayList<nodeLink>();
	ArrayList<Double> childrenDeltaX = new ArrayList<Double>();
	ArrayList<Double> childrenDeltaY = new ArrayList<Double>();
	ArrayList<Integer> rgbColor = new ArrayList<Integer>();
	/*ArrayList<String> incommods = new ArrayList<String>();
	ArrayList<String> outcommods = new ArrayList<String>();*/
	transient MenuBar menu = new MenuBar();
	transient Text text = new Text();
	transient ImageView image = new ImageView();
	String type = new String();
	String parent = new String();
	Integer parentIndex;
	transient Object name; 
	Boolean childrenShow;
}