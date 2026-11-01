package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akaj implements defpackage.akbp {
    private static final anpc a;
    private ajcq b;
    private final apnt c;

    static {
        anoz anozVar = anph.b;
        int i = anpc.d;
        a = new anoy("X-Goog-Spatula", anozVar);
    }

    public akaj(apnt apntVar) {
        this.c = apntVar;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc a() {
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd b() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd c() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc d() {
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd e() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd f() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final defpackage.akcc g(defpackage.aljf aljfVar) {
        try {
            ((anph) aljfVar.d).h(a, (java.lang.String) aiql.H(this.b));
            return defpackage.akcc.a;
        } catch (java.util.concurrent.ExecutionException e) {
            anqt anqtVar = anqt.q;
            java.util.List list = anqw.a;
            return defpackage.akcc.b(anqtVar.a().e(e.getCause()).f("Could not retrieve spatula header"), new anph());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    @Override // defpackage.akbp
    public final defpackage.akcc h(defpackage.aljf aljfVar) {
        ahoq ahoqVarW = ahvr.W(1491, "AsyncSpatulaInterceptor#headerFuture");
        try {
            ajcq ajcqVarE = aazc.e(((abce) this.c.a.a()).t());
            ahoqVarW.a(ajcqVarE);
            this.b = ajcqVarE;
            defpackage.akcc akccVarC = defpackage.akcc.c(ajcqVarE);
            ahoqVarW.close();
            return akccVarC;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd i(apjb apjbVar) {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd j(apjb apjbVar) {
        return defpackage.akcd.a;
    }
}
