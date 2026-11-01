package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tre {
    private static final aimz b = aimz.i("com/android/dialer/sharpie/impl/service/session/SharpieSession");
    private static final j$.time.Duration c;
    public final defpackage.qbe a;
    private final aolr d;
    private final ihr e;
    private final ruc f;
    private aeun g;
    private final defpackage.uss h;

    static {
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(500L);
        aooh.e(durationOfMillis, "ofMillis(...)");
        c = durationOfMillis;
    }

    public tre(aolr aolrVar, ihr ihrVar, defpackage.uss ussVar, ruc rucVar, defpackage.qbe qbeVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ihrVar, "audioPrismSession");
        aooh.f(ussVar, "audioPrismConfigProvider");
        aooh.f(rucVar, "metrics");
        aooh.f(qbeVar, "inCallLogging");
        this.d = aolrVar;
        this.e = ihrVar;
        this.h = ussVar;
        this.f = rucVar;
        this.a = qbeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.tqy tqyVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.tqy) {
            tqyVar = (defpackage.tqy) aolnVar;
            int i = tqyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqyVar.c = i - Integer.MIN_VALUE;
            } else {
                tqyVar = new defpackage.tqy(this, aolnVar);
            }
        } else {
            tqyVar = new defpackage.tqy(this, aolnVar);
        }
        java.lang.Object obj = tqyVar.a;
        ihq ihqVar = aolu.a;
        int i2 = tqyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(tqyVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(890, "SharpieSession_reserveAudioPrismSession");
            try {
                aolr aolrVar = this.d;
                defpackage.tpd tpdVar = new defpackage.tpd(this, (aoln) null, 5);
                tqyVar.d = ahoqVarZ;
                tqyVar.c = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, tpdVar, tqyVar);
                if (objAj != ihqVar) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return ihqVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = tqyVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        ihqVar = (ihq) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return ihqVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x013d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0159  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0159 -> B:45:0x015b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(aoln r17) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tre.b(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.tra traVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.tra) {
            traVar = (defpackage.tra) aolnVar;
            int i = traVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                traVar.c = i - Integer.MIN_VALUE;
            } else {
                traVar = new defpackage.tra(this, aolnVar);
            }
        } else {
            traVar = new defpackage.tra(this, aolnVar);
        }
        java.lang.Object obj = traVar.a;
        defpackage.tri triVar = aolu.a;
        int i2 = traVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(traVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(891, "SharpieSession_start");
            try {
                aolr aolrVar = this.d;
                defpackage.tpd tpdVar = new defpackage.tpd(this, (aoln) null, 6, (byte[]) null);
                traVar.d = ahoqVarZ;
                traVar.c = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, tpdVar, traVar);
                if (objAj != triVar) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return triVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = traVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        triVar = (defpackage.tri) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return triVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.trb trbVar;
        ihr ihrVar;
        ihr ihrVar2;
        ihu ihuVar;
        boolean z;
        aimz aimzVar;
        iht ihtVarB;
        iht ihtVarB2;
        if (aolnVar instanceof defpackage.trb) {
            trbVar = (defpackage.trb) aolnVar;
            int i = trbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                trbVar.d = i - Integer.MIN_VALUE;
            } else {
                trbVar = new defpackage.trb(this, aolnVar);
            }
        } else {
            trbVar = new defpackage.trb(this, aolnVar);
        }
        java.lang.Object objC = trbVar.b;
        aolu aoluVar = aolu.a;
        int i2 = trbVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = trbVar.a;
                aooc.af(objC);
                ihrVar2 = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            ihuVar = (ihu) objC;
            z = ihuVar.c;
            aimzVar = b;
            if (!z) {
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "startInternal", 115, "SharpieSession.kt").v("ScamDetectionSession started successfully.");
                j$.util.Optional optionalA = this.f.a();
                aooh.e(optionalA, "startLocalTimer(...)");
                this.g = (aeun) aooh.q(optionalA);
                return defpackage.trh.a;
            }
            aimw aimwVarL = aimzVar.b().m(aioa.b).l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "startInternal", 111, "SharpieSession.kt");
            ihtVarB = iht.b(ihuVar.d);
            if (ihtVarB == null) {
                ihtVarB = iht.h;
            }
            aimwVarL.y("AudioPrismSession failed to start: %s", ihtVarB);
            ihtVarB2 = iht.b(ihuVar.d);
            if (ihtVarB2 == null) {
                ihtVarB2 = iht.h;
            }
            return new defpackage.trf(new defpackage.trg(ihtVarB2));
        }
        aooc.af(objC);
        b.b().l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "startInternal", 105, "SharpieSession.kt").v("start");
        ihrVar = this.e;
        defpackage.uss ussVar = this.h;
        trbVar.a = ihrVar;
        trbVar.d = 1;
        objC = ussVar.c(trbVar);
        if (objC == aoluVar) {
            ihrVar2 = ihrVar;
            return aoluVar;
        }
        ihrVar2 = ihrVar;
        trbVar.a = null;
        trbVar.d = 2;
        objC = ihrVar2.c((igf) objC, trbVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        ihuVar = (ihu) objC;
        z = ihuVar.c;
        aimzVar = b;
        if (!z) {
            aimzVar.b().l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "startInternal", 115, "SharpieSession.kt").v("ScamDetectionSession started successfully.");
            j$.util.Optional optionalA2 = this.f.a();
            aooh.e(optionalA2, "startLocalTimer(...)");
            this.g = (aeun) aooh.q(optionalA2);
            return defpackage.trh.a;
        }
        aimw aimwVarL2 = aimzVar.b().m(aioa.b).l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "startInternal", 111, "SharpieSession.kt");
        ihtVarB = iht.b(ihuVar.d);
        if (ihtVarB == null) {
            ihtVarB = iht.h;
        }
        aimwVarL2.y("AudioPrismSession failed to start: %s", ihtVarB);
        ihtVarB2 = iht.b(ihuVar.d);
        if (ihtVarB2 == null) {
            ihtVarB2 = iht.h;
        }
        return new defpackage.trf(new defpackage.trg(ihtVarB2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.trc trcVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.trc) {
            trcVar = (defpackage.trc) aolnVar;
            int i = trcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                trcVar.c = i - Integer.MIN_VALUE;
            } else {
                trcVar = new defpackage.trc(this, aolnVar);
            }
        } else {
            trcVar = new defpackage.trc(this, aolnVar);
        }
        java.lang.Object obj = trcVar.a;
        defpackage.trm trmVar = aolu.a;
        int i2 = trcVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(trcVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(892, "SharpieSession_stop");
            try {
                aolr aolrVar = this.d;
                defpackage.tpd tpdVar = new defpackage.tpd(this, (aoln) null, 7, (char[]) null);
                trcVar.d = ahoqVarZ;
                trcVar.c = 1;
                java.lang.Object objAj = aoov.aj(aolrVar, tpdVar, trcVar);
                if (objAj != trmVar) {
                    obj = objAj;
                    ahoqVar = ahoqVarZ;
                }
                return trmVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = trcVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        trmVar = (defpackage.trm) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return trmVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.trd trdVar;
        ihr ihrVar;
        ihr ihrVar2;
        ihw ihwVar;
        aeun aeunVar;
        ihv ihvVarB;
        int i;
        ihv ihvVarB2;
        ihv ihvVarB3;
        if (aolnVar instanceof defpackage.trd) {
            trdVar = (defpackage.trd) aolnVar;
            int i2 = trdVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trdVar.d = i2 - Integer.MIN_VALUE;
            } else {
                trdVar = new defpackage.trd(this, aolnVar);
            }
        } else {
            trdVar = new defpackage.trd(this, aolnVar);
        }
        java.lang.Object objC = trdVar.b;
        aolu aoluVar = aolu.a;
        int i3 = trdVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                java.lang.Object obj = trdVar.a;
                aooc.af(objC);
                ihrVar2 = obj;
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            ihwVar = (ihw) objC;
            if (!ihwVar.c) {
                aimw aimwVarL = b.b().m(aioa.b).l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "stopInternal", 127, "SharpieSession.kt");
                ihvVarB = ihv.b(ihwVar.d);
                if (ihvVarB == null) {
                    ihvVarB = ihv.c;
                }
                aimwVarL.y("AudioPrismSession failed to stop: %s", ihvVarB);
                i = ihwVar.d;
                ihvVarB2 = ihv.b(i);
                if (ihvVarB2 == null) {
                    ihvVarB2 = ihv.c;
                }
                if (ihvVarB2 != ihv.b) {
                    ihvVarB3 = ihv.b(i);
                    if (ihvVarB3 == null) {
                        ihvVarB3 = ihv.c;
                    }
                    return new defpackage.trj(new defpackage.trk(ihvVarB3));
                }
            }
            aeunVar = this.g;
            if (aeunVar != null) {
                this.f.q(aeunVar, ruc.bX, rub.b);
            }
            b.b().l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "stopInternal", 143, "SharpieSession.kt").v("ScamDetectionSession stopped successfully.");
            return defpackage.trl.a;
        }
        aooc.af(objC);
        b.b().l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "stopInternal", 121, "SharpieSession.kt").v("stop");
        ihrVar = this.e;
        defpackage.uss ussVar = this.h;
        trdVar.a = ihrVar;
        trdVar.d = 1;
        objC = ussVar.c(trdVar);
        if (objC == aoluVar) {
            ihrVar2 = ihrVar;
            return aoluVar;
        }
        ihrVar2 = ihrVar;
        ifv ifvVarB = ifv.b(((igf) objC).c);
        if (ifvVarB == null) {
            ifvVarB = ifv.j;
        }
        trdVar.a = null;
        trdVar.d = 2;
        objC = ihrVar2.d(ifvVarB, trdVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        ihwVar = (ihw) objC;
        if (!ihwVar.c) {
            aimw aimwVarL2 = b.b().m(aioa.b).l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "stopInternal", 127, "SharpieSession.kt");
            ihvVarB = ihv.b(ihwVar.d);
            if (ihvVarB == null) {
                ihvVarB = ihv.c;
            }
            aimwVarL2.y("AudioPrismSession failed to stop: %s", ihvVarB);
            i = ihwVar.d;
            ihvVarB2 = ihv.b(i);
            if (ihvVarB2 == null) {
                ihvVarB2 = ihv.c;
            }
            if (ihvVarB2 != ihv.b) {
                ihvVarB3 = ihv.b(i);
                if (ihvVarB3 == null) {
                    ihvVarB3 = ihv.c;
                }
                return new defpackage.trj(new defpackage.trk(ihvVarB3));
            }
        }
        aeunVar = this.g;
        if (aeunVar != null) {
            this.f.q(aeunVar, ruc.bX, rub.b);
        }
        b.b().l("com/android/dialer/sharpie/impl/service/session/SharpieSession", "stopInternal", 143, "SharpieSession.kt").v("ScamDetectionSession stopped successfully.");
        return defpackage.trl.a;
    }
}
