package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    ArrayList<FormulaItem> alFormulaList;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.ListViewFormula);

        alFormulaList = new ArrayList<>();

        FormulaItem item1 = new FormulaItem("Area of rectangle" , "Length x Length", "Formula type is: Area");
        FormulaItem item2 = new FormulaItem("Area of triangle" , "(Length of base x Length)/2", "Formula type is: Area");
        FormulaItem item3 = new FormulaItem("Volume of cube" , "Length x Length x Length", "Formula type is: Volume");

        alFormulaList.add(item1);
        alFormulaList.add(item2);
        alFormulaList.add(item3);

        caFormula = new CustomAdapter(this, R.layout.formula_item, alFormulaList);

        lvFormula.setAdapter(caFormula);
    }
}
