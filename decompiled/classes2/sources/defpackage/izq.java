package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class izq {
    public final boolean a;
    public final boolean b;
    public final java.util.List c;
    public final aomy d;
    public final aomy e;

    public izq(boolean z, boolean z2, java.util.List list, aomy aomyVar, aomy aomyVar2) {
        aooh.f(list, "greetingsData");
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = aomyVar;
        this.e = aomyVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.izq) {
            defpackage.izq izqVar = (defpackage.izq) obj;
            if (this.a == izqVar.a && this.b == izqVar.b && aooh.n(this.c, izqVar.c) && aooh.n(this.d, izqVar.d) && aooh.n(this.e, izqVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((anty.L(this.a) * 31) + anty.L(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "BeeslyGreetingSettingsUiModel(isLandScape=" + this.a + ", isCustomGreetingLimitReached=" + this.b + ", greetingsData=" + this.c + ", onBackClicked=" + this.d + ", onFabClicked=" + this.e + ')';
    }
}
