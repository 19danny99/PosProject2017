package at.spengergasse.view;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends Application
{

	public View()
	{

	}

	@Override
	public void start(Stage primaryStage)
	{
		Button button1 = new Button("Start Game");
		Button button2 = new Button ("Options");
		Button button3 = new Button ("Exit");
		//Button button4 = new Button ("Exit");
		
		BorderPane root1 = new BorderPane();
		StackPane buttonCenter1 = new StackPane();
		StackPane buttonCenter2 = new StackPane();
		StackPane buttonCenter3 = new StackPane();
		//StackPane buttonCenter4 = new StackPane();
		
		buttonCenter1.getChildren().add(button1);
		buttonCenter2.getChildren().add(button2);
		buttonCenter3.getChildren().add(button3);
		//buttonCenter4.getChildren().add(button4);
		
		StackPane.setAlignment(button1, Pos.TOP_CENTER);
		StackPane.setAlignment(button2, Pos.CENTER);
		StackPane.setAlignment(button3, Pos.BOTTOM_CENTER);
		//StackPane.setAlignment(button4, Pos.CENTER_RIGHT);
		
		root1.setTop(buttonCenter1);
		root1.setCenter(buttonCenter2);
		root1.setBottom(buttonCenter3);
		//root1.setBottom(buttonCenter4);
		
		Border border = new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(10)));
	
	root1.setPadding(new Insets(100, 100, 100, 100));
	root1.setBorder(border);
		
		
		
		Scene scene = new Scene(root1, 600, 400, Color.WHITE);
		
		Image image = new Image("dildoschwert.png");
		
		scene.setCursor(new ImageCursor(image, image.getWidth() / 2, image.getHeight() /2));
		
		
		button1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				DropShadow shadow = new DropShadow();
				button1.setEffect(shadow);
			}
		});
		// Schatten geht weg wenn maus nicht drauf ist
		button1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				button1.setEffect(null);
			}
		});

		button2.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				DropShadow shadow = new DropShadow();
				button2.setEffect(shadow);
			}
		});
		// Schatten geht weg wenn maus nicht drauf ist
		button2.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				button2.setEffect(null);
			}
		});
		
		button3.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				DropShadow shadow = new DropShadow();
				button3.setEffect(shadow);
			}
		});
		// Schatten geht weg wenn maus nicht drauf ist
		button3.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				button3.setEffect(null);
			}
		});
		
		
		primaryStage.setTitle("The legend of Zelda");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	
	/**
	 * @param args
	 *            
	 */
	public static void main(String[] args)
	{
		launch(args);
	}

}
