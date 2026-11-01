package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smm {
    public final aomy a;
    public final boolean b;
    public final defpackage.smp c;
    public final java.lang.String d;

    public smm(aomy aomyVar, boolean z, defpackage.smp smpVar, java.lang.String str) {
        aooh.f(aomyVar, "onClick");
        this.a = aomyVar;
        this.b = z;
        this.c = smpVar;
        this.d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.smm) {
            defpackage.smm smmVar = (defpackage.smm) obj;
            if (aooh.n(this.a, smmVar.a) && this.b == smmVar.b && aooh.n(this.c, smmVar.c) && aooh.n(this.d, smmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
        java.lang.String str = this.d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "Button(onClick=" + this.a + ", enabled=" + this.b + ", indicator=" + this.c + ", contentDescription=" + this.d + ')';
    }
}
