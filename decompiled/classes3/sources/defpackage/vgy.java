package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vgy {
    public final java.lang.String a;
    public final akzc b;

    public vgy(java.lang.String str, akzc akzcVar) {
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
        if (obj instanceof defpackage.vgy) {
            defpackage.vgy vgyVar = (defpackage.vgy) obj;
            if (this.a.equals(vgyVar.a) && this.b.equals(vgyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VoicemailPayload{mimeType=" + this.a + ", bytes=" + java.lang.String.valueOf(this.b) + '}';
    }

    public vgy() {
        throw null;
    }
}
