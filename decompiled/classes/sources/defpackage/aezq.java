package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aezq {
    public final defpackage.aext a;
    public final defpackage.aezr b;

    public aezq(defpackage.aext aextVar, defpackage.aezr aezrVar) {
        this.a = aextVar;
        this.b = aezrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aezq) {
            defpackage.aezq aezqVar = (defpackage.aezq) obj;
            defpackage.aext aextVar = this.a;
            if (aextVar != null ? aextVar.equals(aezqVar.a) : aezqVar.a == null) {
                if (this.b.equals(aezqVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.aext aextVar = this.a;
        return (((aextVar == null ? 0 : aextVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.aezr aezrVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + java.lang.String.valueOf(this.a) + ", snapshotResult=" + aezrVar.toString() + '}';
    }

    public aezq() {
        throw null;
    }
}
