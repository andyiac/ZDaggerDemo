package com.andyiac.zdaggerdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.andyiac.zdaggerdemo.R;
import com.andyiac.zdaggerdemo.data.AllCourses;
import com.andyiac.zdaggerdemo.data.Course;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.orhanobut.logger.Logger;

import java.util.List;

/**
 * @author andyiac
 * @date 12/30/15
 * @web www.andyiac.com
 */
public class CourseSingleTopicListAdapter extends RecyclerView.Adapter<CourseSingleTopicListAdapter.ViewHolder> {


    public interface ICourseItemClickListener {
        void onClick(int course_id);
    }

    private ICourseItemClickListener listener;

    public void setOnICourseItemClickListener(ICourseItemClickListener listener) {
        this.listener = listener;
    }

    private List<AllCourses.DataEntity> mListData;
    private Context mContext;

    public CourseSingleTopicListAdapter(Context context, List<AllCourses.DataEntity> data) {
        this.mContext = context;
        this.mListData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_main_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        AllCourses.DataEntity course = mListData.get(position);
        holder.mTvTitle.setText(course.getTitle());
        holder.mTvAuthor.setText(course.getTeacher().getName());
        holder.mTvAuthorWork.setText(course.getTeacher().getWork());
        ImageLoader.getInstance().displayImage(mListData.get(position).getPhoto(), holder.mImageView);

        holder.mCourseLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               listener.onClick(mListData.get(position).getUid());
            }
        });





    }

    @Override
    public int getItemCount() {
        return mListData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;
        private TextView mTvTitle, mTvAuthor, mTvAuthorWork;
        private LinearLayout mCourseLL;

        public ViewHolder(View itemView) {
            super(itemView);
            mCourseLL = (LinearLayout) itemView.findViewById(R.id.id_ll_course_item_holder);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_course_item_img);
            mTvTitle = (TextView) itemView.findViewById(R.id.tv_course_item_title);
            mTvAuthor = (TextView) itemView.findViewById(R.id.tv_course_item_author);
            mTvAuthorWork = (TextView) itemView.findViewById(R.id.tv_course_item_author_work);
        }
    }
}
