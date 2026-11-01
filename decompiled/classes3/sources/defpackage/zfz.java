package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfz {
    public static final akzm a;

    static {
        akzm akzmVarH = aldf.h();
        aooh.e(akzmVarH, "fromDays(...)");
        a = akzmVarH;
    }

    public static final defpackage.yqv a(defpackage.zfd zfdVar) {
        aooh.f(zfdVar, "<this>");
        akzx akzxVarM = defpackage.yqv.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        defpackage.yqv yqvVar = (defpackage.yqv) akzxVarM.b;
        java.lang.String str = zfdVar.a;
        j$.util.Objects.requireNonNull(str);
        yqvVar.b |= 1;
        yqvVar.c = str;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.yqv) aladVarP;
    }

    public static final defpackage.yrd b(defpackage.zff zffVar) {
        aooh.f(zffVar, "<this>");
        akzx akzxVarM = defpackage.yrd.a.m();
        aooh.f(akzxVarM, "builder");
        java.lang.String str = zffVar.a;
        aooh.f(str, "value");
        akzxVarM.u();
        defpackage.yrd yrdVar = (defpackage.yrd) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        yrdVar.b |= 1;
        yrdVar.c = str;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.yrd) aladVarP;
    }
}
