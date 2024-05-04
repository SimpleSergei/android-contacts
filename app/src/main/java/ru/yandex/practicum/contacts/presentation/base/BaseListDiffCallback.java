package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<F extends ListDiffInterface<F>> extends DiffUtil.ItemCallback<F>   {

    @Override
    public boolean areContentsTheSame(@NonNull F oldItem, @NonNull F newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull F oldItem, @NonNull F newItem) {
        return newItem;
    }

    @Override
    public boolean areItemsTheSame(@NonNull F oldItem, @NonNull F newItem) {
        return oldItem.theSameAs(newItem);
    }
}
