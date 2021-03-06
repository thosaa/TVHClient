package org.tvheadend.tvhclient.model;

import java.util.Date;

public class SeriesRecording implements Comparable<SeriesRecording> {

    public String id;
    public String description;
    public long maxDuration;
    public boolean enabled;
    public long minDuration;
    public long retention;
    public long daysOfWeek;
    public long approxTime;
    public long priority;
    public Date startExtra;
    public Date stopExtra;
    public String title;
    public Channel channel;

    @Override
    public int compareTo(SeriesRecording that) {
        return (this.id.equals(that.id)) ? 0 : 1;
    }
}
