package whammy.fx.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
import javafx.scene.control.ToggleButton;
import whammy.fx.MainApp;
import whammy.fx.model.WhammyCommand;

public class WhammyController {
	ObservableList<String> whammyData = FXCollections.observableArrayList("2 OCT UP", "OCT UP");
	ArrayList<ChoiceBox<String>> commands = new ArrayList<ChoiceBox<String>>();
	ArrayList<Slider> expNumbers = new ArrayList<Slider>();
	ArrayList<TextField> expLabels = new ArrayList<TextField>();
	ArrayList<ToggleButton> toggles = new ArrayList<ToggleButton>();
	static ArrayList<Integer> messageArray = new ArrayList<Integer>();
	static int delay = 1000;
	static int currentToggleValue = 0;
	
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
	public ChoiceBox<String> command17;

	@FXML
	public ChoiceBox<String> command18;

	@FXML
	public ChoiceBox<String> command19;

	@FXML
	public ChoiceBox<String> command20;

	@FXML
	public ChoiceBox<String> command21;

	@FXML
	public ChoiceBox<String> command22;

	@FXML
	public ChoiceBox<String> command23;

	@FXML
	public ChoiceBox<String> command24;

	@FXML
	public ChoiceBox<String> command25;

	@FXML
    public ChoiceBox<String> command26;

    @FXML
	public ChoiceBox<String> command27;

	@FXML
	public ChoiceBox<String> command28;

	@FXML
	public ChoiceBox<String> command29;

	@FXML
    public ChoiceBox<String> command30;

    @FXML
	public ChoiceBox<String> command31;

	@FXML
	public ChoiceBox<String> command32;


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
	public Slider slider17;

	@FXML
	public Slider slider18;

	@FXML
	public Slider slider19;

	@FXML
	public Slider slider20;

	@FXML
	public Slider slider21;

	@FXML
	public Slider slider22;

	@FXML
	public Slider slider23;

	@FXML
	public Slider slider24;

	@FXML
	public Slider slider25;

	@FXML
    public Slider slider26;

    @FXML
	public Slider slider27;

	@FXML
	public Slider slider28;

	@FXML
	public Slider slider29;

	@FXML
    public Slider slider30;

    @FXML
	public Slider slider31;

	@FXML
	public Slider slider32;

    
    // Reference to the main application.
    private MainApp mainApp;
    
    @FXML
    public TextField delayText;

    @FXML
    public TextField textValue1;
    
    @FXML
    public TextField textValue2;
    
    @FXML
    public TextField textValue3;
    
    @FXML
    public TextField textValue4;
    
    @FXML
    public TextField textValue5;

    @FXML
    public TextField textValue6;
    
    @FXML
    public TextField textValue7;
    
    @FXML
    public TextField textValue8;
    
    @FXML
    public TextField textValue9;
    
    @FXML
    public TextField textValue10;
    
    @FXML
    public TextField textValue11;
    
    @FXML
    public TextField textValue12;
    
    @FXML
    public TextField textValue13;
    
    @FXML
    public TextField textValue14;
    
    @FXML
    public TextField textValue15;

    @FXML
    public TextField textValue16;
    
	@FXML
	public TextField textValue17;

	@FXML
	public TextField textValue18;

	@FXML
	public TextField textValue19;

	@FXML
	public TextField textValue20;

	@FXML
	public TextField textValue21;

	@FXML
	public TextField textValue22;

	@FXML
	public TextField textValue23;

	@FXML
	public TextField textValue24;

	@FXML
	public TextField textValue25;

	@FXML
    public TextField textValue26;

    @FXML
	public TextField textValue27;

	@FXML
	public TextField textValue28;

	@FXML
	public TextField textValue29;

	@FXML
    public TextField textValue30;

    @FXML
	public TextField textValue31;

	@FXML
	public TextField textValue32;
    
    @FXML
    public ToggleButton allToggle;
    
    @FXML
    public ToggleButton toggle1;
    
