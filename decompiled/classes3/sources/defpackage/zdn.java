package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zdn {
    public final defpackage.abbi a;
    public final akzc b;

    public /* synthetic */ zdn(byte[] bArr) {
        defpackage.abbi abbiVar = new defpackage.abbi("UNKNOWN", 4);
        akzc akzcVar = akzc.d;
        aooh.e(akzcVar, "EMPTY");
        this(abbiVar, akzcVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zdn) {
            defpackage.zdn zdnVar = (defpackage.zdn) obj;
            if (aooh.n(this.a, zdnVar.a) && aooh.n(this.b, zdnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MoiraiResponse(verdict=" + this.a + ", protectionToken=" + this.b + ')';
    }

    public zdn(defpackage.abbi abbiVar, akzc akzcVar) {
        aooh.f(akzcVar, "protectionToken");
        this.a = abbiVar;
        this.b = akzcVar;
    }

    public zdn() {
        this(null);
    }
}
