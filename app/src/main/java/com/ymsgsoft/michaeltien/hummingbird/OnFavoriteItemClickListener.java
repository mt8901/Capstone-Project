package com.ymsgsoft.michaeltien.hummingbird;

import com.ymsgsoft.michaeltien.hummingbird.playservices.FavoriteRecyclerViewAdapter;

public interface OnFavoriteItemClickListener {
    public void OnItemClick(FavoriteRecyclerViewAdapter.FavoriteObject data, int position);
}
