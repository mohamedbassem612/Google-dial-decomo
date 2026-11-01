package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bwz {
    public final defpackage.gnk a;
    private final defpackage.bwy b;

    public bwz(defpackage.gnk gnkVar, defpackage.bwy bwyVar) {
        this.a = gnkVar;
        this.b = bwyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bwz) {
            defpackage.bwz bwzVar = (defpackage.bwz) obj;
            if (aooh.n(this.a, bwzVar.a) && aooh.n(this.b, bwzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ')';
    }
}
