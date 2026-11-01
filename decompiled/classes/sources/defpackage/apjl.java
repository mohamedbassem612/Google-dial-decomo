package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjl {
    public defpackage.apjf a;
    public int b;
    public defpackage.apit c;
    public defpackage.apjo d;
    public defpackage.apqc e;
    public defpackage.apjm f;
    public defpackage.apjm g;
    public long h;
    public long i;
    public defpackage.apkl j;
    public defpackage.apjr k;
    public defpackage.zzx l;
    private defpackage.apjh m;
    private java.lang.String n;

    public apjl(defpackage.apjm apjmVar) {
        this.b = -1;
        this.d = defpackage.apjo.c;
        this.k = defpackage.apjr.a;
        this.m = apjmVar.a;
        this.a = apjmVar.b;
        this.b = apjmVar.d;
        this.n = apjmVar.c;
        this.c = apjmVar.e;
        this.l = defpackage.aoov.bk(apjmVar.f);
        this.d = apjmVar.g;
        this.e = apjmVar.h;
        this.f = apjmVar.i;
        this.g = apjmVar.j;
        this.h = apjmVar.k;
        this.i = apjmVar.l;
        this.j = apjmVar.m;
        this.k = apjmVar.n;
    }

    public final defpackage.apjm a() {
        int i = this.b;
        if (i < 0) {
            throw new java.lang.IllegalStateException(defpackage.a.bj(i, "code < 0: "));
        }
        defpackage.apjh apjhVar = this.m;
        if (apjhVar == null) {
            throw new java.lang.IllegalStateException("request == null");
        }
        defpackage.apjf apjfVar = this.a;
        if (apjfVar == null) {
            throw new java.lang.IllegalStateException("protocol == null");
        }
        java.lang.String str = this.n;
        if (str != null) {
            return new defpackage.apjm(apjhVar, apjfVar, str, i, this.c, defpackage.aoov.bl(this.l), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
        throw new java.lang.IllegalStateException("message == null");
    }

    public final void b(defpackage.apiu apiuVar) {
        this.l = defpackage.aoov.bk(apiuVar);
    }

    public final void c(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("message");
        }
        this.n = str;
    }

    public final void d(defpackage.apjh apjhVar) {
        if (apjhVar == null) {
            defpackage.aooh.i("request");
        }
        this.m = apjhVar;
    }

    public apjl() {
        this.b = -1;
        this.d = defpackage.apjo.c;
        this.k = defpackage.apjr.a;
        this.l = new defpackage.zzx((byte[]) null, (short[]) null);
    }
}
