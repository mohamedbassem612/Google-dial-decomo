package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class otm {
    public java.lang.Object a;
    public java.lang.Object b;

    public otm(defpackage.otn otnVar) {
        this.a = j$.util.Optional.empty();
        this.b = j$.util.Optional.empty();
        this.a = otnVar.a;
        this.b = otnVar.b;
    }

    public final defpackage.otn a() {
        return new defpackage.otn((j$.util.Optional) this.a, (j$.util.Optional) this.b);
    }

    public final void b(aenj aenjVar) {
        this.b = j$.util.Optional.of(aenjVar);
    }

    public final omy c() {
        return new omy((j$.util.Optional) this.b, (j$.util.Optional) this.a);
    }

    public final void d() {
        this.a = j$.util.Optional.of(2131231968);
    }

    public final olt e() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new olt((java.lang.String) obj2, (java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" key");
        }
        if (this.b == null) {
            sb.append(" value");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null value");
        }
        this.b = str;
    }

    public final olr g() {
        java.lang.Object obj = this.b;
        if (obj == null) {
            throw new java.lang.IllegalStateException("Missing required properties: fileName");
        }
        return new olr((java.lang.String) obj, (j$.util.Optional) this.a);
    }

    public final void h() {
        this.a = j$.util.Optional.of("images/");
    }

    public otm(byte[] bArr) {
        this.b = j$.util.Optional.empty();
        this.a = j$.util.Optional.empty();
    }

    public otm(byte[] bArr, byte[] bArr2) {
        this.a = j$.util.Optional.empty();
    }

    public otm() {
        this.a = j$.util.Optional.empty();
        this.b = j$.util.Optional.empty();
    }

    public otm(char[] cArr) {
    }
}
