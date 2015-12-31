package com.andyiac.zdaggerdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.data.Course;
import com.andyiac.zdaggerdemo.data.CourseType;

import java.util.List;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseMainCourseItemGridViewAdapter extends BaseAdapter {

    private List<Course.CourseEntity> dataList;
    private Context context;
    private LayoutInflater inflater;

    public CourseMainCourseItemGridViewAdapter(Context context, List<Course.CourseEntity> dataList) {
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
        convertView = inflater.inflate(R.layout.course_main_item, null);
        TextView courseTitle = (TextView) convertView.findViewById(R.id.tv_course_item_title);
        TextView courseAuthor = (TextView) convertView.findViewById(R.id.tv_course_item_author);
        TextView courseAuthorWork = (TextView) convertView.findViewById(R.id.tv_course_item_author_work);
        courseTitle.setText(dataList.get(position).getTitle());
        courseAuthor.setText(dataList.get(position).getTeacher().getName());
        courseAuthorWork.setText(dataList.get(position).getTeacher().getWork());
        return convertView;
    }
}
