package com.lash_azem.chepelocalguide.notifications;



import com.lash_azem.chepelocalguide.BasePresenter;
import com.lash_azem.chepelocalguide.BaseView;
import com.lash_azem.chepelocalguide.data.PushNotification;

import java.util.ArrayList;

/**
 * Interacción MVP en Notificaciones
 */
public interface PushNotificationContract {

    interface View extends BaseView<Presenter> {

        void showNotifications(ArrayList<PushNotification> notifications);

        void showEmptyState(boolean empty);

        void popPushNotification(PushNotification pushMessage);
    }

    interface Presenter extends BasePresenter {

        void registerAppClient();

        void loadNotifications();

        void savePushMessage(String title, String description,
                             String expiryDate, String discount);
    }
}
