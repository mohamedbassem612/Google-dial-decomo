package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mbb {
    public final zao a;
    public final java.lang.String b;

    public mbb(zao zaoVar, java.lang.String str) {
        this.a = zaoVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mbb) {
            defpackage.mbb mbbVar = (defpackage.mbb) obj;
            if (aooh.n(this.a, mbbVar.a) && aooh.n(this.b, mbbVar.b)) {
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
