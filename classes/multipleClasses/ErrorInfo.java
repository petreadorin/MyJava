package classes.multipleClasses;

public class ErrorInfo {
    String msgs[] = {
            "Output Error" ,
            "Input Error" ,
            "Disk Full" ,
            "Index Out-Of-Bounds"
    };
    int howbad[] = {3, 3, 2, 4};

    Error getErrorInfo(int i) {
        if(i >=0 & i< msgs.length)
            return new Error(msgs[i], howbad[i]);
        else
            return new Error("Invalid Error Code", 0);
    }
}
