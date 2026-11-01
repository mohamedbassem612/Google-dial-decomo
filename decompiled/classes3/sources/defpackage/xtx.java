package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtx extends defpackage.xff {
    public final defpackage.xua a;

    public xtx(defpackage.xua xuaVar) {
        super(null, null);
        this.a = xuaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xtx) && aooh.n(this.a, ((defpackage.xtx) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ImmediateGlideSize(size=" + this.a + ')';
    }
}
