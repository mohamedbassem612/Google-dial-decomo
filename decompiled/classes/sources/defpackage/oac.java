package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oac {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/emergencycalling/calllocation/service/EmergencyLocationUpdater");
    public final defpackage.aanj b;
    public final defpackage.jxo c;
    public final defpackage.rlv d;
    public final defpackage.aoss e;
    public final defpackage.zjv f;
    public nzz g;
    public final defpackage.zof h;
    public final defpackage.zpm i;
    public final defpackage.apdp j;
    public final defpackage.gpd k;
    private final defpackage.ajct l;
    private final defpackage.aoin m;
    private final defpackage.aoin n;
    private final defpackage.aoin o;
    private final defpackage.aoin p;
    private final defpackage.zrw q;

    public oac(defpackage.aanj aanjVar, defpackage.ajct ajctVar, defpackage.jxo jxoVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.zpm zpmVar, defpackage.gpd gpdVar, defpackage.zrw zrwVar, defpackage.rlv rlvVar, defpackage.aoss aossVar, defpackage.zjv zjvVar) {
        defpackage.aooh.f(aanjVar, "fusedLocationProviderClient");
        defpackage.aooh.f(ajctVar, "lightweightExecutor");
        defpackage.aooh.f(aoinVar, "locationQueryIntervalMillis");
        defpackage.aooh.f(aoinVar2, "locationQueryOldestUpdateAgeMillis");
        defpackage.aooh.f(aoinVar3, "enableLocationQueryOldestUpdateAgeMillisV2");
        defpackage.aooh.f(aoinVar4, "locationQueryOldestUpdateAgeMillisV2");
        defpackage.aooh.f(zpmVar, "callScopes");
        defpackage.aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(zjvVar, "externalsLogging");
        this.b = aanjVar;
        this.l = ajctVar;
        this.c = jxoVar;
        this.m = aoinVar;
        this.n = aoinVar2;
        this.o = aoinVar3;
        this.p = aoinVar4;
        this.i = zpmVar;
        this.k = gpdVar;
        this.q = zrwVar;
        this.d = rlvVar;
        this.e = aossVar;
        this.f = zjvVar;
        this.j = new defpackage.apdp();
        this.h = new nzx(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        oaa oaaVar;
        if (aolnVar instanceof oaa) {
            oaaVar = (oaa) aolnVar;
            int i = oaaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oaaVar.c = i - Integer.MIN_VALUE;
            } else {
                oaaVar = new oaa(this, aolnVar);
            }
        } else {
            oaaVar = new oaa(this, aolnVar);
        }
        java.lang.Object objN = oaaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = oaaVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objN);
            defpackage.zrw zrwVar = this.q;
            oaaVar.c = 1;
            objN = zrwVar.n(oaaVar);
            if (objN == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    defpackage.aooc.af(objN);
                    if (!((java.lang.Boolean) objN).booleanValue()) {
                        this.d.o(defpackage.rmx.EMERGENCY_NO_LOCATION_BYPASS_PERMISSION);
                        return defpackage.aojh.a;
                    }
                    return defpackage.aojh.a;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objN);
                if (!((java.lang.Boolean) objN).booleanValue()) {
                    this.d.o(defpackage.rmx.EMERGENCY_NO_WRITE_SECURE_SETTINGS_PERMISSION);
                    return defpackage.aojh.a;
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(objN);
        }
        if (!((java.lang.Boolean) objN).booleanValue()) {
            this.d.o(defpackage.rmx.EMERGENCY_NO_FINE_LOCATION_PERMISSION);
            return defpackage.aojh.a;
        }
        int i3 = android.os.Build.VERSION.SDK_INT;
        defpackage.zrw zrwVar2 = this.q;
        if (i3 >= 33) {
            oaaVar.c = 2;
            objN = zrwVar2.o(oaaVar);
            if (objN == aoluVar) {
                return aoluVar;
            }
            if (!((java.lang.Boolean) objN).booleanValue()) {
                this.d.o(defpackage.rmx.EMERGENCY_NO_LOCATION_BYPASS_PERMISSION);
                return defpackage.aojh.a;
            }
            return defpackage.aojh.a;
        }
        oaaVar.c = 3;
        objN = zrwVar2.z(oaaVar);
        if (objN == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objN).booleanValue()) {
            this.d.o(defpackage.rmx.EMERGENCY_NO_WRITE_SECURE_SETTINGS_PERMISSION);
            return defpackage.aojh.a;
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bf A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:13:0x002c, B:35:0x00b1, B:37:0x00bf, B:39:0x00d0, B:38:0x00c8, B:21:0x0056, B:23:0x0071, B:26:0x0077, B:29:0x0094, B:33:0x00a5, B:30:0x009a, B:31:0x009f, B:32:0x00a0), top: B:45:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:13:0x002c, B:35:0x00b1, B:37:0x00bf, B:39:0x00d0, B:38:0x00c8, B:21:0x0056, B:23:0x0071, B:26:0x0077, B:29:0x0094, B:33:0x00a5, B:30:0x009a, B:31:0x009f, B:32:0x00a0), top: B:45:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object b(nzo nzoVar, defpackage.aoln aolnVar) {
        oab oabVar;
        nzo nzoVar2;
        defpackage.apdp apdpVar;
        java.lang.Long l;
        if (aolnVar instanceof oab) {
            oabVar = (oab) aolnVar;
            int i = oabVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oabVar.d = i - Integer.MIN_VALUE;
            } else {
                oabVar = new oab(this, aolnVar);
            }
        } else {
            oabVar = new oab(this, aolnVar);
        }
        java.lang.Object obj = oabVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = oabVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    apdpVar = oabVar.e;
                    nzoVar2 = (nzo) oabVar.a;
                    defpackage.aooc.af(obj);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar = (defpackage.apdp) oabVar.a;
                    defpackage.aooc.af(obj);
                }
                if (((java.lang.Boolean) this.o.a()).booleanValue()) {
                    l = (java.lang.Long) this.p.a();
                } else {
                    l = (java.lang.Long) this.n.a();
                }
                java.lang.Object objA = this.m.a();
                defpackage.aooh.e(objA, "get(...)");
                aanp aanpVar = new aanp(((java.lang.Number) objA).longValue());
                aanpVar.d(100);
                defpackage.aooh.c(l);
                aanpVar.c(l.longValue());
                aanpVar.a = false;
                aanpVar.b = true;
                defpackage.aaum aaumVarA = this.b.a(aanpVar.a(), this.l, this.g);
                aaumVarA.a(new riw(new npi(this, 6), 1));
                aaumVarA.q(new rix(this, 1));
                defpackage.zjv.i(this.f, defpackage.mgv.FUSED_LOCATION_PROVIDER_CLIENT_REQUEST_LOCATION_UPDATES, null, null, 0, 30);
                apdpVar.d();
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj);
            defpackage.apdp apdpVar2 = this.j;
            oabVar.a = nzoVar;
            oabVar.e = apdpVar2;
            oabVar.d = 1;
            if (apdpVar2.b(oabVar) == aoluVar) {
                return aoluVar;
            }
            nzoVar2 = nzoVar;
            apdpVar = apdpVar2;
            ((defpackage.aimw) a.b().l("com/android/dialer/emergencycalling/calllocation/service/EmergencyLocationUpdater", "requestLocationUpdates$<anonymous>", 93, "EmergencyLocationUpdater.kt")).v("enter");
            if (this.g != null) {
                defpackage.aojh aojhVar = defpackage.aojh.a;
                apdpVar.d();
                return aojhVar;
            }
            this.g = new nzz(this);
            this.d.o(defpackage.rmx.EMERGENCY_ATTEMPTED_LOCATION_REQUEST);
            defpackage.zas zasVarI = this.k.i(null);
            int iOrdinal = nzoVar2.ordinal();
            if (iOrdinal == 0) {
                zasVarI.b(defpackage.mce.EMERGENCY_CALL_ATTEMPTED_LOCATION_REQUEST);
            } else {
                if (iOrdinal != 1) {
                    throw new defpackage.aois();
                }
                zasVarI.b(defpackage.mce.EMERGENCY_CALLBACK_ATTEMPTED_LOCATION_REQUEST);
            }
            oabVar.a = apdpVar;
            oabVar.e = null;
            oabVar.d = 2;
            if (a(oabVar) == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) this.o.a()).booleanValue()) {
                l = (java.lang.Long) this.p.a();
            } else {
                l = (java.lang.Long) this.n.a();
            }
            java.lang.Object objA2 = this.m.a();
            defpackage.aooh.e(objA2, "get(...)");
            aanp aanpVar2 = new aanp(((java.lang.Number) objA2).longValue());
            aanpVar2.d(100);
            defpackage.aooh.c(l);
            aanpVar2.c(l.longValue());
            aanpVar2.a = false;
            aanpVar2.b = true;
            defpackage.aaum aaumVarA2 = this.b.a(aanpVar2.a(), this.l, this.g);
            aaumVarA2.a(new riw(new npi(this, 6), 1));
            aaumVarA2.q(new rix(this, 1));
            defpackage.zjv.i(this.f, defpackage.mgv.FUSED_LOCATION_PROVIDER_CLIENT_REQUEST_LOCATION_UPDATES, null, null, 0, 30);
            apdpVar.d();
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            nzoVar.d();
            throw th;
        }
    }
}
