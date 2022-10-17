package com.example.widget;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class HelloController {
    @FXML
    private ImageView Computerimg;

    @FXML
    private ImageView Chromeimg;

    @FXML
    private ImageView Discordimg;

    @FXML
    private ImageView Steamimg;

    @FXML
    private ImageView Yandeximg;

    @FXML
    private ImageView Discord;

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

    public void mouseClickedYandex() {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                try {
                    desktop.open(new File("C:\\Users\\User\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void EnteredSteam() {
        Steamimg.setOpacity(1);
        Steamimg.setFitHeight(53);
        Steamimg.setFitWidth(55);
    }


    public void ExitedSteam() {
        Steamimg.setOpacity(0.6);
        Steamimg.setFitHeight(49);
        Steamimg.setFitWidth(47);
    }

    public void EntDiscord() {
        Discordimg.setOpacity(1);
       Discordimg.setFitHeight(53);
       Discordimg.setFitWidth(55);
    }

    public void ExDiscord() {
        Discordimg.setOpacity(0.6);
        Discordimg.setFitHeight(49);
      Discordimg.setFitWidth(47);
    }
}
