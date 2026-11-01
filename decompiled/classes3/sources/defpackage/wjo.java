package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wjo {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/pipeline/XatuPipelineRunner");
    public final aolr b;
    public final aoss c;
    public final ihr d;
    public final defpackage.wjc e;
    public final ihi f;
    public final defpackage.whs g;
    public final defpackage.wrh h;
    public long i;
    public final defpackage.wle j;
    public final apdp k;
    public final defpackage.wsk l;
    public final defpackage.wsk m;

    public wjo(aolr aolrVar, aoss aossVar, ihr ihrVar, defpackage.wjc wjcVar, ihi ihiVar, aazc aazcVar, defpackage.whs whsVar, defpackage.wrh wrhVar, defpackage.wsk wskVar, defpackage.wsk wskVar2, defpackage.wle wleVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ihrVar, "audioPrismSession");
        aooh.f(ihiVar, "audioPrismDuplexRelay");
        aooh.f(aazcVar, "clock");
        aooh.f(whsVar, "xatuLoggingCoordinator");
        aooh.f(wleVar, "pipelineResultListener");
        this.b = aolrVar;
        this.c = aossVar;
        this.d = ihrVar;
        this.e = wjcVar;
        this.f = ihiVar;
        this.g = whsVar;
        this.h = wrhVar;
        this.l = wskVar;
        this.m = wskVar2;
        this.j = wleVar;
        this.k = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        defpackage.wjg wjgVar;
        defpackage.amtj amtjVar;
        if (aolnVar instanceof defpackage.wjg) {
            wjgVar = (defpackage.wjg) aolnVar;
            int i = wjgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjgVar.c = i - Integer.MIN_VALUE;
            } else {
                wjgVar = new defpackage.wjg(this, aolnVar);
            }
        } else {
            wjgVar = new defpackage.wjg(this, aolnVar);
        }
        java.lang.Object objA = wjgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjgVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            akzx akzxVarM = defpackage.wjd.a.m();
            aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            ((defpackage.wjd) akzxVarM.b).b = -1;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            ihr ihrVar = this.d;
            igf igfVarA = this.e.a((defpackage.wjd) aladVarP);
            wjgVar.d = str;
            wjgVar.c = 1;
            objA = ihrVar.a(igfVarA, wjgVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = wjgVar.d;
            aooc.af(objA);
        }
        igi igiVar = (igi) objA;
        if (!igiVar.d) {
            aimw aimwVarL = a.d().l("com/android/dialer/xatu/impl/pipeline/XatuPipelineRunner", "isReady", 228, "XatuPipelineRunner.kt");
            igh ighVarB = igh.b(igiVar.e);
            if (ighVarB == null) {
                ighVarB = igh.h;
            }
            aimwVarL.y("XatuPipelineRunner not ready: %s", ighVarB.name());
            defpackage.whs whsVar = this.g;
            igh ighVarB2 = igh.b(igiVar.e);
            if (ighVarB2 == null) {
                ighVarB2 = igh.h;
            }
            int iOrdinal = ighVarB2.ordinal();
            if (iOrdinal == 1) {
                amtjVar = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_CALL_PRECONDITIONS_NOT_SATISFIED;
            } else if (iOrdinal == 2) {
                amtjVar = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_MODELS_NOT_AVAILABLE;
            } else if (iOrdinal == 3) {
                amtjVar = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_UPLINK_REQUESTED_WHEN_DUOLINKS_UNAVAILABLE;
            } else if (iOrdinal != 4) {
                amtjVar = iOrdinal != 5 ? defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_UNKNOWN : defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_DEVICE_EXCEEDS_THERMAL_THRESHOLD;
            } else {
                amtjVar = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_LOCALE_MISMATCH;
            }
            whsVar.a(str, amtjVar);
        }
        return java.lang.Boolean.valueOf(igiVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.wjd wjdVar, aoln aolnVar) {
        defpackage.wjh wjhVar;
        defpackage.amtj amtjVar;
        if (aolnVar instanceof defpackage.wjh) {
            wjhVar = (defpackage.wjh) aolnVar;
            int i = wjhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjhVar.c = i - Integer.MIN_VALUE;
            } else {
                wjhVar = new defpackage.wjh(this, aolnVar);
            }
        } else {
            wjhVar = new defpackage.wjh(this, aolnVar);
        }
        java.lang.Object objB = wjhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjhVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objB);
            a.b().l("com/android/dialer/xatu/impl/pipeline/XatuPipelineRunner", "reserveAudioPrismSession", 341, "XatuPipelineRunner.kt").v("Reserving AudioPrismSession");
            ihr ihrVar = this.d;
            igf igfVarA = this.e.a(wjdVar);
            wjhVar.d = wjdVar;
            wjhVar.c = 1;
            objB = ihrVar.b(igfVarA, wjhVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wjdVar = wjhVar.d;
            aooc.af(objB);
        }
        ihq ihqVar = (ihq) objB;
        if (!ihqVar.c) {
            aimw aimwVarL = a.b().m(aioa.b).l("com/android/dialer/xatu/impl/pipeline/XatuPipelineRunner", "reserveAudioPrismSession", 348, "XatuPipelineRunner.kt");
            ihp ihpVarB = ihp.b(ihqVar.d);
            if (ihpVarB == null) {
                ihpVarB = ihp.d;
            }
            aimwVarL.y("AudioPrismSession failed to reserve: %s", ihpVarB);
            defpackage.whs whsVar = this.g;
            java.lang.String str = wjdVar.c;
            ihp ihpVarB2 = ihp.b(ihqVar.d);
            if (ihpVarB2 == null) {
                ihpVarB2 = ihp.d;
            }
            int iOrdinal = ihpVarB2.ordinal();
            if (iOrdinal != 1) {
                amtjVar = iOrdinal != 2 ? defpackage.amtj.PIPELINE_RUNNER_RESERVE_FAILURE_UNKNOWN : defpackage.amtj.PIPELINE_RUNNER_RESERVE_FAILURE_INCOMPATIBLE_CLIENT_IN_SESSION;
            } else {
                amtjVar = defpackage.amtj.PIPELINE_RUNNER_RESERVE_FAILURE_REQUESTED_FEATURE_ALREADY_IN_SESSION;
            }
            whsVar.a(str, amtjVar);
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.wjd wjdVar, aoln aolnVar) {
        defpackage.wji wjiVar;
        defpackage.wjd wjdVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.wji) {
            wjiVar = (defpackage.wji) aolnVar;
            int i = wjiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjiVar.d = i - Integer.MIN_VALUE;
            } else {
                wjiVar = new defpackage.wji(this, aolnVar);
            }
        } else {
            wjiVar = new defpackage.wji(this, aolnVar);
        }
        java.lang.Object objAj = wjiVar.b;
        defpackage.amtj amtjVar = aolu.a;
        int i2 = wjiVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objAj);
                apdp apdpVar3 = this.k;
                wjiVar.a = wjdVar;
                wjiVar.e = apdpVar3;
                wjiVar.d = 1;
                if (apdpVar3.b(wjiVar) != amtjVar) {
                    wjdVar2 = wjdVar;
                    apdpVar = apdpVar3;
                }
                return amtjVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) wjiVar.a;
                try {
                    aooc.af(objAj);
                    amtjVar = (defpackage.amtj) objAj;
                    apdpVar2.d();
                    return amtjVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = wjiVar.e;
            wjdVar2 = (defpackage.wjd) wjiVar.a;
            aooc.af(objAj);
            aolr aolrVar = this.b;
            defpackage.vjf vjfVar = new defpackage.vjf(this, wjdVar2, (aoln) null, 13);
            wjiVar.a = apdpVar;
            wjiVar.e = null;
            wjiVar.d = 2;
            objAj = aoov.aj(aolrVar, vjfVar, wjiVar);
            if (objAj != amtjVar) {
                apdpVar2 = apdpVar;
                amtjVar = (defpackage.amtj) objAj;
                apdpVar2.d();
            }
            return amtjVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.wje wjeVar, aoln aolnVar) {
        defpackage.wjj wjjVar;
        defpackage.wje wjeVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.wjj) {
            wjjVar = (defpackage.wjj) aolnVar;
            int i = wjjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjjVar.d = i - Integer.MIN_VALUE;
            } else {
                wjjVar = new defpackage.wjj(this, aolnVar);
            }
        } else {
            wjjVar = new defpackage.wjj(this, aolnVar);
        }
        java.lang.Object objAj = wjjVar.b;
        defpackage.amtj amtjVar = aolu.a;
        int i2 = wjjVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objAj);
                apdp apdpVar3 = this.k;
                wjjVar.a = wjeVar;
                wjjVar.e = apdpVar3;
                wjjVar.d = 1;
                if (apdpVar3.b(wjjVar) != amtjVar) {
                    wjeVar2 = wjeVar;
                    apdpVar = apdpVar3;
                }
                return amtjVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) wjjVar.a;
                try {
                    aooc.af(objAj);
                    amtjVar = (defpackage.amtj) objAj;
                    apdpVar2.d();
                    return amtjVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = wjjVar.e;
            wjeVar2 = (defpackage.wje) wjjVar.a;
            aooc.af(objAj);
            aolr aolrVar = this.b;
            defpackage.wjk wjkVar = new defpackage.wjk(this, wjeVar2, null);
            wjjVar.a = apdpVar;
            wjjVar.e = null;
            wjjVar.d = 2;
            objAj = aoov.aj(aolrVar, wjkVar, wjjVar);
            if (objAj != amtjVar) {
                apdpVar2 = apdpVar;
                amtjVar = (defpackage.amtj) objAj;
                apdpVar2.d();
            }
            return amtjVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }
}
