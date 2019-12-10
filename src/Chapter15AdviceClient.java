
    //To read data from a Socket, use a BufferedReader

    //1)  Socket chatSocket = new Socket("196.164.1.103" 5000);
     //   2)InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
// Make an InputStreamReader chained to the Socket’s low-level (connection) input stream
//BufferedReader reader = new BufferedReader(stream);
//String message = reader.readLine();
    //Make a BufferedReader and read!

    //To write data to a Socket, use a PrintWriter
   // Socket chatSocket = new Socket("127.0.0.1" 5000);
    //PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
    //writer.println("message to send";
    //writer.print("another message";

    import java.io.*;
    import java.net.*;
class DailyAdviseClient {
    public void go() {
        try {
            Socket s = new Socket("127.0.0.1",4242);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("You should: " + advice);

            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main (String [] args) {
        DailyAdviseClient client = new DailyAdviseClient();
        client.go();
    }
}
//Server application makes a ServerSocket, on a specific port
//How it Works:
// 1) ServerSocket serverSock = new ServerSocket(4242);
    //2) Socket sock = new Socket(“190.165.1.103”, 4242);
//3) Server makes a new Socket to communicate with this client
// Socket sock = serverSock.accept();
    //When a client finally tries to connect, the method returns
    //a plain old Socket (on a different port) that knows
    //how to communicate with the client (i.e., knows the
    //client’s IP address and port number). The Socket is on
    //a different port than the ServerSocket, so that the
    //ServerSocket can go back to waiting for other clients
