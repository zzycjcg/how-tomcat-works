package com.github.zzycjcg.simple.httpserver;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletTest implements Servlet
{
    
    /** {@inheritDoc} */
    
    @Override
    public void init(ServletConfig config)
        throws ServletException
    {
    
    }
    
    /** {@inheritDoc} */
    
    @Override
    public ServletConfig getServletConfig()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void service(ServletRequest req, ServletResponse res)
        throws ServletException, IOException
    {
        res.getWriter().println("Hello world! This is ServletTest.");
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getServletInfo()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub
        
    }
    
}
