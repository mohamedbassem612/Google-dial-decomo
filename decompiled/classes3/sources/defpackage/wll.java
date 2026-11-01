package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wll {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/service/XatuPreconditions");
    public final android.view.accessibility.AccessibilityManager b;
    public final java.lang.String c;
    public final defpackage.whs d;
    public final defpackage.wjo e;
    public final defpackage.wpx f;
    public final defpackage.pqo g;
    public final zpm h;
    public final defpackage.afpl i;
    private final aoss j;
    private final defpackage.wmy k;
    private final aoin l;

    public wll(android.view.accessibility.AccessibilityManager accessibilityManager, defpackage.pqo pqoVar, java.lang.String str, zpm zpmVar, defpackage.afpl afplVar, aoss aossVar, defpackage.whs whsVar, defpackage.wjo wjoVar, defpackage.wpx wpxVar, defpackage.wmy wmyVar, aoin aoinVar) {
        aooh.f(pqoVar, "callDirection");
        aooh.f(str, "callId");
        aooh.f(zpmVar, "callScopes");
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(whsVar, "xatuLoggingCoordinator");
        aooh.f(wjoVar, "xatuPipelineRunner");
        aooh.f(wmyVar, "xatuSupportedNumber");
        aooh.f(aoinVar, "disableHedwig");
        this.b = accessibilityManager;
        this.g = pqoVar;
        this.c = str;
        this.h = zpmVar;
        this.i = afplVar;
        this.j = aossVar;
        this.d = whsVar;
        this.e = wjoVar;
        this.f = wpxVar;
        this.k = wmyVar;
        this.l = aoinVar;
    }

    public final ajcq a() {
        return aosv.F(this.j, 0, new defpackage.wlh(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.wlg wlgVar, aoln aolnVar) {
        defpackage.wli wliVar;
        defpackage.wmy wmyVar;
        ajcq ajcqVarI;
        if (aolnVar instanceof defpackage.wli) {
            wliVar = (defpackage.wli) aolnVar;
            int i = wliVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wliVar.c = i - Integer.MIN_VALUE;
            } else {
                wliVar = new defpackage.wli(this, aolnVar);
            }
        } else {
            wliVar = new defpackage.wli(this, aolnVar);
        }
        java.lang.Object objD = wliVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wliVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                wmyVar = wliVar.d;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            aooh.e(objD, "await(...)");
            return objD;
        }
        aooc.af(objD);
        wmyVar = this.k;
        ajcq ajcqVarBl = wlgVar.bl();
        wliVar.d = wmyVar;
        wliVar.c = 1;
        objD = aosv.D(ajcqVarBl, wliVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        j$.util.Optional optional = (j$.util.Optional) objD;
        if (optional.isPresent()) {
            java.lang.String str = (java.lang.String) optional.orElseThrow();
            int i3 = 5;
            ajcqVarI = ahrv.g(ahvr.F(new defpackage.whv(wmyVar, str, i3), wmyVar.c)).i(new defpackage.whr(wmyVar, str, i3), wmyVar.d);
        } else {
            akzx akzxVarM = nzb.a.m();
            akzxVarM.u();
            nzb nzbVar = akzxVarM.b;
            nzbVar.b |= 1;
            nzbVar.c = false;
            akzxVarM.u();
            nzb nzbVar2 = akzxVarM.b;
            nzbVar2.d = 1004;
            nzbVar2.b |= 2;
            ajcqVarI = aiql.z(akzxVarM.p());
        }
        wliVar.d = null;
        wliVar.c = 2;
        objD = aosv.D(ajcqVarI, wliVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        aooh.e(objD, "await(...)");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.wlg wlgVar, aoln aolnVar) {
        defpackage.wlk wlkVar;
        boolean zN;
        if (aolnVar instanceof defpackage.wlk) {
            wlkVar = (defpackage.wlk) aolnVar;
            int i = wlkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wlkVar.c = i - Integer.MIN_VALUE;
            } else {
                wlkVar = new defpackage.wlk(this, aolnVar);
            }
        } else {
            wlkVar = new defpackage.wlk(this, aolnVar);
        }
        java.lang.Object objD = wlkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wlkVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            if (((java.lang.Boolean) this.l.a()).booleanValue()) {
                zN = false;
            } else {
                ajcq ajcqVarD = wlgVar.ca().d();
                wlkVar.c = 1;
                objD = aosv.D(ajcqVarD, wlkVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.valueOf(zN);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        aooh.e(objD, "await(...)");
        zN = aooh.n(aooh.q((j$.util.Optional) objD), java.lang.Boolean.TRUE);
        return java.lang.Boolean.valueOf(zN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.afpl afplVar, aoln aolnVar) {
        defpackage.wlj wljVar;
        hkl hklVarY;
        if (aolnVar instanceof defpackage.wlj) {
            wljVar = (defpackage.wlj) aolnVar;
            int i = wljVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wljVar.c = i - Integer.MIN_VALUE;
            } else {
                wljVar = new defpackage.wlj(this, aolnVar);
            }
        } else {
            wljVar = new defpackage.wlj(this, aolnVar);
        }
        java.lang.Object objD = wljVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wljVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            if (((java.lang.Boolean) this.l.a()).booleanValue()) {
                hklVarY = afplVar.Y();
            } else {
                ajcq ajcqVarX = afplVar.X();
                wljVar.c = 1;
                objD = aosv.D(ajcqVarX, wljVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            java.lang.Object objAr = aooc.ar(hklVarY, defpackage.wlg.class);
            aooh.e(objAr, "get(...)");
            return objAr;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        hklVarY = (hkl) objD;
        java.lang.Object objAr2 = aooc.ar(hklVarY, defpackage.wlg.class);
        aooh.e(objAr2, "get(...)");
        return objAr2;
    }
}
