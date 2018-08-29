package com.example.android.sofiatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CultureFragmentPage extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private static final String DRAWABLE_TYPE = "drawable";
    private ArrayList<LocationData> locationList = new ArrayList<>();
    private int currentPage;

    public static CultureFragmentPage newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        CultureFragmentPage fragment = new CultureFragmentPage();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        currentPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.culture_fragment_page, container, false);
        locationList.clear();

        if (currentPage == 1){
            createCultureList();
        } else if (currentPage == 2){
            createNatureList();
        } else if (currentPage == 3) {
            createHistoryList();
        } else if (currentPage ==4){
            createPopularList();
        }

        LocationCustomAdapter adapter = new LocationCustomAdapter(getActivity(), android.R.layout.simple_list_item_1, locationList);
        ListView listView = (ListView) view;
        listView.setAdapter(adapter);
        return view;
    }

    private void createCultureList(){
        String ndkName = "National Palace of Culture";
        String ndkDescription = "The National Palace of Culture, located in Sofia, the capital of Bulgaria, " +
                "is the largest, multifunctional conference and exhibition centre in south-eastern " +
                "Europe. It was opened in 1981 in celebration of Bulgaria's 1300th anniversary.";
        int ndkImage = getContext().getResources().getIdentifier("ndk_image", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData ndk = new TourLocationData(ndkName, ndkDescription, ndkImage);

        locationList.add(ndk);

        String theatreName = "Ivan Vazov National Theatre";
        String theareDescription = "The Ivan Vazov National Theatre is Bulgaria's national theatre, " +
                "as well as the oldest and most authoritative theatre in the country and one of the " +
                "important landmarks of Sofia, the capital of Bulgaria. It is located in the centre " +
                "of the city, with the facade facing the City Garden.";
        int theatreImage = getContext().getResources().getIdentifier("national_theatre", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData theatre = new TourLocationData(theatreName, theareDescription, theatreImage);

        locationList.add(theatre);

        String libraryName = "Cyril and Methodius National Library";
        String libraryDescription = "The SS. Cyril and Methodius National Library is the national " +
                "library of Bulgaria,[1] situated in the capital city of Sofia. Founded on 4 April 1878," +
                " the library received the status of Bulgarian National Library three years later and" +
                " the Bulgarian National Revival Archive was merged into it in 1924.\n" +
                "\n" +
                "It is named after \"SS. Cyril and Methodius\"; Saints Cyril and Methodius. They are " +
                "the creators of the Glagolitic alphabet. The Cyrillic alphabet is named after Cyril.";
        int libraryImage = getContext().getResources().getIdentifier("library", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData library = new TourLocationData(libraryName, libraryDescription, libraryImage);

        locationList.add(library);
    }

    private void createNatureList(){
        String moutainName = "Vitosha";
        String mountainDescription = "Vitosha, the ancient Scomius or Scombrus,[1] is a mountain " +
                "massif, on the outskirts of Sofia, the capital of Bulgaria. Vitosha is one of the " +
                "symbols of Sofia and the closest site for hiking, alpinism and skiing. Convenient " +
                "bus lines and rope ways render the mountain easily accessible. Vitosha has the " +
                "outlines of an enormous dome. The territory of the mountain includes Vitosha nature " +
                "park that encompasses the best known and most frequently visited parts.";
        int mountainImage = getContext().getResources().getIdentifier("vitosha_mountain", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData mountain = new TourLocationData(moutainName, mountainDescription, mountainImage);

        locationList.add(mountain);

        String gardenName = "Borisova gradina";
        String gardenDescription = "Borisova gradina or Knyaz-Borisova gradina (translated as Boris'" +
                " Garden or Knyaz Boris' Garden) is the oldest and best known park in Sofia, the " +
                "capital of Bulgaria. Its construction and arrangement began in 1884 and it is named " +
                "after Bulgarian Tsar Boris III.\n" +
                "\n" +
                "The history of the garden embraces three periods under three renowned gardeners. " +
                "All followed the initial scheme, developing it further and perfecting it instead of " +
                "making radical changes to the original design.";
        int gardenImage = getContext().getResources().getIdentifier("boris_garden", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData garden = new TourLocationData(gardenName, gardenDescription, gardenImage);

        locationList.add(garden);

        String parkName = "South Park";
        String parkDescription = "South Park is one of the big parks in Sofia. As the name suggests " +
                "it is located in the south parts of the city and it's size is 1,48 square km. In the " +
                "park can be see 65 kinds of birds, 29 of which are of a protected kind and 2 are in" +
                " the Red Book of Bulgaria.";
        int parkImage = getContext().getResources().getIdentifier("south_park", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData park = new TourLocationData(parkName, parkDescription, parkImage);

        locationList.add(park);
    }

    private void createHistoryList(){
        String museumName = "National Historical Museum";
        String museumDescription = "The National Historical Museum in Sofia is Bulgaria's largest " +
                "museum. It was founded on 5 May 1973. A new representative exhibition was opened in " +
                "the building of the Court of Justice on 2 March 1984, to commemorate the 13th " +
                "centenary of the Bulgarian state.\n" +
                "\n" +
                "The museum was moved in 2000 to the former primary residence of the dictator and " +
                "last communist leader Todor Zhivkov at Boyana, and currently contains over 650,000 " +
                "objects connected to archaeology, fine arts, history and ethnography, although only " +
                "10% of them are permanently exhibited.";
        int museumImage = getContext().getResources().getIdentifier("history_museum", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData museum = new TourLocationData(museumName, museumDescription, museumImage);

        locationList.add(museum);

        String serdikaName = "Amphitheatre of Serdica";
        String serdikaDescription = "The Amphitheatre of Serdica (Latin: AMPHITEATRUM SERDICENSE) " +
                "was an amphitheatre in the Ancient Roman city of Ulpia Serdica, now Sofia, the " +
                "capital of Bulgaria. Discovered in 2004 and the subject of excavations in 2005 and " +
                "2006, the ruins of the amphitheatre lie on two adjacent sites in the centre of " +
                "modern Sofia. The amphitheatre was built in the 3rd–4th century AD on top of a " +
                "2nd–3rd century theatre which had been ravaged by the Goths. However, the amphitheatre " +
                "remained in use for less than a century and was abandoned by the 5th century.";
        int serdikaImage = getContext().getResources().getIdentifier("serdika", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData serdika = new TourLocationData(serdikaName, serdikaDescription, serdikaImage);

        locationList.add(serdika);

        String churchName = "Church of St. George";
        String churchDescription = "The Church of St George is an Early Christian red brick rotunda " +
                "that is considered the oldest building in Sofia, the capital of Bulgaria.[1] It is " +
                "situated behind the Sheraton Hotel, amid remains of the ancient town of Serdica.\n" +
                "\n" +
                "Built by the Romans in the 4th century, it is a cylindrical domed structure built " +
                "on a square base. It is believed that it was built on the site of a pagan temple, " +
                "though the original purpose of the building was for public use.[1] The building is " +
                "famous for the 12th-, 13th- and 14th-century frescoes inside the central dome. " +
                "Three layers of frescoes have been discovered, the earliest dating back to the 10th " +
                "century. ";
        int churchImage = getContext().getResources().getIdentifier("church", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData church = new TourLocationData(churchName, churchDescription, churchImage);

        locationList.add(church);
    }

    private void createPopularList(){
        String nevskiName = "Alexander Nevsky Cathedral";
        String nevskiDescription = "The St. Alexander Nevsky Cathedral is a Bulgarian Orthodox " +
                "cathedral in Sofia, the capital of Bulgaria. Built in Neo-Byzantine style, it " +
                "serves as the cathedral church of the Patriarch of Bulgaria and it is one of the " +
                "largest Eastern Orthodox cathedrals in the world, as well as one of Sofia's symbols " +
                "and primary tourist attractions. The St. Alexander Nevsky Cathedral in Sofia " +
                "occupies an area of 3,170 square metres (34,100 sq ft) and can hold 10,000 people " +
                "inside.";
        int nevskiImage = getContext().getResources().getIdentifier("nevski", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData nevski = new TourLocationData(nevskiName, nevskiDescription, nevskiImage);

        locationList.add(nevski);

        String streetName = "Vitosha Boulevard";
        String streetDescription = "Vitosha Boulevard (often called just Vitoshka) is the main " +
                "commercial street in the centre of Sofia, the capital of Bulgaria, which is " +
                "abundant in posh stores, restaurants and bars. It extends from the St Nedelya " +
                "Square to the Southern Park. Many high-end fashion labels have outlets on Vitosha " +
                "boulevard and the neighbouring streets.";
        int streetImage = getContext().getResources().getIdentifier("street", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData street = new TourLocationData(streetName, streetDescription, streetImage);

        locationList.add(street);

        String haliName = "Central Sofia Market Hall";
        String haliDescription = "The Central Sofia Market Hall, known popularly simply as The " +
                "Market Hall (Halite) is a covered market in the centre of Sofia, the capital of " +
                "Bulgaria, located on Marie Louise Boulevard. It was opened in 1911 and is today an " +
                "important trade centre in the city.";
        int haliImage = getContext().getResources().getIdentifier("hali", DRAWABLE_TYPE, getContext().getPackageName());
        LocationData hali = new TourLocationData(haliName, haliDescription, haliImage);

        locationList.add(hali);
    }
}
