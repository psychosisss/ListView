package com.example.psychosis.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;

/**
 * Created by psychosis on 2018/4/9.
 */
//姓名班级学号
public class MainActivity extends Activity{
    private final static String NAME="name";
    private final static String CLAS="clas";
    private final static String NUM="num";

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        String[] name={"王博文","魏大勋 ","lily","bob"};
        String[] clas={"一班","二班 ","三班 ","四班"};
        String[] num={"19940518","2015011","2017011","2018441"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<name.length;i++){
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME,name[i]);
            item.put(CLAS,clas[i]);
            item.put(NUM,num[i]);
            items.add(item);
        }
        SimpleAdapter adapter= new SimpleAdapter(this,items, R.layout.item,new String[]{
            NAME,CLAS,NUM},new int[]{R.id.txtname,R.id.txtclas,R.id.txtnum});
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }


}
