package com.github.zzycjcg.simple.httpserver;

import java.io.File;

public interface Constants
{
    String APP_HOME = System.getProperty("app.home");
    
    String STATIC_FILE_HOME = APP_HOME + File.separator + "conf" + File.separator + "static";
    
    String LIB_ROOT = APP_HOME + File.separator + "lib";
}
