package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uhd {
    public final java.lang.String a;
    public final akzc b;

    public uhd(java.lang.String str, akzc akzcVar) {
        aooh.f(str, "clientRole");
        aooh.f(akzcVar, "protectionToken");
        this.a = str;
        this.b = akzcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uhd) {
            defpackage.uhd uhdVar = (defpackage.uhd) obj;
            if (aooh.n(this.a, uhdVar.a) && aooh.n(this.b, uhdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MoiraiDataEntity(clientRole=" + this.a + ", protectionToken=" + this.b + ')';
    }
}
