package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajgu extends defpackage.ajsz {
    public final defpackage.ajgt a;

    public ajgu(defpackage.ajgt ajgtVar) {
        this.a = ajgtVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.a != defpackage.ajgt.c;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ajgu) && ((defpackage.ajgu) obj).a == this.a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajgu.class, this.a});
    }

    public final java.lang.String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a.d + ')';
    }
}
