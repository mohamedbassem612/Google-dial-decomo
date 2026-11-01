package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvb extends defpackage.dvk {
    @Override // defpackage.dvk
    protected final java.lang.String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.dvk
    public final void b(izg izgVar) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            if (android.util.Log.isLoggable("NotifCompat", 3)) {
                android.util.Log.d("NotifCompat", "Unrecognized call type in CallStyle: 0");
            }
        } else {
            android.app.Notification.Builder builder = (android.app.Notification.Builder) izgVar.a;
            builder.setContentTitle(null);
            android.os.Bundle bundle = this.c.s;
            java.lang.CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.c.s.getCharSequence("android.text");
            builder.setContentText(charSequence != null ? charSequence : null);
            builder.setCategory("call");
        }
    }

    @Override // defpackage.dvk
    public final void e(android.os.Bundle bundle) {
        super.e(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }
}
