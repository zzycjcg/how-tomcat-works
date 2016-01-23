package com.github.zzycjcg.simple.httpserver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

public class ServletProcessor
{
    public void process(Request request, Response response)
        throws IOException
    {
        String uri = request.getUri();
        String servletName = uri.substring(uri.lastIndexOf('/') + 1);
        URLClassLoader classLoader = null;
        URL[] urls = new URL[1];
        File classPath = new File(Constants.LIB_ROOT);
        String repository = new URL("file", null, classPath.getCanonicalPath() + File.separator).toString();
        urls[0] = new URL((URL)null, repository, (URLStreamHandler)null);
        classLoader = new URLClassLoader(urls);
        
        Class<?> myClass = null;
        try
        {
            myClass = classLoader.loadClass(
                ServletProcessor.class.getName().substring(0, ServletProcessor.class.getName().lastIndexOf('.')) + "."
                    + servletName);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            classLoader.close();
        }
        if (myClass == null)
        {
            response.getWriter().println(servletName + " not found!");
            return;
        }
        Servlet servlet = null;
        try
        {
            servlet = (Servlet)myClass.newInstance();
            servlet.service(new RequestFacade(request), new ResponseFacade(response));
        }
        catch (InstantiationException | IllegalAccessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ServletException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
