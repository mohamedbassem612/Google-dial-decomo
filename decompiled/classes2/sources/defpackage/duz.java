package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class duz extends defpackage.dvk {
    private java.lang.CharSequence a;

    @Override // defpackage.dvk
    protected final java.lang.String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.dvk
    public final void b(izg izgVar) {
        android.app.Notification.BigTextStyle bigTextStyleBigText = new android.app.Notification.BigTextStyle((android.app.Notification.Builder) izgVar.a).setBigContentTitle(null).bigText(this.a);
        if (this.e) {
            bigTextStyleBigText.setSummaryText(this.d);
        }
    }

    public final void c(java.lang.CharSequence charSequence) {
        this.a = defpackage.dva.c(charSequence);
    }
}
