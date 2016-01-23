package com.github.zzycjcg.simple.httpserver;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer
{
    private static final String SHUTDOWN = "/SHUTDOWN";
    
    public void startup()
    {
        boolean stop = false;
        ServerSocket server = null;
        try
        {
            server = new ServerSocket(8080, 1, InetAddress.getByName("0"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        while (!stop)
        {
            try
            {
                Socket socket = server.accept();
                Request request = new Request(socket.getInputStream());
                request.parse();
                Response response = new Response(socket.getOutputStream());
                response.setUri(request.getUri());
                if (request.getUri().startsWith("/servlet"))
                {
                    ServletProcessor servletProcessor = new ServletProcessor();
                    servletProcessor.process(request, response);
                }
                else
                {
                    StaticResourceProcessor staticResourceProcessor = new StaticResourceProcessor();
                    staticResourceProcessor.process(request, response);
                }
                
                socket.close();
                stop = SHUTDOWN.equalsIgnoreCase(request.getUri());
            }
            catch (IOException e)
            {
                e.printStackTrace();
                System.exit(1);
            }
        }
        try
        {
            // close the server
            server.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
    
}
