package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjm implements java.io.Closeable {
    public final defpackage.apjh a;
    public final defpackage.apjf b;
    public final java.lang.String c;
    public final int d;
    public final defpackage.apit e;
    public final defpackage.apiu f;
    public final defpackage.apjo g;
    public final defpackage.apqc h;
    public final defpackage.apjm i;
    public final defpackage.apjm j;
    public final long k;
    public final long l;
    public final defpackage.apkl m;
    public final defpackage.apjr n;

    public apjm(defpackage.apjh apjhVar, defpackage.apjf apjfVar, java.lang.String str, int i, defpackage.apit apitVar, defpackage.apiu apiuVar, defpackage.apjo apjoVar, defpackage.apqc apqcVar, defpackage.apjm apjmVar, defpackage.apjm apjmVar2, long j, long j2, defpackage.apkl apklVar, defpackage.apjr apjrVar) {
        if (apjoVar == null) {
            defpackage.aooh.i("body");
        }
        if (apjrVar == null) {
            defpackage.aooh.i("trailersSource");
        }
        this.a = apjhVar;
        this.b = apjfVar;
        this.c = str;
        this.d = i;
        this.e = apitVar;
        this.f = apiuVar;
        this.g = apjoVar;
        this.h = apqcVar;
        this.i = apjmVar;
        this.j = apjmVar2;
        this.k = j;
        this.l = j2;
        this.m = apklVar;
        this.n = apjrVar;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String strB = this.f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final java.lang.String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
