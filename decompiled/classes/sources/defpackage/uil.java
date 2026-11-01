package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uil {
    public defpackage.udm a;
    public defpackage.udm b;
    public uim c;
    public java.lang.String d;
    public java.lang.Boolean e;
    public java.lang.Boolean f;
    public short g;
    private defpackage.udm h;
    private defpackage.udm i;
    private defpackage.udm j;
    private udl k;
    private aiyg l;

    public uil(defpackage.uio uioVar) {
        this.a = (defpackage.udm) uioVar.f().orElse((java.lang.Object) null);
        this.h = (defpackage.udm) uioVar.b().orElse((java.lang.Object) null);
        this.b = (defpackage.udm) uioVar.g().orElse((java.lang.Object) null);
        this.i = (defpackage.udm) uioVar.a().orElse((java.lang.Object) null);
        this.j = (defpackage.udm) uioVar.d().orElse((java.lang.Object) null);
        this.c = (uim) uioVar.c().orElse((java.lang.Object) null);
        this.d = (java.lang.String) uioVar.e().orElse((java.lang.Object) null);
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(uioVar.f);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        this.e = (java.lang.Boolean) optionalOfNullable.orElse((java.lang.Object) null);
        j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(uioVar.g);
        defpackage.aooh.e(optionalOfNullable2, "ofNullable(...)");
        this.f = (java.lang.Boolean) optionalOfNullable2.orElse((java.lang.Object) null);
        j$.util.Optional optionalOfNullable3 = j$.util.Optional.ofNullable(uioVar.h);
        defpackage.aooh.e(optionalOfNullable3, "ofNullable(...)");
        this.k = (udl) optionalOfNullable3.orElse((java.lang.Object) null);
        j$.util.Optional optionalOfNullable4 = j$.util.Optional.ofNullable(uioVar.i);
        defpackage.aooh.e(optionalOfNullable4, "ofNullable(...)");
        this.l = (aiyg) optionalOfNullable4.orElse((java.lang.Object) null);
        this.g = (short) 2047;
    }

    public final defpackage.uio a() {
        defpackage.udm udmVar = this.a;
        defpackage.udm udmVar2 = this.h;
        defpackage.udm udmVar3 = this.b;
        defpackage.udm udmVar4 = this.i;
        defpackage.udm udmVar5 = this.j;
        uim uimVar = this.c;
        java.lang.String str = this.d;
        java.lang.Boolean bool = this.e;
        java.lang.Boolean bool2 = this.f;
        udl udlVar = this.k;
        aiyg aiygVar = this.l;
        int i = ~this.g;
        return new defpackage.uio(1 != (i & 1) ? udmVar : null, (i & 2) != 0 ? null : udmVar2, (i & 4) != 0 ? null : udmVar3, (i & 8) != 0 ? null : udmVar4, (i & 16) != 0 ? null : udmVar5, (i & 32) != 0 ? null : uimVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : udlVar, (i & 1024) != 0 ? null : aiygVar);
    }

    public final /* synthetic */ void b(j$.util.Optional optional) {
        defpackage.aooh.f(optional, "patronusSpamCheckSkipReason");
        this.l = (aiyg) defpackage.aooh.q(optional);
        this.g = (short) (this.g | 1024);
    }

    public final void c(udl udlVar) {
        this.k = udlVar;
        this.g = (short) (this.g | 512);
    }

    public final void d(defpackage.udm udmVar) {
        this.h = udmVar;
        this.g = (short) (this.g | 2);
    }

    public final void e(defpackage.udm udmVar) {
        this.j = udmVar;
        this.g = (short) (this.g | 16);
    }
}
