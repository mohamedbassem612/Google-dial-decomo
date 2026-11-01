package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbs implements defpackage.kbu {
    public final kcy a;

    public kbs(kcy kcyVar) {
        this.a = kcyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kbs) && aooh.n(this.a, ((defpackage.kbs) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "RowClick(selection=" + this.a + ')';
    }
}
