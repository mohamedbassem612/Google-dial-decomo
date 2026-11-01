package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uox extends defpackage.aais {
    public final java.util.List a;
    public final defpackage.aomy b;
    public final defpackage.aonj c;
    public final defpackage.aonj d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final defpackage.aomy j;
    public final defpackage.aomy k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uox(java.util.List list, defpackage.aomy aomyVar, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, defpackage.aomy aomyVar2, defpackage.aomy aomyVar3) {
        super((short[]) null);
        defpackage.aooh.f(aomyVar, "addContactClickHandler");
        defpackage.aooh.f(aonjVar, "contactClickHandler");
        defpackage.aooh.f(aonjVar2, "removeContactHandler");
        defpackage.aooh.f(aomyVar2, "toggleHideContacts");
        this.a = list;
        this.b = aomyVar;
        this.c = aonjVar;
        this.d = aonjVar2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = aomyVar2;
        this.k = aomyVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uox) {
            defpackage.uox uoxVar = (defpackage.uox) obj;
            if (defpackage.aooh.n(this.a, uoxVar.a) && defpackage.aooh.n(this.b, uoxVar.b) && defpackage.aooh.n(this.c, uoxVar.c) && defpackage.aooh.n(this.d, uoxVar.d) && this.e == uoxVar.e && this.f == uoxVar.f && this.g == uoxVar.g && this.h == uoxVar.h && this.i == uoxVar.i && defpackage.aooh.n(this.j, uoxVar.j) && defpackage.aooh.n(this.k, uoxVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        defpackage.aomy aomyVar = this.j;
        boolean z = this.i;
        boolean z2 = this.h;
        int iL = (((((((((((iHashCode * 31) + defpackage.anty.L(this.e)) * 31) + defpackage.anty.L(this.f)) * 31) + defpackage.anty.L(this.g)) * 31) + defpackage.anty.L(z2)) * 31) + defpackage.anty.L(z)) * 31) + aomyVar.hashCode();
        defpackage.aomy aomyVar2 = this.k;
        return (iL * 31) + (aomyVar2 == null ? 0 : aomyVar2.hashCode());
    }

    public final java.lang.String toString() {
        return "Data(items=" + this.a + ", addContactClickHandler=" + this.b + ", contactClickHandler=" + this.c + ", removeContactHandler=" + this.d + ", hideContacts=" + this.e + ", enableCallLogInCompose=" + this.f + ", enableFavoritesBarPhotoCacheFix=" + this.g + ", enableFavoritesBarAddButtonTalkbackFix=" + this.h + ", enableFavoritesBarHeaderA11yFix=" + this.i + ", toggleHideContacts=" + this.j + ", viewAllContacts=" + this.k + ')';
    }
}
