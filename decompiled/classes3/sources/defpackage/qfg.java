package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qfg {
    public static final aimz a = aimz.i("com/android/dialer/incall/rtt/service/RttCallMessagesCache");
    final android.content.Context c;
    public final ajct d;
    public final java.util.concurrent.Executor e;
    public final defpackage.qeq f;
    public final teb h;
    public final long i;
    public final aais j;
    public final defpackage.afpl k;
    public final java.util.List b = new java.util.ArrayList();
    public j$.util.Optional g = j$.util.Optional.empty();

    public qfg(android.content.Context context, ajct ajctVar, defpackage.qeq qeqVar, teb tebVar, defpackage.afpl afplVar, long j, aais aaisVar) {
        this.c = context;
        this.d = ajctVar;
        this.e = new ajdc(ajctVar);
        this.f = qeqVar;
        this.h = tebVar;
        this.k = afplVar;
        this.i = j;
        this.j = aaisVar;
    }

    public final ajcq a() {
        return ahvr.F(new defpackage.qfe(this, 3), this.e);
    }

    public final ajcq b() {
        return ahvr.F(new defpackage.qfe(this, 2), this.e);
    }

    public final ajcq c() {
        return ahrv.g(b()).h(new defpackage.pqn(7), ajbm.a);
    }

    public final ajcq d() {
        return ahvr.F(new defpackage.qfe(this, 0), this.e);
    }

    public final ajcq e(java.lang.String str) {
        return ahvr.E(new defpackage.pmw(this, str, 14, null), this.e);
    }
}
