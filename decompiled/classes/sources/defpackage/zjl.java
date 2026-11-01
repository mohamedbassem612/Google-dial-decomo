package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zjl {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/emergencycallback/RecentEmergencyCallIdentifier");
    public final defpackage.ecx b;
    public final defpackage.aoss c;
    public final defpackage.zzx d;
    private final defpackage.aoin e;

    public zjl(defpackage.aazc aazcVar, defpackage.ecx ecxVar, defpackage.zzx zzxVar, defpackage.aoin aoinVar, defpackage.aoss aossVar) {
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (ecxVar == null) {
            defpackage.aooh.i("lastEmergencyCallTimeDataStore");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("recentEmergencyCallWindowMillis");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = ecxVar;
        this.d = zzxVar;
        this.e = aoinVar;
        this.c = aossVar;
    }

    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.c, 0, new defpackage.unj(this, (defpackage.aoln) null, 9), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.zjj zjjVar;
        if (aolnVar instanceof defpackage.zjj) {
            zjjVar = (defpackage.zjj) aolnVar;
            int i = zjjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zjjVar.c = i - Integer.MIN_VALUE;
            } else {
                zjjVar = new defpackage.zjj(this, aolnVar);
            }
        } else {
            zjjVar = new defpackage.zjj(this, aolnVar);
        }
        java.lang.Object objAu = zjjVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zjjVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objAu);
                if (this.d.m()) {
                    ((defpackage.aimw) a.b().l("com/google/android/dialershared/emergencycallback/RecentEmergencyCallIdentifier", "getLastEmergencyCallTimeMillis", 93, "RecentEmergencyCallIdentifier.kt")).v("Cannot retrieve since this value is not in device-encrypted storage.");
                    return null;
                }
                defpackage.aoxh aoxhVarB = this.b.b();
                zjjVar.c = 1;
                objAu = defpackage.aoov.au(aoxhVarB, zjjVar);
                if (objAu == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAu);
            }
            return new java.lang.Long(((defpackage.zji) objAu).c);
        } catch (java.util.concurrent.ExecutionException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e).l("com/google/android/dialershared/emergencycallback/RecentEmergencyCallIdentifier", "getLastEmergencyCallTimeMillis", 103, "RecentEmergencyCallIdentifier.kt")).v("Failed to get last emergency call time");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean, int] */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        defpackage.zjk zjkVar;
        if (aolnVar instanceof defpackage.zjk) {
            zjkVar = (defpackage.zjk) aolnVar;
            int i = zjkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zjkVar.c = i - Integer.MIN_VALUE;
            } else {
                zjkVar = new defpackage.zjk(this, aolnVar);
            }
        } else {
            zjkVar = new defpackage.zjk(this, aolnVar);
        }
        java.lang.Object objB = zjkVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = zjkVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            zjkVar.c = 1;
            objB = b(zjkVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        java.lang.Long l = (java.lang.Long) objB;
        if (l == null || l.longValue() == 0) {
            ((defpackage.aimw) a.b().l("com/google/android/dialershared/emergencycallback/RecentEmergencyCallIdentifier", "hasRecentEmergencyCall", 64, "RecentEmergencyCallIdentifier.kt")).v("Last emergency call time not available. Not an emergency callback.");
            return java.lang.Boolean.FALSE;
        }
        long epochMilli = j$.time.Instant.now().toEpochMilli() - l.longValue();
        long jLongValue = ((java.lang.Number) this.e.a()).longValue();
        defpackage.aimw aimwVar = (defpackage.aimw) a.b().l("com/google/android/dialershared/emergencycallback/RecentEmergencyCallIdentifier", "hasRecentEmergencyCall", 75, "RecentEmergencyCallIdentifier.kt");
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf((boolean) ((epochMilli > jLongValue ? 1 : (epochMilli == jLongValue ? 0 : -1)) >>> 31));
        aimwVar.y("Has recent emergency call due to being within window: %b", boolValueOf);
        return boolValueOf;
    }
}
