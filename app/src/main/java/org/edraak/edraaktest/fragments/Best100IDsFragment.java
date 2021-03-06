package org.edraak.edraaktest.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.edraak.edraaktest.R;
import org.edraak.edraaktest.models.loaders.bestitems.BaseBest100IDsLoader;
import org.edraak.edraaktest.utils.RecyclerViewManager;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Best100IDsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Best100IDsFragment extends BaseFragment {

    private BaseBest100IDsLoader best100IDsLoader;

    public Best100IDsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment Best100IDsFragment.
     */
    public static Best100IDsFragment newInstance() {
        return new Best100IDsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        best100IDsLoader = new BaseBest100IDsLoader(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        initViews(rootView);

        return rootView;
    }

    @Override
    protected void initViews(View rootView) {
        RecyclerView coursesList = (RecyclerView)
                rootView.findViewById(R.id.coursesList);

        RecyclerViewManager.setVerticalRecyclerView(coursesList,
                best100IDsLoader.getAdapter(),
                true,
                false);
    }

    @Override
    public void onStart() {
        super.onStart();

        best100IDsLoader.retrieve();
    }
}
