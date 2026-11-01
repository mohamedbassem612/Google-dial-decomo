package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xol extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.xon f;
    final /* synthetic */ defpackage.xmx g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xol(defpackage.xon xonVar, defpackage.xmx xmxVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = xonVar;
        this.g = xmxVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: all -> 0x015d, xoo -> 0x017b, CancellationException -> 0x0189, TRY_LEAVE, TryCatch #12 {all -> 0x015d, blocks: (B:36:0x009b, B:38:0x00ad, B:49:0x00d8, B:51:0x00ec, B:54:0x0104, B:60:0x013d, B:61:0x015c), top: B:79:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[Catch: all -> 0x015d, xoo -> 0x017b, CancellationException -> 0x0189, TRY_ENTER, TryCatch #12 {all -> 0x015d, blocks: (B:36:0x009b, B:38:0x00ad, B:49:0x00d8, B:51:0x00ec, B:54:0x0104, B:60:0x013d, B:61:0x015c), top: B:79:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec A[Catch: all -> 0x015d, xoo -> 0x017b, CancellationException -> 0x0189, TryCatch #12 {all -> 0x015d, blocks: (B:36:0x009b, B:38:0x00ad, B:49:0x00d8, B:51:0x00ec, B:54:0x0104, B:60:0x013d, B:61:0x015c), top: B:79:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104 A[Catch: all -> 0x015d, xoo -> 0x017b, CancellationException -> 0x0189, TRY_LEAVE, TryCatch #12 {all -> 0x015d, blocks: (B:36:0x009b, B:38:0x00ad, B:49:0x00d8, B:51:0x00ec, B:54:0x0104, B:60:0x013d, B:61:0x015c), top: B:79:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d A[Catch: all -> 0x015d, xoo -> 0x017b, CancellationException -> 0x0189, TRY_ENTER, TryCatch #12 {all -> 0x015d, blocks: (B:36:0x009b, B:38:0x00ad, B:49:0x00d8, B:51:0x00ec, B:54:0x0104, B:60:0x013d, B:61:0x015c), top: B:79:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x013d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [xmw] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xjz] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v5, types: [xjz] */
    /* JADX WARN: Type inference failed for: r1v8, types: [xjz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aolu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xjz] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, xjz, xni] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object b(java.lang.Object obj) throws defpackage.xoo {
        java.lang.Object obj2;
        defpackage.xon xonVar;
        aoxi aoxiVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        ?? r3;
        ?? r12;
        defpackage.xmq xmqVarC;
        aozj aozjVar;
        aoxh aowyVar;
        aoxh aoxhVar;
        java.lang.Object obj5;
        java.lang.Object obj6;
        aoxi aoxiVar2;
        ?? r4;
        aoxw aoxwVar;
        avg avgVar;
        ?? r1 = "State flow not found for node ";
        ?? r2 = aolu.a;
        int i = this.e;
        try {
            if (i == 0) {
                aooc.af(obj);
                aoxi aoxiVar3 = (aoxi) this.h;
                obj2 = this.g;
                xonVar = this.f;
                try {
                    try {
                        defpackage.xmw xmwVar = xonVar.d;
                        this.h = aoxiVar3;
                        this.a = obj2;
                        this.b = obj2;
                        this.c = xonVar;
                        this.d = obj2;
                        this.e = 1;
                        if (xmwVar.g(this) == r2) {
                            return r2;
                        }
                        aoxiVar = aoxiVar3;
                        java.lang.Object obj7 = obj2;
                        obj3 = obj7;
                        r3 = obj7;
                        int i2 = defpackage.xon.g;
                        r12 = xonVar.d;
                        xmqVarC = r12.c(r3);
                        if (r12.c(r3).h()) {
                            defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r3, "Task(", ") is already complete. Closing state observer."));
                            this.h = obj3;
                            this.a = obj2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = 2;
                            if (aoxiVar.a(xmqVarC, this) != r2) {
                                return aojh.a;
                            }
                            return r2;
                        }
                        aooh.f((java.lang.Object) r3, "token");
                        aozjVar = (aozj) r12.d.get(new defpackage.xjy(r3));
                        if (aozjVar != null) {
                            aowyVar = new aowy(new defpackage.ahgx((aoxh) new aoys(aozjVar, (aoub) null), (aono) new ill((aoln) null, 4, (int[]) null), (aoln) null, 2));
                        } else {
                            aowyVar = null;
                        }
                        if (aowyVar != null) {
                            defpackage.xox.e("OnboardingTaskServiceServer", "State flow not found for node " + defpackage.xfh.a(r3) + '.');
                            throw new java.lang.IllegalStateException("Task cannot be found.");
                        }
                        this.h = aoxiVar;
                        this.a = obj3;
                        this.b = obj2;
                        this.c = r3;
                        this.d = aowyVar;
                        this.e = 3;
                        if (aoxiVar.a(xmqVarC, this) != r2) {
                            return r2;
                        }
                        aoxhVar = aowyVar;
                        obj5 = obj2;
                        obj6 = obj3;
                        aoxiVar2 = aoxiVar;
                        r4 = r3;
                        aoxwVar = new aoxw(aoxhVar, 1);
                        avgVar = new avg((java.lang.Object) r4, aoxiVar2, 9, (byte[]) null);
                        this.h = obj6;
                        this.a = obj5;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = 4;
                        if (aoxwVar.fM(avgVar, this) == r2) {
                            return r2;
                        }
                        return aojh.a;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r1 = obj2;
                        r2 = r1;
                        defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), th);
                        throw new defpackage.xoo(r2, th, null);
                    }
                } catch (java.util.concurrent.CancellationException e) {
                    e = e;
                    r1 = obj2;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), e);
                    throw e;
                } catch (defpackage.xoo e2) {
                    e = e2;
                    r1 = obj2;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), e);
                    throw e;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    java.lang.Object obj8 = this.a;
                    aooc.af(obj);
                    return aojh.a;
                }
                if (i != 3) {
                    java.lang.Object obj9 = this.a;
                    aooc.af(obj);
                } else {
                    aoxhVar = (aoxh) this.d;
                    defpackage.xmx xmxVar = (defpackage.xmx) this.c;
                    obj5 = this.b;
                    obj6 = this.a;
                    aoxiVar2 = (aoxi) this.h;
                    try {
                        aooc.af(obj);
                        r4 = xmxVar;
                        obj6 = obj6;
                        aoxwVar = new aoxw(aoxhVar, 1);
                        avgVar = new avg((java.lang.Object) r4, aoxiVar2, 9, (byte[]) null);
                        this.h = obj6;
                        this.a = obj5;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = 4;
                        if (aoxwVar.fM(avgVar, this) == r2) {
                            return r2;
                        }
                    } catch (java.util.concurrent.CancellationException e3) {
                        e = e3;
                        r1 = obj5;
                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), e);
                        throw e;
                    } catch (defpackage.xoo e4) {
                        e = e4;
                        r1 = obj5;
                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r1 = obj5;
                        r2 = obj6;
                        defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), th);
                        throw new defpackage.xoo(r2, th, null);
                    }
                }
                return aojh.a;
            }
            defpackage.xmx xmxVar2 = (defpackage.xmx) this.d;
            defpackage.xon xonVar2 = (defpackage.xon) this.c;
            java.lang.Object obj10 = this.b;
            java.lang.Object obj11 = this.a;
            aoxiVar = (aoxi) this.h;
            try {
                aooc.af(obj);
                xonVar = xonVar2;
                obj2 = obj10;
                r3 = xmxVar2;
                obj3 = obj11;
                try {
                    int i3 = defpackage.xon.g;
                    r12 = xonVar.d;
                    xmqVarC = r12.c(r3);
                    if (r12.c(r3).h()) {
                        defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r3, "Task(", ") is already complete. Closing state observer."));
                        this.h = obj3;
                        this.a = obj2;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = 2;
                        if (aoxiVar.a(xmqVarC, this) != r2) {
                            return aojh.a;
                        }
                        return r2;
                    }
                    aooh.f((java.lang.Object) r3, "token");
                    aozjVar = (aozj) r12.d.get(new defpackage.xjy(r3));
                    if (aozjVar != null) {
                        aowyVar = new aowy(new defpackage.ahgx((aoxh) new aoys(aozjVar, (aoub) null), (aono) new ill((aoln) null, 4, (int[]) null), (aoln) null, 2));
                    } else {
                        aowyVar = null;
                    }
                    if (aowyVar != null) {
                        defpackage.xox.e("OnboardingTaskServiceServer", "State flow not found for node " + defpackage.xfh.a(r3) + '.');
                        throw new java.lang.IllegalStateException("Task cannot be found.");
                    }
                    this.h = aoxiVar;
                    this.a = obj3;
                    this.b = obj2;
                    this.c = r3;
                    this.d = aowyVar;
                    this.e = 3;
                    if (aoxiVar.a(xmqVarC, this) != r2) {
                        return r2;
                    }
                    aoxhVar = aowyVar;
                    obj5 = obj2;
                    obj6 = obj3;
                    aoxiVar2 = aoxiVar;
                    r4 = r3;
                    aoxwVar = new aoxw(aoxhVar, 1);
                    avgVar = new avg((java.lang.Object) r4, aoxiVar2, 9, (byte[]) null);
                    this.h = obj6;
                    this.a = obj5;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = 4;
                    if (aoxwVar.fM(avgVar, this) == r2) {
                        return r2;
                    }
                    return aojh.a;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    r1 = obj2;
                    obj4 = obj3;
                    r2 = obj4;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), th);
                    throw new defpackage.xoo(r2, th, null);
                }
            } catch (java.util.concurrent.CancellationException e5) {
                e = e5;
                r1 = obj10;
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), e);
                throw e;
            } catch (defpackage.xoo e6) {
                e = e6;
                r1 = obj10;
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), e);
                throw e;
            } catch (java.lang.Throwable th4) {
                th = th4;
                r1 = obj10;
                obj4 = obj11;
                r2 = obj4;
                defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task state for node ".concat(defpackage.xfh.a(r1)), th);
                throw new defpackage.xoo(r2, th, null);
            }
        } catch (java.util.concurrent.CancellationException e7) {
            e = e7;
        } catch (defpackage.xoo e8) {
            e = e8;
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.xol xolVar = new defpackage.xol(this.f, this.g, aolnVar);
        xolVar.h = obj;
        return xolVar;
    }
}
