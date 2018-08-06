package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.FileChannel;

public class ChuanServer {
    public static void protServer(String po) throws IOException {

        System.out.println("服务端启动成功,端口号为:" + po);
        int port = Integer.parseInt(po);

        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket clientSocket = serverSocket.accept();

            new Thread() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(
                                new InputStreamReader(clientSocket.getInputStream(), "GBK")
                        );

                        InputStream is = clientSocket.getInputStream();

                        PrintStream pr = new PrintStream(
                                clientSocket.getOutputStream()
                        );

                        pr.println("我是服务端");

                        String str = br.readLine();
                        System.out.println("br.readLine():" + str);
                        System.out.println("服务端来接收了!!");
                        out(is, str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();


        }

    }


    public static void out(InputStream is, String str) throws IOException {


        FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\upload\\" + str);

        BufferedInputStream bi = new BufferedInputStream(is);
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        int len = 0;
        while ((len=bi.read())!=-1){
            bo.write(len);
        }



        bi.close();
        bo.close();


    }
}
