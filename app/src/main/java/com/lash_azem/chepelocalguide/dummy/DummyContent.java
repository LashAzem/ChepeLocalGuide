package com.lash_azem.chepelocalguide.dummy;

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
        addItem(new DummyItem("1", "Leños", "¿Anteojos de madera? ¿Por qué no? La madera demuestra su gran versatilidad y ese toque natural del cual carecen otros materiales."));
        addItem(new DummyItem("2", "Mar Rojo", "The latest fashion trends worldwide, in Costa Rica. ONLINE & MOBILE BOUTIQUE"));
        addItem(new DummyItem("2", "Wear Bona Fide", "Fabric Necklaces Handmade"));
        addItem(new DummyItem("3", "Tijo", "Tijo es una marca costarricense de ropa. Nuestros productos son originales y cada prenda es exclusiva y numerada."));
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

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

