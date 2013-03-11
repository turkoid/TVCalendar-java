/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turkoid.tvcalendar.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author turkoid
 */
public class Show {
    private String id;
    private String name;
    private String summary;
    private String network;
    private List<Episode> nextEpisodes;
    private String status;

    public Show() {
        nextEpisodes = new ArrayList();
    }

    private String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public String getNetwork() {
        return network;
    }

    public List<Episode> getNextEpisodes() {
        return nextEpisodes;
    }

    public Episode getNextEpisode() {
        return nextEpisodes.isEmpty() ? null : nextEpisodes.get(0);
    }

    public String getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
