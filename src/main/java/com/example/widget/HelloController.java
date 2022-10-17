package com.example.widget;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button buttondiscord;

    @FXML
    private Button buttonsteam;

    @FXML
    private Button mycomputer;


    public void mouseClickedSteam() throws IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                try {
                    desktop.open(new File("C:\\Program Files (x86)\\Steam\\Steam.exe"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void mouseClickedDiscord() {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                try {
                    desktop.open(new File("C:\\Users\\User\\AppData\\Local\\Discord\\app-1.0.9006\\Discord.exe"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void mouseClickedComputer() throws IOException {
        Runtime.getRuntime().exec("cmd /c start explorer");
    }


    public void mouseClickedClose() {
        System.exit(1);
    }
}
