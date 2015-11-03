package is.sjosund.TicTacToeSjosund;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class TicTacToeWeb implements SparkApplication {

    public static void main(String[] args) {
        staticFileLocation("/public");
        SparkApplication tttWeb = new TicTacToeWeb();

        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }

        tttWeb.init();
    }

    @Override
    public void init() {
        
    }

}