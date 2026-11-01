package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyz {
    public final akzc a;
    public final int b;

    public hyz(akzc akzcVar, int i) {
        this.a = akzcVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.hyz) {
            defpackage.hyz hyzVar = (defpackage.hyz) obj;
            if (this.a.equals(hyzVar.a) && this.b == hyzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "Data{data=" + java.lang.String.valueOf(this.a) + ", bytesLost=" + this.b + '}';
    }

    public hyz() {
        throw null;
    }
}
