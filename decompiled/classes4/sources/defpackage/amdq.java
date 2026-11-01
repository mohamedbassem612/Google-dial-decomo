package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amdq {
    public final j$.util.Optional a;
    public final aify b;
    public final int c;

    public amdq(j$.util.Optional optional, int i, aify aifyVar) {
        this.a = optional;
        this.c = i;
        this.b = aifyVar;
    }

    public static defpackage.amdq a(int i) {
        defpackage.wn wnVarB = b();
        wnVarB.d(i);
        return wnVarB.a();
    }

    public static defpackage.wn b() {
        defpackage.wn wnVar = new defpackage.wn();
        wnVar.b(j$.util.Optional.empty());
        wnVar.c(aike.a);
        return wnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amdq) {
            defpackage.amdq amdqVar = (defpackage.amdq) obj;
            if (this.a.equals(amdqVar.a)) {
                int i = this.c;
                int i2 = amdqVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ahvr.aP(this.b, amdqVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.c;
        a.aY(i);
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        int i = this.c;
        return "MultiLayerMatchResult{selectedCorrection=" + java.lang.String.valueOf(this.a) + ", status=" + (i != 0 ? java.lang.Integer.toString(i - 2) : "null") + ", singleLayerResults=" + java.lang.String.valueOf(this.b) + '}';
    }

    public amdq() {
        throw null;
    }
}
