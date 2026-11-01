package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajgc extends defpackage.ajsz {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final defpackage.ajgb e;
    public final defpackage.ajga f;

    public ajgc(int i, int i2, int i3, int i4, defpackage.ajgb ajgbVar, defpackage.ajga ajgaVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = ajgbVar;
        this.f = ajgaVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.e != defpackage.ajgb.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajgc)) {
            return false;
        }
        defpackage.ajgc ajgcVar = (defpackage.ajgc) obj;
        return ajgcVar.a == this.a && ajgcVar.b == this.b && ajgcVar.c == this.c && ajgcVar.d == this.d && ajgcVar.e == this.e && ajgcVar.f == this.f;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajgc.class, java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), this.e, this.f});
    }

    public final java.lang.String toString() {
        defpackage.ajga ajgaVar = this.f;
        return "AesCtrHmacAead Parameters (variant: " + java.lang.String.valueOf(this.e) + ", hashType: " + java.lang.String.valueOf(ajgaVar) + ", " + this.c + "-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }
}
