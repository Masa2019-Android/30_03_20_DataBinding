package com.telran.a30_03_20;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.telran.a30_03_20.databinding.ContactRowBinding;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {
    private List<Contact> contacts;

    public ContactAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ContactRowBinding binding = DataBindingUtil.inflate(inflater,R.layout.contact_row,parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Contact curr = contacts.get(position);
        holder.binding.setContact(curr);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ContactRowBinding binding;

        public MyViewHolder(ContactRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            this.binding.setViewHolder(this);
        }

        public void onItemClick(int id){
            Log.d("MY_TAG", "onItemClick: " + id);
        }
    }
}
