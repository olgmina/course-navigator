package org.example.works.slideshow;

public interface Iterator
{
    public boolean hasNext();
    public Object next();
    public Object preview();
    public boolean haspreview();
    public int getCurrentIndex();
    }
