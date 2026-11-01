package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymq {
    public final java.lang.Object a;
    public final defpackage.ydy b;

    public ymq(java.lang.Object obj, defpackage.ydy ydyVar) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Null getService");
        }
        this.a = obj;
        this.b = ydyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ymq) {
            defpackage.ymq ymqVar = (defpackage.ymq) obj;
            if (this.a.equals(ymqVar.a) && this.b.equals(ymqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ydy ydyVar = this.b;
        return "InferenceServiceContext{getService=" + this.a.toString() + ", disconnectSignal=" + ydyVar.toString() + '}';
    }

    protected ymq() {
        throw null;
    }
}
