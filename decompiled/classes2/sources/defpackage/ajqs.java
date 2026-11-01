package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajqs extends ajsz {
    public final defpackage.ajqr a;
    public final defpackage.ajqr b;
    private final java.lang.Integer c;
    private final java.lang.Integer d;
    private final java.lang.Integer e;
    private final java.lang.Integer f;

    public ajqs(java.lang.Integer num, java.lang.Integer num2, defpackage.ajqr ajqrVar, defpackage.ajqr ajqrVar2, java.lang.Integer num3, java.lang.Integer num4) {
        this.c = num;
        this.d = num2;
        this.a = ajqrVar;
        this.b = ajqrVar2;
        this.e = num3;
        this.f = num4;
    }

    public final int c() {
        return this.f.intValue();
    }

    public final int d() {
        return this.d.intValue();
    }

    public final int e() {
        return this.e.intValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajqs)) {
            return false;
        }
        defpackage.ajqs ajqsVar = (defpackage.ajqs) obj;
        return ajqsVar.f() == f() && ajqsVar.d() == d() && ajqsVar.a == this.a && ajqsVar.b == this.b && ajqsVar.e() == e() && ajqsVar.c() == c();
    }

    public final int f() {
        return this.c.intValue();
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajqs.class, this.c, this.d, this.a, this.b, this.e, this.f});
    }

    public final java.lang.String toString() {
        defpackage.ajqr ajqrVar = this.a;
        return "AesCtrHmacStreaming Parameters (IKM size: " + this.c + ", " + this.d + "-byte AES key, " + java.lang.String.valueOf(ajqrVar) + " for HKDF, " + java.lang.String.valueOf(ajqrVar) + " for HMAC, " + this.e + "-byte tags, " + this.f + "-byte ciphertexts)";
    }
}
