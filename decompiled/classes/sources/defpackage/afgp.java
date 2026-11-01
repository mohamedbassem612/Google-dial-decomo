package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgp {
    public final android.net.Uri a;
    public final defpackage.albh b;
    public final defpackage.ahyn c;
    public final defpackage.aify d;
    public final defpackage.afhd e;
    public final boolean f;

    public afgp(android.net.Uri uri, defpackage.albh albhVar, defpackage.ahyn ahynVar, defpackage.aify aifyVar, defpackage.afhd afhdVar, boolean z) {
        this.a = uri;
        this.b = albhVar;
        this.c = ahynVar;
        this.d = aifyVar;
        this.e = afhdVar;
        this.f = z;
    }

    public static defpackage.afgo a() {
        defpackage.afgo afgoVar = new defpackage.afgo();
        afgoVar.b = defpackage.afgy.a;
        afgoVar.c();
        afgoVar.f(true);
        return afgoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.afgp) {
            defpackage.afgp afgpVar = (defpackage.afgp) obj;
            if (this.a.equals(afgpVar.a) && this.b.equals(afgpVar.b) && this.c.equals(afgpVar.c) && defpackage.ahvr.aP(this.d, afgpVar.d) && this.e.equals(afgpVar.e) && this.f == afgpVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        defpackage.afhd afhdVar = this.e;
        defpackage.aify aifyVar = this.d;
        defpackage.ahyn ahynVar = this.c;
        defpackage.albh albhVar = this.b;
        return "ProtoDataStoreConfig{uri=" + java.lang.String.valueOf(this.a) + ", schema=" + java.lang.String.valueOf(albhVar) + ", handler=" + java.lang.String.valueOf(ahynVar) + ", migrations=" + java.lang.String.valueOf(aifyVar) + ", variantConfig=" + java.lang.String.valueOf(afhdVar) + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    public afgp() {
        throw null;
    }
}
