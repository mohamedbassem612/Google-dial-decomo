package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class owh implements ahjr {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoReceiver");
    public final rlv b;
    private final aoss c;
    private final zjv d;

    public owh(aoss aossVar, zjv zjvVar, rlv rlvVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(rlvVar, "loggingBindings");
        this.c = aossVar;
        this.d = zjvVar;
        this.b = rlvVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        aooh.f(intent, "intent");
        zjv.g(this.d, getClass(), intent, (java.util.List) null, 12);
        return aosv.F(this.c, 0, new ofa(intent, this, (aoln) null, 15), 3);
    }
}
