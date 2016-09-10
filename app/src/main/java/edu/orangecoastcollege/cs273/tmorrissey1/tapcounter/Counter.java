package edu.orangecoastcollege.cs273.tmorrissey1.tapcounter;

/**
 * Represents an integer counter
 * @author Travis Morrissey
 */
public class Counter {
    private int mCount;

    /**
     * @return integer value of the counter
     */
    public int getCount() {
        return mCount;
    }

    /**
     * Increments the counter by one.
     */
    public void addCount() {
       ++mCount;
    }
}
