package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class whx {
    public final java.lang.String a;
    public final akzc b;

    public whx(java.lang.String str, akzc akzcVar) {
        this.a = str;
        this.b = akzcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.whx) {
            defpackage.whx whxVar = (defpackage.whx) obj;
            if (this.a.equals(whxVar.a) && this.b.equals(whxVar.b)) {
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

    public whx() {
        throw null;
    }
}
