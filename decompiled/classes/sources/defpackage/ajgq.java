package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajgq extends defpackage.ajsz {
    public final int a;
    public final defpackage.ajgp b;

    public ajgq(int i, defpackage.ajgp ajgpVar) {
        this.a = i;
        this.b = ajgpVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.b != defpackage.ajgp.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajgq)) {
            return false;
        }
        defpackage.ajgq ajgqVar = (defpackage.ajgq) obj;
        return ajgqVar.a == this.a && ajgqVar.b == this.b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajgq.class, java.lang.Integer.valueOf(this.a), this.b});
    }

    public final java.lang.String toString() {
        return "AesGcmSiv Parameters (variant: " + java.lang.String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
