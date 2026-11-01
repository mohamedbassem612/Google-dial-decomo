package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class umg implements ahjr {
    private static final aimz a = aimz.i("com/android/dialer/spamnotification/impl/ui/SpamNotificationReceiver");
    private final aoss b;
    private final ajcu c;
    private final rwi d;
    private final defpackage.uhp e;
    private final zjv f;
    private final jmz g;
    private final jna h;
    private final defpackage.ulh i;
    private final aogc j;

    public umg(aoss aossVar, ajcu ajcuVar, defpackage.ulh ulhVar, jna jnaVar, aogc aogcVar, rwi rwiVar, defpackage.uhp uhpVar, zjv zjvVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(rwiVar, "notificationManager");
        aooh.f(zjvVar, "externalsLogging");
        this.b = aossVar;
        this.c = ajcuVar;
        this.i = ulhVar;
        this.h = jnaVar;
        this.j = aogcVar;
        this.d = rwiVar;
        this.e = uhpVar;
        this.f = zjvVar;
        ni niVarQ = hhv.q(jmz.a.m());
        niVarQ.K();
        niVarQ.L(9);
        this.g = niVarQ.J();
    }

    public final ajcq a(android.content.Intent intent, int i) {
        java.lang.String action;
        if (intent == null || (action = intent.getAction()) == null) {
            throw new java.lang.IllegalStateException("Missing receiver action");
        }
        java.lang.Object obj = defpackage.ukv.a.get(action);
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Invalid key: ".concat(action));
        }
        defpackage.ukv ukvVar = (defpackage.ukv) obj;
        a.b().l("com/android/dialer/spamnotification/impl/ui/SpamNotificationReceiver", "onReceive", 65, "SpamNotificationReceiver.kt").y("action: %s", intent.getAction());
        defpackage.uku ukuVarS = defpackage.sns.s(intent.getExtras(), "notification_model", wsc.bP(defpackage.uku.a.m()).S());
        zjv zjvVar = this.f;
        java.lang.Class<?> cls = getClass();
        aooh.c(ukuVarS);
        kaw kawVarAQ = gus.aQ(mhc.a.m());
        kawVarAQ.N("[unique_call_id: " + ukuVarS.e + ", call_connect_time_millis: " + ukuVarS.f + ", tag: " + ukuVarS.g + ", id: " + ukuVarS.h + ", country_iso: " + ukuVarS.i + ']');
        zjvVar.d(cls, intent, ajsz.aY(kawVarAQ.L()));
        return ahvr.I(this.h.c(aosv.F(this.b, 0, new defpackage.ugg(this, ukvVar, ukuVarS, (aoln) null, 8), 3), this.j, this.g), new defpackage.udu(new ukw(3), 4), this.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object b(defpackage.ukv ukvVar, defpackage.uku ukuVar, aoln aolnVar) throws aois {
        defpackage.umf umfVar;
        defpackage.ukv ukvVar2;
        defpackage.uku ukuVar2;
        defpackage.ukv ukvVar3;
        defpackage.uku ukuVar3;
        int iOrdinal;
        java.lang.Object objAj;
        defpackage.ulh ulhVar;
        java.lang.Object objAj2;
        if (aolnVar instanceof defpackage.umf) {
            umfVar = (defpackage.umf) aolnVar;
            int i = umfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                umfVar.c = i - Integer.MIN_VALUE;
            } else {
                umfVar = new defpackage.umf(this, aolnVar);
            }
        } else {
            umfVar = new defpackage.umf(this, aolnVar);
        }
        java.lang.Object objD = umfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = umfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.uku ukuVar4 = umfVar.e;
                defpackage.ukv ukvVar4 = umfVar.d;
                aooc.af(objD);
                ukuVar2 = ukuVar4;
                ukvVar2 = ukvVar4;
            } else if (i2 == 2) {
                ukuVar3 = umfVar.e;
                ukvVar3 = umfVar.d;
                aooc.af(objD);
                java.util.Map map = defpackage.ukv.a;
                iOrdinal = ukvVar3.ordinal();
                if (iOrdinal != 0) {
                    defpackage.ulh ulhVar2 = this.i;
                    umfVar.d = null;
                    umfVar.e = null;
                    umfVar.c = 3;
                    objAj = aoov.aj(ulhVar2.b, new defpackage.ufr(ulhVar2, ukuVar3, (aoln) null, 10), umfVar);
                    if (objAj != aoluVar) {
                        objAj = aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                } else if (iOrdinal != 1) {
                    ulhVar = this.i;
                    umfVar.d = null;
                    umfVar.e = null;
                    umfVar.c = 4;
                    if (ulhVar.a(umfVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (iOrdinal == 2) {
                        throw new aois();
                    }
                    defpackage.ulh ulhVar3 = this.i;
                    java.lang.String str = ukuVar3.c;
                    aooh.e(str, "getRawNumber(...)");
                    java.lang.String str2 = ukuVar3.i;
                    aooh.e(str2, "getCountryIso(...)");
                    java.lang.String str3 = ukuVar3.e;
                    aooh.e(str3, "getUniqueCallId(...)");
                    long j = ukuVar3.f;
                    umfVar.d = null;
                    umfVar.e = null;
                    umfVar.c = 5;
                    objAj2 = aoov.aj(ulhVar3.b, new defpackage.ujn(ulhVar3, str3, j, str, str2, (aoln) null, 3), umfVar);
                    if (objAj2 != aoluVar) {
                        objAj2 = aojh.a;
                    }
                    if (objAj2 == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 3 && i2 != 4 && i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        ajcq ajcqVarB = this.e.b();
        ukvVar2 = ukvVar;
        umfVar.d = ukvVar2;
        ukuVar2 = ukuVar;
        umfVar.e = ukuVar2;
        umfVar.c = 1;
        objD = aosv.D(ajcqVarB, umfVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        java.lang.Boolean bool = (java.lang.Boolean) objD;
        if (ukvVar2 != defpackage.ukv.BLOCK_AND_REPORT_AS_SPAM || !bool.booleanValue()) {
            ajcq ajcqVarD = this.d.d(ukuVar2.g, ukuVar2.h);
            umfVar.d = ukvVar2;
            umfVar.e = ukuVar2;
            umfVar.c = 2;
            if (aosv.D(ajcqVarD, umfVar) == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.uku ukuVar5 = ukuVar2;
        ukvVar3 = ukvVar2;
        ukuVar3 = ukuVar5;
        java.util.Map map2 = defpackage.ukv.a;
        iOrdinal = ukvVar3.ordinal();
        if (iOrdinal != 0) {
            defpackage.ulh ulhVar4 = this.i;
            umfVar.d = null;
            umfVar.e = null;
            umfVar.c = 3;
            objAj = aoov.aj(ulhVar4.b, new defpackage.ufr(ulhVar4, ukuVar3, (aoln) null, 10), umfVar);
            if (objAj != aoluVar) {
                objAj = aojh.a;
            }
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else if (iOrdinal != 1) {
            ulhVar = this.i;
            umfVar.d = null;
            umfVar.e = null;
            umfVar.c = 4;
            if (ulhVar.a(umfVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (iOrdinal == 2) {
                throw new aois();
            }
            defpackage.ulh ulhVar5 = this.i;
            java.lang.String str4 = ukuVar3.c;
            aooh.e(str4, "getRawNumber(...)");
            java.lang.String str5 = ukuVar3.i;
            aooh.e(str5, "getCountryIso(...)");
            java.lang.String str6 = ukuVar3.e;
            aooh.e(str6, "getUniqueCallId(...)");
            long j2 = ukuVar3.f;
            umfVar.d = null;
            umfVar.e = null;
            umfVar.c = 5;
            objAj2 = aoov.aj(ulhVar5.b, new defpackage.ujn(ulhVar5, str6, j2, str4, str5, (aoln) null, 3), umfVar);
            if (objAj2 != aoluVar) {
                objAj2 = aojh.a;
            }
            if (objAj2 == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
