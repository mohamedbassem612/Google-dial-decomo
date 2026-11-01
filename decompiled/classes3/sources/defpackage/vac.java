package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vac implements ahjr {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/configui/VoicemailSecretCodeReceiver");
    private final android.content.Context b;

    public vac(android.content.Context context) {
        aooh.f(context, "appContext");
        this.b = context;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        aooh.f(intent, "intent");
        if (!aooh.n("android.provider.Telephony.SECRET_CODE", intent.getAction())) {
            return ajcm.a;
        }
        android.net.Uri data = intent.getData();
        aooh.c(data);
        if (!aooh.n("886266344", data.getHost())) {
            return ajcm.a;
        }
        a.b().l("com/android/dialer/voicemail/configui/VoicemailSecretCodeReceiver", "onReceive", 30, "VoicemailSecretCodeReceiver.kt").v("secret code received");
        android.content.Context context = this.b;
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.voicemail.configui.VoicemailSecretCodeActivity.class);
        intent2.setFlags(268435456);
        ahqx.l(context, intent2);
        return ajcm.a;
    }
}
