package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class owg implements defpackage.zoi, defpackage.zns {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoCallScopeListener");
    public final defpackage.ptx b;
    private final aoss c;
    private final defpackage.oxg d;
    private final defpackage.pqo e;
    private final defpackage.pgi f;
    private final defpackage.rdp g;
    private final heq h;

    public owg(aoss aossVar, defpackage.oxg oxgVar, defpackage.pgi pgiVar, heq heqVar, defpackage.rdp rdpVar, defpackage.pqo pqoVar, defpackage.ptx ptxVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(pqoVar, "callDirection");
        aooh.f(ptxVar, "callProperties");
        this.c = aossVar;
        this.d = oxgVar;
        this.f = pgiVar;
        this.h = heqVar;
        this.g = rdpVar;
        this.e = pqoVar;
        this.b = ptxVar;
    }

    @Override // defpackage.zns
    public final ajcq a() {
        return aosv.F(this.c, 0, new defpackage.ovz(this, (aoln) null, 3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v18, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.owf owfVar;
        defpackage.owy owyVar;
        heq heqVar;
        java.lang.Object objAj;
        if (aolnVar instanceof defpackage.owf) {
            owfVar = (defpackage.owf) aolnVar;
            int i = owfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                owfVar.c = i - Integer.MIN_VALUE;
            } else {
                owfVar = new defpackage.owf(this, aolnVar);
            }
        } else {
            owfVar = new defpackage.owf(this, aolnVar);
        }
        java.lang.Object objD = owfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = owfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else if (i2 == 2) {
                aooc.af(objD);
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoCallScopeListener", "showNotificationIfEligible", 70, "PostCallAnswerMethodPromoCallScopeListener.kt").v("Post-call notification already shown, skipping");
                    return aojh.a;
                }
                defpackage.pgi pgiVar = this.f;
                owfVar.c = 3;
                objD = pgiVar.d(owfVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                owyVar = (defpackage.owy) objD;
                if (owyVar == defpackage.owy.SELECTED_ANSWER_METHOD_TAP) {
                    a.b().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoCallScopeListener", "showNotificationIfEligible", 76, "PostCallAnswerMethodPromoCallScopeListener.kt").y("User already has single tap selected: %s", owyVar);
                    return aojh.a;
                }
                heqVar = this.h;
                owfVar.c = 4;
                if (heqVar.Q(owfVar) == aoluVar) {
                    return aoluVar;
                }
                defpackage.rdp rdpVar = this.g;
                owfVar.c = 5;
                objAj = aoov.aj((aolr) rdpVar.d, new defpackage.ovz(rdpVar, (aoln) null, 5), owfVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                aooc.af(objD);
                owyVar = (defpackage.owy) objD;
                if (owyVar == defpackage.owy.SELECTED_ANSWER_METHOD_TAP) {
                    a.b().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoCallScopeListener", "showNotificationIfEligible", 76, "PostCallAnswerMethodPromoCallScopeListener.kt").y("User already has single tap selected: %s", owyVar);
                    return aojh.a;
                }
                heqVar = this.h;
                owfVar.c = 4;
                if (heqVar.Q(owfVar) == aoluVar) {
                    return aoluVar;
                }
                defpackage.rdp rdpVar2 = this.g;
                owfVar.c = 5;
                objAj = aoov.aj((aolr) rdpVar2.d, new defpackage.ovz(rdpVar2, (aoln) null, 5), owfVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 4) {
                aooc.af(objD);
                defpackage.rdp rdpVar3 = this.g;
                owfVar.c = 5;
                objAj = aoov.aj((aolr) rdpVar3.d, new defpackage.ovz(rdpVar3, (aoln) null, 5), owfVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        ajcq ajcqVar = this.e.b;
        aooh.e(ajcqVar, "getDirection(...)");
        owfVar.c = 1;
        objD = aosv.D(ajcqVar, owfVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (objD != defpackage.zmy.a) {
            a.b().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoCallScopeListener", "showNotificationIfEligible", 60, "PostCallAnswerMethodPromoCallScopeListener.kt").v("Call is not incoming, skipping post-call notification");
            return aojh.a;
        }
        if (this.d.a()) {
            a.b().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoCallScopeListener", "showNotificationIfEligible", 65, "PostCallAnswerMethodPromoCallScopeListener.kt").v("Simple view active, skipping post-call notification");
            return aojh.a;
        }
        heq heqVar2 = this.h;
        owfVar.c = 2;
        objD = heqVar2.P(owfVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objD).booleanValue()) {
            a.b().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoCallScopeListener", "showNotificationIfEligible", 70, "PostCallAnswerMethodPromoCallScopeListener.kt").v("Post-call notification already shown, skipping");
            return aojh.a;
        }
        defpackage.pgi pgiVar2 = this.f;
        owfVar.c = 3;
        objD = pgiVar2.d(owfVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        owyVar = (defpackage.owy) objD;
        if (owyVar == defpackage.owy.SELECTED_ANSWER_METHOD_TAP) {
            a.b().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoCallScopeListener", "showNotificationIfEligible", 76, "PostCallAnswerMethodPromoCallScopeListener.kt").y("User already has single tap selected: %s", owyVar);
            return aojh.a;
        }
        heqVar = this.h;
        owfVar.c = 4;
        if (heqVar.Q(owfVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.rdp rdpVar4 = this.g;
        owfVar.c = 5;
        objAj = aoov.aj((aolr) rdpVar4.d, new defpackage.ovz(rdpVar4, (aoln) null, 5), owfVar);
        if (objAj != aoluVar) {
            objAj = aojh.a;
        }
        if (objAj == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    @Override // defpackage.zoi
    public final void eh() {
        aoov.an(this.c, (aolr) null, 0, new defpackage.ovz(this, null, 4, null), 3);
    }
}
