package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adio {
    public final java.lang.String a;

    public adio(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adio) {
            defpackage.adio adioVar = (defpackage.adio) obj;
            java.lang.String str = this.a;
            if (str != null) {
                return str.equals(adioVar.a);
            }
            if (adioVar.a == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        return str == null ? "" : str;
    }

    public adio() {
        throw null;
    }
}
