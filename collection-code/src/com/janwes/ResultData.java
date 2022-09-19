package com.janwes;

import java.util.List;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes
 * @date 2022/1/9 20:31
 * @description
 */
public class ResultData {

    private String indexCode;

    private String indexName;

    private List<String> levels;

    private List<String> departments;

    private String statDate;

    public ResultData() {
    }

    public ResultData(String indexCode, String indexName, List<String> levels, List<String> departments, String statDate) {
        this.indexCode = indexCode;
        this.indexName = indexName;
        this.levels = levels;
        this.departments = departments;
        this.statDate = statDate;
    }

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public List<String> getLevels() {
        return levels;
    }

    public void setLevels(List<String> levels) {
        this.levels = levels;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "indexCode='" + indexCode + '\'' +
                ", indexName='" + indexName + '\'' +
                ", levels=" + levels +
                ", departments=" + departments +
                ", statDate='" + statDate + '\'' +
                '}';
    }
}
