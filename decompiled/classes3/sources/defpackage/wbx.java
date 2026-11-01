package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbx {
    private static final aimz a = aimz.i("com/android/dialer/wear/gnp/impl/GnpDialerWearAppStateCheckerImpl");
    private final aonj b = new aiuo(new defpackage.wbi(this, (aoln) null, 4));
    private final tvn c;

    public wbx(tvn tvnVar) {
        this.c = tvnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.wbu wbuVar;
        if (aolnVar instanceof defpackage.wbu) {
            wbuVar = (defpackage.wbu) aolnVar;
            int i = wbuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbuVar.c = i - Integer.MIN_VALUE;
            } else {
                wbuVar = new defpackage.wbu(this, aolnVar);
            }
        } else {
            wbuVar = new defpackage.wbu(this, aolnVar);
        }
        java.lang.Object objD = wbuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wbuVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.zur zurVarL = this.c.l();
            defpackage.ztw ztwVar = defpackage.ztw.e;
            akzx akzxVarM = defpackage.ztz.a.m();
            aooh.f(akzxVarM, "builder");
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            ajcq ajcqVarB = zurVarL.b(ztwVar, (defpackage.ztz) aladVarP);
            wbuVar.c = 1;
            objD = aosv.D(ajcqVarB, wbuVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        defpackage.afpl afplVar = (defpackage.afpl) objD;
        aimz aimzVar = a;
        aimw aimwVarL = aimzVar.b().l("com/android/dialer/wear/gnp/impl/GnpDialerWearAppStateCheckerImpl", "getDialerWearAppState", 53, "GnpDialerWearAppStateCheckerImpl.kt");
        java.lang.Object obj = afplVar.a;
        aimwVarL.y("SentStatus: %s", obj);
        if (obj == defpackage.zul.a) {
            java.lang.Object obj2 = afplVar.b;
            aooh.e(obj2, "getResponseData(...)");
            defpackage.zua zuaVar = (defpackage.zua) aooh.q((j$.util.Optional) obj2);
            if (zuaVar != null) {
                aimzVar.b().l("com/android/dialer/wear/gnp/impl/GnpDialerWearAppStateCheckerImpl", "getDialerWearAppState$<anonymous>", 58, "GnpDialerWearAppStateCheckerImpl.kt").v("Dialer Wear app state successfully received.");
                return zuaVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.ztx ztxVar, aoln aolnVar) {
        defpackage.wbv wbvVar;
        if (aolnVar instanceof defpackage.wbv) {
            wbvVar = (defpackage.wbv) aolnVar;
            int i = wbvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbvVar.c = i - Integer.MIN_VALUE;
            } else {
                wbvVar = new defpackage.wbv(this, aolnVar);
            }
        } else {
            wbvVar = new defpackage.wbv(this, aolnVar);
        }
        java.lang.Object objA = wbvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wbvVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.b;
            wbvVar.d = ztxVar;
            wbvVar.c = 1;
            objA = aonjVar.a(wbvVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ztxVar = wbvVar.d;
            aooc.af(objA);
        }
        defpackage.zua zuaVar = (defpackage.zua) objA;
        return java.lang.Boolean.valueOf(zuaVar != null ? new alam(zuaVar.e, defpackage.zua.b).contains(ztxVar) : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.zty ztyVar, aoln aolnVar) {
        defpackage.wbw wbwVar;
        if (aolnVar instanceof defpackage.wbw) {
            wbwVar = (defpackage.wbw) aolnVar;
            int i = wbwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbwVar.c = i - Integer.MIN_VALUE;
            } else {
                wbwVar = new defpackage.wbw(this, aolnVar);
            }
        } else {
            wbwVar = new defpackage.wbw(this, aolnVar);
        }
        java.lang.Object objA = wbwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wbwVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.b;
            wbwVar.d = ztyVar;
            wbwVar.c = 1;
            objA = aonjVar.a(wbwVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ztyVar = wbwVar.d;
            aooc.af(objA);
        }
        defpackage.zua zuaVar = (defpackage.zua) objA;
        return java.lang.Boolean.valueOf(zuaVar != null ? new alam(zuaVar.d, defpackage.zua.a).contains(ztyVar) : false);
    }
}
