package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adjk {
    public final defpackage.adhw a;
    public final java.lang.String b;

    public adjk(defpackage.adhw adhwVar, java.lang.String str) {
        if (adhwVar == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.a = adhwVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adjk) {
            defpackage.adjk adjkVar = (defpackage.adjk) obj;
            if (this.a.equals(adjkVar.a)) {
                java.lang.String str = this.b;
                if (str == null) {
                    if (adjkVar.b == null) {
                        return true;
                    }
                } else if (str.equals(adjkVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym("");
        ahymVar.c();
        ahymVar.b("name", this.a);
        ahymVar.b("scheme", this.b);
        return ahymVar.toString();
    }

    public adjk() {
        throw null;
    }
}
