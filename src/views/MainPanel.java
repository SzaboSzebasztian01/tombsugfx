package views;

import com.github.SzaboSzebasztian1.inputlib.ButtonPanel;
import com.github.SzaboSzebasztian1.inputlib.InputPanel;
import com.github.SzaboSzebasztian1.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    TitlePanel titlePanel;
    InputPanel sidePanel;
    InputPanel alphaPanel;
    ButtonPanel buttonPanel;
    InputPanel volumePanel;

    public MainPanel() {
        this.titlePanel = new TitlePanel();
        this.sidePanel = new InputPanel();
        this.alphaPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.volumePanel = new InputPanel();
        
        this.titlePanel.setText("Rombuszba írható kör sugara");
        this.sidePanel.setText("Oldal: ");
        this.alphaPanel.setText("Alfa szög: ");
        this.buttonPanel.setCalcButtonText("Számít");
        this.volumePanel.setText("Térfogat: ");

        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.sidePanel);
        this.getChildren().add(this.alphaPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.volumePanel);

    }
    
}
