package app;

import java.io.IOException;
import views.Home;

public class App {
  public static void main(String[] args) throws InterruptedException, IOException {
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new Home().setVisible(true);
      }
    });
  }
}
