package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hnk extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.hnm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnk(defpackage.hnm hnmVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = hnmVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aojh) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.hnm hnmVar;
        java.lang.Throwable th;
        ahpj ahpjVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        int i = this.d;
        try {
            if (i == 0) {
                aooc.af(obj);
                hnmVar = this.e;
                this.a = hnmVar;
                this.d = 1;
                if (ahre.a((aolr) null, this) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        aooc.af(obj);
                        return aojh.a;
                    }
                    obj3 = this.c;
                    obj2 = this.b;
                    ahpjVar = (ahpj) this.a;
                    try {
                        aooc.af(obj);
                        ahns.d(ahns.a(), ahpjVar);
                        ((ahne) obj2).b = (ahnd) obj3;
                        return aojh.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        try {
                            ahnn.b(th);
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            ahns.d(ahns.a(), ahpjVar);
                            ((ahne) obj2).b = (ahnd) obj3;
                            throw th3;
                        }
                    }
                }
                hnmVar = (defpackage.hnm) this.a;
                aooc.af(obj);
            }
            boolean z = ahns.a;
            ahpe ahpeVarA = ahns.a();
            ahne ahneVar = ahpeVarA.e;
            if (ahneVar == null) {
                throw new java.lang.IllegalStateException("reactiveTraced should be used within TikTok provided CoroutineContext");
            }
            ahnd ahndVar = ahneVar.b;
            if (ahndVar == ahnd.b) {
                aimw aimwVarL = defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "registerInCallController$<anonymous>$<anonymous>$<anonymous>", 120, "CarInCallController.kt");
                zpm zpmVar = hnmVar.p;
                aimwVarL.C("Creating in call screen if necessary: hasOngoingCallScope = %s, isInCallScreenPushed=%s", zpmVar.a().size(), hnmVar.k());
                aihd aihdVarA = zpmVar.a();
                aooh.e(aihdVarA, "getAllCallScopes(...)");
                if (!aihdVarA.isEmpty() && !hnmVar.k() && zpmVar.a().size() != zpmVar.b(zpo.d).size() && !hnmVar.i() && !hnmVar.j()) {
                    this.a = null;
                    this.d = 2;
                    if (hnmVar.b(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            if (ahndVar == ahnd.a) {
                throw new java.lang.IllegalStateException("Already has a manually propagated trace, resuming executor trace may change causality.");
            }
            ahpj ahpjVarB = ahns.b();
            if (ahpjVarB != null && ahpjVarB != ahoo.a && ahpjVarB != ahneVar.c) {
                throw new java.lang.IllegalStateException("Do not call reactiveTraced with the trace present: the reactive pattern should be used in long-lived coroutines to avoid trace leaks, and therefore having the trace present in the coroutine defeats the purpose. See go/tiktok/dev/concurrent/coroutines/tracing#flows");
            }
            ahob ahobVarM = ahpeVarA.d;
            if (ahobVarM == null) {
                ahobVarM = ahob.m(ahpeVarA);
            }
            ahnd ahndVar2 = ahnd.b;
            ahnd ahndVar3 = ahneVar.b;
            if (ahobVarM == ahoo.a) {
                ahndVar2 = ahnd.c;
            }
            ahneVar.b = ahndVar2;
            ahpj ahpjVarD = ahns.d(ahpeVarA, ahobVarM);
            try {
                aimw aimwVarL2 = defpackage.hnm.a.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "registerInCallController$<anonymous>$<anonymous>$<anonymous>", 120, "CarInCallController.kt");
                zpm zpmVar2 = hnmVar.p;
                aimwVarL2.C("Creating in call screen if necessary: hasOngoingCallScope = %s, isInCallScreenPushed=%s", zpmVar2.a().size(), hnmVar.k());
                aihd aihdVarA2 = zpmVar2.a();
                aooh.e(aihdVarA2, "getAllCallScopes(...)");
                if (!aihdVarA2.isEmpty() && !hnmVar.k() && zpmVar2.a().size() != zpmVar2.b(zpo.d).size() && !hnmVar.i() && !hnmVar.j()) {
                    this.a = ahpjVarD;
                    this.b = ahneVar;
                    this.c = ahndVar3;
                    this.d = 3;
                    if (hnmVar.b(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                ahpjVar = ahpjVarD;
                obj2 = ahneVar;
                obj3 = ahndVar3;
                ahns.d(ahns.a(), ahpjVar);
                ((ahne) obj2).b = (ahnd) obj3;
                return aojh.a;
            } catch (java.lang.Throwable th4) {
                th = th4;
                ahpjVar = ahpjVarD;
                obj2 = ahneVar;
                obj3 = ahndVar3;
                ahnn.b(th);
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            ahnn.b(th5);
            throw th5;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.hnk(this.e, aolnVar);
    }
}
