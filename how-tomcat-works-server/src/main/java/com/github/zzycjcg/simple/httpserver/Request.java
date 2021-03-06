package com.github.zzycjcg.simple.httpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.AsyncContext;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Request implements ServletRequest
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
    
    @Override
    public Object getAttribute(String name)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Enumeration<String> getAttributeNames()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getCharacterEncoding()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void setCharacterEncoding(String env)
        throws UnsupportedEncodingException
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public int getContentLength()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public long getContentLengthLong()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public String getContentType()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ServletInputStream getInputStream()
        throws IOException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getParameter(String name)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Enumeration<String> getParameterNames()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String[] getParameterValues(String name)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Map<String, String[]> getParameterMap()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getProtocol()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getScheme()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getServerName()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int getServerPort()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public BufferedReader getReader()
        throws IOException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getRemoteAddr()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getRemoteHost()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void setAttribute(String name, Object o)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void removeAttribute(String name)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public Locale getLocale()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Enumeration<Locale> getLocales()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public boolean isSecure()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public RequestDispatcher getRequestDispatcher(String path)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getRealPath(String path)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int getRemotePort()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public String getLocalName()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public String getLocalAddr()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int getLocalPort()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public ServletContext getServletContext()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public AsyncContext startAsync()
        throws IllegalStateException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
        throws IllegalStateException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public boolean isAsyncStarted()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public boolean isAsyncSupported()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    @Override
    public AsyncContext getAsyncContext()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public DispatcherType getDispatcherType()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
}
