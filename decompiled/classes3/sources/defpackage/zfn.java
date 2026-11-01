package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfn {
    public final defpackage.zfm a;
    public final java.lang.String b;

    public zfn(defpackage.zfm zfmVar, java.lang.String str) {
        aooh.f(zfmVar, "sendDataResult");
        this.a = zfmVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zfn) {
            defpackage.zfn zfnVar = (defpackage.zfn) obj;
            if (this.a == zfnVar.a && aooh.n(this.b, zfnVar.b)) {
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
        return "SendDataSessionResult(sendDataResult=" + this.a + ", internalMessageId=" + this.b + ')';
    }
}
