package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rpj {
    private static final defpackage.aimz g = defpackage.aimz.i("com/android/dialer/main/impl/service/MainFragmentDataService");
    public final defpackage.rpa a;
    public final defpackage.aoss b;
    public final defpackage.zzx c;
    public final defpackage.zzx d;
    public final defpackage.zzx e;
    public final defpackage.agab f;
    private final defpackage.aoss h;
    private final defpackage.aogc i;
    private final defpackage.apni j;

    public rpj(defpackage.zzx zzxVar, defpackage.zzx zzxVar2, defpackage.rpa rpaVar, defpackage.aogc aogcVar, defpackage.agab agabVar, defpackage.apni apniVar, defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.zzx zzxVar3) {
        if (rpaVar == null) {
            defpackage.aooh.i("mainActivityRetainedStateController");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("resultPropagator");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.d = zzxVar;
        this.e = zzxVar2;
        this.a = rpaVar;
        this.i = aogcVar;
        this.f = agabVar;
        this.j = apniVar;
        this.b = aossVar;
        this.h = aossVar2;
        this.c = zzxVar3;
    }

    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.b, 0, new roy(this, (defpackage.aoln) null, 2), 3);
    }

    public final defpackage.ajcq b(defpackage.roc rocVar) {
        ((defpackage.aimw) g.b().l("com/android/dialer/main/impl/service/MainFragmentDataService", "selectTab", 162, "MainFragmentDataService.kt")).y("selected tab %s", rocVar);
        defpackage.ajcq ajcqVarF = defpackage.aosv.F(this.b, 0, new rka(this, rocVar, (defpackage.aoln) null, 3), 3);
        this.i.s(ajcqVarF, defpackage.rpl.a);
        return ajcqVarF;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[PHI: r6
      0x0062: PHI (r6v1 roc) = (r6v0 roc), (r6v0 roc), (r6v5 roc) binds: [B:17:0x0047, B:19:0x004f, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.roc rocVar, defpackage.aoln aolnVar) {
        defpackage.rpg rpgVar;
        defpackage.rnv rnvVar;
        boolean z;
        defpackage.ajcq ajcqVarB;
        if (aolnVar instanceof defpackage.rpg) {
            rpgVar = (defpackage.rpg) aolnVar;
            int i = rpgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rpgVar.c = i - Integer.MIN_VALUE;
            } else {
                rpgVar = new defpackage.rpg(this, aolnVar);
            }
        } else {
            rpgVar = new defpackage.rpg(this, aolnVar);
        }
        java.lang.Object objB = rpgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = rpgVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                rocVar = rpgVar.d;
                defpackage.aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objB);
            }
            return defpackage.roc.CALL_LOG_TAB_KEY;
        }
        defpackage.aooc.af(objB);
        defpackage.aoin aoinVar = (defpackage.aoin) this.d.k().get(rocVar);
        if (aoinVar == null || (rnvVar = (defpackage.rnv) aoinVar.a()) == null) {
            z = false;
        } else {
            rpgVar.d = rocVar;
            rpgVar.c = 1;
            objB = rnvVar.b(rpgVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        }
        if (!z) {
            return rocVar;
        }
        ajcqVarB = b(defpackage.roc.CALL_LOG_TAB_KEY);
        rpgVar.d = null;
        rpgVar.c = 2;
        if (defpackage.aosv.D(ajcqVarB, rpgVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.roc.CALL_LOG_TAB_KEY;
        defpackage.rob robVar = (defpackage.rob) objB;
        if (robVar != null) {
            z = robVar.d;
        } else {
            z = false;
        }
        if (!z) {
            return rocVar;
        }
        ajcqVarB = b(defpackage.roc.CALL_LOG_TAB_KEY);
        rpgVar.d = null;
        rpgVar.c = 2;
        if (defpackage.aosv.D(ajcqVarB, rpgVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.roc.CALL_LOG_TAB_KEY;
    }

    public final void d() {
        this.j.i(defpackage.aoov.an(this.h, null, 0, new defpackage.mev(this, (defpackage.aoln) null, 15), 3));
    }

    public final void e() {
        this.j.i(defpackage.aoov.an(this.h, null, 0, new roy(this, (defpackage.aoln) null, 4, (char[]) null), 3));
    }

    public final defpackage.ajcq f(int i, java.lang.String str) {
        defpackage.aooh.f(str, "input");
        return defpackage.aosv.F(this.b, 0, new kgx(3, this, str, (defpackage.aoln) null, 5), 3);
    }
}
