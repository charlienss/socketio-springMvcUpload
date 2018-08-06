//
//package socket;
//
//import java.io.*;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class Servers {
//
//
//    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(5566);
//
//        Socket clientSocket = serverSocket.accept();
//
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(clientSocket.getInputStream(), "GBK")
//        );
//
//       InputStream is= clientSocket.getInputStream();
//
//
//        PrintStream pr = new PrintStream(
//                clientSocket.getOutputStream()
//        );
//
//        pr.println("我是服务端");
//
//        String str = br.readLine();
//        System.out.println("br.readLine():" + str);
//        System.out.println("服务端来接收了!!");
//        out(is, str);
//        br.close();
//        pr.close();
//
//        System.out.println("服务端关闭");
//
//
//    }
//
//
//    public static void out(InputStream is, String str) throws IOException {
//
//
////        //创建输入通道
////        FileChannel finChannel = is.getChannel();
////        //创建输出通道
////        FileChannel foutChannel = fo.getChannel();
////        //创建缓冲区
////        ByteBuffer buf = ByteBuffer.allocate(1024);
////
////        while (true) {
////            //clear方法重置缓冲区,使他可以接受读入的数据()position
////
////            buf.clear();
////
////            //从输入通道读取内容到缓冲去
////            int re = finChannel.read(buf);
////
////            //如果读到文件的结尾 返回结果-1
////            if(re== -1){
////                break;
////            }
////
////            //flip()方法可以一步步读取缓冲区的内容
////            buf.flip();
////
////            foutChannel.write(buf);
////
////        }
//        FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\upload\\" + str);
//
//        BufferedInputStream bi = new BufferedInputStream(is);
//        BufferedOutputStream bo = new BufferedOutputStream(fo);
//
//        int len = 0;
//        while ((len=bi.read())!=-1){
//            bo.write(len);
//        }
//
//
////        byte [] bytes = new byte[8*1024];
////        int len = 0;
////        while ((len=is.read(bytes))!=-1){
////
////            fo.write(bytes,0,len);
////        }
//
//
//        //关流
//        bi.close();
//        bo.close();
//
//
//    }
//
//
//}
