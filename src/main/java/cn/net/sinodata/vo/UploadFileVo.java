package cn.net.sinodata.vo;

import java.io.Serializable;

public class UploadFileVo implements Serializable {
    private static final long serialVersionUID = -183435414995467761L;

    private String accName;
    private String fileName;
    private String fileType;
    private String filePath;

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
