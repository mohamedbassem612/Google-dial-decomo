package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeow {
    public final apgj a;
    public final aify b;

    public aeow(apgj apgjVar, aify aifyVar) {
        if (apgjVar == null) {
            throw new java.lang.NullPointerException("Null debugLogs");
        }
        this.a = apgjVar;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null nativeDebugLogs");
        }
        this.b = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeow) {
            defpackage.aeow aeowVar = (defpackage.aeow) obj;
            if (this.a.equals(aeowVar.a) && ahvr.aP(this.b, aeowVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.b;
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + aifyVar.toString() + '}';
    }

    public aeow() {
        throw null;
    }
}
