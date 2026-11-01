package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rjd implements ahlb {
    public static final aimz a = aimz.i("com/android/dialer/joyball/impl/consenttransfer/JoyballConsentStatusNotifierSynclet");
    public final android.content.Context b;
    public final rjb c;
    private final aoss d;

    public rjd(android.content.Context context, rjb rjbVar, aoss aossVar) {
        aooh.f(context, "appContext");
        aooh.f(rjbVar, "joyballConsentStatusNotifier");
        aooh.f(aossVar, "lightweightScope");
        this.b = context;
        this.c = rjbVar;
        this.d = aossVar;
    }

    public final ajcq a() {
        return aosv.F(this.d, 0, new mva(this, (aoln) null, 14), 3);
    }
}
