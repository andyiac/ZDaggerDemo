package com.andyiac.zdaggerdemo.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.andyiac.zdaggerdemo.R;

import java.util.List;
import java.util.Map;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseMainCategoryGridViewAdapter extends BaseAdapter {

    private List<Map<String, Object>> data;
    private Context context;
    private LayoutInflater inflater;

    public CourseMainCategoryGridViewAdapter(Context context, List<Map<String, Object>> dataList) {
        this.data = dataList;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override

    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.course_main_categroy_grid_item, null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.id_iv_course_category_grid);
        TextView textView = (TextView) convertView.findViewById(R.id.id_tv_course_category_grid);

        int resId = Integer.valueOf(data.get(position).get("img").toString());

        imageView.setImageDrawable(context.getDrawable(resId));
        textView.setText(data.get(position).get("name").toString());
        return convertView;
    }
}
