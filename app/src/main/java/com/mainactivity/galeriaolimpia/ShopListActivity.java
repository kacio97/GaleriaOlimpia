package com.mainactivity.galeriaolimpia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopListActivity extends AppCompatActivity {

    private ArrayList<Shop> listaSklepow = new ArrayList<>();
    private ListView listView;
    private AdapterShop adapterShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);
        createData();

        listView = findViewById(R.id.ListView);

        adapterShop = new AdapterShop(ShopListActivity.this, 0, listaSklepow);

        listView.setAdapter(adapterShop);

    }

    private void createData(){
        Shop s1 = new Shop(R.drawable.bigstar_logo,
                "Moda",
                "Czynne 09:00 - 21:00", "Od 1979 roku jeansy sygnowane znakiem BIG STAR " +
                "są gwarancją najwyższej jakości i designu zgodnego z aktualnymi trendami. " +
                "Od ponad 40 lat jeansy to żelazny element oferty marki, na przestrzeni lat uzupełniany o " +
                "kolejne części garderoby oraz modowe dodatki. Dla projektantów BIG STAR praca jest pasją, odzież sztuką użytkową, " +
                "a jeansy elementem kultury. Zaufanie i lojalność Klientów natomiast, to zobowiązanie do dostarczania produktów najwyższej jakości i " +
                "odpowiadających zmieniającym się na przestrzeni lat trendom. Nieprzerwanie od 1979 roku.",
                "Tel.: 883338328",
                R.drawable.bigstar_shop);

        Shop s2 = new Shop(R.drawable.cropp_logo,
                "Moda",
                "Czynne 09:00 - 21:00",
                "Istniejąca od 2004 roku marka młodzieżowa, której produkty powstają z myślą o osobach, ceniących sobie relacje z rówieśnikami, " +
                        "które poprzez strój chcą zamanifestować swoją niezależność. Dzięki współpracy z renomowanymi partnerami, w salonach tej marki można " +
                        "kupić także produkty firm: MITCHELL & NESS, KOMONO, SHARPIE, a także buty NEW BALANCE i CONVERSE. Marka Cropp jest partnerem wydarzeń " +
                        "adresowanych do artystów i młodych ludzi realizujących swoje pasje. ",
                "Tel.: 785003675",
                R.drawable.cropp_shop);

        Shop s3 = new Shop(R.drawable.grycan_logo,
                "Kawiarnie i restauracje",
                "Czynne 09:00 - 21:00",
                "\"Grycan lody od pokoleń\" to dynamicznie rozwijająca się sieć lodziarni w całej Polsce. " +
                        "Jest to miejsce, w którym każdy znajdzie coś dla siebie.Oferujemy lody i sorbety sprzedawane " +
                        "na porcje w 36. smakach oraz w pojemnikach na wynos, soki i koktajle owocowe, rurki z bitą śmietaną, " +
                        "gorącą czekoladę, kawę, herbatę, zimne napoje a przede wszystkim szeroki wybór wspaniałych deserów lodowych w pucharach.",
                "Tel.: 784009834",
                R.drawable.grycan_shop);

        Shop s4 = new Shop(R.drawable.hm_logo,
                "Moda",
                "Czynne 09:00 - 21:00",
                "H & M to szwedzka firma odzieżowa oferująca modę damską, męską, młodzieżową i dziecięcą oraz kosmetyki i akcesoria. " +
                        "Firma H & M, Hennes & Mauritz powstała w Szwecji, w 1947r i jest jedną z największych firm odzieżowych na świecie. " +
                        "Główną ideą firmy jest oferowanie mody i jakości za najlepszą cenę. " +
                        "W sklepach dostępne są ubrania projektowane przez własnych projektantów firmy, jak również powstałe przy współpracy ze znanymi projektantami ",
                "Tel.: 447153041",
                R.drawable.hm_shop);

        Shop s5 = new Shop(R.drawable.kfc_logo,
                "Kawiarnie i restauracje",
                "Czynne 09:00 - 21:00",
                "Każdego dnia kilkanaście milionów klientów zamawia nasze specjały w ponad 100 krajach na całym świecie. " +
                        "W dużej mierze jesteśmy znani dzięki unikalnej recepturze na kurczaka KFC, którą wynalazł Colonel Harland Sanders ponad pół wieku temu. " +
                        "Stworzona na bazie mieszanki 11 ziół i przypraw panierka, którą obtaczamy wyselekcjonowane kawałki kurczaka, stanowi naszą tajemnicę. ",
                " Tel.: 713861921",
                R.drawable.kfc_shop);

        Shop s6 = new Shop(R.drawable.ny_logo,
                "Moda",
                "Czynne 09:00 - 21:00",
                "\"Dress for the Moment\" to filozofia marki New Yorker. " +
                        "Zgodnie ze swoim mottem, New Yorker tworzy kolekcje męskie i damskie, zawsze w nawiązaniu do najgorętszych trendów sezonu. " +
                        "Poza modą młodzieżową, dżinsami, kolekcją w stylu sportowym i miejskim, " +
                        "w naszych sklepach znajdziesz też szeroki wybór akcesoriów, butów i bielizny.",
                "Tel.: 447159520",
                R.drawable.ny_shop);

        Shop s7 = new Shop(R.drawable.deich_logo,
                "Obuwie i galanteria skórzana",
                "Czynne 09:00 - 21:00",
                "DEICHMANN to międzynarodowa sieć sklepów obuwniczych, których asortyment cieszy się uznaniem klientów w kilkudziesięciu państwach świata." +
                        "W ofercie: obuwie damskie, męskie, dziecięce, młodzieżowe, dla osób starszych, skarpetki, środki do pielęgnacji obuwia (pasty, aerozole), " +
                        "szczotki, wkładki do butów, prawidła, sznurowadła, torby, paski.",
                "Tel.: 446314020",
                R.drawable.deich_shop);

        Shop s8 = new Shop(R.drawable.empik_logo,
                "Multimedia RTV/AGD",
                "Czynne 09:00 - 21:00",
                "Empik to dziesiątki tysięcy książek, płyt z muzyką, filmów, gier multimedialnych, czasopism, dekoracji do domu, " +
                        "produktów i zabawek edukacyjnych, artykułów do relaksu i pielęgnacji, rozwoju własnego, gier planszowych oraz gadżetów podróżniczych. " +
                        "To ulubiona rozrywka i kultura, przyjemność odkrywania i poznawania. " +
                        "Dostarczamy wiedzę, generujemy pasje, poszerzamy zainteresowania, uwalniamy wyobraźnię, inspirujemy do dalszego rozwoju i kreatywności.",
                "Tel.: +48 22 462 72 50",
                R.drawable.empik_shop);

        Shop s9 = new Shop(R.drawable.ccc_logo,
                "Obuwie i galanteria skórzana",
                "Czynne 09:00 - 21:00",
                "CCC jest liderem polskiego rynku w sprzedaży detalicznej i jego największym producentem w Polsce. " +
                        "Bogatą ofertę modnego obuwia w atrakcyjnych cenach CCC kieruje do kobiet, mężczyzn, młodzieży i dzieci w każdej grupie " +
                        "wiekowej. CCC wprowadza aktualne trendy mody światowej na polski rynek obuwia, oferując przy tym atrakcyjne ceny. " +
                        "W trosce o klienta CCC dopełnia wszelkich starań, " +
                        "aby sprzedawany asortyment oraz jakość obsługi w salonach spełniały jego oczekiwania na najwyższym poziomie.",
                "Tel.: 447159519",
                R.drawable.ccc_shop);

        Shop s10 = new Shop(R.drawable.apart_logo,
                "Akcesoria",
                "Czynne 09:00 - 21:00",
                "W naszych salonach oferujemy Państwu szeroki wybór biżuterii oraz zegarki najlepszych światowych marek. " +
                        "To właśnie biżuteria firmy APART najlepiej podkreśli urok i klasę każdego stroju. " +
                        "Każdy znajdzie u nas piękny drobiazg dla siebie oraz wyjątkowy prezent dla swoich najbliższych. " +
                        "Fachowi, uprzejmi i zawsze gotowi do pomocy konsultanci sprawiają, że zakupy w salonach Apart są prawdziwą przyjemnością.",
                "Tel.: 447159574",
                R.drawable.apart_shop);

        Shop s11 = new Shop(R.drawable.rtv_logo,
                "Multimedia RTV/AGD",
                "Czynne 09:00 - 21:00",
                "Nowoczesny sprzęt to nasz atut\n" +
                        "\n" +
                        "W RTV EURO AGD znajdziesz nowoczesny sprzęt, który zapewni rozrywkę całej rodzinie, ułatwi kontakt,  pozwoli rozwijać pasje, " +
                        "zdopinguje do ruchu, pomoże w nauce i urządzi dom, a nawet wyposaży biuro. Trzymamy rękę na pulsie, żeby jak najszybciej wprowadzić do " +
                        "sprzedaży technologiczne nowości.\n" +
                        "\n" +
                        "Niska cena to nie wszystko\n" +
                        "\n" +
                        "U nas zawsze możesz liczyć na  atrakcyjne ceny, promocje i rabaty, ale to nie jest jedyny nasz atut. Oferujmy znacznie więcej – " +
                        "profesjonalne doradztwo technologiczne i praktyczne usługi.",
                "Tel.: 855 855 855",
                R.drawable.rtv_shop);

        listaSklepow.add(s1);
        listaSklepow.add(s2);
        listaSklepow.add(s3);
        listaSklepow.add(s4);
        listaSklepow.add(s5);
        listaSklepow.add(s6);
        listaSklepow.add(s7);
        listaSklepow.add(s8);
        listaSklepow.add(s9);
        listaSklepow.add(s10);
        listaSklepow.add(s11);
    }


}
