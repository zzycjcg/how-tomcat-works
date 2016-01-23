package com.github.zzycjcg.simple.httpserver;

public class StaticResourceProcessor
{
    public void process(Request request, Response response)
    {
        response.sendStaticResource();
    }
}
