//package socket;
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class LiaoServer {
//
//
//    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(5566);
//        while(true){
//
//
//            Socket clientSocket = serverSocket.accept();
//            new Thread(){
//                @Override
//                public void run() {
//                    try {
//
//
//
//                    BufferedReader br = new BufferedReader(
//                            new InputStreamReader(clientSocket.getInputStream(), "GBK")
//                    );
//
//                    InputStream is= clientSocket.getInputStream();
//
//
//                    PrintStream pr = new PrintStream(
//                            clientSocket.getOutputStream()
//                    );
//
//
//
//
//                    String str = br.readLine();
//                    System.out.println("br.readLine():" + str);
//
//                        Scanner scanner = new Scanner(System.in);
//                        String s = scanner.nextLine();
//                        pr.println(s);
//
//
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//
//
//
//                }
//            }.start();
//        }
//
//
//
//
//
//    }
//}
