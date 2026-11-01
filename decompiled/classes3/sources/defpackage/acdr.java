package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acdr extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.acds c;
    final /* synthetic */ com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acdr(defpackage.acds acdsVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, aoln aolnVar) {
        super(2, aolnVar);
        this.c = acdsVar;
        this.d = promoContext;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0175 A[Catch: Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:57:0x01a2, B:30:0x0102, B:32:0x0118, B:34:0x013d, B:36:0x0153, B:38:0x015b, B:39:0x015d, B:41:0x0161, B:43:0x0168, B:46:0x0171, B:54:0x0193, B:42:0x0166, B:48:0x0175, B:50:0x017b, B:51:0x017d), top: B:66:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x017b A[Catch: Exception -> 0x01b3, TryCatch #1 {Exception -> 0x01b3, blocks: (B:57:0x01a2, B:30:0x0102, B:32:0x0118, B:34:0x013d, B:36:0x0153, B:38:0x015b, B:39:0x015d, B:41:0x0161, B:43:0x0168, B:46:0x0171, B:54:0x0193, B:42:0x0166, B:48:0x0175, B:50:0x017b, B:51:0x017d), top: B:66:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0192  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        defpackage.acio acioVar;
        akjx akjxVar;
        android.view.View viewA;
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        try {
            if (this.b != 0) {
                obj2 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                defpackage.acds acdsVar = this.c;
                ackz ackzVar = (ackz) acdsVar.d.a();
                if (ackzVar == null) {
                    acbd acbdVar = acdsVar.e;
                    com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = this.d;
                    acbdVar.b(promoContext, "GrowthKitCallbacks not found.", new java.lang.Object[0]);
                    acdsVar.f.g(promoContext, akvk.k);
                    return new adub(new abzt((java.lang.String) null));
                }
                if (!anfq.e() && defpackage.acax.b(acdsVar.c)) {
                    acbd acbdVar2 = acdsVar.e;
                    com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext2 = this.d;
                    acbdVar2.b(promoContext2, "Accessibility is enabled, not displaying.", new java.lang.Object[0]);
                    acdsVar.f.g(promoContext2, akvk.j);
                    return new adub(new abzt((java.lang.String) null));
                }
                az azVarA = ackzVar.a();
                defpackage.aciq aciqVar = acdsVar.h;
                if (aciqVar.e()) {
                    acbd acbdVar3 = acdsVar.e;
                    com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext3 = this.d;
                    acbdVar3.b(promoContext3, "Not showing as a promotion is already presented or being shown.", new java.lang.Object[0]);
                    acdsVar.f.g(promoContext3, akvk.u);
                    defpackage.acds.a.b().v("Not showing promotion, as a promotion is already presented or being shown.");
                    return new adub(new abzt((java.lang.String) null));
                }
                for (java.lang.String str : defpackage.acds.b) {
                    if (azVarA.a().e(str) != null) {
                        acbd acbdVar4 = acdsVar.e;
                        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext4 = this.d;
                        acbdVar4.b(promoContext4, "Not showing as a promotion is already presented.", new java.lang.Object[0]);
                        acdsVar.f.g(promoContext4, akvk.u);
                        defpackage.acds.a.b().y("Not showing promotion, as %s promotion is already presented.", str);
                        return new adub(new abzt((java.lang.String) null));
                    }
                }
                com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext5 = this.d;
                akhl akhlVarC = promoContext5.c();
                defpackage.aclc aclcVarV = defpackage.abxl.v(promoContext5);
                acal acalVar = acdsVar.f;
                acalVar.l(promoContext5);
                acbd acbdVar5 = acdsVar.e;
                i = 0;
                try {
                    java.lang.String simpleName = ackzVar.getClass().getSimpleName();
                    aooh.e(simpleName, "getSimpleName(...)");
                    acbdVar5.b(promoContext5, "Sending to collaborator callback [%s].", new java.lang.Object[]{simpleName});
                    defpackage.acky ackyVarB = ackzVar.b(aclcVarV);
                    if (!ackyVarB.a) {
                        java.lang.String simpleName2 = ackzVar.getClass().getSimpleName();
                        aooh.e(simpleName2, "getSimpleName(...)");
                        acbdVar5.b(promoContext5, "Rejected by GrowthKitCallbacks [%s].", new java.lang.Object[]{simpleName2});
                        acalVar.s(promoContext5, ackyVarB.b);
                        return new adub(new abzt((java.lang.String) null));
                    }
                    defpackage.acjh acjhVar = defpackage.acjh.a;
                    android.content.Context context = acdsVar.c;
                    aooh.f(context, "context");
                    defpackage.akkc akkcVarB = acjhVar.b(context);
                    aciqVar.c(promoContext5, akkcVarB, azVarA);
                    if (aclcVarV.b != 5) {
                        acioVar = acdsVar.g;
                        akjxVar = akhlVarC.h;
                        if (akjxVar == null) {
                            akjxVar = akjx.a;
                        }
                        aooh.e(akjxVar, "getUi(...)");
                        viewA = acioVar.a(azVarA, akjxVar);
                        this.a = akhlVarC;
                        this.b = 2;
                        if (acioVar.b(azVarA, viewA, promoContext5, akkcVarB, this) != aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        akjx akjxVar2 = promoContext5.c().h;
                        if (akjxVar2 == null) {
                            akjxVar2 = akjx.a;
                        }
                        int iAQ = a.aQ((akjxVar2.c == 5 ? (defpackage.akkh) akjxVar2.d : defpackage.akkh.a).m);
                        if (iAQ == 0) {
                            iAQ = 1;
                        }
                        if (iAQ - 1 != 2) {
                            acioVar = acdsVar.g;
                            akjxVar = akhlVarC.h;
                            if (akjxVar == null) {
                                akjxVar = akjx.a;
                            }
                            aooh.e(akjxVar, "getUi(...)");
                            viewA = acioVar.a(azVarA, akjxVar);
                            this.a = akhlVarC;
                            this.b = 2;
                            if (acioVar.b(azVarA, viewA, promoContext5, akkcVarB, this) != aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            defpackage.aciu aciuVar = acdsVar.i;
                            this.a = akhlVarC;
                            this.b = 1;
                            if (aciuVar.e(promoContext5, 3, this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    obj2 = akhlVarC;
                } catch (java.lang.Exception e) {
                    e = e;
                    defpackage.acds acdsVar2 = this.c;
                    com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext6 = this.d;
                    acdsVar2.e.d(promoContext6, e, new java.lang.Object[i]);
                    acdsVar2.f.g(promoContext6, akvk.b);
                    acdsVar2.h.d(promoContext6);
                    return new defpackage.adtw(e, adty.b);
                }
            }
            return new adub(new abzt(defpackage.abxl.q((akhl) obj2)));
        } catch (java.lang.Exception e2) {
            e = e2;
            i = 0;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.acdr(this.c, this.d, aolnVar);
    }
}
