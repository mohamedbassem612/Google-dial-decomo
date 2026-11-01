package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dhe {
    public final defpackage.csx a;
    public final int b;

    public dhe(defpackage.csx csxVar, int i) {
        this.a = csxVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dhe) {
            defpackage.dhe dheVar = (defpackage.dhe) obj;
            if (defpackage.aooh.n(this.a, dheVar.a) && this.b == dheVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
    }
}
