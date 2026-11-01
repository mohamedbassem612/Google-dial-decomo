package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xlf extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.xoc e;
    final /* synthetic */ defpackage.xlh f;
    final /* synthetic */ int g;
    final /* synthetic */ defpackage.xoc h;
    final /* synthetic */ defpackage.xoe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlf(defpackage.xoc xocVar, defpackage.xlh xlhVar, int i, defpackage.xoc xocVar2, defpackage.xoe xoeVar, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.e = xocVar;
        this.f = xlhVar;
        this.g = i;
        this.h = xocVar2;
        this.i = xoeVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [xjz] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [xjz] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken2;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        defpackage.xnv xnvVar;
        ?? r4 = 0;
        ?? r5 = 0;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.d;
            try {
                try {
                    if (i == 0) {
                        aooc.af(obj);
                        defpackage.xoc xocVar = this.e;
                        defpackage.xlr xlrVar = com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR;
                        this.d = 1;
                        obj = defpackage.xff.q(xocVar, xlrVar, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                java.lang.Object obj8 = this.a;
                                aooc.af(obj);
                                r5 = obj8;
                            } else {
                                obj6 = this.c;
                                java.lang.Object obj9 = this.b;
                                obj5 = this.a;
                                try {
                                    aooc.af(obj);
                                    obj7 = obj9;
                                    xnvVar = new defpackage.xnv((android.os.PersistableBundle) obj);
                                    this.a = obj5;
                                    this.b = null;
                                    this.c = null;
                                    this.d = 3;
                                    if (((defpackage.xlh) obj7).l((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj6, xnvVar, this) != aoluVar) {
                                        return aoluVar;
                                    }
                                    r5 = obj5;
                                } catch (java.lang.Exception e) {
                                    e = e;
                                    r5 = obj5;
                                    this.i.a(defpackage.xlh.x(this.f, r5, e));
                                    if (e instanceof java.util.concurrent.CancellationException) {
                                        throw e;
                                    }
                                }
                            }
                            this.i.b();
                            return aojh.a;
                        }
                        aooc.af(obj);
                    }
                    defpackage.xlh xlhVar = this.f;
                    xlhVar.o(erasedOnboardingTaskToken2, this.g);
                    defpackage.xoc xocVar2 = this.h;
                    this.a = erasedOnboardingTaskToken2;
                    this.b = xlhVar;
                    this.c = erasedOnboardingTaskToken2;
                    this.d = 2;
                    java.lang.Object objR = defpackage.xff.r(xocVar2, this);
                    if (objR == aoluVar) {
                        return aoluVar;
                    }
                    obj5 = erasedOnboardingTaskToken2;
                    obj = objR;
                    obj6 = obj5;
                    obj7 = xlhVar;
                    xnvVar = new defpackage.xnv((android.os.PersistableBundle) obj);
                    this.a = obj5;
                    this.b = null;
                    this.c = null;
                    this.d = 3;
                    if (((defpackage.xlh) obj7).l((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj6, xnvVar, this) != aoluVar) {
                        return aoluVar;
                    }
                    r5 = obj5;
                    this.i.b();
                    return aojh.a;
                } catch (java.lang.Exception e2) {
                    r5 = erasedOnboardingTaskToken2;
                    e = e2;
                    this.i.a(defpackage.xlh.x(this.f, r5, e));
                    if (e instanceof java.util.concurrent.CancellationException) {
                        throw e;
                    }
                }
                erasedOnboardingTaskToken2 = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj;
            } catch (java.lang.Exception e3) {
                e = e3;
            }
        } else {
            aolu aoluVar2 = aolu.a;
            int i2 = this.d;
            try {
                try {
                    if (i2 == 0) {
                        aooc.af(obj);
                        defpackage.xoc xocVar3 = this.e;
                        defpackage.xlr xlrVar2 = com.android.onboarding.tasks.ErasedOnboardingTaskToken.CREATOR;
                        this.d = 1;
                        obj = defpackage.xff.q(xocVar3, xlrVar2, this);
                        if (obj == aoluVar2) {
                            return aoluVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                java.lang.Object obj10 = this.a;
                                aooc.af(obj);
                                r4 = obj10;
                            } else {
                                obj3 = this.c;
                                java.lang.Object obj11 = this.b;
                                obj2 = this.a;
                                try {
                                    aooc.af(obj);
                                    obj4 = obj11;
                                    this.a = obj2;
                                    this.b = null;
                                    this.c = null;
                                    this.d = 3;
                                    if (((defpackage.xlh) obj4).m((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj3, (android.os.PersistableBundle) obj, this) != aoluVar2) {
                                        return aoluVar2;
                                    }
                                    r4 = obj2;
                                } catch (java.lang.Exception e4) {
                                    e = e4;
                                    r4 = obj2;
                                    this.i.a(defpackage.xlh.x(this.f, r4, e));
                                    if (e instanceof java.util.concurrent.CancellationException) {
                                        throw e;
                                    }
                                }
                            }
                            this.i.b();
                            return aojh.a;
                        }
                        aooc.af(obj);
                    }
                    defpackage.xlh xlhVar2 = this.f;
                    xlhVar2.o(erasedOnboardingTaskToken, this.g);
                    defpackage.xoc xocVar4 = this.h;
                    this.a = erasedOnboardingTaskToken;
                    this.b = xlhVar2;
                    this.c = erasedOnboardingTaskToken;
                    this.d = 2;
                    java.lang.Object objR2 = defpackage.xff.r(xocVar4, this);
                    if (objR2 == aoluVar2) {
                        return aoluVar2;
                    }
                    obj2 = erasedOnboardingTaskToken;
                    obj = objR2;
                    obj3 = obj2;
                    obj4 = xlhVar2;
                    this.a = obj2;
                    this.b = null;
                    this.c = null;
                    this.d = 3;
                    if (((defpackage.xlh) obj4).m((com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj3, (android.os.PersistableBundle) obj, this) != aoluVar2) {
                        return aoluVar2;
                    }
                    r4 = obj2;
                    this.i.b();
                    return aojh.a;
                } catch (java.lang.Exception e5) {
                    r4 = erasedOnboardingTaskToken;
                    e = e5;
                    this.i.a(defpackage.xlh.x(this.f, r4, e));
                    if (e instanceof java.util.concurrent.CancellationException) {
                        throw e;
                    }
                }
                erasedOnboardingTaskToken = (com.android.onboarding.tasks.ErasedOnboardingTaskToken) obj;
            } catch (java.lang.Exception e6) {
                e = e6;
            }
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return this.$cid != 0 ? new defpackage.xlf(this.e, this.f, this.g, this.h, this.i, aolnVar, 1, null) : new defpackage.xlf(this.e, this.f, this.g, this.h, this.i, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlf(defpackage.xoc xocVar, defpackage.xlh xlhVar, int i, defpackage.xoc xocVar2, defpackage.xoe xoeVar, aoln aolnVar, int i2, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i2;
        this.e = xocVar;
        this.f = xlhVar;
        this.g = i;
        this.h = xocVar2;
        this.i = xoeVar;
    }
}
