package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajvp implements defpackage.ajvs, defpackage.ajvt {
    public final defpackage.ajwe a;
    public final defpackage.ajwe b;
    private final android.content.Context c;
    private final java.util.Set d;
    private final java.util.concurrent.Executor e;

    public ajvp(android.content.Context context, java.lang.String str, java.util.Set set, defpackage.ajwe ajweVar, java.util.concurrent.Executor executor) {
        this.a = new defpackage.ajuc(new defpackage.ajtt(context, str, 2));
        this.d = set;
        this.e = executor;
        this.b = ajweVar;
        this.c = context;
    }

    @Override // defpackage.ajvs
    public final defpackage.aaum a() {
        return !defpackage.dpe.p(this.c) ? defpackage.aazc.s("") : defpackage.aazc.q(this.e, new agqr(this, 5));
    }

    @Override // defpackage.ajvt
    public final synchronized int b() {
        defpackage.ajwe ajweVar = this.a;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        defpackage.ajyk ajykVar = (defpackage.ajyk) ajweVar.a();
        if (!ajykVar.l(jCurrentTimeMillis)) {
            return 1;
        }
        ajykVar.h();
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            defpackage.aazc.s(null);
        } else if (defpackage.dpe.p(this.c)) {
            defpackage.aazc.q(this.e, new defpackage.vcz(this, 19));
        } else {
            defpackage.aazc.s(null);
        }
    }
}
