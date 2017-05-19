package at.spengergasse.view;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;

public class optionenmenuControler {

	@FXML
	private Slider soundbar;
	
	@FXML
	private void initialize() {
		// Handle Slider value change events.
		soundbar.valueProperty().addListener((observable, oldValue, newValue) -> {
				int i = newValue.intValue();
			});
	}
	
}
