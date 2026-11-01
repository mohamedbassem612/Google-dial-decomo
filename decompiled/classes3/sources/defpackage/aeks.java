package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeks {
    public final ahyn a;
    public final ahyn b;
    public final ahyn c;
    public final ahyn d;
    public final ahyn e;
    public final ahyn f;
    public final boolean g;
    public final aesg h;
    public final aesg i;

    public aeks(ahyn ahynVar, ahyn ahynVar2, ahyn ahynVar3, ahyn ahynVar4, ahyn ahynVar5, ahyn ahynVar6, aesg aesgVar, boolean z, aesg aesgVar2) {
        this.a = ahynVar;
        this.b = ahynVar2;
        this.c = ahynVar3;
        this.d = ahynVar4;
        this.e = ahynVar5;
        this.f = ahynVar6;
        this.h = aesgVar;
        this.g = z;
        this.i = aesgVar2;
    }

    public static defpackage.aekr a() {
        defpackage.aekr aekrVar = new defpackage.aekr();
        aekrVar.a = ahyn.h(new defpackage.aekt(new aesg()));
        aekrVar.c(true);
        aekrVar.c = new aesg();
        aekrVar.b = new aesg();
        return aekrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeks) {
            defpackage.aeks aeksVar = (defpackage.aeks) obj;
            if (this.a.equals(aeksVar.a) && this.b.equals(aeksVar.b) && this.c.equals(aeksVar.c) && this.d.equals(aeksVar.d) && this.e.equals(aeksVar.e) && this.f.equals(aeksVar.f) && this.h.equals(aeksVar.h) && this.g == aeksVar.g && this.i.equals(aeksVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.d.hashCode() ^ (-2127709203)) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.i.hashCode();
    }

    public final java.lang.String toString() {
        aesg aesgVar = this.i;
        aesg aesgVar2 = this.h;
        ahyn ahynVar = this.f;
        ahyn ahynVar2 = this.e;
        ahyn ahynVar3 = this.d;
        ahyn ahynVar4 = this.c;
        ahyn ahynVar5 = this.b;
        return "ExpressSignInFeatures{signInWithoutAccountFeature=" + java.lang.String.valueOf(this.a) + ", disclaimerFeature=" + java.lang.String.valueOf(ahynVar5) + ", customHeaderContentFeature=" + java.lang.String.valueOf(ahynVar4) + ", logoViewFeature=" + java.lang.String.valueOf(ahynVar3) + ", cancelableFeature=" + java.lang.String.valueOf(ahynVar2) + ", materialVersion=" + java.lang.String.valueOf(ahynVar) + ", secondaryButtonStyleFeature=" + java.lang.String.valueOf(aesgVar2) + ", supportAccountSwitching=" + this.g + ", customContinueButtonTextsFactory=" + java.lang.String.valueOf(aesgVar) + '}';
    }

    public aeks() {
        throw null;
    }
}
