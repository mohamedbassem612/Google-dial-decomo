package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lcr {
    public final java.lang.String a;
    public final akzc b;

    public lcr(java.lang.String str, akzc akzcVar) {
        this.a = str;
        this.b = akzcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lcr) {
            defpackage.lcr lcrVar = (defpackage.lcr) obj;
            if (this.a.equals(lcrVar.a) && this.b.equals(lcrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "NamedFile{fileName=" + this.a + ", audioData=" + java.lang.String.valueOf(this.b) + '}';
    }

    public lcr() {
        throw null;
    }
}
