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
        addItem(new DummyItem("0", "BUHO", "Búho es el nombre común..."));
        addItem(new DummyItem("1", "COLIBRÍ", "Los troquilinos (Trochilinae) son..."));
        addItem(new DummyItem("2", "CUERVO", "El cuervo común (Corvus corax) es ..."));
        addItem(new DummyItem("3", "FLAMENCO", "Los fenicopteriformes..."));
        addItem(new DummyItem("4", "KIWI", "Los kiwis (Apterix, gr. 'sin alas') son..."));
        addItem(new DummyItem("5", "LORO", "Las Psitácidas (Psittacidae) son..."));
        addItem(new DummyItem("6", "PAVO", "Pavo es un género de aves..."));
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

