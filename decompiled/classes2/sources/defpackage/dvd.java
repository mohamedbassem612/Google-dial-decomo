package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvd extends defpackage.dvk {
    private final java.util.ArrayList a = new java.util.ArrayList();

    @Override // defpackage.dvk
    protected final java.lang.String a() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.dvk
    public final void b(izg izgVar) {
        android.app.Notification.InboxStyle bigContentTitle = new android.app.Notification.InboxStyle((android.app.Notification.Builder) izgVar.a).setBigContentTitle(null);
        if (this.e) {
            bigContentTitle.setSummaryText(this.d);
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((java.lang.CharSequence) arrayList.get(i));
        }
    }
}
