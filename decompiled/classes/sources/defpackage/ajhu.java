package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhu extends defpackage.ajsz {
    public final defpackage.ajht a;

    public ajhu(defpackage.ajht ajhtVar) {
        this.a = ajhtVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.a != defpackage.ajht.c;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ajhu) && ((defpackage.ajhu) obj).a == this.a;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajhu.class, this.a});
    }

    public final java.lang.String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a.d + ')';
    }
}
