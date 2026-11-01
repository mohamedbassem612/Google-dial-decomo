package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xla extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(acjk acjkVar, akik akikVar, int i, akjc akjcVar, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.e = acjkVar;
        this.c = akikVar;
        this.b = 3;
        this.d = akjcVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 3) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 4) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 5) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [acit, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [aiq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, xni] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, xjz] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, xlw] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, xlw] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xjz] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, xni] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        java.lang.Object objK;
        defpackage.xnh xnhVarH;
        java.lang.Object objA;
        java.lang.Object objM;
        int i = this.$cid;
        java.lang.String str = "OTMServiceBinder";
        boolean z = true;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                    str = str;
                } else {
                    aooc.af(obj);
                    java.lang.Object obj2 = this.c;
                    java.lang.Object obj3 = this.d;
                    ((defpackage.xlh) obj2).o((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj3, this.b);
                    defpackage.xnv xnvVar = new defpackage.xnv((android.os.PersistableBundle) this.e);
                    this.a = 1;
                    java.lang.Object objL = ((defpackage.xlh) obj2).l((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj3, xnvVar, this);
                    str = objL;
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                }
            } catch (java.lang.Exception e) {
                java.lang.Object obj4 = this.d;
                java.util.Objects.toString(obj4);
                defpackage.xox.f(str, "Failed to interrupt task for ".concat(java.lang.String.valueOf(obj4)), e);
                if (e instanceof java.util.concurrent.CancellationException) {
                    throw e;
                }
            }
            return aojh.a;
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            int i2 = this.a;
            try {
                if (i2 == 0) {
                    aooc.af(obj);
                    java.lang.Object obj5 = this.e;
                    java.lang.Object obj6 = this.c;
                    ((defpackage.xlh) obj5).o((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj6, this.b);
                    java.lang.Object objM2 = aa$.ExternalSyntheticApiModelOutline1.m(((defpackage.xlh) obj5).c);
                    aooh.e(objM2, "get(...)");
                    if (((defpackage.xpz) objM2).e(429537734L)) {
                        this.a = 1;
                        objK = ((defpackage.xlh) obj5).k((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj6, this);
                        if (objK == aoluVar2) {
                            return aoluVar2;
                        }
                        xnhVarH = (defpackage.xnh) objK;
                    } else {
                        defpackage.xox.b("OTMServiceBinder", a.bh(obj6, "getTaskStateWithCallback token="));
                        defpackage.xmw xmwVar = ((defpackage.xlh) obj5).f;
                        this.a = 2;
                        if (xmwVar.g(this) == aoluVar2) {
                            return aoluVar2;
                        }
                        xnhVarH = ((defpackage.xlh) this.e).h(this.c);
                    }
                } else if (i2 != 1) {
                    aooc.af(obj);
                    xnhVarH = ((defpackage.xlh) this.e).h(this.c);
                } else {
                    aooc.af(obj);
                    objK = obj;
                    xnhVarH = (defpackage.xnh) objK;
                }
                ((defpackage.xls) this.d).a(((defpackage.xlh) this.e).g(xnhVarH.c()));
            } catch (java.lang.Exception e2) {
                ?? r2 = this.c;
                java.util.Objects.toString(r2);
                defpackage.xox.f("OTMServiceBinder", "Failed to fetch task state for ".concat(java.lang.String.valueOf((java.lang.Object) r2)), e2);
                ((defpackage.xls) this.d).a(((defpackage.xlh) this.e).g(defpackage.xfc.e(defpackage.xhp.h(r2, new defpackage.xhm("Task execution failed with an exception."), null, 12))));
                if (e2 instanceof java.util.concurrent.CancellationException) {
                    throw e2;
                }
            }
            return aojh.a;
        }
        if (i == 2) {
            aolu aoluVar3 = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                    str = str;
                } else {
                    aooc.af(obj);
                    java.lang.Object obj7 = this.c;
                    java.lang.Object obj8 = this.d;
                    ((defpackage.xlh) obj7).o((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj8, this.b);
                    android.os.PersistableBundle persistableBundleB = ((defpackage.xlh) obj7).b((android.os.PersistableBundle) this.e);
                    this.a = 1;
                    java.lang.Object objM3 = ((defpackage.xlh) obj7).m((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj8, persistableBundleB, this);
                    str = objM3;
                    if (objM3 == aoluVar3) {
                        return aoluVar3;
                    }
                }
            } catch (java.lang.Exception e3) {
                defpackage.xox.f(str, "Task " + this.d + " failed to start", e3);
                if (e3 instanceof java.util.concurrent.CancellationException) {
                    throw e3;
                }
                z = false;
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i == 3) {
            aolu aoluVar4 = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                    objA = obj;
                } else {
                    aooc.af(obj);
                    java.lang.Object obj9 = this.e;
                    ?? r8 = this.c;
                    ((defpackage.xlh) obj9).o((com.android.onboarding.tasks.ErasedOnboardingTaskToken) r8, this.b);
                    defpackage.xon xonVar = ((defpackage.xlh) obj9).g;
                    defpackage.xmx xmxVarV = defpackage.xlh.v(r8);
                    this.a = 1;
                    objA = xonVar.a(xmxVarV, this);
                    if (objA == aoluVar4) {
                        return aoluVar4;
                    }
                }
                com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskStateE = defpackage.xfc.e((defpackage.xmk) objA);
                ?? r3 = this.d;
                java.lang.Object obj10 = this.e;
                r3.a(((defpackage.xlh) obj10).g(erasedOnboardingTaskStateE), ((defpackage.xlh) obj10).e(erasedOnboardingTaskStateE));
            } catch (java.lang.Exception e4) {
                ?? r4 = this.c;
                java.util.Objects.toString(r4);
                defpackage.xox.f("OTMServiceBinder", "Failed to await task completion for ".concat(java.lang.String.valueOf((java.lang.Object) r4)), e4);
                com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskStateE2 = defpackage.xfc.e(defpackage.xhp.h(r4, new defpackage.xhm("Task execution failed with an exception."), null, 12));
                ?? r5 = this.d;
                defpackage.xlh xlhVar = (defpackage.xlh) this.e;
                r5.a(xlhVar.g(erasedOnboardingTaskStateE2), xlhVar.e(erasedOnboardingTaskStateE2));
                if (e4 instanceof java.util.concurrent.CancellationException) {
                    throw e4;
                }
            }
            return aojh.a;
        }
        if (i == 4) {
            aolu aoluVar5 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 != 0) {
                return obj;
            }
            java.lang.Object obj11 = this.e;
            java.lang.Object obj12 = this.c;
            java.lang.Object obj13 = this.d;
            this.a = 1;
            java.lang.Object objE = ((defpackage.afpl) obj11).b.e((akik) obj12, 3, (akjc) obj13, this);
            return objE != aoluVar5 ? objE : aoluVar5;
        }
        if (i != 5) {
            aolu aoluVar6 = aolu.a;
            int i4 = this.a;
            aooc.af(obj);
            if (i4 == 0) {
                java.lang.Object obj14 = this.d;
                ?? r1 = this.e;
                java.lang.Object obj15 = this.c;
                float f = ((defpackage.aooq) obj14).a;
                defpackage.abkv abkvVar = new defpackage.abkv(obj15, 10);
                this.a = 1;
                if (wx.g(f, 1.0f, (aiq) r1, abkvVar, this, 4) == aoluVar6) {
                    return aoluVar6;
                }
            }
            int i5 = this.b;
            defpackage.acsl acslVar = (defpackage.acsl) this.c;
            if (i5 == acslVar.e) {
                acslVar.d = null;
                if (acslVar.c == null) {
                    acslVar.f();
                }
            }
            return aojh.a;
        }
        aolu aoluVar7 = aolu.a;
        int i6 = this.a;
        aooc.af(obj);
        if (i6 != 0) {
            objM = obj;
        } else {
            java.lang.Object obj16 = this.e;
            akik akikVar = (akik) this.c;
            acjk acjkVar = (acjk) obj16;
            android.content.Intent intentF = acjkVar.f(akikVar);
            if (intentF == null) {
                return null;
            }
            alat<akjr> alatVar = akikVar.h;
            aooh.e(alatVar, "getExtraDataList(...)");
            for (akjr akjrVar : alatVar) {
                int i7 = akjrVar.c;
                int iB = akky.b(i7);
                if (iB == 0) {
                    throw null;
                }
                int i8 = iB - 1;
                if (i8 == 0) {
                    aooh.c(intentF.putExtra(akjrVar.e, i7 == 2 ? (java.lang.String) akjrVar.d : ""));
                } else if (i8 == 1) {
                    aooh.c(intentF.putExtra(akjrVar.e, i7 == 4 ? ((java.lang.Integer) akjrVar.d).intValue() : 0));
                } else if (i8 == 2) {
                    aooh.c(intentF.putExtra(akjrVar.e, i7 == 5 ? ((java.lang.Boolean) akjrVar.d).booleanValue() : false));
                } else if (i8 == 3 && i7 == 3) {
                    ((java.lang.Integer) akjrVar.d).intValue();
                }
            }
            if (acjkVar.c.isEmpty()) {
                return intentF;
            }
            java.lang.Object obj17 = this.d;
            this.a = 1;
            objM = aosv.m(new defpackage.acji(intentF, 3, (akjc) obj17, acjkVar, null), this);
            if (objM == aoluVar7) {
                return aoluVar7;
            }
        }
        return (android.content.Intent) objM;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, xlw] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.c;
            return new defpackage.xla((defpackage.xlh) obj2, (com.android.onboarding.tasks.ErasedOnboardingTaskToken) this.d, this.b, (android.os.PersistableBundle) this.e, aolnVar, 0);
        }
        if (i == 1) {
            java.lang.Object obj3 = this.e;
            return new defpackage.xla((defpackage.xlh) obj3, (com.android.onboarding.tasks.ErasedOnboardingTaskToken) this.c, this.b, (defpackage.xls) this.d, aolnVar, 1);
        }
        if (i == 2) {
            java.lang.Object obj4 = this.c;
            return new defpackage.xla((defpackage.xlh) obj4, (com.android.onboarding.tasks.ErasedOnboardingTaskToken) this.d, this.b, (android.os.PersistableBundle) this.e, aolnVar, 2, null);
        }
        if (i == 3) {
            java.lang.Object obj5 = this.e;
            return new defpackage.xla((defpackage.xlh) obj5, (com.android.onboarding.tasks.ErasedOnboardingTaskToken) this.c, this.b, (defpackage.xlw) this.d, aolnVar, 3);
        }
        if (i == 4) {
            java.lang.Object obj6 = this.e;
            return new defpackage.xla((defpackage.afpl) obj6, (akik) this.c, 3, (akjc) this.d, aolnVar, 4);
        }
        if (i != 5) {
            return new defpackage.xla((defpackage.aooq) this.d, (ajl) this.e, this.b, (defpackage.acsl) this.c, aolnVar, 6);
        }
        java.lang.Object obj7 = this.e;
        return new defpackage.xla((acjk) obj7, (akik) this.c, 3, (akjc) this.d, aolnVar, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(defpackage.afpl afplVar, akik akikVar, int i, akjc akjcVar, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.e = afplVar;
        this.c = akikVar;
        this.b = 3;
        this.d = akjcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(defpackage.aooq aooqVar, ajl ajlVar, int i, defpackage.acsl acslVar, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.d = aooqVar;
        this.e = ajlVar;
        this.b = i;
        this.c = acslVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(defpackage.xlh xlhVar, com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, int i, android.os.PersistableBundle persistableBundle, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.c = xlhVar;
        this.d = erasedOnboardingTaskToken;
        this.b = i;
        this.e = persistableBundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(defpackage.xlh xlhVar, com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, int i, android.os.PersistableBundle persistableBundle, aoln aolnVar, int i2, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i2;
        this.c = xlhVar;
        this.d = erasedOnboardingTaskToken;
        this.b = i;
        this.e = persistableBundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(defpackage.xlh xlhVar, com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, int i, defpackage.xls xlsVar, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.e = xlhVar;
        this.c = erasedOnboardingTaskToken;
        this.b = i;
        this.d = xlsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(defpackage.xlh xlhVar, com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, int i, defpackage.xlw xlwVar, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.e = xlhVar;
        this.c = erasedOnboardingTaskToken;
        this.b = i;
        this.d = xlwVar;
    }
}
