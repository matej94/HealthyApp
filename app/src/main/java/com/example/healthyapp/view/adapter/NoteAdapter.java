package com.example.healthyapp.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.healthyapp.R;
import com.example.healthyapp.model.Note;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;

public class NoteAdapter extends RealmBaseAdapter<Note> implements ListAdapter {
    private static class ViewHolder {
        TextView TitleTv, DescriptionTv, DateTv;
    }

    public NoteAdapter(OrderedRealmCollection<Note> realmResults) {
        super(realmResults);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.note_item, parent, false);
            viewHolder = new ViewHolder();
           // viewHolder.IdTv = convertView.findViewById(R.id.idTv);
            viewHolder.TitleTv = convertView.findViewById(R.id.titleTv);
            viewHolder.DescriptionTv = convertView.findViewById(R.id.descriptionTv);
            viewHolder.DateTv = convertView.findViewById(R.id.dateTv);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if (adapterData != null) {
            final Note note = adapterData.get(position);
            //viewHolder.IdTv.setText(((Integer.toString(note.getId()))));
            viewHolder.TitleTv.setText(note.getTitle());
            viewHolder.DescriptionTv.setText(note.getDescription());
            viewHolder.DateTv.setText(""+ note.getDate());

        }
        return convertView;
    }
}