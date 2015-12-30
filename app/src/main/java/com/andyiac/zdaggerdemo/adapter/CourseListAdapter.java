package com.andyiac.zdaggerdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.data.Course;
import com.orhanobut.logger.Logger;

import java.util.List;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseListAdapter extends RecyclerView.Adapter<CourseListAdapter.ViewHolder> {


    private List<Course.CourseEntity> mListData;
    private Context mContext;

    public CourseListAdapter(Context context, List<Course.CourseEntity> data) {
        this.mContext = context;
        this.mListData = data;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_main_item, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Course.CourseEntity course = mListData.get(position);
        Logger.e("=======");
        Logger.json(JSON.toJSONString(course));
        holder.mTvTitle.setText(course.getTitle());
        holder.mTvAuthor.setText(course.getTeacher().getName());
        holder.mTvAuthorWork.setText(course.getTeacher().getWork());
    }

    @Override
    public int getItemCount() {
        return mListData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;
        private TextView mTvTitle, mTvAuthor, mTvAuthorWork;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_course_item_img);
            mTvTitle = (TextView) itemView.findViewById(R.id.tv_course_item_title);
            mTvAuthor = (TextView) itemView.findViewById(R.id.tv_course_item_author);
            mTvAuthorWork = (TextView) itemView.findViewById(R.id.tv_course_item_author_work);

        }
    }
}
