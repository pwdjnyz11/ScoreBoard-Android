package org.techtown.miniproject;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import org.techtown.miniproject.activities.InfoActivity;
import org.techtown.miniproject.adapters.GameAdapter;
import org.techtown.miniproject.items.GameItem;

public class GameFragment extends Fragment {
    RecyclerView game_recycler_view;
    InfoActivity activity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        activity = (InfoActivity) getActivity();
    }

    @Override
    public void onDetach() {
        super.onDetach();

        activity = null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_game, container, false);

        /* 선택된 tab 텍스트 색상 설정 */
        TabLayout tabs = (TabLayout) rootView.findViewById(R.id.tabs);
        tabs.setTabTextColors(Color.rgb(153, 153, 153), Color.rgb(0, 0, 0));

        /* recyclerView 설정 */
        game_recycler_view = (RecyclerView) rootView.findViewById(R.id.game_recycler_view);

        LinearLayoutManager game_layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        game_recycler_view.setLayoutManager(game_layoutManager);

        GameAdapter game_adapter = new GameAdapter(getActivity());
        game_adapter.addItem(new GameItem("배구"));
        game_adapter.addItem(new GameItem("컬링"));
        game_adapter.addItem(new GameItem("허들"));
        game_recycler_view.setAdapter(game_adapter);

        return rootView;
    }
}
