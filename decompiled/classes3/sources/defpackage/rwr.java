package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rwr implements ahjr {
    private static final aimz a = aimz.i("com/android/dialer/notification/channel/NotificationChannelUpdateReceiver");
    private final rwo b;

    public rwr(rwo rwoVar) {
        this.b = rwoVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        a.b().l("com/android/dialer/notification/channel/NotificationChannelUpdateReceiver", "onReceive", 45, "NotificationChannelUpdateReceiver.java").v("Updating notification channels");
        return this.b.d();
    }
}
