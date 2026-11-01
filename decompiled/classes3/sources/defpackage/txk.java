package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class txk {
    public static final aimz a = aimz.i("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechModelDownloader");
    private final android.content.Context b;
    private final ok c;
    private final defpackage.txj d;

    public txk(android.content.Context context, ahpz ahpzVar, ok okVar, defpackage.twa twaVar) {
        aooh.f(context, "appContext");
        aooh.f(ahpzVar, "traceCreation");
        this.b = context;
        this.c = okVar;
        defpackage.txj txjVar = new defpackage.txj(ahpzVar, twaVar);
        this.d = txjVar;
        dvx.f(context, txjVar, new android.content.IntentFilter("com.google.recognition.action.LANGUAGE_DOWNLOAD_COMPLETE"), (java.lang.String) null, 2);
    }

    public final void a(akff akffVar) {
        this.c.b(akffVar);
    }

    public final void b() {
        this.b.unregisterReceiver(this.d);
    }
}
