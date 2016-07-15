package com.lash_azem.chepelocalguide.dummy;

import com.lash_azem.chepelocalguide.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    //private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1","Leños", "¿Anteojos de madera? ¿Por qué no? La madera demuestra su gran versatilidad y ese toque natural del cual carecen otros materiales.", R.drawable.local_dummy));
        addItem(new DummyItem("2", "Mar Rojo", "The latest fashion trends worldwide, in Costa Rica. ONLINE & MOBILE BOUTIQUE", R.drawable.local_dummy));
        addItem(new DummyItem("3", "Wear Bona Fide", "Fabric Necklaces Handmade", R.drawable.local_dummy));
        addItem(new DummyItem("4", "Tijo", "Tijo es una marca costarricense de ropa. Nuestros productos son originales y cada prenda es exclusiva y numerada.", R.drawable.local_dummy));
        addItem(new DummyItem("5", "Plivertees", "Camisas Serigrafia", R.drawable.local_dummy));
        addItem(new DummyItem("6", "Boza", "Bolsos de Cuero", R.drawable.local_dummy));
        addItem(new DummyItem("7", "Tienda Eñe", "Tienda de Variedades", R.drawable.local_dummy));
        addItem(new DummyItem("8", "Cafe Miel", "Cafeteria", R.drawable.local_dummy));
        addItem(new DummyItem("9", "De Aqui y de Alla", "Tienda de variedades", R.drawable.local_dummy));
        addItem(new DummyItem("10", "11:11 Banda", "Banda Costarricense", R.drawable.local_dummy));
        addItem(new DummyItem("11", "NOMELLAMO", "Taller de creacion de Peluches", R.drawable.local_dummy));
        addItem(new DummyItem("12", "Gato Negro", "Joyeria", R.drawable.local_dummy));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final int cover;

        public DummyItem(String id, String content, String details, int cover) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.cover = cover;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

