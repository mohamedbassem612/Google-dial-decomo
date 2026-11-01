package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vff {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public vff(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Null localVoicemail");
        }
        this.a = obj;
        if (obj2 == null) {
            throw new java.lang.NullPointerException("Null serverVoicemail");
        }
        this.b = obj2;
    }

    public static /* synthetic */ boolean a(java.lang.Object obj) {
        return !((defpackage.vdg) ((defpackage.vff) obj).a).e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vff) {
            defpackage.vff vffVar = (defpackage.vff) obj;
            if (this.a.equals(vffVar.a) && this.b.equals(vffVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        return "VoicemailPair{localVoicemail=" + this.a.toString() + ", serverVoicemail=" + obj.toString() + '}';
    }

    public vff() {
        throw null;
    }
}
