package tranthanh.dmt.listviewcauthu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class cauthuAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<cauthu> cauthuList;

    public cauthuAdapter(Context context, int layout, List<cauthu> cauthuList) {
        this.context = context;
        this.layout = layout;
        this.cauthuList = cauthuList;
    }

    @Override
    public int getCount() {
        return cauthuList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
         TextView txtHoTen,txtTuoi,txtViTri,txtQuoctich;
         ImageView imgHinh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,null);
            holder = new ViewHolder();
            //anh xa
            holder.txtHoTen=(TextView)convertView.findViewById(R.id.Ten);
            holder.txtTuoi=(TextView) convertView.findViewById(R.id.Tuoi);
            holder.txtViTri=(TextView) convertView.findViewById(R.id.Vitri);
            holder.txtQuoctich=(TextView) convertView.findViewById(R.id.QuocTich);
            holder.imgHinh=(ImageView) convertView.findViewById(R.id.Hinh);
            convertView.setTag(holder);
        }
        else
        {
           holder=(ViewHolder) convertView.getTag();
        }
        cauthu Cauthu=cauthuList.get(position);
        holder.txtHoTen.setText(Cauthu.getHoTen());
        holder.txtTuoi.setText(Cauthu.getTuoi());
        holder.txtViTri.setText(Cauthu.getViTri());
        holder.txtQuoctich.setText(Cauthu.getQuocTich());
        holder.imgHinh.setImageResource(Cauthu.getHinh());

        return convertView;

    }
}
