package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfq implements defpackage.tfz {
    public final defpackage.tfj a;

    public tfq(defpackage.tfj tfjVar) {
        this.a = tfjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tfq) && aooh.n(this.a, ((defpackage.tfq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CopyNumber(actionContext=" + this.a + ')';
    }
}
