package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahdv {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;

    public ahdv(aoin aoinVar, java.lang.String str, defpackage.abtr abtrVar, defpackage.wpx wpxVar, defpackage.whs whsVar, aoss aossVar, agsm agsmVar) {
        aooh.f(aoinVar, "xatuAutomaticDisplayOptOutSnackbarTriggerCount");
        aooh.f(str, "callId");
        aooh.f(abtrVar, "xatuState");
        aooh.f(whsVar, "xatuLoggingCoordinator");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(agsmVar, "androidFutures");
        this.g = aoinVar;
        this.c = str;
        this.b = abtrVar;
        this.e = wpxVar;
        this.d = whsVar;
        this.f = aossVar;
        this.a = agsmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [aowv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ymj] */
    public final java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        java.lang.Object obj2 = this.c;
        return ((defpackage.yui) this.a).b((defpackage.yts) this.b, obj, this.d, this.e, (defpackage.ymk) obj2, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v8, types: [aowv, java.lang.Object] */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.yuj yujVar;
        defpackage.yui yuiVar;
        java.lang.Object objA;
        if (aolnVar instanceof defpackage.yuj) {
            yujVar = (defpackage.yuj) aolnVar;
            int i = yujVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yujVar.b = i - Integer.MIN_VALUE;
            } else {
                yujVar = new defpackage.yuj(this, aolnVar);
            }
        } else {
            yujVar = new defpackage.yuj(this, aolnVar);
        }
        java.lang.Object objA2 = yujVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yujVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA2);
            } else if (i2 == 2) {
                aooc.af(objA2);
                this.f.e((java.lang.Throwable) null);
                java.lang.Object obj = this.a;
                yujVar.b = 3;
                yuiVar = (defpackage.yui) obj;
                if (yuiVar.g.isEmpty() || (objA = yuiVar.h.a(yujVar)) != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA2);
            }
            return aojh.a;
        }
        aooc.af(objA2);
        java.lang.Object obj2 = this.a;
        java.lang.Object obj3 = this.b;
        yujVar.b = 1;
        objA2 = ((defpackage.yui) obj2).a((defpackage.yts) obj3, yujVar);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        yujVar.b = 2;
        if (aooh.w((java.util.List) objA2, yujVar) == aoluVar) {
            return aoluVar;
        }
        this.f.e((java.lang.Throwable) null);
        java.lang.Object obj4 = this.a;
        yujVar.b = 3;
        yuiVar = (defpackage.yui) obj4;
        if (yuiVar.g.isEmpty()) {
            objA = aojh.a;
        } else {
            objA = aojh.a;
        }
        if (objA == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aowu, java.lang.Object] */
    public final aoxh c() {
        return new aoxd((aowu) this.g, false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoss, java.lang.Object] */
    public final void d() {
        ((agsm) this.a).g(aosv.F((aoss) this.f, 0, new defpackage.wcj(this, (aoln) null, 3), 3), 1L, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoss, java.lang.Object] */
    public final void e() {
        ((agsm) this.a).g(aosv.F((aoss) this.f, 0, new uer(this, (aoln) null, 16), 3), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v1, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, rlv] */
    public final void f(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        java.lang.Object obj = this.e;
        if (obj != null) {
            boolean zEquals = ((android.telecom.PhoneAccountHandle) ((defpackage.alin) obj).c).equals(phoneAccountHandle);
            ?? r1 = this.c;
            if (zEquals) {
                r1.n(rmw.ge);
            } else {
                r1.n(rmw.gf);
            }
        }
        ?? r0 = this.g;
        if (!((aihd) r0).isEmpty() && z) {
            this.c.n(rmw.gg);
            rsr rsrVarAF = new kaw("data_id").aF((java.util.Collection) r0);
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("preferred_phone_account_component_name", phoneAccountHandle.getComponentName().flattenToString());
            contentValues.put("preferred_phone_account_id", phoneAccountHandle.getId());
            java.lang.Object obj2 = this.a;
            java.lang.Object obj3 = rsrVarAF.b;
            java.lang.String str = (java.lang.String) obj3;
            ojo ojoVar = (ojo) obj2;
            agsm.i(842, ahvr.H(ojoVar.f(defpackage.abxw.a, contentValues, str, (java.lang.String[]) rsrVarAF.a), new defpackage.rht(10), (java.util.concurrent.Executor) this.d), "Write preferred account failure.", new java.lang.Object[0]);
        }
        java.lang.Object obj4 = this.b;
        if (obj4 != null) {
            agsm.i(841, this.d.eU(ahqx.i(new hsl(this, obj4, phoneAccountHandle, 20, (char[]) null))), "Report user selection failure.", new java.lang.Object[0]);
        }
    }

    public ahdv(android.content.Context context, aeqx aeqxVar, gpd gpdVar, kaw kawVar, ssq ssqVar, defpackage.vxz vxzVar, tkl tklVar) {
        aooh.f(ssqVar, "phoneNumberHelper");
        this.d = context;
        this.e = aeqxVar;
        this.c = gpdVar;
        this.b = kawVar;
        this.g = ssqVar;
        this.f = vxzVar;
        this.a = tklVar;
    }

    public ahdv(ajct ajctVar, defpackage.svm svmVar, rlv rlvVar, ojo ojoVar, java.lang.String str, defpackage.alin alinVar, aihd aihdVar) {
        this.d = ajctVar;
        this.f = svmVar;
        this.c = rlvVar;
        this.a = ojoVar;
        this.b = str;
        this.e = alinVar;
        this.g = aihdVar;
    }

    public ahdv(aonj aonjVar, java.lang.String str, java.lang.String str2, ajyz ajyzVar, apnt apntVar, ajzt ajztVar, android.accounts.Account account) {
        aooh.f(str2, "scope");
        aooh.f(ajyzVar, "channelProvider");
        aooh.f(apntVar, "spatulaHeaderProvider");
        aooh.f(ajztVar, "serviceConfig");
        this.b = aonjVar;
        this.g = str;
        this.d = str2;
        this.c = ajyzVar;
        this.a = apntVar;
        this.e = ajztVar;
        this.f = account;
    }

    public ahdv(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.Map map, aexi aexiVar, j$.util.Optional optional, ahbq ahbqVar, ahda ahdaVar, aewq aewqVar) {
        aooh.f(scheduledExecutorService, "executor");
        aooh.f(map, "subpackagedToTier");
        aooh.f(aexiVar, "phenotypeApi");
        aooh.f(optional, "reaper");
        aooh.f(ahbqVar, "state");
        aooh.f(aewqVar, "phenotypeContext");
        this.a = scheduledExecutorService;
        this.b = map;
        this.c = aexiVar;
        this.d = optional;
        this.e = ahbqVar;
        this.g = ahdaVar;
        this.f = aewqVar;
    }

    public ahdv(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7) {
        aoinVar.getClass();
        this.e = aoinVar;
        aoinVar2.getClass();
        this.c = aoinVar2;
        aoinVar3.getClass();
        this.d = aoinVar3;
        aoinVar4.getClass();
        this.b = aoinVar4;
        aoinVar5.getClass();
        this.a = aoinVar5;
        aoinVar6.getClass();
        this.f = aoinVar6;
        aoinVar7.getClass();
        this.g = aoinVar7;
    }

    public ahdv(defpackage.yts ytsVar, defpackage.ymj ymjVar, defpackage.ymk ymkVar, defpackage.yui yuiVar) {
        this.b = ytsVar;
        this.e = ymjVar;
        this.c = ymkVar;
        this.a = yuiVar;
        aowi aowiVarH = aooh.H(Integer.MAX_VALUE, 0, (aonj) null, 6);
        this.f = aowiVarH;
        this.g = aowiVarH;
        this.d = aowiVarH;
    }
}
