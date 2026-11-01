package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajjr extends defpackage.ajsz {
    public final defpackage.ajjp a;
    public final defpackage.ajjo b;
    public final defpackage.ajjm c;
    public final defpackage.ajjq d;

    public ajjr(defpackage.ajjp ajjpVar, defpackage.ajjo ajjoVar, defpackage.ajjm ajjmVar, defpackage.ajjq ajjqVar) {
        super((byte[]) null);
        this.a = ajjpVar;
        this.b = ajjoVar;
        this.c = ajjmVar;
        this.d = ajjqVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.d != defpackage.ajjq.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajjr)) {
            return false;
        }
        defpackage.ajjr ajjrVar = (defpackage.ajjr) obj;
        return this.a == ajjrVar.a && this.b == ajjrVar.b && this.c == ajjrVar.c && this.d == ajjrVar.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajjr.class, this.a, this.b, this.c, this.d});
    }

    public final java.lang.String toString() {
        return "HPKE Parameters (Variant: " + this.d.d + ", KemId: " + this.a.toString() + ", KdfId: " + this.b.toString() + ", AeadId: " + this.c.toString() + ')';
    }
}
