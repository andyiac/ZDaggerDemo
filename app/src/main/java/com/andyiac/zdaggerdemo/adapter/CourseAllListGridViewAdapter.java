package com.andyiac.zdaggerdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.data.CourseType;

import java.util.List;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseAllListGridViewAdapter extends BaseAdapter {

    private List<CourseType.TypeEntity> dataList;
    private Context context;
    private LayoutInflater inflater;

    public CourseAllListGridViewAdapter(Context context, List<CourseType.TypeEntity> dataList) {
        this.dataList = dataList;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override

    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.course_select_type_item, null);
        TextView textview = (TextView) convertView.findViewById(R.id.id_tv_item_course_type);
        textview.setText(dataList.get(position).getName());
        return convertView;
    }
}
