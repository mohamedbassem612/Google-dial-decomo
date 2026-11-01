package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajqy extends ajsz {
    public final defpackage.ajqx a;
    private final java.lang.Integer b;
    private final java.lang.Integer c;
    private final java.lang.Integer d;

    public ajqy(java.lang.Integer num, java.lang.Integer num2, defpackage.ajqx ajqxVar, java.lang.Integer num3) {
        this.b = num;
        this.c = num2;
        this.a = ajqxVar;
        this.d = num3;
    }

    public final int c() {
        return this.d.intValue();
    }

    public final int d() {
        return this.c.intValue();
    }

    public final int e() {
        return this.b.intValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajqy)) {
            return false;
        }
        defpackage.ajqy ajqyVar = (defpackage.ajqy) obj;
        return ajqyVar.e() == e() && ajqyVar.d() == d() && ajqyVar.a == this.a && ajqyVar.c() == c();
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajqy.class, this.b, this.c, this.a, this.d});
    }

    public final java.lang.String toString() {
        return "AesGcmHkdfStreaming Parameters (IKM size: " + this.b + ", " + this.c + "-byte AES GCM key, " + java.lang.String.valueOf(this.a) + " for HKDF " + this.d + "-byte ciphertexts)";
    }
}
