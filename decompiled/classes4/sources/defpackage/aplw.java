package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class aplw implements apqd {
    public boolean a;
    final /* synthetic */ defpackage.apmc b;
    private final apiw c;
    private final defpackage.apph d;

    public aplw(defpackage.apmc apmcVar, apiw apiwVar) {
        this.b = apmcVar;
        this.c = apiwVar;
        this.d = new defpackage.apph(apmcVar.f.b.fP());
    }

    public long b(apoy apoyVar, long j) throws java.io.IOException {
        try {
            return this.b.f.b.b(apoyVar, j);
        } catch (java.io.IOException e) {
            this.b.c.g();
            c(defpackage.apmc.a);
            throw e;
        }
    }

    public final void c(apiu apiuVar) {
        apje apjeVar;
        aooh.f(apiuVar, "trailers");
        defpackage.apmc apmcVar = this.b;
        int i = apmcVar.d;
        if (i != 6) {
            if (i != 5) {
                throw new java.lang.IllegalStateException(a.bj(i, "state: "));
            }
            defpackage.apmc.n(this.d);
            apmcVar.d = 6;
            if (apiuVar.a() <= 0 || (apjeVar = apmcVar.b) == null) {
                return;
            }
            aplq.a(apjeVar.i, this.c, apiuVar);
        }
    }

    protected final void d() {
        this.a = true;
    }

    public final apqf fP() {
        return this.d;
    }
}
