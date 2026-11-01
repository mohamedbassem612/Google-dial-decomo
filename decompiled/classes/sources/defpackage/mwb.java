package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mwb {
    public final defpackage.acux a;
    public final java.util.List b;

    public mwb(defpackage.acux acuxVar, java.util.List list) {
        if (acuxVar == null) {
            defpackage.aooh.i("mdd");
        }
        if (list == null) {
            defpackage.aooh.i("mddUseCases");
        }
        this.a = acuxVar;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mwb) {
            defpackage.mwb mwbVar = (defpackage.mwb) obj;
            if (defpackage.aooh.n(this.a, mwbVar.a) && defpackage.aooh.n(this.b, mwbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MddFilePack(mdd=" + this.a + ", mddUseCases=" + this.b + ')';
    }
}
