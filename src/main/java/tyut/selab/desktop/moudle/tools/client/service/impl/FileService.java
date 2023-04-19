package tyut.selab.desktop.moudle.tools.client.service.impl;

import tyut.selab.desktop.moudle.student.userdao.IUserDao;
import tyut.selab.desktop.moudle.tools.client.dao.IUpFileDao;
import tyut.selab.desktop.moudle.tools.client.domain.vo.FileUpVo;
import tyut.selab.desktop.moudle.tools.client.service.IFileUpService;

import java.io.*;
import java.net.Socket;

public class FileService implements IFileUpService {
    public static void main(String[] args) {

    }

    private IUserDao userDao;

    private IUpFileDao upFileDao;
    int port;

    @Override
    /*


    需要的参数：
    从UI/Dao层获取 下载文件信息
    （向服务器发送需要下载的文件）
    （用接受服务器的文件流）
    从 dao层获取下载路径

    * */
    public int fileDown(FileUpVo fileUpVo) {


        return 0;
    }

    @Override
    //文件上传方法
    //1. 需要判断字符串是否为upIp吗
    //2. 端口号是固定的吗？

    public int fileUpLoading(FileUpVo fileUpVo) {
        String upIp = fileUpVo.getUpIp();
        String upFilepath = fileUpVo.getUpFilePath();
        int length = 0;
        FileInputStream fis = null;
        DataOutputStream dos = null;
        Socket socket = null;
        OutputStream out =null;
        PrintWriter pw = null;
        byte[] sendByte = null;
        try {
            socket = new Socket(upIp,7777);
            out = socket.getOutputStream();
            pw = new PrintWriter(out);
            System.out.println("连接到服务器成功");
            File file = new File("C:\\Users\\86184\\Documents\\GitHub\\S__StudyNotes\\Back_ends_Learning\\L_Code\\A1_HTML\\A_img\\与松鼠的约定.png");
            fis = new FileInputStream(file);
            dos = new DataOutputStream(socket.getOutputStream());
            sendByte = new byte[1024];
            pw.write("123"+"\r\n");
            pw.flush();
            pw.write("456"+"\r\n");
            pw.flush();
            System.out.println("准备发送");
            while((length=fis.read(sendByte))>0){
                dos.write(sendByte, 0 , length);
                dos.flush();
            }
            System.out.println("文件发送完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                fis.close();
                dos.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        /*
        上传是否成功 需要从服务器获得判断信息
        */
        return 0;

    }
}
