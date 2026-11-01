package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qca {
    public final j$.util.Optional a;
    public final boolean b;

    public qca(j$.util.Optional optional, boolean z) {
        this.a = optional;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qca) {
            defpackage.qca qcaVar = (defpackage.qca) obj;
            if (this.a.equals(qcaVar.a) && this.b == qcaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "OnHoldModel{displayName=" + java.lang.String.valueOf(this.a) + ", isVideoCall=" + this.b + '}';
    }

    public qca() {
        throw null;
    }
}
