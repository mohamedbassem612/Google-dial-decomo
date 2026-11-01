package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class trj implements defpackage.trm {
    public final defpackage.trk a;

    public trj(defpackage.trk trkVar) {
        this.a = trkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.trj) && aooh.n(this.a, ((defpackage.trj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failed(reason=" + this.a + ')';
    }
}
