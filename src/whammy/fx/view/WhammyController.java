package whammy.fx.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import whammy.fx.MainApp;
import whammy.fx.model.WhammyCommand;

public class WhammyController {
	ObservableList<String> whammyData = FXCollections.observableArrayList("2 OCT UP", "OCT UP");
	ArrayList<ChoiceBox<String>> commands = new ArrayList<ChoiceBox<String>>();
	ArrayList<Slider> expNumbers = new ArrayList<Slider>();
	ArrayList<Label> expLabels = new ArrayList<Label>();
	static ArrayList<Integer> messageArray = new ArrayList<Integer>();
	static int delay = 1000;
	
	@FXML
	public ChoiceBox<String> command1;

	@FXML
	public ChoiceBox<String> command2;

	@FXML
	public ChoiceBox<String> command3;

	@FXML
	public ChoiceBox<String> command4;

	@FXML
	public ChoiceBox<String> command5;

	@FXML
	public ChoiceBox<String> command6;

	@FXML
	public ChoiceBox<String> command7;

	@FXML
	public ChoiceBox<String> command8;

	@FXML
	public ChoiceBox<String> command9;

	@FXML
    public ChoiceBox<String> command10;

    @FXML
	public ChoiceBox<String> command11;

	@FXML
	public ChoiceBox<String> command12;

	@FXML
	public ChoiceBox<String> command13;

	@FXML
    public ChoiceBox<String> command14;

    @FXML
	public ChoiceBox<String> command15;

	@FXML
	public ChoiceBox<String> command16;

	@FXML
	public Slider slider1;

	@FXML
	public Slider slider2;

	@FXML
	public Slider slider3;

	@FXML
	public Slider slider4;

	@FXML
	public Slider slider5;

	@FXML
	public Slider slider6;

	@FXML
    public Slider slider7;

    @FXML
    public Slider slider8;

    @FXML
	public Slider slider9;

	@FXML
	public Slider slider10;

	@FXML
	public Slider slider11;

	@FXML
	public Slider slider12;

	@FXML
	public Slider slider13;

	@FXML
	public Slider slider14;

	@FXML
    public Slider slider15;

    @FXML
    public Slider slider16;
    
    @FXML
    public Label slideValue1;
    
    @FXML
    public Label slideValue2;
    
    @FXML
    public Label slideValue3;
    
    @FXML
    public Label slideValue4;
    
    @FXML
    public Label slideValue5;

    @FXML
    public Label slideValue6;
    
    @FXML
    public Label slideValue7;
    
    @FXML
    public Label slideValue8;
    
    @FXML
    public Label slideValue9;
    
    @FXML
    public Label slideValue10;
    
    @FXML
    public Label slideValue11;
    
    @FXML
    public Label slideValue12;
    
    @FXML
    public Label slideValue13;
    
    @FXML
    public Label slideValue14;
    
    @FXML
    public Label slideValue15;

    @FXML
    public Label slideValue16;
    
    // Reference to the main application.
    private MainApp mainApp;
    
    @FXML
    public TextField delayText;

    @FXML
    private Button setDelayButton;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public WhammyController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
		//ArrayList<ChoiceBox<String>> commands = new ArrayList<ChoiceBox<String>>();
		commands.add(command1);
		commands.add(command2);
		commands.add(command3);
		commands.add(command4);
		commands.add(command5);
		commands.add(command6);
		commands.add(command7);
		commands.add(command8);
		commands.add(command9);
		commands.add(command10);
		commands.add(command11);
		commands.add(command12);
		commands.add(command13);
		commands.add(command14);
		commands.add(command15);
		commands.add(command16);
		
		
		expNumbers.add(slider1);
		expNumbers.add(slider2);
		expNumbers.add(slider3);
		expNumbers.add(slider4);
		expNumbers.add(slider5);
		expNumbers.add(slider6);
		expNumbers.add(slider7);
		expNumbers.add(slider8);
		expNumbers.add(slider9);
		expNumbers.add(slider10);
		expNumbers.add(slider11);
		expNumbers.add(slider12);
		expNumbers.add(slider13);
		expNumbers.add(slider14);
		expNumbers.add(slider15);
		expNumbers.add(slider16);
		
		expLabels.add(slideValue1);
		expLabels.add(slideValue2);
		expLabels.add(slideValue3);
		expLabels.add(slideValue4);
		expLabels.add(slideValue5);
		expLabels.add(slideValue6);
		expLabels.add(slideValue7);
		expLabels.add(slideValue8);
		expLabels.add(slideValue9);
		expLabels.add(slideValue10);
		expLabels.add(slideValue11);
		expLabels.add(slideValue12);
		expLabels.add(slideValue13);
		expLabels.add(slideValue14);
		expLabels.add(slideValue15);
		expLabels.add(slideValue16);
		
		// Listen for Slider value changes

