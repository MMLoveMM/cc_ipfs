package cn.net.sinodata.util;

public class Result<T> {

    private final String ERROR = "1";
    private final String SUCCESS = "0";

    private String flagCode;
    private String message;
    private T data;

    public String getFlagCode() {
        return flagCode;
    }

    public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result<T> success(T data) {
        this.flagCode = this.SUCCESS;
        this.data = data;
        return this;
    }

    public Result<T> error(String message) {
        this.flagCode = this.ERROR;
        this.message = message;
        return this;
    }
}
