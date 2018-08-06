package service.impl;

import org.springframework.stereotype.Service;
import service.UpService;

import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

@Service
public class UpServiceImpl  implements UpService {

    @Override
    public void upload(String fileName, InputStream is, String iphost, String port) {
        getClientSocket(is, fileName, iphost, port);
    }

    //聊天
    @Override
    public String liaotian(String shuru, String iphost, String port) {

        String str = "";
        int po = Integer.parseInt(port);

        try {
            Socket socket = new Socket(iphost, po);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            PrintStream pr = new PrintStream(
                    socket.getOutputStream()
            );

            pr.println(shuru);


            //读取服务器返回的消息
            str = br.readLine();

            System.out.println("服务器发来的消息为:" + str);

            pr.close();
            br.close();
            System.out.println("客户端已关闭");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }


    //建立socket通信

    public void getClientSocket(InputStream is, String fileName, String iphost, String port) {
        int po = Integer.parseInt(port);
        try {
            Socket socket = new Socket(iphost, po);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            PrintStream pr = new PrintStream(
                    socket.getOutputStream()
            );

            OutputStream os = socket.getOutputStream();

            System.out.println("客户端给你传文件了!");
            System.out.println("文件名为:" + fileName);

            //读取服务器返回的消息
            String str = br.readLine();
            System.out.println("服务器发来的消息为:" + str);


            pr.println(fileName);


            in(is, os);
            pr.close();
            br.close();
            System.out.println("客户端已关闭");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    //上传文本
    public static void in(InputStream is, OutputStream os) throws IOException {

        //BIO


        BufferedInputStream bi = new BufferedInputStream(is);

        BufferedOutputStream bo = new BufferedOutputStream(os);
        int len = 0;
        while ((len=bi.read())!=-1){
            bo.write(len);
            System.out.println(len);
        }

        bi.close();
        bo.close();
    }

}
