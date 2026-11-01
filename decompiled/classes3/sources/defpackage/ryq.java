package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryq {
    public final aomy a;
    public final aomy b;
    public final aonj c;
    public final defpackage.slh d;
    public final defpackage.abjl e;
    public final defpackage.ryt f;
    public final java.util.List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public ryq(aomy aomyVar, aomy aomyVar2, aonj aonjVar, defpackage.slh slhVar, defpackage.abjl abjlVar, defpackage.ryt rytVar, java.util.List list, boolean z, boolean z2, boolean z3) {
        aooh.f(aomyVar2, "toEditor");
        aooh.f(aonjVar, "onDone");
        aooh.f(rytVar, "initialSelectedShareSetting");
        aooh.f(list, "shareSettings");
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = aonjVar;
        this.d = slhVar;
        this.e = abjlVar;
        this.f = rytVar;
        this.g = list;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ryq) {
            defpackage.ryq ryqVar = (defpackage.ryq) obj;
            if (aooh.n(this.a, ryqVar.a) && aooh.n(this.b, ryqVar.b) && aooh.n(this.c, ryqVar.c) && aooh.n(this.d, ryqVar.d) && aooh.n(this.e, ryqVar.e) && aooh.n(this.f, ryqVar.f) && aooh.n(this.g, ryqVar.g) && this.h == ryqVar.h && this.i == ryqVar.i && this.j == ryqVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        boolean z = this.j;
        return (((((iHashCode * 31) + anty.L(this.h)) * 31) + anty.L(this.i)) * 31) + anty.L(z);
    }

    public final java.lang.String toString() {
        return "CallingCardSharingUiData(onBack=" + this.a + ", toEditor=" + this.b + ", onDone=" + this.c + ", callingCardPreviewUiData=" + this.d + ", transformationUiData=" + this.e + ", initialSelectedShareSetting=" + this.f + ", shareSettings=" + this.g + ", isSaving=" + this.h + ", isOnboardingRefactorEnabled=" + this.i + ", isInitialStep=" + this.j + ')';
    }
}
