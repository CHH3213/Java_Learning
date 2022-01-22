package pers.chh3213.exercise;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : network_program
 * @Package : pers.chh3213.exercise
 * @ClassName : SocketServerClientTest.java
 * @createTime : 2022/1/22 15:52
 * @Email :
 * @Description :
 */
public class SocketServerClientTest {
    @Test
    public void TcpTestOneClient(){

        Socket socket = null;
        InputStream is = null;  // 获取服务端信息
//        ByteArrayOutputStream bos = null;
        FileOutputStream fos = null;
        try {
            socket = new Socket("127.0.0.1",1001);
            is = socket.getInputStream();
            int len;
            byte [] bytes = new byte[5];
//            bos = new ByteArrayOutputStream();
            fos = new FileOutputStream("100.jpg");
            while ((len = is.read(bytes)) != -1){
//                bos.write(bytes,0,len);
                fos.write(bytes,0,len);
            }
//            System.out.println(bos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

//            if(bos != null){
//                try {
//                    bos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }

    @Test
    public void TcpTestOneServer(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            serverSocket = new ServerSocket(1001);
            socket = serverSocket.accept();
            os = socket.getOutputStream();
            int len;
            byte [] bytes = new byte[1024];
            fis = new FileInputStream(new File("1.jpg"));
            while ((len = fis.read(bytes)) != -1){
                os.write(bytes,0,len);
//                os.write("老王我给你发了一个图片  你好好欣赏啊".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
