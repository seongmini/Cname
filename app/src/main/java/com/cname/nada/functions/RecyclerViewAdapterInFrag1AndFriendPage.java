package com.cname.nada.functions;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.cname.nada.FriendPageActivity;
import com.cname.nada.R;

import java.util.ArrayList;

public class RecyclerViewAdapterInFrag1AndFriendPage extends RecyclerView.Adapter<RecyclerViewAdapterInFrag1AndFriendPage.ViewHolder>{
    private ArrayList<ArrayList<String>> mData = null;
    private RecyclerViewAdapterInFrag2.OnItemClickListener mListener = null;

    public interface OnItemClickListener {
        void onItemClick(View v, int pos);
    }

    public void setOnItemClickListener (RecyclerViewAdapterInFrag2.OnItemClickListener listener) {
        this.mListener = listener;
    }

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textCareerCategory;
        TextView textCareerTitle;
        TextView textCareerStartDate;

        ViewHolder(View itemView) {
            super(itemView);

            // 뷰 객체에 대한 참조. (hold strong reference)
            textCareerCategory = itemView.findViewById(R.id.careerCategory);
            textCareerTitle = itemView.findViewById(R.id.careerTitle);
            textCareerStartDate = itemView.findViewById(R.id.careerStartDate);
        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    public RecyclerViewAdapterInFrag1AndFriendPage(ArrayList<ArrayList<String>> list) {
        this.mData = list;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public RecyclerViewAdapterInFrag1AndFriendPage.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.recyclerview_item_in_frag1_and_friendpage, parent, false);
        RecyclerViewAdapterInFrag1AndFriendPage.ViewHolder vh = new RecyclerViewAdapterInFrag1AndFriendPage.ViewHolder(view);

        return vh;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(RecyclerViewAdapterInFrag1AndFriendPage.ViewHolder holder, int position) {
        String category = mData.get(position).get(0);
        String title = mData.get(position).get(1);
        String startDate = mData.get(position).get(2);
        holder.textCareerCategory.setText(category);
        holder.textCareerTitle.setText(title);
        holder.textCareerStartDate.setText(startDate);
    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mData.size();
    }
}
