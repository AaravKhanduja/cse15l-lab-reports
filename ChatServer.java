import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String user;
    String message;
    String ans = "";

    public String handleRequest(URI url) {
        if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("&");
                String[] params1 = parameters[0].split("=");
                String[] params2 = parameters[1].split("=");

                String[] finalVals = new String[params1.length + params2.length];
                finalVals[0] = params1[0];
                finalVals[1] = params1[1];
                finalVals[2] = params2[0];
                finalVals[3] = params2[1];


                if (finalVals[0].equals("s") && finalVals[2].equals("user")) {
                    message = finalVals[1];
                    user = finalVals[3];
                    ans = ans + "\n" + user + ": " + message;
                    return (ans);
                }
            }
            return "404 Not Found!";
        }
    }


class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
