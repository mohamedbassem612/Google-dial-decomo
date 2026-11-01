package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ujo extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.ujp b;
    final /* synthetic */ defpackage.ujq c;
    final /* synthetic */ defpackage.uku d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujo(aoln aolnVar, defpackage.ujp ujpVar, defpackage.ujq ujqVar, defpackage.uku ukuVar) {
        super(2, aolnVar);
        this.b = ujpVar;
        this.c = ujqVar;
        this.d = ukuVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        defpackage.uks ukqVar;
        defpackage.uks uknVar;
        aolu aoluVar = aolu.a;
        try {
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                defpackage.ujp ujpVar = this.b;
                vwb vwbVar = ujpVar.h;
                defpackage.vqu vquVar = ujpVar.i;
                defpackage.ujq ujqVar = this.c;
                defpackage.uku ukuVar = this.d;
                aooh.f(ukuVar, "notificationModel");
                int iOrdinal = ujqVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        akzx akzxVarM = defpackage.ujd.a.m();
                        aooh.f(akzxVarM, "builder");
                        java.lang.Object obj2 = vquVar.a;
                        java.lang.String string = ((android.content.Context) obj2).getString(2132019484, defpackage.vqu.T(ukuVar));
                        aooh.e(string, "getString(...)");
                        aooh.f(string, "value");
                        akzxVarM.u();
                        defpackage.ujd ujdVar = (defpackage.ujd) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string);
                        ujdVar.b = string;
                        java.lang.String string2 = defpackage.yee.d((android.content.Context) obj2).toString();
                        aooh.f(string2, "value");
                        akzxVarM.u();
                        defpackage.ujd ujdVar2 = (defpackage.ujd) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string2);
                        ujdVar2.c = string2;
                        java.lang.String string3 = ((android.content.Context) obj2).getString(2132020225);
                        aooh.e(string3, "getString(...)");
                        aooh.f(string3, "value");
                        akzxVarM.u();
                        defpackage.ujd ujdVar3 = (defpackage.ujd) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string3);
                        ujdVar3.e = string3;
                        java.lang.String string4 = (defpackage.yee.g((android.content.Context) obj2) + (-1) != 0 ? ((android.content.Context) obj2).getText(2132020229) : ((android.content.Context) obj2).getText(2132020228)).toString();
                        aooh.f(string4, "value");
                        akzxVarM.u();
                        defpackage.ujd ujdVar4 = (defpackage.ujd) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string4);
                        ujdVar4.f = string4;
                        java.lang.String string5 = ((android.content.Context) obj2).getString(2132020226);
                        aooh.e(string5, "getString(...)");
                        aooh.f(string5, "value");
                        akzxVarM.u();
                        defpackage.ujd ujdVar5 = (defpackage.ujd) akzxVarM.b;
                        j$.util.Objects.requireNonNull(string5);
                        ujdVar5.d = string5;
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        ukqVar = new defpackage.ukp((defpackage.ujd) aladVarP);
                    } else if (iOrdinal == 2) {
                        java.lang.String str = ukuVar.c;
                        aooh.e(str, "getRawNumber(...)");
                        uknVar = new defpackage.ukn(str);
                    } else {
                        if (iOrdinal != 3) {
                            throw new aois();
                        }
                        uknVar = defpackage.uko.c;
                    }
                    this.a = 1;
                    if (vwbVar.a(uknVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    akzx akzxVarM2 = defpackage.uki.a.m();
                    aooh.f(akzxVarM2, "builder");
                    java.lang.Object obj3 = vquVar.a;
                    java.lang.String string6 = defpackage.yee.f((android.content.Context) obj3, defpackage.vqu.T(ukuVar)).toString();
                    aooh.f(string6, "value");
                    akzxVarM2.u();
                    defpackage.uki ukiVar = (defpackage.uki) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string6);
                    ukiVar.b = string6;
                    java.lang.String string7 = ((android.content.Context) obj3).getString(2132020227);
                    aooh.e(string7, "getString(...)");
                    aooh.f(string7, "value");
                    akzxVarM2.u();
                    defpackage.uki ukiVar2 = (defpackage.uki) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string7);
                    ukiVar2.d = string7;
                    java.lang.String string8 = defpackage.yee.e((android.content.Context) obj3).toString();
                    aooh.f(string8, "value");
                    akzxVarM2.u();
                    defpackage.uki ukiVar3 = (defpackage.uki) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string8);
                    ukiVar3.e = string8;
                    java.lang.String string9 = ((android.content.Context) obj3).getString(2132020226);
                    aooh.e(string9, "getString(...)");
                    aooh.f(string9, "value");
                    akzxVarM2.u();
                    defpackage.uki ukiVar4 = (defpackage.uki) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string9);
                    ukiVar4.c = string9;
                    alad aladVarP2 = akzxVarM2.p();
                    aooh.e(aladVarP2, "build(...)");
                    ukqVar = new defpackage.ukq((defpackage.uki) aladVarP2);
                }
                uknVar = ukqVar;
                this.a = 1;
                if (vwbVar.a(uknVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        } catch (java.lang.Exception e) {
            if (!(e instanceof java.util.concurrent.CancellationException)) {
                aimz aimzVar = zih.a;
                zih.a.c().k(e).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
            }
            throw e;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ujo ujoVar = new defpackage.ujo(aolnVar, this.b, this.c, this.d);
        ujoVar.e = obj;
        return ujoVar;
    }
}
