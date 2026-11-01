package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yol {
    private final aify a;
    private final java.lang.String b;

    public yol(aify aifyVar, java.lang.String str) {
        this.a = aifyVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yol) {
            defpackage.yol yolVar = (defpackage.yol) obj;
            if (ahvr.aP(this.a, yolVar.a) && this.b.equals(yolVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "BatchSummary{summaries=" + java.lang.String.valueOf(this.a) + ", batchSignature=" + this.b + '}';
    }

    public yol() {
        throw null;
    }
}
