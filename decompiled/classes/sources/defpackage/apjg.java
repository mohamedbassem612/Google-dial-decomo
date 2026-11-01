package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjg {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;

    public apjg(defpackage.apjh apjhVar) {
        this.e = defpackage.apjs.a;
        this.a = apjhVar.a;
        this.b = apjhVar.b;
        this.d = apjhVar.d;
        this.e = apjhVar.f;
        this.c = defpackage.aoov.bk(apjhVar.c);
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            defpackage.aooh.i("value");
        }
        ((defpackage.zzx) this.c).T(str, str2);
    }

    public final void b(java.lang.String str, defpackage.apjk apjkVar) {
        if (str == null) {
            defpackage.aooh.i("method");
        }
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("method.isEmpty() == true");
        }
        if (apjkVar == null) {
            if (str == null) {
                defpackage.aooh.i("method");
            }
            if (defpackage.aooh.n(str, "POST") || defpackage.aooh.n(str, "PUT") || defpackage.aooh.n(str, "PATCH") || defpackage.aooh.n(str, "PROPPATCH") || defpackage.aooh.n(str, "QUERY") || defpackage.aooh.n(str, "REPORT")) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bk(str, "method ", " must have a request body."));
            }
        } else if (!defpackage.aoov.bd(str)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bk(str, "method ", " must not have a request body."));
        }
        this.b = str;
        this.d = apjkVar;
    }

    public final void c(java.lang.String str) {
        ((defpackage.zzx) this.c).V(str);
    }

    public apjg() {
        this.e = defpackage.apjs.a;
        this.b = "GET";
        this.c = new defpackage.zzx((byte[]) null, (short[]) null);
    }

    public apjg(byte[] bArr) {
    }
}
