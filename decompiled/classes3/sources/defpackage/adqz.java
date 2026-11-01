package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adqz {
    public final java.lang.String a;
    public final java.lang.String b;

    public adqz(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null path");
        }
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adqz) {
            defpackage.adqz adqzVar = (defpackage.adqz) obj;
            if (this.a.equals(adqzVar.a) && this.b.equals(adqzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PackInfo{name=" + this.a + ", path=" + this.b + '}';
    }

    public adqz() {
        throw null;
    }
}
