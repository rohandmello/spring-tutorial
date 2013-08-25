package com.rohan.core.sequence;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan.Dmello
 * Date: 8/4/13
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class SequenceGenerator {
    private String suffix;
    private String preFix;
    private int initial;
    private int counter;

    private List<Object> suffixes;

    public SequenceGenerator(){}

    public SequenceGenerator(String preFix, String suffix, int initial){
        this.preFix = preFix;
        this.suffix = suffix;
        this.initial = initial;
    }

    public void setSuffixes(List<Object> suffixes) {
        this.suffixes = suffixes;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setPreFix(String preFix) {
        this.preFix = preFix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public synchronized String getSequence() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(preFix);
        buffer.append(initial + counter++);
        for(Object suffix : suffixes){
            buffer.append("-");
            buffer.append(suffix);
        }
        return buffer.toString();
    }

}
