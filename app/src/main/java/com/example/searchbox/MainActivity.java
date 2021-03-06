package com.example.searchbox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    AutoCompleteTextView tv;


        String name[]={"Amit","arun","Anuj","Arun","Ayan","Arjun","Ankita","kavish","Karan","Kavita","bhavika","Yogita","Devashish","Bholi","Bhavesh","badal","Badrinath","badlu","baani","Banti","babli","Birju","Bharat","Chandu","Chandan","Chandragupta","Chameli","Champa","Chamanlal","Champak","Chanchal",
                "Dev","Diwakar","Deshna","Divya","Dinkar","Dashrath","Devilaal","Duryodhan","Dushashan","Damini","Erica","Evan","Eva","Evanshi","Faruk","Faisal","faim","Firoj",
                "Gudiya","Guddu","Gokul","Gopal","Ginni","Gomati","Garima","Gajjendra","Gajju","Hitesh","Heena","Heema","Himanshi","Himmat","Harshita","Harsh",
                "Ishika","Ishita","Irfaan","Ishan","Ishani","Israt","Ilhaan","Indrajeet","Julie","Jaggu","Jagdish","Jethalaal","Jayesh","Jai","jaydeep",
                "jeevan","Jaspreet","jammy","Jassi","Kavi","Komal","Kamal","krishna","Krish","Keshev","kancha","Kamlesh","Kanhiya","Kannu","Kunti","Lovely",
                "Laxman","lokesh","Lalita","Laksh","Laxmi","Lalu","Leela","Mansi","Monika","Mohani","Monalisa","Malini","Mamta","Mohini","Monu","Meena","Meenu",
                "Nisha","Nishikant","Neeraj","Nivedita","Namrita","Neelam","Neelu","Naman","Namit","Naveen","Naina","Nancy","Obama","Om","Oscar","Oju","Ojas",
                "Pintu","Pinku","Piku","Pihu","Pavan","Parvesh","Pallavi","Pooja","Poonam","Pinky","Pushpa","Queen","Ram","ramesh","Raju","Ravan","Rajeshwari","Ramlaal","reenu","Rinku","Rahul",
                "Sarita","Sonu","saraswati","Suman","Sonal","Sunita","Shikha","Shipra","Simran","Samrath","sanjay","Shivani","Salman","Sharukh","Shivam","Shiv",
                "Shubham","Shani","Sunny","Sonali","Sujata","Twinkle","tarun","tannu","Tanisha","Tanya","Tushar","Tani","Tinku","Titu","Tim cook","Umesh","Uma",
                "Usha","Usmaan","Yogi","Yogesh","Yamini","Yamuna","Yami","yash","Yashvardhan","Yudhistir","Yuvani","Yuvan","Zerk"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String>obj;
        obj=new ArrayAdapter<String>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,name);

        tv.setAdapter(obj);
        tv.setThreshold(1);
        tv.setOnItemClickListener(this);


    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Position="+position, Toast.LENGTH_LONG).show();

    }
}