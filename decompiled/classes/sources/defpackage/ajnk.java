package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajnk extends defpackage.ajsz {
    public final int a;
    public final int b;
    public final defpackage.ajnj c;

    public ajnk(int i, int i2, defpackage.ajnj ajnjVar) {
        super((byte[]) null);
        this.a = i;
        this.b = i2;
        this.c = ajnjVar;
    }

    public final int c() {
        defpackage.ajnj ajnjVar = this.c;
        if (ajnjVar == defpackage.ajnj.d) {
            return this.b;
        }
        if (ajnjVar == defpackage.ajnj.a || ajnjVar == defpackage.ajnj.b || ajnjVar == defpackage.ajnj.c) {
            return this.b + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.c != defpackage.ajnj.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajnk)) {
            return false;
        }
        defpackage.ajnk ajnkVar = (defpackage.ajnk) obj;
        return ajnkVar.a == this.a && ajnkVar.c() == c() && ajnkVar.c == this.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajnk.class, java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), this.c});
    }

    public final java.lang.String toString() {
        return "AES-CMAC Parameters (variant: " + java.lang.String.valueOf(this.c) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
