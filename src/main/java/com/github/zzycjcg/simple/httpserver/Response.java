package com.github.zzycjcg.simple.httpserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;

public class Response
{
    private final OutputStream outputStream;
    
    private String uri;
    
    private final File rootFile;
    
    public Response(OutputStream outputStream)
    {
        this.outputStream = outputStream;
        try
        {
            rootFile = new File(Main.class.getResource("/META-INF/static").toURI());
        }
        catch (URISyntaxException e)
        {
            throw new IllegalArgumentException(e);
        }
    }
    
    /**
     * @param uri the uri to set
     */
    public void setUri(String uri)
    {
        this.uri = uri;
    }
    
    public void sendStaticResource()
    {
        File staticFile = new File(rootFile, uri);
        if (!staticFile.exists())
        {
            String notFound = new StringBuilder("HTTP/1.1 404 NOT FOUND\r\n").append("Server: HttpServer\r\n")
                .append("Content-Length: 9\r\n")
                .append("Connection: closed\r\n")
                .append("\r\n")
                .append("NOT FOUND")
                .toString();
            try
            {
                outputStream.write(notFound.getBytes());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return;
        }
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(staticFile);
            byte[] buffer = new byte[4096];
            int n;
            while ((n = fis.read(buffer, 0, buffer.length)) != -1)
            {
                outputStream.write(buffer, 0, n);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
