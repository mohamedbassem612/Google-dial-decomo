package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajnr extends defpackage.ajsz {
    public final int a;
    public final int b;
    public final defpackage.ajnq c;
    public final defpackage.ajnp d;

    public ajnr(int i, int i2, defpackage.ajnq ajnqVar, defpackage.ajnp ajnpVar) {
        super((byte[]) null);
        this.a = i;
        this.b = i2;
        this.c = ajnqVar;
        this.d = ajnpVar;
    }

    public final int c() {
        defpackage.ajnq ajnqVar = this.c;
        if (ajnqVar == defpackage.ajnq.d) {
            return this.b;
        }
        if (ajnqVar == defpackage.ajnq.a || ajnqVar == defpackage.ajnq.b || ajnqVar == defpackage.ajnq.c) {
            return this.b + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.c != defpackage.ajnq.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajnr)) {
            return false;
        }
        defpackage.ajnr ajnrVar = (defpackage.ajnr) obj;
        return ajnrVar.a == this.a && ajnrVar.c() == c() && ajnrVar.c == this.c && ajnrVar.d == this.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajnr.class, java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), this.c, this.d});
    }

    public final java.lang.String toString() {
        defpackage.ajnp ajnpVar = this.d;
        return "HMAC Parameters (variant: " + java.lang.String.valueOf(this.c) + ", hashType: " + java.lang.String.valueOf(ajnpVar) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
