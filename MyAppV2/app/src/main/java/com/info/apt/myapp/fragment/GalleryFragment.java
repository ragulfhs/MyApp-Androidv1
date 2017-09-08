package com.info.apt.myapp.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.info.apt.myapp.Adapter.TabViewPagerAdapter;
import com.info.apt.myapp.R;
import com.info.apt.myapp.tabfragments.BlousesFragment;
import com.info.apt.myapp.tabfragments.DressesFragment;
import com.info.apt.myapp.tabfragments.SkirtFragment;
import com.info.apt.myapp.tabfragments.TopsFragment;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GalleryFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {

    private ViewPager tabViewPager;
    private TabLayout tabLayout;
    private TextView tabOne,tabTwo,tabThree,tabFour;

    private String tabTitles[] = new String[] { "DRESSES", "TOPS", "BLOUSES", "SKIRT" };

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);

        tabViewPager = (ViewPager) rootView.findViewById(R.id.tab_view_pager);

        createViewPager(tabViewPager);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tab_layout);

//        setupViewPager(tabViewPager);

        tabLayout.setupWithViewPager(tabViewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int position = tab.getPosition();

                if(position == 0){



                    tabOne.setText("DRESSES");
                    tabOne.setTextColor(getResources().getColor(R.color.white));
                    tabLayout.getTabAt(0).setCustomView(tabOne);


                    tabTwo.setText("TOPS");
                    tabTwo.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(1).setCustomView(tabTwo);


                    tabThree.setText("BLOUSES");
                    tabThree.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(2).setCustomView(tabThree);


                    tabFour.setText("SKIRT");
                    tabFour.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(3).setCustomView(tabFour);

                }
                else if( position ==1){


                    tabOne.setText("DRESSES");
                    tabOne.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(0).setCustomView(tabOne);


                    tabTwo.setText("TOPS");
                    tabTwo.setTextColor(getResources().getColor(R.color.white));
                    tabLayout.getTabAt(1).setCustomView(tabTwo);


                    tabThree.setText("BLOUSES");
                    tabThree.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(2).setCustomView(tabThree);

                    tabFour.setText("SKIRT");
                    tabFour.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(3).setCustomView(tabFour);


                }
                else if(position ==2){

                    tabOne.setText("DRESSES");
                    tabOne.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(0).setCustomView(tabOne);


                    tabTwo.setText("TOPS");
                    tabTwo.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(1).setCustomView(tabTwo);


                    tabThree.setText("BLOUSES");
                    tabThree.setTextColor(getResources().getColor(R.color.white));
                    tabLayout.getTabAt(2).setCustomView(tabThree);

                    tabFour.setText("SKIRT");
                    tabFour.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(3).setCustomView(tabFour);

                } else if(position ==3){

                    tabOne.setText("DRESSES");
                    tabOne.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(0).setCustomView(tabOne);


                    tabTwo.setText("TOPS");
                    tabTwo.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(1).setCustomView(tabTwo);


                    tabThree.setText("BLOUSES");
                    tabThree.setTextColor(getResources().getColor(R.color.lightgrey));
                    tabLayout.getTabAt(2).setCustomView(tabThree);

                    tabFour.setText("SKIRT");
                    tabFour.setTextColor(getResources().getColor(R.color.white));
                    tabLayout.getTabAt(3).setCustomView(tabFour);

                }

                //also you can use tab.setCustomView() too
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // tab.setIcon(R.drawable.oldicon);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        createTabIcons();

        return rootView;
    }


    private void createViewPager(ViewPager viewPager) {
        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getFragmentManager());
        adapter.addFragment(new DressesFragment(), "DRESSES");
        adapter.addFragment(new TopsFragment(), "TOPS");
        adapter.addFragment(new BlousesFragment(), "BLOUSES");
        adapter.addFragment(new SkirtFragment(), "SKIRT");
        viewPager.setAdapter(adapter);
    }

    private void createTabIcons() {

        tabOne = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.custom_tab, null);
        tabOne.setText("DRESSES");
        tabOne.setTextSize(14);
        tabOne.setTextColor(getResources().getColor(R.color.white));
        tabLayout.getTabAt(0).setCustomView(tabOne);

        tabTwo = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.custom_tab, null);
        tabTwo.setText("TOPS");
        tabTwo.setTextSize(14);
        tabTwo.setTextColor(getResources().getColor(R.color.lightgrey));
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        tabThree  = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.custom_tab, null);
        tabThree.setText("BLOUSES");
        tabThree.setTextSize(14);
        tabThree.setTextColor(getResources().getColor(R.color.lightgrey));
        tabLayout.getTabAt(2).setCustomView(tabThree);

        tabFour  = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.custom_tab, null);
        tabFour.setText("SKIRT");
        tabFour.setTextSize(14);
        tabFour.setTextColor(getResources().getColor(R.color.lightgrey));
        tabLayout.getTabAt(3).setCustomView(tabFour);
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }




    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
