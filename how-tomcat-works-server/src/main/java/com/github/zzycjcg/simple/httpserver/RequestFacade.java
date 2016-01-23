package com.github.zzycjcg.simple.httpserver;

import java.io.BufferedReader;
import java.io.IOException;
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

public class RequestFacade implements ServletRequest
{
    private final ServletRequest servletRequest;
    
    public RequestFacade(Request request)
    {
        servletRequest = request;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Object getAttribute(String name)
    {
        return servletRequest.getAttribute(name);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Enumeration<String> getAttributeNames()
    {
        return servletRequest.getAttributeNames();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getCharacterEncoding()
    {
        return servletRequest.getCharacterEncoding();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setCharacterEncoding(String env)
        throws UnsupportedEncodingException
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int getContentLength()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public long getContentLengthLong()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getContentType()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public ServletInputStream getInputStream()
        throws IOException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getParameter(String name)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Enumeration<String> getParameterNames()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String[] getParameterValues(String name)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Map<String, String[]> getParameterMap()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getProtocol()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getScheme()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getServerName()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int getServerPort()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public BufferedReader getReader()
        throws IOException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getRemoteAddr()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getRemoteHost()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setAttribute(String name, Object o)
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void removeAttribute(String name)
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Locale getLocale()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Enumeration<Locale> getLocales()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public boolean isSecure()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public RequestDispatcher getRequestDispatcher(String path)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getRealPath(String path)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int getRemotePort()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getLocalName()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getLocalAddr()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int getLocalPort()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public ServletContext getServletContext()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public AsyncContext startAsync()
        throws IllegalStateException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse)
        throws IllegalStateException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public boolean isAsyncStarted()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public boolean isAsyncSupported()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public AsyncContext getAsyncContext()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public DispatcherType getDispatcherType()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
}
