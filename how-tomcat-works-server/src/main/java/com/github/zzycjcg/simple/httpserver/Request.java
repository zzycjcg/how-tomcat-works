package com.github.zzycjcg.simple.httpserver;

import java.io.IOException;
import java.io.InputStream;

public class Request
{
    private final InputStream inputStream;
    
    private String uri;
    
    private static final char BLACK = ' ';
    
    public Request(InputStream inputStream)
    {
        this.inputStream = inputStream;
    }
    
    public void parse()
    {
        byte[] buffer = new byte[2048];
        try
        {
            inputStream.read(buffer);
            uri = parseUri(new String(buffer, "UTF-8"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
    private String parseUri(String param)
    {
        int index1 = param.indexOf(BLACK);
        if (index1 == -1)
        {
            return null;
        }
        int index2 = param.indexOf(BLACK, index1 + 1);
        if (index2 == -1)
        {
            return null;
        }
        return param.substring(index1 + 1, index2);
    }
    
    /**
     * @return the uri
     */
    public String getUri()
    {
        return uri;
    }
    
}
