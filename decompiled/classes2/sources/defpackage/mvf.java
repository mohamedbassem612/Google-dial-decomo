package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mvf implements rrz {
    private static final aimz d = aimz.i("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee");
    public final nnx a;
    public final aoss b;
    public final rlv c;
    private final android.content.Context e;
    private final defpackage.mux f;
    private final noe g;
    private final aoin h;
    private final rsd i;
    private final rsb j;

    public mvf(android.content.Context context, nnx nnxVar, aoss aossVar, defpackage.mux muxVar, rlv rlvVar, noe noeVar, aoin aoinVar) {
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
        this.i = rsd.c;
        this.j = new rsb(new rsm(14));
    }

    public final rsb a() {
        return this.j;
    }

    public final rsd b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x0183  */
    /* JADX WARN: Code duplicated, block: B:56:0x0189  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.mve mveVar;
        defpackage.noh nohVarB;
        java.lang.Object objF;
        defpackage.noh nohVar;
        int iIntValue;
        java.lang.Object objB;
        int i;
        defpackage.noh nohVar2;
        defpackage.noi noiVarB;
        aimz aimzVar;
        aoin aoinVar;
        rse rsfVar;
        rse rsfVar2;
        rse rsfVar3;
        if (aolnVar instanceof defpackage.mve) {
            mveVar = (defpackage.mve) aolnVar;
            int i2 = mveVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mveVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mveVar = new defpackage.mve(this, aolnVar);
            }
        } else {
            mveVar = new defpackage.mve(this, aolnVar);
        }
        java.lang.Object objC = mveVar.b;
        rsh rshVar = aolu.a;
        int i3 = mveVar.d;
        int i4 = 4;
        if (i3 == 0) {
            aooc.af(objC);
            noe noeVar = this.g;
            mveVar.d = 1;
            objC = noeVar.c(mveVar);
            if (objC != rshVar) {
            }
            return rshVar;
        }
        if (i3 == 1) {
            aooc.af(objC);
        } else {
            if (i3 == 2) {
                aooc.af(objC);
                nohVarB = defpackage.noh.b(((nok) objC).c);
                if (nohVarB == null) {
                    nohVarB = defpackage.noh.UNRECOGNIZED;
                }
                defpackage.mux muxVar = this.f;
                mveVar.e = nohVarB;
                mveVar.d = 3;
                objF = muxVar.f(mveVar);
                if (objF != rshVar) {
                    nohVar = nohVarB;
                    objC = objF;
                    iIntValue = ((java.lang.Number) objC).intValue();
                    nnx nnxVar = this.a;
                    mveVar.e = nohVar;
                    mveVar.a = iIntValue;
                    mveVar.d = 4;
                    objB = nnxVar.b(mveVar);
                    if (objB != rshVar) {
                        i = iIntValue;
                        objC = objB;
                        nohVar2 = nohVar;
                    }
                }
                return rshVar;
            }
            if (i3 == 3) {
                nohVar = mveVar.e;
                aooc.af(objC);
                iIntValue = ((java.lang.Number) objC).intValue();
                nnx nnxVar2 = this.a;
                mveVar.e = nohVar;
                mveVar.a = iIntValue;
                mveVar.d = 4;
                objB = nnxVar2.b(mveVar);
                if (objB != rshVar) {
                    i = iIntValue;
                    objC = objB;
                    nohVar2 = nohVar;
                }
                return rshVar;
            }
            if (i3 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = mveVar.a;
            nohVar2 = mveVar.e;
            aooc.af(objC);
        }
        noiVarB = defpackage.noi.b(((nok) objC).d);
        if (noiVarB == null) {
            noiVarB = defpackage.noi.UNRECOGNIZED;
        }
        aimzVar = d;
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 61, "DobbyUpsellMediumToMaxHomepageMarquee.kt").y("enrollment status: %s", nohVar2);
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 65, "DobbyUpsellMediumToMaxHomepageMarquee.kt").w("reportSpamCountInPastWeek: %d", i);
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 66, "DobbyUpsellMediumToMaxHomepageMarquee.kt").y("protectionLevel: %s", noiVarB);
        if (i >= 3 && noiVarB == defpackage.noi.PROTECTION_LEVEL_MEDIUM && nohVar2 != defpackage.noh.ENROLLMENT_STATUS_USER_OPTED_OUT && nohVar2 != defpackage.noh.ENROLLMENT_STATUS_OPTED_OUT_BY_GOOGLE_FI) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 77, "DobbyUpsellMediumToMaxHomepageMarquee.kt").v("UpsellMediumToMax banner is eligible for display.");
            aoinVar = this.h;
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
                rsfVar2 = new rse(2132017862, (java.lang.Object) null);
            } else {
                java.lang.String string2 = this.e.getResources().getString(2132017862);
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
            rshVar = new rsh(rspVar, rryVar, rrxVar, new rsa(rsfVar3, new defpackage.mtr(this, i4)));
            return rshVar;
        }
        return null;
        if (!((java.lang.Boolean) objC).booleanValue()) {
            nnx nnxVar3 = this.a;
            mveVar.d = 2;
            objC = nnxVar3.b(mveVar);
            if (objC != rshVar) {
                nohVarB = defpackage.noh.b(((nok) objC).c);
                if (nohVarB == null) {
                    nohVarB = defpackage.noh.UNRECOGNIZED;
                }
                defpackage.mux muxVar2 = this.f;
                mveVar.e = nohVarB;
                mveVar.d = 3;
                objF = muxVar2.f(mveVar);
                if (objF != rshVar) {
                    nohVar = nohVarB;
                    objC = objF;
                    iIntValue = ((java.lang.Number) objC).intValue();
                    nnx nnxVar4 = this.a;
                    mveVar.e = nohVar;
                    mveVar.a = iIntValue;
                    mveVar.d = 4;
                    objB = nnxVar4.b(mveVar);
                    if (objB != rshVar) {
                        i = iIntValue;
                        objC = objB;
                        nohVar2 = nohVar;
                        noiVarB = defpackage.noi.b(((nok) objC).d);
                        if (noiVarB == null) {
                            noiVarB = defpackage.noi.UNRECOGNIZED;
                        }
                        aimzVar = d;
                        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 61, "DobbyUpsellMediumToMaxHomepageMarquee.kt").y("enrollment status: %s", nohVar2);
                        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 65, "DobbyUpsellMediumToMaxHomepageMarquee.kt").w("reportSpamCountInPastWeek: %d", i);
                        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 66, "DobbyUpsellMediumToMaxHomepageMarquee.kt").y("protectionLevel: %s", noiVarB);
                        if (i >= 3) {
                            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 77, "DobbyUpsellMediumToMaxHomepageMarquee.kt").v("UpsellMediumToMax banner is eligible for display.");
                            aoinVar = this.h;
                            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                rsfVar = new rse(2132017861, (java.lang.Object) null);
                            } else {
                                java.lang.String string4 = this.e.getResources().getString(2132017861);
                                aooh.e(string4, "getString(...)");
                                rsfVar = new rsf(string4);
                            }
                            rsp rspVar2 = new rsp(rsfVar);
                            rry rryVar2 = new rry(defpackage.abja.aN);
                            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                rsfVar2 = new rse(2132017862, (java.lang.Object) null);
                            } else {
                                java.lang.String string5 = this.e.getResources().getString(2132017862);
                                aooh.e(string5, "getString(...)");
                                rsfVar2 = new rsf(string5);
                            }
                            rrx rrxVar2 = new rrx(rsfVar2);
                            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                rsfVar3 = new rse(2132017860, (java.lang.Object) null);
                            } else {
                                java.lang.String string6 = this.e.getResources().getString(2132017860);
                                aooh.e(string6, "getString(...)");
                                rsfVar3 = new rsf(string6);
                            }
                            rshVar = new rsh(rspVar2, rryVar2, rrxVar2, new rsa(rsfVar3, new defpackage.mtr(this, i4)));
                        }
                    }
                }
            }
            return rshVar;
        }
        d.b().l("com/android/dialer/dobby/impl/growthkit/DobbyUpsellMediumToMaxHomepageMarquee", "getMarqueeUiModel", 54, "DobbyUpsellMediumToMaxHomepageMarquee.kt").v("AAPM is enabled, inhibit promotion");
        return null;
    }

    public final void g() {
        this.c.o(rmx.kM);
    }

    public final /* synthetic */ void f() {
    }
}
