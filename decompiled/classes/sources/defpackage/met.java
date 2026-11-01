package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class met {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/darpa/impl/DarpaImpl");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final defpackage.aoss d;
    private final defpackage.aolr e;
    private final defpackage.rlv f;
    private final defpackage.rvw g;
    private final defpackage.zzx h;
    private final defpackage.kaw i;

    public met(android.content.Context context, defpackage.kaw kawVar, defpackage.zzx zzxVar, defpackage.ajct ajctVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.rlv rlvVar, defpackage.rvw rvwVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingbindings");
        }
        this.b = context;
        this.i = kawVar;
        this.h = zzxVar;
        this.c = ajctVar;
        this.d = aossVar;
        this.e = aolrVar;
        this.f = rlvVar;
        this.g = rvwVar;
    }

    public final android.content.Intent a() {
        android.content.Context context = this.b;
        defpackage.aooh.f(context, "context");
        android.content.Intent flags = new android.content.Intent().setClassName("com.google.android.gms", "com.google.android.gms.advancedprotection.ui.AdvancedProtectionDialogActivity").setAction("com.google.android.gms.settings.ADVANCED_PROTECTION_DIALOG").setFlags(268435456);
        defpackage.aooh.e(flags, "setFlags(...)");
        if (context.getPackageManager().resolveActivity(flags, 0) == null) {
            return null;
        }
        return flags;
    }

    public final android.content.Intent b() {
        android.content.Context context = this.b;
        defpackage.aooh.f(context, "context");
        android.content.Intent flags = new android.content.Intent().setClassName("com.google.android.gms", "com.google.android.gms.advancedprotection.ui.AdvancedProtectionSettingsActivity").setAction("com.google.android.gms.settings.ADVANCED_PROTECTION").setFlags(268435456);
        defpackage.aooh.e(flags, "setFlags(...)");
        if (context.getPackageManager().resolveActivity(flags, 0) == null) {
            return null;
        }
        return flags;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        defpackage.mep mepVar;
        if (aolnVar instanceof defpackage.mep) {
            mepVar = (defpackage.mep) aolnVar;
            int i = mepVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mepVar.c = i - Integer.MIN_VALUE;
            } else {
                mepVar = new defpackage.mep(this, aolnVar);
            }
        } else {
            mepVar = new defpackage.mep(this, aolnVar);
        }
        java.lang.Object objS = mepVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mepVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objS);
            defpackage.kaw kawVar = this.i;
            mepVar.c = 1;
            objS = kawVar.S(mepVar);
            if (objS == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objS);
        }
        return java.lang.Boolean.valueOf(((defpackage.mfd) objS).b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        meq meqVar;
        boolean z;
        if (aolnVar instanceof meq) {
            meqVar = (meq) aolnVar;
            int i = meqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                meqVar.d = i - Integer.MIN_VALUE;
            } else {
                meqVar = new meq(this, aolnVar);
            }
        } else {
            meqVar = new meq(this, aolnVar);
        }
        java.lang.Object obj = meqVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = meqVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            android.security.advancedprotection.AdvancedProtectionManager advancedProtectionManagerM = a$.ExternalSyntheticApiModelOutline0.m(this.b.getSystemService(a$.ExternalSyntheticApiModelOutline0.m()));
            if (advancedProtectionManagerM == null) {
                ((defpackage.aimw) a.d().l("com/android/dialer/darpa/impl/DarpaImpl", "getIsAapmEnabledFresh", 56, "DarpaImpl.kt")).v("AdvancedProtectionManager is not available on this platform");
                return java.lang.Boolean.FALSE;
            }
            boolean zM = a$.ExternalSyntheticApiModelOutline0.m(advancedProtectionManagerM);
            meqVar.a = zM;
            meqVar.d = 1;
            if (e(zM, meqVar) == aoluVar) {
                return aoluVar;
            }
            z = zM;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = meqVar.a;
            defpackage.aooc.af(obj);
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:25:0x00a5->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final java.lang.Object e(boolean z, defpackage.aoln aolnVar) {
        mer merVar;
        ?? it;
        defpackage.rlv rlvVar;
        meh mehVar;
        if (aolnVar instanceof mer) {
            merVar = (mer) aolnVar;
            int i = merVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                merVar.e = i - Integer.MIN_VALUE;
            } else {
                merVar = new mer(this, aolnVar);
            }
        } else {
            merVar = new mer(this, aolnVar);
        }
        java.lang.Object objS = merVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = merVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                z = merVar.a;
                defpackage.aooc.af(objS);
            } else if (i2 == 2) {
                z = merVar.a;
                defpackage.aooc.af(objS);
                defpackage.aihd aihdVarE = this.h.e();
                defpackage.aooh.e(aihdVarE, "get(...)");
                it = aihdVarE.iterator();
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = merVar.a;
                java.lang.Object obj = merVar.b;
                defpackage.aooc.af(objS);
                it = obj;
            }
            while (it.hasNext()) {
                mehVar = (meh) it.next();
                merVar.b = it;
                merVar.a = z;
                merVar.e = 3;
                if (mehVar.c(z, merVar) == aoluVar) {
                    return aoluVar;
                }
            }
            this.g.e.s(defpackage.ajcm.a, defpackage.rvw.a);
            rlvVar = this.f;
            if (z) {
                rlvVar.o(defpackage.rmx.DARPA_CALLBACKS_TRIGGERED_BY_AAPM_ENABLED);
            } else {
                rlvVar.o(defpackage.rmx.DARPA_CALLBACKS_TRIGGERED_BY_AAPM_DISABLED);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objS);
        ((defpackage.aimw) a.b().l("com/android/dialer/darpa/impl/DarpaImpl", "onAapmChanged", 89, "DarpaImpl.kt")).y("Android Advanced Protection Mode enabled is %b", java.lang.Boolean.valueOf(z));
        defpackage.kaw kawVar = this.i;
        merVar.a = z;
        merVar.e = 1;
        objS = kawVar.S(merVar);
        if (objS == aoluVar) {
            return aoluVar;
        }
        if (((defpackage.mfd) objS).b != z) {
            ((defpackage.aimw) a.b().l("com/android/dialer/darpa/impl/DarpaImpl", "onAapmChanged", 94, "DarpaImpl.kt")).v("cached data is different from latest value");
            defpackage.kaw kawVar2 = this.i;
            merVar.a = z;
            merVar.e = 2;
            if (kawVar2.T(z, merVar) == aoluVar) {
                return aoluVar;
            }
            defpackage.aihd aihdVarE2 = this.h.e();
            defpackage.aooh.e(aihdVarE2, "get(...)");
            it = aihdVarE2.iterator();
            while (it.hasNext()) {
                mehVar = (meh) it.next();
                merVar.b = it;
                merVar.a = z;
                merVar.e = 3;
                if (mehVar.c(z, merVar) == aoluVar) {
                    return aoluVar;
                }
            }
            this.g.e.s(defpackage.ajcm.a, defpackage.rvw.a);
            rlvVar = this.f;
            if (z) {
                rlvVar.o(defpackage.rmx.DARPA_CALLBACKS_TRIGGERED_BY_AAPM_ENABLED);
            } else {
                rlvVar.o(defpackage.rmx.DARPA_CALLBACKS_TRIGGERED_BY_AAPM_DISABLED);
            }
        }
        return defpackage.aojh.a;
    }

    public final java.lang.Object f(defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.e, new mhq(this, (defpackage.aoln) null, 1), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }
}
