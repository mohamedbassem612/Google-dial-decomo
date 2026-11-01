package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afmm {
    public java.lang.Object a;
    public java.lang.Object b;

    public afmm(char[] cArr, byte[] bArr) {
        this.b = ahwt.a;
    }

    public final void a(aihd aihdVar) {
        if (aihdVar == null) {
            throw new java.lang.NullPointerException("Null removedExtras");
        }
        this.a = aihdVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aeko, java.lang.Object] */
    public final defpackage.aekp b() {
        java.lang.Object obj;
        ?? r0 = this.b;
        if (r0 != 0 && (obj = this.a) != null) {
            return new defpackage.aekp(r0, (defpackage.aeks) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" onContinueWithAccountListenerWithAsyncCallback");
        }
        if (this.a == null) {
            sb.append(" features");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(defpackage.aeks aeksVar) {
        if (aeksVar == null) {
            throw new java.lang.NullPointerException("Null features");
        }
        this.a = aeksVar;
    }

    public final defpackage.acxi d() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            throw new java.lang.IllegalStateException("Missing required properties: url");
        }
        return new defpackage.acxi((java.lang.String) obj, (ahyn) this.b);
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null url");
        }
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aomy, java.lang.Object] */
    public final defpackage.abpr f() {
        ?? r1;
        java.lang.Object obj = this.b;
        if (obj != null && (r1 = this.a) != 0) {
            return new defpackage.abpr((java.lang.String) obj, r1);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.a == null) {
            sb.append(" onClick");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.b = str;
    }

    public afmm() {
    }
}
