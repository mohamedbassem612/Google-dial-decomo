package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apoi extends apon {
    final apoy a;
    long b;

    public apoi(long j) {
        apoy apoyVar = new apoy();
        this.a = apoyVar;
        this.b = -1L;
        f(apoyVar, j);
    }

    public final long a() {
        return this.b;
    }

    public final apjh b(apjh apjhVar) throws java.io.IOException {
        if (apjhVar.a("Content-Length") != null) {
            return apjhVar;
        }
        this.e.close();
        apoy apoyVar = this.a;
        this.b = apoyVar.b;
        apjg apjgVar = new apjg(apjhVar);
        apjgVar.c("Transfer-Encoding");
        apjgVar.a("Content-Length", java.lang.Long.toString(apoyVar.b));
        return new apjh(apjgVar);
    }

    public final void d(apoz apozVar) {
        apoy apoyVar = this.a;
        apoyVar.F(((appv) apozVar).b, 0L, apoyVar.b);
    }
}
