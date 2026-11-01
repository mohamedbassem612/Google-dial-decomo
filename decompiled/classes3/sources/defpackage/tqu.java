package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqu implements defpackage.ywu {
    private static final aimz a = aimz.i("com/android/dialer/sharpie/impl/service/session/AudioPrismScamDetectionPreconditions");
    private final zrw b;
    private final ihr c;
    private final defpackage.uss d;

    public tqu(zrw zrwVar, defpackage.uss ussVar, ihr ihrVar) {
        aooh.f(ussVar, "sharpieAudioPrismConfigProvider");
        aooh.f(ihrVar, "audioPrismSession");
        this.b = zrwVar;
        this.d = ussVar;
        this.c = ihrVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.tqs tqsVar;
        ihr ihrVar;
        ihr ihrVar2;
        igi igiVar;
        igh ighVarB;
        int iOrdinal;
        igs igsVar;
        if (aolnVar instanceof defpackage.tqs) {
            tqsVar = (defpackage.tqs) aolnVar;
            int i = tqsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqsVar.d = i - Integer.MIN_VALUE;
            } else {
                tqsVar = new defpackage.tqs(this, aolnVar);
            }
        } else {
            tqsVar = new defpackage.tqs(this, aolnVar);
        }
        java.lang.Object objC = tqsVar.b;
        aolu aoluVar = aolu.a;
        int i2 = tqsVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = tqsVar.a;
                aooc.af(objC);
                ihrVar2 = obj;
            } else if (i2 == 2) {
                aooc.af(objC);
                igiVar = (igi) objC;
                if (!igiVar.d) {
                    return defpackage.ywv.a;
                }
                ighVarB = igh.b(igiVar.e);
                if (ighVarB == null) {
                    ighVarB = igh.h;
                }
                iOrdinal = ighVarB.ordinal();
                if (iOrdinal != 1) {
                    throw new java.lang.IllegalStateException("Error, should never fail call direction preconditions.");
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        return new defpackage.yww(defpackage.ywx.l);
                    }
                    throw new java.lang.IllegalStateException("AudioPrismPreconditions check returned unexpected failure.");
                }
                defpackage.uss ussVar = this.d;
                tqsVar.d = 3;
                objC = ussVar.c(tqsVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            igsVar = ((igf) objC).f;
            if (igsVar == null) {
                igsVar = igs.a;
            }
            java.lang.String str = igsVar.d;
            aooh.e(str, "getLocale(...)");
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/service/session/AudioPrismScamDetectionPreconditions", "audioPrismPreconditionsCheck", 55, "AudioPrismScamDetectionPreconditions.kt").y("Soda language pack for %s unavailable", str);
            return new defpackage.yww(defpackage.ywx.a);
        }
        aooc.af(objC);
        ihrVar = this.c;
        defpackage.uss ussVar2 = this.d;
        tqsVar.a = ihrVar;
        tqsVar.d = 1;
        objC = ussVar2.c(tqsVar);
        if (objC == aoluVar) {
            ihrVar2 = ihrVar;
            return aoluVar;
        }
        ihrVar2 = ihrVar;
        tqsVar.a = null;
        tqsVar.d = 2;
        objC = ihrVar2.a((igf) objC, tqsVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        igiVar = (igi) objC;
        if (!igiVar.d) {
            return defpackage.ywv.a;
        }
        ighVarB = igh.b(igiVar.e);
        if (ighVarB == null) {
            ighVarB = igh.h;
        }
        iOrdinal = ighVarB.ordinal();
        if (iOrdinal != 1) {
            throw new java.lang.IllegalStateException("Error, should never fail call direction preconditions.");
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 5) {
                return new defpackage.yww(defpackage.ywx.l);
            }
            throw new java.lang.IllegalStateException("AudioPrismPreconditions check returned unexpected failure.");
        }
        defpackage.uss ussVar3 = this.d;
        tqsVar.d = 3;
        objC = ussVar3.c(tqsVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        igsVar = ((igf) objC).f;
        if (igsVar == null) {
            igsVar = igs.a;
        }
        java.lang.String str2 = igsVar.d;
        aooh.e(str2, "getLocale(...)");
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/service/session/AudioPrismScamDetectionPreconditions", "audioPrismPreconditionsCheck", 55, "AudioPrismScamDetectionPreconditions.kt").y("Soda language pack for %s unavailable", str2);
        return new defpackage.yww(defpackage.ywx.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.tqt tqtVar;
        defpackage.ywz ywzVar;
        defpackage.ywv ywvVar;
        if (aolnVar instanceof defpackage.tqt) {
            tqtVar = (defpackage.tqt) aolnVar;
            int i = tqtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqtVar.c = i - Integer.MIN_VALUE;
            } else {
                tqtVar = new defpackage.tqt(this, aolnVar);
            }
        } else {
            tqtVar = new defpackage.tqt(this, aolnVar);
        }
        java.lang.Object objP = tqtVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tqtVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objP);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objP);
            }
            ywzVar = (defpackage.ywz) objP;
            ywvVar = defpackage.ywv.a;
            if (aooh.n(ywzVar, ywvVar)) {
                return ywzVar;
            }
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/service/session/AudioPrismScamDetectionPreconditions", "checkDeviceInternal", 41, "AudioPrismScamDetectionPreconditions.kt").v("All ScamDetection preconditions are satisfied");
            return ywvVar;
        }
        aooc.af(objP);
        zrw zrwVar = this.b;
        tqtVar.c = 1;
        objP = zrwVar.p(tqtVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objP).booleanValue()) {
            return new defpackage.yww(defpackage.ywx.k);
        }
        tqtVar.c = 2;
        objP = a(tqtVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        ywzVar = (defpackage.ywz) objP;
        ywvVar = defpackage.ywv.a;
        if (aooh.n(ywzVar, ywvVar)) {
            return ywzVar;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/service/session/AudioPrismScamDetectionPreconditions", "checkDeviceInternal", 41, "AudioPrismScamDetectionPreconditions.kt").v("All ScamDetection preconditions are satisfied");
        return ywvVar;
    }

    @Override // defpackage.ywu
    public final java.lang.Object c(defpackage.yuw yuwVar, defpackage.taq taqVar, aoln aolnVar) {
        return b(aolnVar);
    }
}
