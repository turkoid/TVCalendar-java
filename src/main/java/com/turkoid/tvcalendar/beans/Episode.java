/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turkoid.tvcalendar.beans;

import java.util.Date;

/**
 *
 * @author turkoid
 */
public class Episode {
    private static final String STATUS_DEFAULT = "default";
    private static final String STATUS_PREMIERE = "premiere";
    private static final String STATUS_FINALE = "finale";

    private String id;
    private String showId;
    private String showName;
    private String title;
    private String summary;
    private int season;
    private int episode;
    private String network;
    private Date airtimeStart;
    private Date airtimeEnd;
    private boolean watched;
    private String status;

    private String getId() {
        return id;
    }

    public String getShowId() {
        return showId;
    }

    public String getShowName() {
        return showName;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public int getSeason() {
        return season;
    }

    public int getEpisode() {
        return episode;
    }

    public String getNetwork() {
        return network;
    }

    public Date getAirtimeStart() {
        return airtimeStart;
    }

    public Date getAirtimeEnd() {
        return airtimeEnd;
    }

    public boolean isWatched() {
        return watched;
    }

    public String getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public void setAirtimeStart(Date airtimeStart) {
        this.airtimeStart = airtimeStart;
    }

    public void setAirtimeEnd(Date airtimeEnd) {
        this.airtimeEnd = airtimeEnd;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
