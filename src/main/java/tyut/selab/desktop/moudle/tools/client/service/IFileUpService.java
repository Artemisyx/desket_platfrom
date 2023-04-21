package tyut.selab.desktop.moudle.tools.client.service;

import tyut.selab.desktop.moudle.tools.client.domain.vo.FileUpVo;

public interface IFileUpService {
<<<<<<< Updated upstream
    int fileDown(FileUpVo fileUpVo)                                                                                                                                                                                                                                                                                ;

    int fileUpLoading(FileUpVo fileUpVo);
=======
    int fileDown(FileUp fileUp,String localFLiePath);

    int fileUpLoading(FileUp fileUp,String localFilePath);

    List<FileUp> queryAllFileUpInfo() ;

    List<FileUp> queryFileUpByUser(User user) ;
>>>>>>> Stashed changes
}
