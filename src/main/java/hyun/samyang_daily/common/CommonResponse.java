package hyun.samyang_daily.common;

import lombok.Data;

@Data
public class CommonResponse<T> {

    private boolean success;
    private T data;
    private ErrorInfo errorInfo;


    public CommonResponse(boolean success, T data, ErrorInfo errorInfo) {
        this.success = success;
        this.data = data;
        this.errorInfo = errorInfo;
    }

    public static <T> CommonResponse success(T data) {
        return new CommonResponse<T>(true,data,null);
    }

    public static <T> CommonResponse error (ErrorInfo errorInfo) {
        return new CommonResponse<>(false, null,errorInfo);
    }
}