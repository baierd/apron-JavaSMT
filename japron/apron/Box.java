/*
 * Box.java
 *
 * APRON Library / Java Apron binding
 *
 * Copyright (C) Antoine Mine' 2010
 */

package apron;

import static apron.Abstract0.loadLibrary;

/**
 * Manager factory for the interval abstract domain.
 */
public class Box
    extends Manager
{

    // Internals
    ////////////

    private native void init();

    private static native void class_init();

    static { loadLibrary("japron"); class_init(); }


    // Constructors
    ///////////////
    
    /**
     * Creates a new manager to create and manipulate boxes.
     */
    public Box()
    {
        init(); 
    }

}
