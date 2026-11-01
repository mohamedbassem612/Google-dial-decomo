package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhq extends defpackage.ajsz {
    public final defpackage.ajhp a;
    public final int b;

    private ajhq(defpackage.ajhp ajhpVar, int i) {
        this.a = ajhpVar;
        this.b = i;
    }

    public static defpackage.ajhq c(defpackage.ajhp ajhpVar, int i) throws java.security.GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new java.security.GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new defpackage.ajhq(ajhpVar, i);
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.a != defpackage.ajhp.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajhq)) {
            return false;
        }
        defpackage.ajhq ajhqVar = (defpackage.ajhq) obj;
        return ajhqVar.a == this.a && ajhqVar.b == this.b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajhq.class, this.a, java.lang.Integer.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        return "X-AES-GCM Parameters (variant: " + this.a.c + "salt_size_bytes: " + this.b + ')';
    }
}
