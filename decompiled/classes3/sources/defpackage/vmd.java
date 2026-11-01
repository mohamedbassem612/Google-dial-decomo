package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vmd {
    public final java.lang.String a;
    public final akzc b;

    public vmd(java.lang.String str, akzc akzcVar) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null mimeType");
        }
        this.a = str;
        if (akzcVar == null) {
            throw new java.lang.NullPointerException("Null bytes");
        }
        this.b = akzcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vmd) {
            defpackage.vmd vmdVar = (defpackage.vmd) obj;
            if (this.a.equals(vmdVar.a) && this.b.equals(vmdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ServerAudioPayload{mimeType=" + this.a + ", bytes=" + java.lang.String.valueOf(this.b) + '}';
    }

    public vmd() {
        throw null;
    }
}
