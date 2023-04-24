package org.p2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.p2.gui.ImagenFrame;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        new ImagenFrame();
    }
}