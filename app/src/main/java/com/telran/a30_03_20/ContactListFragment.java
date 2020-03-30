package com.telran.a30_03_20;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.telran.a30_03_20.databinding.FragmentContactListBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactListFragment extends Fragment {

    public ContactListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact_list, container, false);
        FragmentContactListBinding binding = DataBindingUtil.bind(view);
        ContactAdapter adapter = new ContactAdapter(Generator.getContacts());
        RecyclerView.LayoutManager manager = new LinearLayoutManager(requireContext());
        RecyclerView.ItemDecoration divider = new DividerItemDecoration(requireContext(),DividerItemDecoration.VERTICAL);
        binding.setAdapter(adapter);
        binding.setLayoutManager(manager);
        binding.setDivider(divider);
        return view;
    }
}
