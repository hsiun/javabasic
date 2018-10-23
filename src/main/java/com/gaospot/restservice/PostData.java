package com.gaospot.restservice;

/**
 * Created by gao on 2018/9/29.
 */
public class PostData {
    String fileName;

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "PostData{" +
                "fileName='" + fileName + '\'' +
                ", separator='" + separator + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", limitedRecords=" + limitedRecords +
                '}';
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getLimitedRecords() {
        return limitedRecords;
    }

    public void setLimitedRecords(int limitedRecords) {
        this.limitedRecords = limitedRecords;
    }

    public PostData() {
    }

    String separator;
    String startTime;
    String endTime;
    int limitedRecords;

}
