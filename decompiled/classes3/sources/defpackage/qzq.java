package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzq extends pez {
    public final defpackage.quo a;

    public qzq(defpackage.quo quoVar) {
        super((short[]) null);
        this.a = quoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.qzq) && this.a == ((defpackage.qzq) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Elected(electedPromo=" + this.a + ')';
    }
}
