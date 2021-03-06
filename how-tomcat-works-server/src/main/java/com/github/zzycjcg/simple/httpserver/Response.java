package com.github.zzycjcg.simple.httpserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

public class Response implements ServletResponse
{
    private final OutputStream outputStream;
    
    private String uri;
    
    private final File rootFile;
    
    private final PrintWriter writer;
    
    public Response(OutputStream outputStream)
    {
        this.outputStream = outputStream;
        rootFile = new File(Constants.STATIC_FILE_HOME);
        writer = new PrintWriter(outputStream, true);
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
    
    @Override
    public String getCharacterEncoding()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getContentType()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ServletOutputStream getOutputStream()
        throws IOException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public PrintWriter getWriter()
        throws IOException
    {
        return writer;
    }
    
    @Override
    public void setCharacterEncoding(String charset)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void setContentLength(int len)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void setContentLengthLong(long len)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void setContentType(String type)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void setBufferSize(int size)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public int getBufferSize()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public void flushBuffer()
        throws IOException
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void resetBuffer()
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public boolean isCommitted()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public void reset()
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void setLocale(Locale loc)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public Locale getLocale()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
}
