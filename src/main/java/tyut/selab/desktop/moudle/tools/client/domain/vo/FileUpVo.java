package tyut.selab.desktop.moudle.tools.client.domain.vo;

import tyut.selab.desktop.moudle.student.domain.User;

import java.util.Date;

public class FileUpVo {
    private User user;
    private String upFilePath;
    private Date upTime;
    private String upIp;

    public String getUpIp() {
        return upIp;
    }
    public String getUpFilePath() {
        return upFilePath;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "FileUpVo{" +
                "user=" + user +
                ", upFilePath='" + upFilePath + '\'' +
                ", upTime=" + upTime +
                ", upIp='" + upIp + '\'' +
                '}';
    }
}
