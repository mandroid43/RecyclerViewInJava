package com.manapps.mandroid.recyclerviewinjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setUpRecyclerView();
        sendRecyclerViewDataRequest();
    }

    private void sendRecyclerViewDataRequest() {
        //assume you are getting data from api or local storage by function getDataList
        List<DataModel> dataModelList = getDataList();
        showRecyclerViewData(dataModelList);
    }

    private List<DataModel> getDataList() {
        List<DataModel> dataModelList = new ArrayList<>();

//this is the format of data we are going to recieve
        // you can edit the data according to your needs
        // fetch dataList from DataResponse(apiResponse)
        // dataModelList=  dataResponse.getDataList();
//        {
//            "dataList": [
//            {
//                "title": "Item1",
//                    "photoUrl": "photoUrl1"
//            },
//            {
//                "title": "Item2",
//                    "photoUrl": "photoUrl2"
//            }
//  ]
//        }


        DataModel dataModel1 = new DataModel();
        dataModel1.setTitle("Item1");
        dataModel1.setPhotoUrl("PhotoUrl1");
        dataModelList.add(dataModel1);

        DataModel dataModel2 = new DataModel();
        dataModel2.setTitle("Item2");
        dataModel2.setPhotoUrl("PhotoUrl2");
        dataModelList.add(dataModel2);


        DataModel dataModel3 = new DataModel();
        dataModel3.setTitle("Item3");
        dataModel3.setPhotoUrl("PhotoUrl3");
        dataModelList.add(dataModel3);


        DataModel dataModel4 = new DataModel();
        dataModel4.setTitle("Item4");
        dataModel4.setPhotoUrl("PhotoUrl4");
        dataModelList.add(dataModel4);


        DataModel dataModel5 = new DataModel();
        dataModel5.setTitle("Item5");
        dataModel5.setPhotoUrl("PhotoUrl5");
        dataModelList.add(dataModel5);


        return dataModelList;
    }

    private void showRecyclerViewData(List<DataModel> dataModelList) {
        RecyclerViewItemAdapter recyclerViewItemAdapter = new RecyclerViewItemAdapter(this, dataModelList);
        recyclerView.setAdapter(recyclerViewItemAdapter);
        recyclerViewItemAdapter.notifyDataSetChanged();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    //setup recycler view
    private void setUpRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}