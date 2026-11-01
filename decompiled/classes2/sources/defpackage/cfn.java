package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cfn implements java.lang.Iterable, cma, aoow {
    private final cfm a;
    private final int b;
    private final int c;

    public cfn(cfm cfmVar, int i, int i2) {
        this.a = cfmVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.cfn) {
            defpackage.cfn cfnVar = (defpackage.cfn) obj;
            if (cfnVar.b == this.b && cfnVar.c == this.c && aooh.n(cfnVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b + (this.a.hashCode() * 31);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        cfm cfmVar = this.a;
        if (cfmVar.g != this.c) {
            cfo.f();
        }
        int i = this.b;
        return cfmVar.j(i) != null ? new defpackage.cfq() : new defpackage.cfi(cfmVar, i + 1, i + cfmVar.a[(i * 5) + 3]);
    }
}
