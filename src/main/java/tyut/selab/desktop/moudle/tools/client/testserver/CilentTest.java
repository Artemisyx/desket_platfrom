package tyut.selab.desktop.moudle.tools.client.testserver;

import tyut.selab.desktop.moudle.tools.client.domain.FileUp;
import tyut.selab.desktop.moudle.tools.client.service.impl.FileService;

import java.awt.*;

/**
 * @Author y
 * @Date 2023/04/20 22:18
 * @Version
 */

public class CilentTest {
    public static void main(String[] args) {
        FileUp fileUp = new FileUp();
        FileService fileService = new FileService();
        fileService.setName("袁晓晶");
        fileService.setWeek("第一周");
        fileService.fileDown(fileUp,"C:\\Users\\86184\\Desktop\\下载接受文件地点\\Service.zip");
        //Fixme :接收到的文件无法打开  ->  是因为，接受字节流 时 没有处理八十个字节  不对，上传是只传姓名和周数的
        //必须写到文件名结束才行，第一次只写到了文件夹--->拒绝访问
    }

}
