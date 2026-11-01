package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class apon extends defpackage.apjk {
    defpackage.apqf c;
    long d;
    java.io.OutputStream e;
    boolean f;

    @Override // defpackage.apjk
    public long a() {
        return this.d;
    }

    @Override // defpackage.apjk
    public final defpackage.apiy c() {
        return null;
    }

    final void f(defpackage.apoz apozVar, long j) {
        this.c = apozVar.fP();
        this.d = j;
        this.e = new apom(this, j, apozVar);
    }

    public defpackage.apjh b(defpackage.apjh apjhVar) {
        return apjhVar;
    }
}
