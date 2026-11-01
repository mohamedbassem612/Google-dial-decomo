package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mvd implements rrz {
    private static final aimz d = aimz.i("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee");
    public final nnx a;
    public final aoss b;
    public final rlv c;
    private final android.content.Context e;
    private final defpackage.mux f;
    private final noe g;
    private final aoin h;
    private final rsd i;
    private final rsb j;

    public mvd(android.content.Context context, nnx nnxVar, aoss aossVar, defpackage.mux muxVar, rlv rlvVar, noe noeVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableMarqueeDynamicLocale");
        this.e = context;
        this.a = nnxVar;
        this.b = aossVar;
        this.f = muxVar;
        this.c = rlvVar;
        this.g = noeVar;
        this.h = aoinVar;
        this.i = rsd.b;
        this.j = new rsb(new rsm(14));
    }

    public final rsb a() {
        return this.j;
    }

    public final rsd b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.mvc mvcVar;
        int iIntValue;
        java.lang.Object objB;
        int i;
        defpackage.noi noiVarB;
        java.lang.Object objB2;
        defpackage.noi noiVar;
        int i2;
        defpackage.noh nohVarB;
        aimz aimzVar;
        rse rsfVar;
        rse rsfVar2;
        rse rsfVar3;
        if (aolnVar instanceof defpackage.mvc) {
            mvcVar = (defpackage.mvc) aolnVar;
            int i3 = mvcVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mvcVar.d = i3 - Integer.MIN_VALUE;
            } else {
                mvcVar = new defpackage.mvc(this, aolnVar);
            }
        } else {
            mvcVar = new defpackage.mvc(this, aolnVar);
        }
        java.lang.Object objC = mvcVar.b;
        aolu aoluVar = aolu.a;
        int i4 = mvcVar.d;
        int i5 = 3;
        if (i4 != 0) {
            if (i4 == 1) {
                aooc.af(objC);
            } else if (i4 == 2) {
                aooc.af(objC);
                iIntValue = ((java.lang.Number) objC).intValue();
                nnx nnxVar = this.a;
                mvcVar.a = iIntValue;
                mvcVar.d = 3;
                objB = nnxVar.b(mvcVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                i = iIntValue;
                objC = objB;
                noiVarB = defpackage.noi.b(((nok) objC).d);
                if (noiVarB == null) {
                    noiVarB = defpackage.noi.UNRECOGNIZED;
                }
                nnx nnxVar2 = this.a;
                mvcVar.e = noiVarB;
                mvcVar.a = i;
                mvcVar.d = 4;
                objB2 = nnxVar2.b(mvcVar);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                noiVar = noiVarB;
                objC = objB2;
                i2 = i;
            } else if (i4 == 3) {
                i = mvcVar.a;
                aooc.af(objC);
                noiVarB = defpackage.noi.b(((nok) objC).d);
                if (noiVarB == null) {
                    noiVarB = defpackage.noi.UNRECOGNIZED;
                }
                nnx nnxVar3 = this.a;
                mvcVar.e = noiVarB;
                mvcVar.a = i;
                mvcVar.d = 4;
                objB2 = nnxVar3.b(mvcVar);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                noiVar = noiVarB;
                objC = objB2;
                i2 = i;
            } else {
                if (i4 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = mvcVar.a;
                noiVar = mvcVar.e;
                aooc.af(objC);
            }
            nohVarB = defpackage.noh.b(((nok) objC).c);
            if (nohVarB == null) {
                nohVarB = defpackage.noh.UNRECOGNIZED;
            }
            aimzVar = d;
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 60, "DobbyUpsellBasicToMediumHomepageMarquee.kt").y("enrollment status: %s", nohVarB);
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 64, "DobbyUpsellBasicToMediumHomepageMarquee.kt").w("reportSpamCountInPastWeek: %d", i2);
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 65, "DobbyUpsellBasicToMediumHomepageMarquee.kt").y("protectionLevel: %s", noiVar);
            if (i2 >= 3 || noiVar != defpackage.noi.PROTECTION_LEVEL_BASIC || !mni.D(nohVarB)) {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 75, "DobbyUpsellBasicToMediumHomepageMarquee.kt").v("UpsellBasicToMedium banner is NOT eligible for display.");
                return null;
            }
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 82, "DobbyUpsellBasicToMediumHomepageMarquee.kt").v("UpsellBasicToMedium banner is eligible for display.");
            aoin aoinVar = this.h;
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                rsfVar = new rse(2132017861, (java.lang.Object) null);
            } else {
                java.lang.String string = this.e.getResources().getString(2132017861);
                aooh.e(string, "getString(...)");
                rsfVar = new rsf(string);
            }
            rsp rspVar = new rsp(rsfVar);
            rry rryVar = new rry(defpackage.abja.aN);
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                rsfVar2 = new rse(2132017859, (java.lang.Object) null);
            } else {
                java.lang.String string2 = this.e.getResources().getString(2132017859);
                aooh.e(string2, "getString(...)");
                rsfVar2 = new rsf(string2);
            }
            rrx rrxVar = new rrx(rsfVar2);
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                rsfVar3 = new rse(2132017860, (java.lang.Object) null);
            } else {
                java.lang.String string3 = this.e.getResources().getString(2132017860);
                aooh.e(string3, "getString(...)");
                rsfVar3 = new rsf(string3);
            }
            return new rsh(rspVar, rryVar, rrxVar, new rsa(rsfVar3, new defpackage.mtr(this, i5)));
        }
        aooc.af(objC);
        noe noeVar = this.g;
        mvcVar.d = 1;
        objC = noeVar.c(mvcVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objC).booleanValue()) {
            d.b().l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 53, "DobbyUpsellBasicToMediumHomepageMarquee.kt").v("AAPM is enabled, inhibit promotion");
        } else {
            defpackage.mux muxVar = this.f;
            mvcVar.d = 2;
            objC = muxVar.f(mvcVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            iIntValue = ((java.lang.Number) objC).intValue();
            nnx nnxVar4 = this.a;
            mvcVar.a = iIntValue;
            mvcVar.d = 3;
            objB = nnxVar4.b(mvcVar);
            if (objB != aoluVar) {
                return aoluVar;
            }
            i = iIntValue;
            objC = objB;
            noiVarB = defpackage.noi.b(((nok) objC).d);
            if (noiVarB == null) {
                noiVarB = defpackage.noi.UNRECOGNIZED;
            }
            nnx nnxVar5 = this.a;
            mvcVar.e = noiVarB;
            mvcVar.a = i;
            mvcVar.d = 4;
            objB2 = nnxVar5.b(mvcVar);
            if (objB2 == aoluVar) {
                return aoluVar;
            }
            noiVar = noiVarB;
            objC = objB2;
            i2 = i;
            nohVarB = defpackage.noh.b(((nok) objC).c);
            if (nohVarB == null) {
                nohVarB = defpackage.noh.UNRECOGNIZED;
            }
            aimzVar = d;
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 60, "DobbyUpsellBasicToMediumHomepageMarquee.kt").y("enrollment status: %s", nohVarB);
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 64, "DobbyUpsellBasicToMediumHomepageMarquee.kt").w("reportSpamCountInPastWeek: %d", i2);
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 65, "DobbyUpsellBasicToMediumHomepageMarquee.kt").y("protectionLevel: %s", noiVar);
            if (i2 >= 3) {
            }
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellBasicToMediumHomepageMarquee", "getMarqueeUiModel", 75, "DobbyUpsellBasicToMediumHomepageMarquee.kt").v("UpsellBasicToMedium banner is NOT eligible for display.");
        }
        return null;
    }

    public final void g() {
        this.c.o(rmx.kK);
    }

    public final /* synthetic */ void f() {
    }
}
