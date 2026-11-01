package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apma implements apqb {
    final /* synthetic */ defpackage.apmc a;
    private final defpackage.apph b;
    private boolean c;

    public apma(defpackage.apmc apmcVar) {
        this.a = apmcVar;
        this.b = new defpackage.apph(apmcVar.f.c.fP());
    }

    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.apmc apmcVar = this.a;
        apmcVar.f.c.flush();
        defpackage.apmc.n(this.b);
        apmcVar.d = 3;
    }

    public final apqf fP() {
        return this.b;
    }

    public final void fQ(apoy apoyVar, long j) {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        apjv.n(apoyVar.b, j);
        this.a.f.c.fQ(apoyVar, j);
    }

    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.f.c.flush();
    }
}
