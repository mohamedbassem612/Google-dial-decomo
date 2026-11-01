package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uio {
    public final defpackage.udm a;
    public final defpackage.udm b;
    public final defpackage.udm c;
    public final defpackage.udm d;
    public final defpackage.udm e;
    public final java.lang.Boolean f;
    public final java.lang.Boolean g;
    public final udl h;
    public final aiyg i;
    private final uim j;
    private final java.lang.String k;

    public uio(defpackage.udm udmVar, defpackage.udm udmVar2, defpackage.udm udmVar3, defpackage.udm udmVar4, defpackage.udm udmVar5, uim uimVar, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, udl udlVar, aiyg aiygVar) {
        this.a = udmVar;
        this.b = udmVar2;
        this.c = udmVar3;
        this.d = udmVar4;
        this.e = udmVar5;
        this.j = uimVar;
        this.k = str;
        this.f = bool;
        this.g = bool2;
        this.h = udlVar;
        this.i = aiygVar;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.d);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final j$.util.Optional b() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.b);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final j$.util.Optional c() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.j);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final j$.util.Optional d() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.e);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final j$.util.Optional e() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.k);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uio) {
            defpackage.uio uioVar = (defpackage.uio) obj;
            if (defpackage.aooh.n(this.a, uioVar.a) && defpackage.aooh.n(this.b, uioVar.b) && defpackage.aooh.n(this.c, uioVar.c) && defpackage.aooh.n(this.d, uioVar.d) && defpackage.aooh.n(this.e, uioVar.e) && this.j == uioVar.j && defpackage.aooh.n(this.k, uioVar.k) && defpackage.aooh.n(this.f, uioVar.f) && defpackage.aooh.n(this.g, uioVar.g) && this.h == uioVar.h && this.i == uioVar.i) {
                return true;
            }
        }
        return false;
    }

    public final j$.util.Optional f() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.a);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final j$.util.Optional g() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.c);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final int hashCode() {
        defpackage.udm udmVar = this.a;
        int iHashCode = udmVar == null ? 0 : udmVar.hashCode();
        defpackage.udm udmVar2 = this.b;
        int iHashCode2 = udmVar2 == null ? 0 : udmVar2.hashCode();
        int i = iHashCode * 31;
        defpackage.udm udmVar3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (udmVar3 == null ? 0 : udmVar3.hashCode())) * 31;
        defpackage.udm udmVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (udmVar4 == null ? 0 : udmVar4.hashCode())) * 31;
        defpackage.udm udmVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (udmVar5 == null ? 0 : udmVar5.hashCode())) * 31;
        uim uimVar = this.j;
        int iHashCode6 = (iHashCode5 + (uimVar == null ? 0 : uimVar.hashCode())) * 31;
        java.lang.String str = this.k;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.f;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.g;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        udl udlVar = this.h;
        int iHashCode10 = (iHashCode9 + (udlVar == null ? 0 : udlVar.hashCode())) * 31;
        aiyg aiygVar = this.i;
        return iHashCode10 + (aiygVar != null ? aiygVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "SpamMetadata(stirShakenClassification=" + this.a + ", globalClassification=" + this.b + ", userClassification=" + this.c + ", gcoreClassification=" + this.d + ", patronusClassification=" + this.e + ", numberClassification=" + this.j + ", patronusLiveLookupSessionId=" + this.k + ", callIsSampled=" + this.f + ", alternativeSpamSolutionUsed=" + this.g + ", verdictSource=" + this.h + ", patronusSpamCheckSkipReason=" + this.i + ')';
    }

    public uio() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }
}
