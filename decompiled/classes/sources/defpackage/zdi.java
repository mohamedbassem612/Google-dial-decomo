package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zdi {
    private final j$.util.Optional c;
    private final defpackage.aoss d;
    private final defpackage.aeuo e;
    private final defpackage.abce f;
    private static final defpackage.aimz b = defpackage.aimz.i("com/google/android/callingshared/logging/consent/impl/LoggingConsentCheckerImpl");
    public static final defpackage.aenj a = new defpackage.aenj("LoggingConsentChecker.getConsent");

    public zdi(j$.util.Optional optional, defpackage.abce abceVar, defpackage.aoss aossVar) {
        if (abceVar == null) {
            defpackage.aooh.i("usageReportingClient");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.c = optional;
        this.f = abceVar;
        this.d = aossVar;
        this.e = (defpackage.aeuo) optional.orElse((java.lang.Object) null);
    }

    private final void e(defpackage.aeun aeunVar, int i) {
        defpackage.aeuo aeuoVar = this.e;
        if (aeuoVar != null) {
            aeuoVar.d(aeunVar, a, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[Catch: Exception -> 0x009b, TryCatch #1 {Exception -> 0x009b, blocks: (B:12:0x002a, B:23:0x0056, B:25:0x0060, B:29:0x0068, B:32:0x0084, B:34:0x008d, B:36:0x0093, B:37:0x009a), top: B:52:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[Catch: Exception -> 0x009b, TryCatch #1 {Exception -> 0x009b, blocks: (B:12:0x002a, B:23:0x0056, B:25:0x0060, B:29:0x0068, B:32:0x0084, B:34:0x008d, B:36:0x0093, B:37:0x009a), top: B:52:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[Catch: Exception -> 0x009b, TryCatch #1 {Exception -> 0x009b, blocks: (B:12:0x002a, B:23:0x0056, B:25:0x0060, B:29:0x0068, B:32:0x0084, B:34:0x008d, B:36:0x0093, B:37:0x009a), top: B:52:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        defpackage.zdf zdfVar;
        defpackage.aeun aeunVar;
        java.lang.Exception e;
        boolean z;
        defpackage.aimz aimzVar;
        com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions;
        boolean z2;
        if (aolnVar instanceof defpackage.zdf) {
            zdfVar = (defpackage.zdf) aolnVar;
            int i = zdfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdfVar.c = i - Integer.MIN_VALUE;
            } else {
                zdfVar = new defpackage.zdf(this, aolnVar);
            }
        } else {
            zdfVar = new defpackage.zdf(this, aolnVar);
        }
        java.lang.Object obj = zdfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zdfVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aeunVar = zdfVar.d;
            try {
                defpackage.aooc.af(obj);
                usageReportingOptInOptions = ((defpackage.aavp) ((defpackage.aiyy) obj).a).a;
                if (usageReportingOptInOptions != null) {
                    throw new java.lang.NullPointerException("null reference");
                }
                if (usageReportingOptInOptions.a == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                boolValueOf.getClass();
                ((defpackage.aimw) b.b().l("com/google/android/callingshared/logging/consent/impl/LoggingConsentCheckerImpl", "getConsent$<anonymous>", 73, "LoggingConsentCheckerImpl.kt")).y("timer stop with success, timer present: %s", java.lang.Boolean.valueOf(aeunVar != null));
                if (aeunVar != null) {
                    e(aeunVar, 2);
                }
                return boolValueOf;
            } catch (java.lang.Exception e2) {
                e = e2;
                z = e instanceof defpackage.aacw;
                aimzVar = b;
                if (z) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).k(e).l("com/google/android/callingshared/logging/consent/impl/LoggingConsentCheckerImpl", "getConsent", 86, "LoggingConsentCheckerImpl.kt")).y("Fetching usage reporting opt-in failed due to GMS API exception: %s", e.getMessage());
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).k(e).l("com/google/android/callingshared/logging/consent/impl/LoggingConsentCheckerImpl", "getConsent", 91, "LoggingConsentCheckerImpl.kt")).y("Fetching usage reporting opt-in failed: %s", e.getMessage());
                }
                if (aeunVar != null) {
                    e(aeunVar, 3);
                }
                return null;
            }
        }
        defpackage.aooc.af(obj);
        defpackage.aeuo aeuoVar = this.e;
        defpackage.aeun aeunVarA = aeuoVar != null ? aeuoVar.a() : null;
        try {
            defpackage.aaum aaumVarC = this.f.c();
            zdfVar.d = aeunVarA;
            zdfVar.c = 1;
            java.lang.Object objY = defpackage.aooh.Y(aaumVarC, zdfVar);
            if (objY == aoluVar) {
                return aoluVar;
            }
            aeunVar = aeunVarA;
            obj = objY;
            usageReportingOptInOptions = ((defpackage.aavp) ((defpackage.aiyy) obj).a).a;
            if (usageReportingOptInOptions != null) {
                throw new java.lang.NullPointerException("null reference");
            }
            if (usageReportingOptInOptions.a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z2);
            boolValueOf2.getClass();
            ((defpackage.aimw) b.b().l("com/google/android/callingshared/logging/consent/impl/LoggingConsentCheckerImpl", "getConsent$<anonymous>", 73, "LoggingConsentCheckerImpl.kt")).y("timer stop with success, timer present: %s", java.lang.Boolean.valueOf(aeunVar != null));
            if (aeunVar != null) {
                e(aeunVar, 2);
            }
            return boolValueOf2;
        } catch (java.lang.Exception e3) {
            aeunVar = aeunVarA;
            e = e3;
            z = e instanceof defpackage.aacw;
            aimzVar = b;
            if (z) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).k(e).l("com/google/android/callingshared/logging/consent/impl/LoggingConsentCheckerImpl", "getConsent", 86, "LoggingConsentCheckerImpl.kt")).y("Fetching usage reporting opt-in failed due to GMS API exception: %s", e.getMessage());
            } else {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).k(e).l("com/google/android/callingshared/logging/consent/impl/LoggingConsentCheckerImpl", "getConsent", 91, "LoggingConsentCheckerImpl.kt")).y("Fetching usage reporting opt-in failed: %s", e.getMessage());
            }
            if (aeunVar != null) {
                e(aeunVar, 3);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r5
      0x0052: PHI (r5v1 zzc) = (r5v0 zzc), (r5v2 zzc) binds: [B:15:0x003e, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.zzc zzcVar, defpackage.aoln aolnVar) {
        defpackage.zdg zdgVar;
        if (aolnVar instanceof defpackage.zdg) {
            zdgVar = (defpackage.zdg) aolnVar;
            int i = zdgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdgVar.c = i - Integer.MIN_VALUE;
            } else {
                zdgVar = new defpackage.zdg(this, aolnVar);
            }
        } else {
            zdgVar = new defpackage.zdg(this, aolnVar);
        }
        java.lang.Object objC = zdgVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = zdgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            java.util.Set set = defpackage.zdj.a;
            if (defpackage.zdj.a.contains(zzcVar.j)) {
                zzcVar.d();
            } else {
                zdgVar.d = zzcVar;
                zdgVar.c = 1;
                objC = c(zdgVar);
                if (objC == obj) {
                    return obj;
                }
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zzcVar = zdgVar.d;
        defpackage.aooc.af(objC);
        if (((java.lang.Boolean) objC).booleanValue()) {
            zzcVar.d();
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        defpackage.zdh zdhVar;
        if (aolnVar instanceof defpackage.zdh) {
            zdhVar = (defpackage.zdh) aolnVar;
            int i = zdhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdhVar.c = i - Integer.MIN_VALUE;
            } else {
                zdhVar = new defpackage.zdh(this, aolnVar);
            }
        } else {
            zdhVar = new defpackage.zdh(this, aolnVar);
        }
        java.lang.Object objA = zdhVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = zdhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            zdhVar.c = 1;
            objA = a(zdhVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objA;
        return java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    public final void d(defpackage.zzc zzcVar) {
        try {
            defpackage.aoov.an(this.d, null, 0, new defpackage.aeef(this, zzcVar, (defpackage.aoln) null, 1), 3);
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) b.c()).k(e).l("com/google/android/callingshared/logging/consent/impl/LoggingConsentCheckerImpl", "logIfAllowedAsync", 56, "LoggingConsentCheckerImpl.kt")).v("Failed to check consent or log to Clearcut");
        }
    }
}