    @FXML
    public ToggleButton toggle2;
    
    @FXML
    public ToggleButton toggle3;
    
    @FXML
    public ToggleButton toggle4;
    
    @FXML
    public ToggleButton toggle5;

    @FXML
    public ToggleButton toggle6;
    
    @FXML
    public ToggleButton toggle7;
    
    @FXML
    public ToggleButton toggle8;
    
    @FXML
    public ToggleButton toggle9;
    
    @FXML
    public ToggleButton toggle10;
    
    @FXML
    public ToggleButton toggle11;
    
    @FXML
    public ToggleButton toggle12;
    
    @FXML
    public ToggleButton toggle13;
    
    @FXML
    public ToggleButton toggle14;
    
    @FXML
    public ToggleButton toggle15;

    @FXML
    public ToggleButton toggle16;
    
	@FXML
	public ToggleButton toggle17;

	@FXML
	public ToggleButton toggle18;

	@FXML
	public ToggleButton toggle19;

	@FXML
	public ToggleButton toggle20;

	@FXML
	public ToggleButton toggle21;

	@FXML
	public ToggleButton toggle22;

	@FXML
	public ToggleButton toggle23;

	@FXML
	public ToggleButton toggle24;

	@FXML
	public ToggleButton toggle25;

	@FXML
    public ToggleButton toggle26;

    @FXML
	public ToggleButton toggle27;

	@FXML
	public ToggleButton toggle28;

	@FXML
	public ToggleButton toggle29;

	@FXML
    public ToggleButton toggle30;

    @FXML
	public ToggleButton toggle31;

	@FXML
	public ToggleButton toggle32;
    
    @FXML
    private Button setDelayButton;

    @FXML
    public TextField configText;
    
    @FXML 
    public Label configLabel;
    
    @FXML 
    public Button configButton;
    
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
		commands.add(command17);
		commands.add(command18);
		commands.add(command19);
		commands.add(command20);
		commands.add(command21);
		commands.add(command22);
		commands.add(command23);
		commands.add(command24);
		commands.add(command25);
		commands.add(command26);
		commands.add(command27);
		commands.add(command28);
		commands.add(command29);
		commands.add(command30);
		commands.add(command31);
		commands.add(command32);
		
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
		expNumbers.add(slider17);
		expNumbers.add(slider18);
		expNumbers.add(slider19);
		expNumbers.add(slider20);
		expNumbers.add(slider21);
		expNumbers.add(slider22);
		expNumbers.add(slider23);
		expNumbers.add(slider24);
		expNumbers.add(slider25);
		expNumbers.add(slider26);
		expNumbers.add(slider27);
		expNumbers.add(slider28);
		expNumbers.add(slider29);
		expNumbers.add(slider30);
		expNumbers.add(slider31);
		expNumbers.add(slider32);
		
		expLabels.add(textValue1);
		expLabels.add(textValue2);
		expLabels.add(textValue3);
		expLabels.add(textValue4);
		expLabels.add(textValue5);
		expLabels.add(textValue6);
		expLabels.add(textValue7);
		expLabels.add(textValue8);
		expLabels.add(textValue9);
		expLabels.add(textValue10);
		expLabels.add(textValue11);
		expLabels.add(textValue12);
		expLabels.add(textValue13);
		expLabels.add(textValue14);
		expLabels.add(textValue15);
		expLabels.add(textValue16);
		expLabels.add(textValue17);
		expLabels.add(textValue18);
		expLabels.add(textValue19);
		expLabels.add(textValue20);
		expLabels.add(textValue21);
		expLabels.add(textValue22);
		expLabels.add(textValue23);
		expLabels.add(textValue24);
		expLabels.add(textValue25);
		expLabels.add(textValue26);
		expLabels.add(textValue27);
		expLabels.add(textValue28);
		expLabels.add(textValue29);
		expLabels.add(textValue30);
		expLabels.add(textValue31);
		expLabels.add(textValue32);
		
