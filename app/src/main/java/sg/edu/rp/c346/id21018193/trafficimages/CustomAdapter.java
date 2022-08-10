package sg.edu.rp.c346.id21018193.trafficimages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<trafficImages> trafficImagesArrayList;

    public CustomAdapter(Context context, int resource, ArrayList<trafficImages> objects) {
        super(context, resource);
        parent_context = context;
        layout_id = resource;
        trafficImagesArrayList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvCameraId = rowView.findViewById(R.id.textViewCameraId);
        TextView tvTimestamp = rowView.findViewById(R.id.textViewTimestamp);
        TextView tvImage = rowView.findViewById(R.id.textViewImage);

       trafficImages currentItem = trafficImagesArrayList.get(position);

        tvCameraId.setText(currentItem.getCamera_id());
        tvTimestamp.setText(currentItem.getTimestamp());
        tvImage.setText(currentItem.getImage());
        return rowView;
    }

}