		//String cmdName;
    	for (int i = 0; i < 16; i++){
    		try {
    			
				commands.get(i).setItems(
						FXCollections.observableArrayList("UP 2 OCT", "UP OCT",
														"UP 5TH", "UP 4TH",
														"DOWN 2ND", "DOWN 4TH",
														"DOWN 5TH", "DOWN OCT",
														"DOWN 2 OCT", "DIVE BOMB",
														"DEEP", "SHALLOW",
														"UP 2ND/UP 3RD", "UP Min3RD/UP 3RD",
														"UP 3RD/UP 4TH", "UP 4TH/UP 5TH",
														"UP 5TH/UP 6TH", "UP 5TH/UP 7TH",
														"DOWN 4TH/DOWN 3RD", "DOWN 5TH/DOWN 4TH",
														"UP OCT/DOWN OCT"));
				commands.get(i).setValue("UP 2 OCT");
				int counter = i;
				expNumbers.get(i).valueProperty().addListener(new ChangeListener<Number>() {
				    @Override
				    public void changed(ObservableValue<? extends Number> observable,
				            Number oldValue, Number newValue) {

				        	expLabels.get(counter).setText(Integer.toString((int) Math.round(newValue.doubleValue())));
				    }
				});
				
    		} catch (SecurityException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
    	
    	
    	
    }

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Button was clicked, do something...
        getSequence();
    }
    
    public void getSequence(){
    	
    	messageArray.clear();
    	for (int i = 0; i < 16; i++){
    		try {
    			
    			//add 1 to command index to get program number
    			int programNumber = commands.get(i).getSelectionModel().getSelectedIndex() + 1;
    			int expNumber = (int) Math.round(expNumbers.get(i).getValue());
				setProgramAndTreadle(messageArray, programNumber, expNumber);
    		} catch (SecurityException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    	}
    	createProgram(messageArray);
    }
    
	public static void setProgramAndTreadle(ArrayList<Integer> messageArray, int program, int treadle){
		messageArray.add(192);
		messageArray.add(program);
		messageArray.add(176);
		messageArray.add(11);
		messageArray.add(treadle);
	}
	
	public static String getProgramData(ArrayList<Integer> theArray) {
	      StringBuilder sb = new StringBuilder();
	      sb.append("{");
	      for (int i = 0; i < theArray.size(); i++) {
	         if (i > 0) {
	            sb.append(", ");
	         }
	         int item = theArray.get(i);
	         sb.append(item);
	      }
	      sb.append("}");
	      return sb.toString();
	   }

	public void setDelay(){
		int newDelay = Integer.parseInt(delayText.getText());
		this.delay = newDelay;
	}
	
	
    public static void writeFile(String program){
	   		File fold = new File("Whammy.ino");
	
	   		
	   		fold.delete();
	   		File fnew = new File("Whammy.ino");
	   		//System.out.println(program);
	   	
	   		try {
	   		    FileWriter f2 = new FileWriter(fnew, false);
	   		    f2.write(program);
	   		    f2.close();
	   		} catch (IOException e) {
	   		    e.printStackTrace();
	   		}    
	   		
			try (BufferedReader br = new BufferedReader(new FileReader(fnew))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       System.out.println(line);
		    }
			}catch (IOException e) {
			    e.printStackTrace();
			}   
	
	   	}
	
	public static void createProgram(ArrayList<Integer> messageArray){
		String sb = "#include <SoftwareSerial.h> \n" +
				"int k; \n" +
				"SoftwareSerial midi_serial(0, 1); \n" +
				"void play_loop(); \n" +
				"int array[" + messageArray.size() + "] = "+ getProgramData(messageArray) + "; \n" +
				"void setup() {  \n" +
				"  midi_serial.begin(31250); \n" +
				"} \n" +
				"void loop() {   \n" +
				"  play_loop(); \n" +
				"} \n" +
				"void play_loop() { \n" +
				"  int i; \n" +
				"  for (i = 0; i < " + messageArray.size() + "; i++) { \n " +
				"    midi_serial.write((byte) array[i]); //192 \n" +
				"    i++; \n" +
				"    midi_serial.write((byte) (array[i]-1)); //8 \n" +
				"    i++; \n" +
				"    midi_serial.write((byte) array[i]); //176 \n" +
				"    i++; \n" +
				"    midi_serial.write((byte) array[i]); //11 \n" +
				"    i++; \n" +
				"    midi_serial.write((byte) array[i]); //127 \n" +
				"  \n" +
				"    delay(" + delay + "); \n " +
				"  } \n " +
				"} \n";
		writeFile(sb);
		uploadArduino();
	}
	
////ADD BUTTON FUNCTIONALITY
	
	public static void uploadArduino(){
		String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec("ArduinoUploader Whammy.ino 1 COM3");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println("line: " + s);
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
	}

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}