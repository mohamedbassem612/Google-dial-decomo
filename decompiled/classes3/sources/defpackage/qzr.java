package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzr extends pez {
    public final defpackage.quo a;

    public qzr(defpackage.quo quoVar) {
        super((short[]) null);
        this.a = quoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.qzr) && this.a == ((defpackage.qzr) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FinishedShowing(electedPromo=" + this.a + ')';
    }
}
