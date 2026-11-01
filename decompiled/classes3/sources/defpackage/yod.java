package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yod {
    public static final defpackage.yod a;
    public final aify b;

    static {
        aify aifyVarN = aike.a;
        if (aifyVarN != null) {
            aifyVarN = aify.n(aifyVarN);
        }
        a = new defpackage.yod(aifyVarN);
    }

    public yod(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null functionDeclarations");
        }
        this.b = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yod) {
            return ahvr.aP(this.b, ((defpackage.yod) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "FunctionTools{functionDeclarations=" + this.b.toString() + '}';
    }

    public yod() {
        throw null;
    }
}
