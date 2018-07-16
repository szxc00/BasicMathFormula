package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<FormulaItem> formulaList;

    public CustomAdapter(@NonNull Context context, int resource,
                         @NonNull ArrayList<FormulaItem> objects) {

        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        formulaList = objects;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvFormula = rowView.findViewById(R.id.tvFormula);
        TextView tvFormulaType = rowView.findViewById(R.id.tvFormulaType);
        FormulaItem currentItem = formulaList.get(position);
        tvName.setText(currentItem.getFormulaName());
        tvFormula.setText(currentItem.getFormula());
        tvFormulaType.setText(currentItem.getFormulaType());
        return  rowView;
    }

}
