package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ujv {
    private static final aimz a = aimz.i("com/android/dialer/spamnotification/impl/service/SpamNotificationController");
    private final ucr b;
    private final rlv c;
    private final uhs d;
    private final kgl e;

    public ujv(android.content.Context context, ucr ucrVar, kgl kglVar, uhs uhsVar, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(kglVar, "blocking");
        aooh.f(uhsVar, "spamSettings");
        aooh.f(rlvVar, "loggingBindings");
        this.b = ucrVar;
        this.e = kglVar;
        this.d = uhsVar;
        this.c = rlvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, aoln aolnVar) {
        defpackage.ujr ujrVar;
        if (aolnVar instanceof defpackage.ujr) {
            ujrVar = (defpackage.ujr) aolnVar;
            int i = ujrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujrVar.c = i - Integer.MIN_VALUE;
            } else {
                ujrVar = new defpackage.ujr(this, aolnVar);
            }
        } else {
            ujrVar = new defpackage.ujr(this, aolnVar);
        }
        java.lang.Object obj = ujrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ujrVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ajcq ajcqVarJ = this.e.j(aify.p(str), str2);
            ujrVar.c = 1;
            if (aosv.D(ajcqVarJ, ujrVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ujs ujsVar;
        if (aolnVar instanceof defpackage.ujs) {
            ujsVar = (defpackage.ujs) aolnVar;
            int i = ujsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujsVar.c = i - Integer.MIN_VALUE;
            } else {
                ujsVar = new defpackage.ujs(this, aolnVar);
            }
        } else {
            ujsVar = new defpackage.ujs(this, aolnVar);
        }
        java.lang.Object objK = ujsVar.a;
        java.lang.Boolean bool = aolu.a;
        int i2 = ujsVar.c;
        if (i2 == 0) {
            aooc.af(objK);
            ujsVar.c = 1;
            aosc aoscVar = new aosc(ajsz.ap(ujsVar), 1);
            aoscVar.z();
            this.c.n(rmw.iq);
            this.d.d(true, new defpackage.ujt((aosb) aoscVar, 0));
            objK = aoscVar.k();
            if (objK != bool) {
            }
            return bool;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objK);
        bool = (java.lang.Boolean) objK;
        if (!bool.booleanValue()) {
            a.d().i(zct.b).l("com/android/dialer/spamnotification/impl/service/SpamNotificationController", "enableSpamBlockingSetting", 61, "SpamNotificationController.kt").v("Fail to modify spam blocking through notification promo");
            this.c.n(rmw.ir);
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, java.lang.String str2, long j, aivt aivtVar, aoln aolnVar) {
        defpackage.uju ujuVar;
        if (aolnVar instanceof defpackage.uju) {
            ujuVar = (defpackage.uju) aolnVar;
            int i = ujuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujuVar.c = i - Integer.MIN_VALUE;
            } else {
                ujuVar = new defpackage.uju(this, aolnVar);
            }
        } else {
            ujuVar = new defpackage.uju(this, aolnVar);
        }
        java.lang.Object obj = ujuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ujuVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ucr ucrVar = this.b;
            defpackage.uzx uzxVarCd = wsc.cd(defpackage.ucq.a.m());
            uzxVarCd.q(1);
            uzxVarCd.r(str2);
            uzxVarCd.p(j);
            defpackage.uzx uzxVarA = airh.A(aivu.a.m());
            uzxVarA.aC(str);
            uzxVarA.aG(wsc.bH(1));
            uzxVarA.aF(3);
            uzxVarA.aA(defpackage.rms.NOT_FOUND);
            uzxVarA.aE();
            uzxVarA.aD(aivtVar);
            uzxVarCd.s(uzxVarA.az());
            ajcq ajcqVarE = ucrVar.e(uzxVarCd.o().p());
            ujuVar.c = 1;
            if (aosv.D(ajcqVarE, ujuVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
