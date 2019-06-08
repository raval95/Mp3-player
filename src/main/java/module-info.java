module mp3player {
        requires javafx.graphics;
        requires javafx.controls;
        requires javafx.fxml;
        requires jid3lib;
        requires javafx.media;

        exports mp3player.main to javafx.graphics;
        opens controller to javafx.fxml;
        opens mp3 to javafx.base;
        }