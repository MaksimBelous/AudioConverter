package com.example.audioconverter;

//import necessary libraries
        import java.io.File;
        import java.io.IOException;

//FFMPEG_Java_Wrapper class
public class FfMpeg  {

    //main
    public static void main(String[] args) {

        //try block
        try {
            //create process
            Runtime rt = Runtime.getRuntime();
            //save the location
            File folder = new File("C:\\Users\\DelftStack\\Desktop\\MediaFiles");
            //save all files in an array that are retrieved from the specified folder
            File[] file = folder.listFiles();

            /*
            for each filename, open the command prompt
            and execute the specified command.
             */
            for (int i = 0; i < file.length; i++) {
                rt.exec("cmd.exe /c start "
                                + "ffmpeg -i " + file[i].getName()
                                + " -vn output" + (i + 1) + ".m4a", null,
                        folder);
            }//end for

        } //end try
        catch (IOException e) {
            System.out.println(e);
        }//end catch

    }//end main
}//end FFMPEG_Java_Wrapper