package com.example.fruits;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class FruitBottomSheetDialog extends BottomSheetDialogFragment {

    @Override
    public int getTheme() {
        return R.style.BottomSheetStyle; // Appliquer le style à la feuille de dialogue
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_dialog, container, false);

        RecyclerView fruitRecyclerView = view.findViewById(R.id.fruitRecyclerView);
        fruitRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Generate a list of 100 fruits
        List<String> fruits = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            fruits.add("Fruit " + i);
        }

        FruitAdapter adapter = new FruitAdapter(fruits);
        fruitRecyclerView.setAdapter(adapter);

        // Get the two buttons at the bottom and add click listeners
        view.findViewById(R.id.button1).setOnClickListener(v -> {
            // Button 1 action
        });

        view.findViewById(R.id.button2).setOnClickListener(v -> {
            // Button 2 action
        });

        return view;
    }
}

class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {

    private final List<String> fruits;

    public FruitAdapter(List<String> fruits) {
        this.fruits = fruits;
    }

    @NonNull
    @Override
    public FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new FruitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitViewHolder holder, int position) {
        holder.bind(fruits.get(position));
    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }

    static class FruitViewHolder extends RecyclerView.ViewHolder {

        public FruitViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(String fruitName) {
            ((android.widget.TextView) itemView).setText(fruitName);
        }
    }
}
