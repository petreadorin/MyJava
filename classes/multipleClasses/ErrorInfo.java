package classes.multipleClasses;

public class ErrorInfo {
    String[] msgs = {
            "Output Error" ,
            "Input Error" ,
            "Disk Full" ,
            "Index Out-Of-Bounds"
    };
    int[] howbad = {3, 3, 2, 4};

   public  Error getErrorInfo(int index) {
        if(index >=0 & index< msgs.length)
            return new Error(msgs[index], howbad[index]);
        else
            return new Error("Invalid Error Code", 0);
    }
}
