package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rsk implements defpackage.rsl {
    public final defpackage.rsp a;
    public final defpackage.rry b;
    public final defpackage.rrx c;
    public final defpackage.rsa d;
    private final defpackage.rsa e = null;
    private final boolean f = true;

    public rsk(defpackage.rsp rspVar, defpackage.rry rryVar, defpackage.rrx rrxVar, defpackage.rsa rsaVar) {
        this.a = rspVar;
        this.b = rryVar;
        this.c = rrxVar;
        this.d = rsaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rsk) {
            defpackage.rsk rskVar = (defpackage.rsk) obj;
            if (aooh.n(this.a, rskVar.a) && aooh.n(this.b, rskVar.b) && aooh.n(this.c, rskVar.c) && aooh.n(this.d, rskVar.d)) {
                defpackage.rsa rsaVar = rskVar.e;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    boolean z = rskVar.f;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 961) + 1231;
    }

    public final java.lang.String toString() {
        return "InformationalMarqueeUiModel(title=" + this.a + ", icon=" + this.b + ", body=" + this.c + ", primaryButton=" + this.d + ", secondaryButton=null, hasCloseButton=true)";
    }
}
