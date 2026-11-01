package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vld {
    public final java.lang.String a;
    public final defpackage.vmd b;

    public vld(java.lang.String str, defpackage.vmd vmdVar) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null objectId");
        }
        this.a = str;
        if (vmdVar == null) {
            throw new java.lang.NullPointerException("Null serverAudioPayload");
        }
        this.b = vmdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vld) {
            defpackage.vld vldVar = (defpackage.vld) obj;
            if (this.a.equals(vldVar.a) && this.b.equals(vldVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "GreetingAndAudioData{objectId=" + this.a + ", serverAudioPayload=" + this.b.toString() + '}';
    }

    public vld() {
        throw null;
    }
}
