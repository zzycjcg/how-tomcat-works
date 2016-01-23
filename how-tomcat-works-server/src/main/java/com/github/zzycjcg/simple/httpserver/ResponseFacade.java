package com.github.zzycjcg.simple.httpserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

public class ResponseFacade implements ServletResponse
{
    private final ServletResponse servletResponse;
    
    public ResponseFacade(Response response)
    {
        this.servletResponse = response;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getCharacterEncoding()
    {
        return servletResponse.getCharacterEncoding();
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
    public ServletOutputStream getOutputStream()
        throws IOException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public PrintWriter getWriter()
        throws IOException
    {
        return servletResponse.getWriter();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setCharacterEncoding(String charset)
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setContentLength(int len)
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setContentLengthLong(long len)
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setContentType(String type)
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setBufferSize(int size)
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public int getBufferSize()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void flushBuffer()
        throws IOException
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void resetBuffer()
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public boolean isCommitted()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void reset()
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setLocale(Locale loc)
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
    
}
