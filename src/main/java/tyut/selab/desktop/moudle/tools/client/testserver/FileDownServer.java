package tyut.selab.desktop.moudle.tools.client.testserver;

import javax.sound.sampled.AudioFormat;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author y
 * @Date 2023/04/20 20:49
 * @Version
 *
 * 文件下载 的 服务器端
 * 1.套接字连接建立
 * 2.1客户端向服务端发送 姓名 加 周数
 * 2.2服务端 接受到姓名 加 周数 并处理信息 （从数据库）得到路径
 * --> 一个问题出现了  由于有zip ，rar 两种文件，只有姓名加周数无法知道具体需要的文件
 *
 */
public class FileDownServer {

    public  int fileDown(){

        try(ServerSocket server = new ServerSocket(45617);) {
            while (true){
                Socket socket = server.accept();
//               Thread thread = new Thread(new Runnable() {
//                    @Override
//                    public void run() {  //此处为套接字处理程序
                        try {
                            int length = 0;
                            // 接受客户端信息部分   --接收姓名和周数
                            InputStream is = socket.getInputStream();   //接受客户端消息的输入流
                            InputStreamReader ir = new InputStreamReader(is);
                            BufferedReader br = new BufferedReader(ir);
                            DataInputStream dis = new DataInputStream(is);

                            try {
                                //int length
                                byte[] getBytes ;          // 39   21+18
                                getBytes = dis.readNBytes(39);
                                // ToDo 处理信息部分  如何处理得到得字符串 并通过信息得到路径？
                                String getString = new String(getBytes);

                                System.out.println("打印接收信息：");
                                System.out.println(Arrays.toString(getBytes));
                                System.out.println(getString);
                                //
                                // FixMe: 大概是，根据信息查询，从数据库获取路径

                                //向客户端输出信息部分
                                File file = new File("C:\\Users\\86184\\Desktop\\service.zip");
                                //"home/fengyang/吕岩芳/第一周/提交/袁晓晶-2022005929.zip"  获得
                                FileInputStream fis = new FileInputStream(file);

                                OutputStream os = socket.getOutputStream();             //向客户端输出流
                                DataOutputStream dos = new DataOutputStream(os);
                                byte[] sendBytes = new byte[1024];

                                while ((length=fis.read(sendBytes))>0){
                                    dos.write(sendBytes,0,length);
                                    dos.flush();
                                }
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
//                    }
//                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}