		toggles.add(toggle1);
		toggles.add(toggle2);
		toggles.add(toggle3);
		toggles.add(toggle4);
		toggles.add(toggle5);
		toggles.add(toggle6);
		toggles.add(toggle7);
		toggles.add(toggle8);
		toggles.add(toggle9);
		toggles.add(toggle10);
		toggles.add(toggle11);
		toggles.add(toggle12);
		toggles.add(toggle13);
		toggles.add(toggle14);
		toggles.add(toggle15);
		toggles.add(toggle16);
		toggles.add(toggle17);
		toggles.add(toggle18);
		toggles.add(toggle19);
		toggles.add(toggle20);
		toggles.add(toggle21);
		toggles.add(toggle22);
		toggles.add(toggle23);
		toggles.add(toggle24);
		toggles.add(toggle25);
		toggles.add(toggle26);
		toggles.add(toggle27);
		toggles.add(toggle28);
		toggles.add(toggle29);
		toggles.add(toggle30);
		toggles.add(toggle31);
		toggles.add(toggle32);
		// Listen for Slider value changes

		//String cmdName;
    	for (int i = 0; i < 32; i++){
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
				
				expLabels.get(i).textProperty().addListener(new ChangeListener<String>() {
				    @Override
				    public void changed(ObservableValue<? extends String> observable,
				            String oldValue, String newValue) {

				    	expNumbers.get(counter).setValue(Integer.parseInt(newValue));
				    }
				});
				
				toggles.get(i).setSelected(true);
				
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
    
    @FXML
    private void handleFileButton(ActionEvent event) {
        // Button was clicked, do something...
        readFile(configText.getText());
        
        
    }
    public void readFile(String filename){
    	BufferedReader br = null;
    	try {
    		br = new BufferedReader(new FileReader(filename));
    	    StringBuilder sb = new StringBuilder();
    	    String line = br.readLine();
    	    int start = 0;
    	    int end = 7;
    	    String command;
    	    for (int i = 0; i < 32; i++){
    	    	try{
    	    		command = line.substring(start, end);
    	    		//System.out.println(command);
    	    		
    	    		String[] numbers = command.split(" ");
    	    		System.out.println(numbers[0]);
    	    		commands.get(i).getSelectionModel().select(Integer.parseInt(numbers[0]) - 1);
    	    		System.out.println(numbers[1]);
    	    		expNumbers.get(i).setValue(Integer.parseInt(numbers[1]));
	    	    	start += 8;
	    	    	end += 8;
    	    	} catch (StringIndexOutOfBoundsException e){
    	    		break;
    	    	}
    	    	
    	    }

    	    
    	    //System.out.println(line);
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
    	    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    public void getSequence(){
    	
    	messageArray.clear();
    	for (int i = 0; i < 32; i++){
    		try {
    			if (toggles.get(i).isSelected()){
    				currentToggleValue = 0;
    			} else {
    				currentToggleValue = 21;
    			}
    			
    			//add 1 to command index to get program number
    			int programNumber = commands.get(i).getSelectionModel().getSelectedIndex() + 1 + currentToggleValue;
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
		messageArray.add(program);
		messageArray.add(treadle);
	}
	
	public static String getProgramData(ArrayList<Integer> theArray) {
	      StringBuilder sb = new StringBuilder();
	      for (int i = 0; i < theArray.size(); i++) {
	         if (i > 0) {
	            sb.append(" ");
	         }
	         int item = theArray.get(i);
	         String formatted = String.format("%03d", item);
	         sb.append(formatted);
	      }
	      return sb.toString();
	   }

	public void setDelay(){
		int newDelay = Integer.parseInt(delayText.getText());
		this.delay = newDelay;
	}
	
	
    public static void writeFile(String program){
	   		File fold = new File("test.txt");   		
	   		fold.delete();
	   		File fnew = new File("test.txt");
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
		String sb =  getProgramData(messageArray);
		writeFile(sb);
		//uploadArduino();
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