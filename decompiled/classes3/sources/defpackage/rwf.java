package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rwf implements ahyc {
    public final /* synthetic */ rwi a;
    public final /* synthetic */ j$.util.Optional b;
    public final /* synthetic */ int c;
    public final /* synthetic */ android.app.Notification d;

    public /* synthetic */ rwf(rwi rwiVar, j$.util.Optional optional, int i, android.app.Notification notification) {
        this.a = rwiVar;
        this.b = optional;
        this.c = i;
        this.d = notification;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        aikn aiknVarH;
        rwi rwiVar = this.a;
        int i = this.c;
        android.app.Notification notification = this.d;
        this.b.ifPresentOrElse(new defpackage.rwh(rwiVar, i, notification, 0), new mo(rwiVar, i, notification, 9));
        java.lang.String group = notification.getGroup();
        if (android.text.TextUtils.isEmpty(group)) {
            aiknVarH = aikn.a;
        } else {
            android.content.Context context = rwiVar.b;
            aihb aihbVar = new aihb();
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
            android.service.notification.StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            int length = activeNotifications.length;
            if (length > 45) {
                defpackage.rwk.a.b().l("com/android/dialer/notification/NotificationThrottler", "throttle", 71, "NotificationThrottler.java").w("app has %d notifications, system may suppress future notifications", length);
            }
            int i2 = 0;
            for (android.service.notification.StatusBarNotification statusBarNotification : activeNotifications) {
                if (defpackage.rwk.a(statusBarNotification, group)) {
                    i2++;
                }
            }
            if (i2 > 8) {
                defpackage.rwk.a.b().l("com/android/dialer/notification/NotificationThrottler", "throttle", 85, "NotificationThrottler.java").M("groupKey: %s is over limit, count: %d, limit: %d", group, java.lang.Integer.valueOf(i2), 8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.service.notification.StatusBarNotification statusBarNotification2 : activeNotifications) {
                    if (defpackage.rwk.a(statusBarNotification2, group)) {
                        arrayList.add(statusBarNotification2);
                    }
                }
                java.util.Collections.sort(arrayList, new defpackage.qxq(5));
                for (int i3 = 0; i3 < i2 - 8; i3++) {
                    notificationManager.cancel(((android.service.notification.StatusBarNotification) arrayList.get(i3)).getTag(), ((android.service.notification.StatusBarNotification) arrayList.get(i3)).getId());
                    aihbVar.i(((android.service.notification.StatusBarNotification) arrayList.get(i3)).getTag());
                }
            }
            aiknVarH = aihbVar.h();
        }
        rwiVar.g.addAll(aiknVarH);
        return null;
    }
}
