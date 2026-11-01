package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fyg extends dzl {
    private final defpackage.fxx a;

    public fyg(defpackage.fxx fxxVar) {
        super((byte[]) null);
        this.a = fxxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && aooh.n(this.a, ((defpackage.fyg) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() - 31;
    }

    public final java.lang.String toString() {
        return "InProgress(latestEvent=" + this.a + ", direction=-1)";
    }
}
