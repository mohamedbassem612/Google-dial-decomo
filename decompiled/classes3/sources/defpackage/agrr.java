package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agrr {
    public final defpackage.aeks a;
    private final ahyn b;

    public agrr(defpackage.aeks aeksVar, ahyn ahynVar) {
        this.a = aeksVar;
        this.b = ahynVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agrr) {
            defpackage.agrr agrrVar = (defpackage.agrr) obj;
            if (this.a.equals(agrrVar.a) && this.b.equals(agrrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.b;
        return "Options{features=" + java.lang.String.valueOf(this.a) + ", topViewCreator=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public agrr() {
        throw null;
    }
}
