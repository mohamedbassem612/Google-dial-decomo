package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rwk {
    public static final aimz a = aimz.i("com/android/dialer/notification/NotificationThrottler");

    public static boolean a(android.service.notification.StatusBarNotification statusBarNotification, java.lang.String str) {
        if ((statusBarNotification.getNotification().flags & 512) != 0) {
            return false;
        }
        return android.text.TextUtils.equals(str, statusBarNotification.getNotification().getGroup());
    }
}
