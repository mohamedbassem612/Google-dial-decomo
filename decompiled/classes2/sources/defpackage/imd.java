package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class imd extends defpackage.hgu {
    public final twd a;
    public final defpackage.igw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imd(twd twdVar, defpackage.igw igwVar) {
        super(null);
        aooh.f(twdVar, "sodaConfig");
        this.a = twdVar;
        this.b = igwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.imd) {
            defpackage.imd imdVar = (defpackage.imd) obj;
            if (aooh.n(this.a, imdVar.a) && aooh.n(this.b, imdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.igw igwVar = this.b;
        return iHashCode + (igwVar == null ? 0 : igwVar.hashCode());
    }

    public final java.lang.String toString() {
        return "LanguagePackSuccess(sodaConfig=" + this.a + ", audioPrismSodaLpInfo=" + this.b + ')';
    }
}
