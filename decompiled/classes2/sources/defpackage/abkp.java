package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abkp implements abko {
    public final abki a;
    public final java.lang.String b;

    public abkp(abki abkiVar, java.lang.String str) {
        this.a = abkiVar;
        this.b = str;
    }

    public final java.lang.String a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abkp) {
            defpackage.abkp abkpVar = (defpackage.abkp) obj;
            if (aooh.n(this.a, abkpVar.a) && aooh.n(this.b, abkpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "SingleMonogram2UiData(item=" + this.a + ", contentDescription=" + this.b + ')';
    }
}
