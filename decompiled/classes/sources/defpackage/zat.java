package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zat {
    public final defpackage.zao a;
    public final java.lang.String b;

    public zat(defpackage.zao zaoVar, java.lang.String str) {
        this.a = zaoVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zat) {
            defpackage.zat zatVar = (defpackage.zat) obj;
            if (defpackage.aooh.n(this.a, zatVar.a) && defpackage.aooh.n(this.b, zatVar.b)) {
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
        return "ConfigurationKey(configuration=" + this.a + ", uniqueCallId=" + this.b + ')';
    }
}
