package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ablw implements defpackage.abmf, defpackage.abmh {
    public final java.lang.String a;
    public final boolean b;
    public final java.lang.String c;
    public final java.util.List d;
    public final aomy e;
    private final boolean f;
    private final aomy g;

    public /* synthetic */ ablw(java.lang.String str, boolean z, java.lang.String str2, aomy aomyVar) {
        aokc aokcVar = aokc.a;
        aooh.f(str, "title");
        this.a = str;
        this.f = true;
        this.b = z;
        this.c = str2;
        this.d = aokcVar;
        this.e = aomyVar;
        this.g = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ablw) {
            defpackage.ablw ablwVar = (defpackage.ablw) obj;
            if (aooh.n(this.a, ablwVar.a)) {
                boolean z = ablwVar.f;
                if (this.b == ablwVar.b && aooh.n(this.c, ablwVar.c) && aooh.n(this.d, ablwVar.d) && aooh.n(this.e, ablwVar.e)) {
                    aomy aomyVar = ablwVar.g;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.c;
        return (((((((((iHashCode + anty.L(true)) * 31) + anty.L(this.b)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + 1) * 31) + this.e.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        return "SingleSelectOption(title=" + this.a + ", enabled=true, selected=" + this.b + ", description=" + this.c + ", descriptionAnnotations=" + this.d + ", onClick=" + this.e + ", onDisabledClick=null)";
    }
}
