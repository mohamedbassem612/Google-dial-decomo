package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aepx {
    public final boolean a;
    private final defpackage.aify b;

    public aepx(boolean z, defpackage.aify aifyVar) {
        this.a = z;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = aifyVar;
    }

    public final defpackage.aify a() {
        if (this.a) {
            return this.b;
        }
        throw new java.lang.IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aepx) {
            defpackage.aepx aepxVar = (defpackage.aepx) obj;
            if (this.a == aepxVar.a && defpackage.ahvr.aP(this.b, aepxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + '}';
    }

    public aepx() {
        throw null;
    }
}
