package com.mainactivity.galeriaolimpia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RepetorieSingleDayActivity extends AppCompatActivity {

    private ArrayList<Movie> listaFilmow = new ArrayList<>();
    private ListView listView;
    private AdapterMovie adapterMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repetorie_single_day);

        Intent intent = getIntent();

        String dzien = intent.getStringExtra("dzien");

        createData();

        ArrayList<Movie> dziennaListaFilmow = new ArrayList<>();

        for (int i = 0; i < listaFilmow.size(); i++) {
            for (int j = 0; j < listaFilmow.get(i).getPlayDay().size(); j++) {
                if (listaFilmow.get(i).getPlayDay().get(j).equals(dzien)) {
                    dziennaListaFilmow.add(listaFilmow.get(i));
                }
            }
        }

        listView = findViewById(R.id.singleDayListView);

        adapterMovie = new AdapterMovie(RepetorieSingleDayActivity.this, 0, dziennaListaFilmow);

        listView.setAdapter(adapterMovie);


    }


    private void createData() {

        ArrayList<String> playDays = new ArrayList<>();
        playDays.add("poniedzialek");
        playDays.add("wtorek");
        playDays.add("sroda");
        playDays.add("czwartek");
        playDays.add("piatek");
        playDays.add("sobota");
        playDays.add("niedziela");

        Movie m1 = new Movie(R.drawable.mulan,
                "Mulan", "2020", "Przygodowy",
                "Będąc nieodrodną córką wielkiego wojownika, Hua Mulan jest szybka, nieustraszona i zdeterminowana. " +
                        "Kiedy cesarz nakazuje, aby jeden mężczyzna z każdej rodziny służył w jego armii, Mulan zajmuje miejsce swojego chorego ojca. " +
                        "Jako Hua Jun staje się jednym z największych chińskich wojowników.",
                new ArrayList<>(playDays.subList(0, 2)));

        Movie m2 = new Movie(R.drawable.wonderwoman,
                "Wonder Woman 1984", "2020", "Akcja  /Fantasy  /Przygodowy",
                "Wonder Woman przenosi się w czasie do lat 80. XX wieku. " +
                        "Księżniczka Diana Prince podczas zimnej wojny stawia czoło niebezpiecznym przeciwnikom takim jak Cheetah i Max Lord.",
                new ArrayList<>(playDays.subList(0, 2)));

        Movie m3 = new Movie(R.drawable.sponge,
                "SpongeBob Film: Na ratunek", "2020", "Komedia  /Animacja",
                "Zmiany, zmiany, zmiany. W świecie SpongeBoba Kanciastoportego czas na wielkie zmiany. Musiał pożegnać się ze swym ukochanym Bikini Dolnym, " +
                        "w którym spędził tyle lat. No, ale nie miał wyboru. " +
                        "Musiał wyruszyć na ratunek Gacusiowi, swemu ukochanemu przyjacielowi.",
                new ArrayList<>(playDays.subList(1, 4)));


        Movie m4 = new Movie(R.drawable.topgun,
                "Top Gun: Maverick", "2020", "Akcja",
                "Po ponad 30 latach w służbie amerykańskiej marynarce wojennej, Pete „Maverick” Mitchell (Tom Cruise) jest tam, gdzie powinien być – na szczycie. " +
                        "Jest mistrzowskim pilotem, testującym najnowocześniejsze maszyny." +
                        "Kiedy staje na czele pilockiej spec-grupy szkolącej jej uczestników do udziału w misji, jakiej dotąd nie było, " +
                        "mierzy się ze swymi lękami i demonami, czego kulminacją będzie ostateczne poświęcenie tych, którzy zostaną wybrani do misji.",
                new ArrayList<>(playDays.subList(2, 5)));

        Movie m5 = new Movie(R.drawable.soul,
                "Co w duszy gra", "2020", "Animacja",
                "Zdarzyło Ci się kiedyś zastanawiać, skąd wzięła się Twoja pasja, Twoje marzenia i zainteresowania? " +
                        "Co sprawia, że jesteś... SOBĄ? W 2020 r. Pixar Animation Studios zabiorą Cię w podróż z ulic Nowego Jorku do nigdy wcześniej " +
                        "niewidzianych kosmicznych sfer i do miejsca, " +
                        "gdzie wszyscy odkrywamy swoje niepowtarzalne osobowości.",
                new ArrayList<String>(playDays.subList(3, 6)));

        Movie m6 = new Movie(R.drawable.tenet,
                "Tenet", "2020", "Thriller  /Akcja",
                "Tenet to nowy film Christophera Nolana z Johnem Davidem Washingtonem w roli głównej.",
                new ArrayList<String>(playDays.subList(4, 7)));

        Movie m7 = new Movie(R.drawable.trolle,
                "Trolle 2", "2020", "Komedia  /Animacja  /Przygodowy",
                "Queen Poppy i Branch odkrywają, że poza ich wioską istnieją inne światy zamieszkane przez Trolle, z którymi – by tak rzec – jakoś im nie po drodze. " +
                        "Kiedy niespodziewane niebezpieczeństwo zagrozi całej populacji Trolli, Poppy i Branch oraz ich przyjaciele wyruszą w wielką podróż przez nowe –" +
                        " niebezpieczne – lądy, by dokonać niemożliwego: pogodzić ze sobą wszystkie Trolle i połączyć się przeciw wrogowi.",
                new ArrayList<String>(playDays.subList(5, 7)));

        listaFilmow.add(m1);
        listaFilmow.add(m2);
        listaFilmow.add(m3);
        listaFilmow.add(m4);
        listaFilmow.add(m5);
        listaFilmow.add(m6);
        listaFilmow.add(m7);
    }
}
