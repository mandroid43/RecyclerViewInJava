package com.manapps.mandroid.recyclerviewinjava;

import java.util.List;

public class DataResponse {
    public List<DataModel> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataModel> dataList) {
        this.dataList = dataList;
    }

    private List<DataModel> dataList=null;
}
