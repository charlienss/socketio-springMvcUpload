package service;

import java.io.FileInputStream;
import java.io.InputStream;

public interface UpService {


    void upload(String fileName, InputStream is, String iphost,String port);

    String liaotian(String shuru,String iphost,String port);
}
