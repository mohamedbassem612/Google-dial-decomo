package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fqn {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final defpackage.eqg g;
    public final int h;
    public final defpackage.aizi i;
    public final defpackage.aizi j;
    public final int k;
    public final int l;
    public final boolean m;
    final int n;
    public final defpackage.fqo[] o;

    public fqn(defpackage.fqm fqmVar) {
        this.a = fqmVar.a;
        this.b = fqmVar.b;
        this.c = fqmVar.c;
        this.d = fqmVar.d;
        this.e = fqmVar.e;
        this.f = fqmVar.f;
        defpackage.eqg eqgVar = fqmVar.g;
        ahvr.ci(eqgVar);
        this.g = eqgVar;
        this.h = fqmVar.h;
        this.o = fqmVar.i;
        this.k = fqmVar.j;
        this.i = fqmVar.k;
        this.j = fqmVar.l;
        this.m = fqmVar.m;
        this.l = fqmVar.n;
        this.n = fqmVar.o;
    }

    public final defpackage.fqo a(int i) {
        defpackage.fqo[] fqoVarArr = this.o;
        if (fqoVarArr == null) {
            return null;
        }
        return fqoVarArr[i];
    }
}
