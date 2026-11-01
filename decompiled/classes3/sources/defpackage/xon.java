package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xon implements defpackage.xhu {
    static final /* synthetic */ aoqc[] a = {new aoom(defpackage.xon.class, "otm", "getOtm()Lcom/android/onboarding/tasks/OnboardingTaskManager;", 0)};
    public static final /* synthetic */ int g = 0;
    public final /* synthetic */ defpackage.xhu b;
    public final java.util.Collection c;
    public final defpackage.xmw d;
    public final java.util.Set e;
    public final java.util.Set f;
    private final java.util.function.Supplier h;
    private final defpackage.xkp i;
    private final aoss j;
    private final java.util.function.Supplier k;
    private final aope l;
    private final aoir m;

    public xon(defpackage.xhu xhuVar, java.util.function.Supplier supplier, java.util.Collection collection, defpackage.xkp xkpVar, aoss aossVar, java.util.function.Supplier supplier2, defpackage.xmw xmwVar, java.util.Set set, java.util.Set set2, aope aopeVar) {
        aooh.f(xhuVar, "component");
        this.b = xhuVar;
        this.h = supplier;
        this.c = collection;
        this.i = xkpVar;
        this.j = aossVar;
        this.k = supplier2;
        this.d = xmwVar;
        this.e = set;
        this.f = set2;
        this.l = aopeVar;
        this.m = aooc.ag(new defpackage.xmr(this, 4));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final void h(defpackage.xmq xmqVar, java.lang.Throwable th) throws aois {
        defpackage.xou xosVar;
        j$.util.Objects.checkIndex(0, 4);
        if (xmqVar != null) {
            if (xmqVar instanceof defpackage.xmp) {
                defpackage.xmp xmpVar = (defpackage.xmp) xmqVar;
                java.lang.Object objG = xmpVar.g();
                xosVar = objG instanceof defpackage.xou ? (defpackage.xou) objG : null;
                if (xosVar == null) {
                    xosVar = new defpackage.xot(xmpVar.g());
                }
            } else if (xmqVar instanceof defpackage.xmm) {
                defpackage.xmm xmmVar = (defpackage.xmm) xmqVar;
                java.lang.Object objG2 = xmmVar.g();
                xosVar = objG2 instanceof defpackage.xou ? (defpackage.xou) objG2 : null;
                if (xosVar == null) {
                    xosVar = new defpackage.xos(th, xmmVar.d);
                }
            } else if (xmqVar instanceof defpackage.xmo) {
                defpackage.xox.g("OnboardingTaskServiceServer", "logCompleteTask called with non-complete task " + defpackage.xfh.a(xmqVar) + " (" + xmqVar + ')');
                return;
            }
            defpackage.xou xouVar = xosVar;
            defpackage.xmk xmkVar = (defpackage.xmk) xmqVar;
            defpackage.xjb.c.a(new defpackage.xis(xmkVar.getNodeName(), xmkVar.getNodeComponent(), xmqVar.d(), xouVar));
            return;
        }
        throw new aois();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x017d A[ADDED_TO_REGION, EDGE_INSN: B:117:0x017d->B:68:0x017d BREAK  A[LOOP:0: B:61:0x0153->B:67:0x0178], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[Catch: all -> 0x0218, xoo -> 0x021e, CancellationException -> 0x0224, TryCatch #8 {CancellationException -> 0x0224, xoo -> 0x021e, all -> 0x0218, blocks: (B:44:0x00ac, B:46:0x00b8, B:47:0x00c4, B:49:0x00ca, B:53:0x00e7, B:55:0x00eb, B:57:0x0117, B:56:0x00ff), top: B:113:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[Catch: all -> 0x0218, xoo -> 0x021e, CancellationException -> 0x0224, TryCatch #8 {CancellationException -> 0x0224, xoo -> 0x021e, all -> 0x0218, blocks: (B:44:0x00ac, B:46:0x00b8, B:47:0x00c4, B:49:0x00ca, B:53:0x00e7, B:55:0x00eb, B:57:0x0117, B:56:0x00ff), top: B:113:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca A[Catch: all -> 0x0218, xoo -> 0x021e, CancellationException -> 0x0224, TRY_LEAVE, TryCatch #8 {CancellationException -> 0x0224, xoo -> 0x021e, all -> 0x0218, blocks: (B:44:0x00ac, B:46:0x00b8, B:47:0x00c4, B:49:0x00ca, B:53:0x00e7, B:55:0x00eb, B:57:0x0117, B:56:0x00ff), top: B:113:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7 A[Catch: all -> 0x0218, xoo -> 0x021e, CancellationException -> 0x0224, TRY_ENTER, TryCatch #8 {CancellationException -> 0x0224, xoo -> 0x021e, all -> 0x0218, blocks: (B:44:0x00ac, B:46:0x00b8, B:47:0x00c4, B:49:0x00ca, B:53:0x00e7, B:55:0x00eb, B:57:0x0117, B:56:0x00ff), top: B:113:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[Catch: all -> 0x0218, xoo -> 0x021e, CancellationException -> 0x0224, TryCatch #8 {CancellationException -> 0x0224, xoo -> 0x021e, all -> 0x0218, blocks: (B:44:0x00ac, B:46:0x00b8, B:47:0x00c4, B:49:0x00ca, B:53:0x00e7, B:55:0x00eb, B:57:0x0117, B:56:0x00ff), top: B:113:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff A[Catch: all -> 0x0218, xoo -> 0x021e, CancellationException -> 0x0224, TryCatch #8 {CancellationException -> 0x0224, xoo -> 0x021e, all -> 0x0218, blocks: (B:44:0x00ac, B:46:0x00b8, B:47:0x00c4, B:49:0x00ca, B:53:0x00e7, B:55:0x00eb, B:57:0x0117, B:56:0x00ff), top: B:113:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015f A[Catch: all -> 0x0210, xoo -> 0x0244, CancellationException -> 0x0251, TryCatch #8 {all -> 0x0210, blocks: (B:74:0x01c5, B:67:0x0178, B:61:0x0153, B:63:0x015f, B:65:0x0165, B:68:0x017d, B:70:0x0189, B:71:0x01aa, B:75:0x01cf, B:76:0x020f, B:51:0x00df), top: B:107:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0189 A[Catch: all -> 0x0210, xoo -> 0x0244, CancellationException -> 0x0251, TryCatch #8 {all -> 0x0210, blocks: (B:74:0x01c5, B:67:0x0178, B:61:0x0153, B:63:0x015f, B:65:0x0165, B:68:0x017d, B:70:0x0189, B:71:0x01aa, B:75:0x01cf, B:76:0x020f, B:51:0x00df), top: B:107:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cf A[Catch: all -> 0x0210, xoo -> 0x0244, CancellationException -> 0x0251, TryCatch #8 {all -> 0x0210, blocks: (B:74:0x01c5, B:67:0x0178, B:61:0x0153, B:63:0x015f, B:65:0x0165, B:68:0x017d, B:70:0x0189, B:71:0x01aa, B:75:0x01cf, B:76:0x020f, B:51:0x00df), top: B:107:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0189, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01cf, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [xmq] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xmx] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xjz] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [xjz] */
    /* JADX WARN: Type inference failed for: r1v23, types: [xjz] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, xmx, xni] */
    /* JADX WARN: Type inference failed for: r1v27, types: [xni] */
    /* JADX WARN: Type inference failed for: r1v28, types: [xhi] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, xmx] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, xjz, xmx, xni] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [xmx] */
    /* JADX WARN: Type inference failed for: r2v12, types: [xmx] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [xjz] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [xmx] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [xmw] */
    /* JADX WARN: Type inference failed for: r5v4, types: [xmw] */
    /* JADX WARN: Type inference failed for: r5v9, types: [xmw] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.StringBuilder] */
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
    public final java.lang.Object a(defpackage.xmx xmxVar, aoln aolnVar) {
        defpackage.xog xogVar;
        ?? r1;
        ?? r2;
        ?? r3;
        long j;
        long j2;
        ?? r4;
        long j3;
        java.lang.Object obj;
        ?? r5;
        ?? r6;
        defpackage.xmq xmqVarC;
        ?? r7;
        ?? r8;
        defpackage.xmw xmwVar;
        ?? r20;
        ?? r9;
        defpackage.xmq xmqVarC2;
        aoub aoubVarH;
        j$.time.Duration duration;
        ?? r10 = xmxVar;
        if (aolnVar instanceof defpackage.xog) {
            xogVar = (defpackage.xog) aolnVar;
            int i = xogVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xogVar.g = i - Integer.MIN_VALUE;
            } else {
                xogVar = new defpackage.xog(this, aolnVar);
            }
        } else {
            xogVar = new defpackage.xog(this, aolnVar);
        }
        ?? r11 = xogVar.e;
        aolu aoluVar = aolu.a;
        ?? r12 = xogVar.g;
        try {
            if (r12 != 0) {
                try {
                    if (r12 == 1) {
                        defpackage.xmx xmxVar2 = xogVar.i;
                        defpackage.xmx xmxVar3 = xogVar.h;
                        aooc.af((java.lang.Object) r11);
                        r11 = xmxVar2;
                        r1 = xmxVar3;
                        try {
                            r9 = this.d;
                            xmqVarC2 = r9.c(r1);
                            if (xmqVarC2.h()) {
                                defpackage.xox.b("OnboardingTaskServiceServer", a.bi(xmqVarC2, (java.lang.Object) r1, "awaitTaskCompletion: Task(", ") is already completed - "));
                                xmqVarC = xmqVarC2;
                                r8 = r1;
                                r7 = r11;
                            } else {
                                aoubVarH = r9.h(r1);
                                if (aoubVarH != null) {
                                    defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r1, "awaitTaskCompletion: Task(", ") found in execution cache. Waiting for completion."));
                                    xogVar.h = r1;
                                    xogVar.i = r11;
                                    xogVar.g = 2;
                                    if (aoubVarH.n(xogVar) == aoluVar) {
                                        r3 = r1;
                                        r2 = r11;
                                        return aoluVar;
                                    }
                                    r3 = r1;
                                    r2 = r11;
                                    xmqVarC = this.d.c(r3);
                                    r8 = r3;
                                    r7 = r2;
                                } else {
                                    duration = r1.b;
                                    if (duration == null) {
                                        defpackage.xox.e("OnboardingTaskServiceServer", a.bg((java.lang.Object) r1, "awaitTaskCompletion: Task(", ") does not have a timeout defined."));
                                        long j4 = aorh.a;
                                        j2 = aooh.A(15, aorj.e);
                                    } else {
                                        j2 = aorh.j(aooh.B(duration.getSeconds(), aorj.d), aooh.A(duration.getNano(), aorj.a));
                                    }
                                    long j5 = aorh.a;
                                    long jA = aooh.A(50, aorj.c);
                                    java.lang.String strM = aorh.m(j2);
                                    java.lang.String strM2 = aorh.m(jA);
                                    ?? sb = new java.lang.StringBuilder("awaitTaskCompletion: Task(");
                                    sb.append(r1);
                                    r20 = r1;
                                    try {
                                        sb.append(") being polled for completion: timeoutDuration=");
                                        sb.append(strM);
                                        sb.append(" pollingInterval=");
                                        sb.append(strM2);
                                        defpackage.xox.b("OnboardingTaskServiceServer", sb.toString());
                                        j = jA;
                                        j3 = 0;
                                        r4 = r20;
                                        while (true) {
                                            r6 = this.d;
                                            if (r6.c(r4).h()) {
                                                break;
                                                break;
                                            }
                                            break;
                                            j3 = aorh.j(j3, j);
                                        }
                                        xmqVarC = r6.c(r4);
                                        if (!xmqVarC.h()) {
                                            defpackage.xox.c("OnboardingTaskServiceServer", "awaitTaskCompletion: Task(" + r4 + ") does not complete after polling for " + aorh.m(j2) + ". Are you using a singleton binder? b/479654792");
                                            throw new java.lang.IllegalStateException("Task does not complete after polling for " + aorh.m(j2) + '.');
                                        }
                                        defpackage.xox.b("OnboardingTaskServiceServer", "awaitTaskCompletion: Task(" + r4 + ") is now complete after polling for " + aorh.m(j3) + '.');
                                        r8 = r4;
                                        r7 = r11;
                                    } catch (java.util.concurrent.CancellationException e) {
                                        e = e;
                                        r10 = r20;
                                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), e);
                                        throw e;
                                    } catch (defpackage.xoo e2) {
                                        e = e2;
                                        r10 = r20;
                                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), e);
                                        throw e;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        r10 = r20;
                                        defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), th);
                                        throw new defpackage.xoo(r11, th, null);
                                    }
                                }
                            }
                            defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r8, "awaitTaskCompletion(", "): Flushing before returning"));
                            xmwVar = this.d;
                            xogVar.h = r8;
                            xogVar.i = r7;
                            xogVar.a = xmqVarC;
                            xogVar.g = 4;
                            if (xmwVar.e(xogVar) != aoluVar) {
                                return aoluVar;
                            }
                            obj = xmqVarC;
                            r5 = r8;
                        } catch (java.util.concurrent.CancellationException e3) {
                            e = e3;
                            r20 = r1;
                        } catch (defpackage.xoo e4) {
                            e = e4;
                            r20 = r1;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            r20 = r1;
                        }
                    } else if (r12 == 2) {
                        defpackage.xmx xmxVar4 = xogVar.i;
                        defpackage.xmx xmxVar5 = xogVar.h;
                        aooc.af((java.lang.Object) r11);
                        r2 = xmxVar4;
                        r3 = xmxVar5;
                        r3 = r1;
                        r2 = r11;
                        xmqVarC = this.d.c(r3);
                        r8 = r3;
                        r7 = r2;
                        defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r8, "awaitTaskCompletion(", "): Flushing before returning"));
                        xmwVar = this.d;
                        xogVar.h = r8;
                        xogVar.i = r7;
                        xogVar.a = xmqVarC;
                        xogVar.g = 4;
                        if (xmwVar.e(xogVar) != aoluVar) {
                            return aoluVar;
                        }
                        obj = xmqVarC;
                        r5 = r8;
                    } else if (r12 == 3) {
                        long j6 = xogVar.d;
                        j = xogVar.c;
                        j2 = xogVar.b;
                        defpackage.xmx xmxVar6 = xogVar.i;
                        defpackage.xmx xmxVar7 = xogVar.h;
                        aooc.af((java.lang.Object) r11);
                        r11 = xmxVar6;
                        r4 = xmxVar7;
                        j3 = aorh.j(j6, j);
                        while (true) {
                            r6 = this.d;
                            if (r6.c(r4).h() || aorh.a(j3, j2) >= 0) {
                                break;
                            }
                            xogVar.h = r4;
                            xogVar.i = r11;
                            xogVar.b = j2;
                            xogVar.c = j;
                            xogVar.d = j3;
                            xogVar.g = 3;
                            if (aosv.k(j, xogVar) == aoluVar) {
                                return aoluVar;
                            }
                            j3 = aorh.j(j3, j);
                        }
                        xmqVarC = r6.c(r4);
                        if (!xmqVarC.h()) {
                            defpackage.xox.c("OnboardingTaskServiceServer", "awaitTaskCompletion: Task(" + r4 + ") does not complete after polling for " + aorh.m(j2) + ". Are you using a singleton binder? b/479654792");
                            throw new java.lang.IllegalStateException("Task does not complete after polling for " + aorh.m(j2) + '.');
                        }
                        defpackage.xox.b("OnboardingTaskServiceServer", "awaitTaskCompletion: Task(" + r4 + ") is now complete after polling for " + aorh.m(j3) + '.');
                        r8 = r4;
                        r7 = r11;
                        defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r8, "awaitTaskCompletion(", "): Flushing before returning"));
                        xmwVar = this.d;
                        xogVar.h = r8;
                        xogVar.i = r7;
                        xogVar.a = xmqVarC;
                        xogVar.g = 4;
                        if (xmwVar.e(xogVar) != aoluVar) {
                            return aoluVar;
                        }
                        obj = xmqVarC;
                        r5 = r8;
                    } else {
                        if (r12 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = xogVar.a;
                        defpackage.xmx xmxVar8 = xogVar.i;
                        defpackage.xmx xmxVar9 = xogVar.h;
                        try {
                            aooc.af((java.lang.Object) r11);
                            r5 = xmxVar9;
                        } catch (java.util.concurrent.CancellationException e5) {
                            e = e5;
                            r10 = xmxVar9;
                            defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), e);
                            throw e;
                        } catch (defpackage.xoo e6) {
                            e = e6;
                            r10 = xmxVar9;
                            defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), e);
                            throw e;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            r11 = xmxVar8;
                            r10 = xmxVar9;
                            defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                            defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), th);
                            throw new defpackage.xoo(r11, th, null);
                        }
                    }
                } catch (java.util.concurrent.CancellationException e7) {
                    e = e7;
                    r10 = r12;
                } catch (defpackage.xoo e8) {
                    e = e8;
                    r10 = r12;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    r11 = r10;
                    r10 = r12;
                }
            } else {
                aooc.af((java.lang.Object) r11);
                try {
                    try {
                        defpackage.xox.b("OnboardingTaskServiceServer", a.bi(r10.b, (java.lang.Object) r10, "awaitTaskCompletion(", ") with timeout: "));
                        defpackage.xmw xmwVar2 = this.d;
                        xogVar.h = r10;
                        xogVar.i = r10;
                        xogVar.g = 1;
                        if (xmwVar2.g(xogVar) == aoluVar) {
                            return aoluVar;
                        }
                        r11 = r10;
                        r1 = r10;
                        r9 = this.d;
                        xmqVarC2 = r9.c(r1);
                        if (xmqVarC2.h()) {
                            defpackage.xox.b("OnboardingTaskServiceServer", a.bi(xmqVarC2, (java.lang.Object) r1, "awaitTaskCompletion: Task(", ") is already completed - "));
                            xmqVarC = xmqVarC2;
                            r8 = r1;
                            r7 = r11;
                        } else {
                            aoubVarH = r9.h(r1);
                            if (aoubVarH != null) {
                                defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r1, "awaitTaskCompletion: Task(", ") found in execution cache. Waiting for completion."));
                                xogVar.h = r1;
                                xogVar.i = r11;
                                xogVar.g = 2;
                                if (aoubVarH.n(xogVar) == aoluVar) {
                                    r3 = r1;
                                    r2 = r11;
                                    return aoluVar;
                                }
                                r3 = r1;
                                r2 = r11;
                                xmqVarC = this.d.c(r3);
                                r8 = r3;
                                r7 = r2;
                            } else {
                                duration = r1.b;
                                if (duration == null) {
                                    defpackage.xox.e("OnboardingTaskServiceServer", a.bg((java.lang.Object) r1, "awaitTaskCompletion: Task(", ") does not have a timeout defined."));
                                    long j7 = aorh.a;
                                    j2 = aooh.A(15, aorj.e);
                                } else {
                                    j2 = aorh.j(aooh.B(duration.getSeconds(), aorj.d), aooh.A(duration.getNano(), aorj.a));
                                }
                                long j8 = aorh.a;
                                long jA2 = aooh.A(50, aorj.c);
                                java.lang.String strM3 = aorh.m(j2);
                                java.lang.String strM4 = aorh.m(jA2);
                                ?? sb2 = new java.lang.StringBuilder("awaitTaskCompletion: Task(");
                                sb2.append(r1);
                                r20 = r1;
                                sb2.append(") being polled for completion: timeoutDuration=");
                                sb2.append(strM3);
                                sb2.append(" pollingInterval=");
                                sb2.append(strM4);
                                defpackage.xox.b("OnboardingTaskServiceServer", sb2.toString());
                                j = jA2;
                                j3 = 0;
                                r4 = r20;
                                while (true) {
                                    r6 = this.d;
                                    if (r6.c(r4).h()) {
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                    j3 = aorh.j(j3, j);
                                }
                                xmqVarC = r6.c(r4);
                                if (!xmqVarC.h()) {
                                    defpackage.xox.c("OnboardingTaskServiceServer", "awaitTaskCompletion: Task(" + r4 + ") does not complete after polling for " + aorh.m(j2) + ". Are you using a singleton binder? b/479654792");
                                    throw new java.lang.IllegalStateException("Task does not complete after polling for " + aorh.m(j2) + '.');
                                }
                                defpackage.xox.b("OnboardingTaskServiceServer", "awaitTaskCompletion: Task(" + r4 + ") is now complete after polling for " + aorh.m(j3) + '.');
                                r8 = r4;
                                r7 = r11;
                            }
                        }
                        defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r8, "awaitTaskCompletion(", "): Flushing before returning"));
                        xmwVar = this.d;
                        xogVar.h = r8;
                        xogVar.i = r7;
                        xogVar.a = xmqVarC;
                        xogVar.g = 4;
                        if (xmwVar.e(xogVar) != aoluVar) {
                            return aoluVar;
                        }
                        obj = xmqVarC;
                        r5 = r8;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        r11 = r10;
                        defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), th);
                        throw new defpackage.xoo(r11, th, null);
                    }
                } catch (java.util.concurrent.CancellationException e9) {
                    e = e9;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), e);
                    throw e;
                } catch (defpackage.xoo e10) {
                    e = e10;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node ".concat(defpackage.xfh.a(r10)), e);
                    throw e;
                }
            }
            return (defpackage.xmk) ((defpackage.xmq) obj).e(r5);
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.xmx xmxVar, aoln aolnVar) throws defpackage.xoo {
        defpackage.xoi xoiVar;
        defpackage.xmx xmxVar2;
        if (aolnVar instanceof defpackage.xoi) {
            xoiVar = (defpackage.xoi) aolnVar;
            int i = xoiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xoiVar.c = i - Integer.MIN_VALUE;
            } else {
                xoiVar = new defpackage.xoi(this, aolnVar);
            }
        } else {
            xoiVar = new defpackage.xoi(this, aolnVar);
        }
        java.lang.Object obj = xoiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xoiVar.c;
        try {
            try {
                if (i2 == 0) {
                    aooc.af(obj);
                    defpackage.xox.b("OnboardingTaskServiceServer", a.bx(defpackage.xfh.a(xmxVar), "Getting task state for node "));
                    defpackage.xmw xmwVar = this.d;
                    xoiVar.d = xmxVar;
                    xoiVar.e = xmxVar;
                    xoiVar.c = 1;
                    if (xmwVar.g(xoiVar) == aoluVar) {
                        return aoluVar;
                    }
                    xmxVar2 = xmxVar;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.xmx xmxVar3 = xoiVar.e;
                    defpackage.xmx xmxVar4 = xoiVar.d;
                    aooc.af(obj);
                    xmxVar2 = xmxVar3;
                    xmxVar = xmxVar4;
                }
                try {
                    return this.d.c(xmxVar);
                } catch (java.lang.Throwable th) {
                    th = th;
                    xmxVar = xmxVar2;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                    throw new defpackage.xoo(xmxVar, th, null);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (defpackage.xoo e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[Catch: all -> 0x017f, xoo -> 0x019c, CancellationException -> 0x01a9, TRY_ENTER, TryCatch #9 {all -> 0x017f, blocks: (B:36:0x009b, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1, B:44:0x00c0, B:45:0x00d4, B:46:0x00d5, B:48:0x00df, B:50:0x0102, B:61:0x0146, B:52:0x0108, B:53:0x010c, B:55:0x0112, B:57:0x011e, B:59:0x0128, B:60:0x0145, B:64:0x015c, B:65:0x017e), top: B:81:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[Catch: all -> 0x017f, xoo -> 0x019c, CancellationException -> 0x01a9, TryCatch #9 {all -> 0x017f, blocks: (B:36:0x009b, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1, B:44:0x00c0, B:45:0x00d4, B:46:0x00d5, B:48:0x00df, B:50:0x0102, B:61:0x0146, B:52:0x0108, B:53:0x010c, B:55:0x0112, B:57:0x011e, B:59:0x0128, B:60:0x0145, B:64:0x015c, B:65:0x017e), top: B:81:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00df A[Catch: all -> 0x017f, xoo -> 0x019c, CancellationException -> 0x01a9, TryCatch #9 {all -> 0x017f, blocks: (B:36:0x009b, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1, B:44:0x00c0, B:45:0x00d4, B:46:0x00d5, B:48:0x00df, B:50:0x0102, B:61:0x0146, B:52:0x0108, B:53:0x010c, B:55:0x0112, B:57:0x011e, B:59:0x0128, B:60:0x0145, B:64:0x015c, B:65:0x017e), top: B:81:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0108 A[Catch: all -> 0x017f, xoo -> 0x019c, CancellationException -> 0x01a9, TryCatch #9 {all -> 0x017f, blocks: (B:36:0x009b, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1, B:44:0x00c0, B:45:0x00d4, B:46:0x00d5, B:48:0x00df, B:50:0x0102, B:61:0x0146, B:52:0x0108, B:53:0x010c, B:55:0x0112, B:57:0x011e, B:59:0x0128, B:60:0x0145, B:64:0x015c, B:65:0x017e), top: B:81:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: all -> 0x017f, xoo -> 0x019c, CancellationException -> 0x01a9, TryCatch #9 {all -> 0x017f, blocks: (B:36:0x009b, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1, B:44:0x00c0, B:45:0x00d4, B:46:0x00d5, B:48:0x00df, B:50:0x0102, B:61:0x0146, B:52:0x0108, B:53:0x010c, B:55:0x0112, B:57:0x011e, B:59:0x0128, B:60:0x0145, B:64:0x015c, B:65:0x017e), top: B:81:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128 A[Catch: all -> 0x017f, xoo -> 0x019c, CancellationException -> 0x01a9, TryCatch #9 {all -> 0x017f, blocks: (B:36:0x009b, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1, B:44:0x00c0, B:45:0x00d4, B:46:0x00d5, B:48:0x00df, B:50:0x0102, B:61:0x0146, B:52:0x0108, B:53:0x010c, B:55:0x0112, B:57:0x011e, B:59:0x0128, B:60:0x0145, B:64:0x015c, B:65:0x017e), top: B:81:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x015c A[Catch: all -> 0x017f, xoo -> 0x019c, CancellationException -> 0x01a9, TRY_ENTER, TryCatch #9 {all -> 0x017f, blocks: (B:36:0x009b, B:39:0x00a5, B:41:0x00ab, B:43:0x00b1, B:44:0x00c0, B:45:0x00d4, B:46:0x00d5, B:48:0x00df, B:50:0x0102, B:61:0x0146, B:52:0x0108, B:53:0x010c, B:55:0x0112, B:57:0x011e, B:59:0x0128, B:60:0x0145, B:64:0x015c, B:65:0x017e), top: B:81:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:0: B:53:0x010c->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0128, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x015c, please report this as an issue */
    public final java.lang.Object c(defpackage.xmx xmxVar, defpackage.xgk xgkVar, aoln aolnVar) throws defpackage.xoo {
        defpackage.xoj xojVar;
        java.lang.Throwable th;
        defpackage.xjz xjzVar;
        defpackage.xfz xfzVar;
        defpackage.xgk xgkVar2;
        defpackage.xmw xmwVar;
        defpackage.xmb xmbVarB;
        android.os.PersistableBundle persistableBundle;
        java.util.Set<java.lang.String> setKeySet;
        java.util.Iterator<T> it;
        defpackage.xmq xmqVarD;
        if (aolnVar instanceof defpackage.xoj) {
            xojVar = (defpackage.xoj) aolnVar;
            int i = xojVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xojVar.d = i - Integer.MIN_VALUE;
            } else {
                xojVar = new defpackage.xoj(this, aolnVar);
            }
        } else {
            xojVar = new defpackage.xoj(this, aolnVar);
        }
        java.lang.Object obj = xojVar.b;
        aolu aoluVar = aolu.a;
        int i2 = xojVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            try {
                try {
                    xfzVar = ((defpackage.xnv) xgkVar).a;
                    defpackage.xox.e("OnboardingTaskServiceServer", a.bo(xfzVar, defpackage.xfh.a(xmxVar), "Interrupting node ", " with reason "));
                    defpackage.xmw xmwVar2 = this.d;
                    xojVar.e = xmxVar;
                    xojVar.a = xgkVar;
                    xojVar.g = xmxVar;
                    xojVar.f = xfzVar;
                    xojVar.d = 1;
                    if (xmwVar2.g(xojVar) == aoluVar) {
                        return aoluVar;
                    }
                    xgkVar2 = xgkVar;
                    xjzVar = xmxVar;
                    xmwVar = this.d;
                    xmbVarB = xmwVar.b(xmxVar);
                    if (xmbVarB == null) {
                        xmqVarD = xmwVar.d(xmxVar);
                        if (xmqVarD != null) {
                        }
                        defpackage.xox.c("OnboardingTaskServiceServer", a.bx(defpackage.xfh.a(xmxVar), "No instance found for interrupt to token "));
                        throw new java.lang.IllegalStateException("Task cannot be found.");
                    }
                    if (xmbVarB.a().c(xfzVar)) {
                        defpackage.xox.b("OnboardingTaskServiceServer", "Task " + xmbVarB.a() + " does not accept interrupt " + xfzVar);
                        throw new java.lang.IllegalStateException("Task cannot be interrupted.");
                    }
                    aooh.f(xgkVar2, "<this>");
                    android.os.PersistableBundle persistableBundle2 = xgkVar2.a().toPersistableBundle();
                    persistableBundle = new android.os.PersistableBundle(xgkVar2.toPersistableBundle());
                    setKeySet = persistableBundle2.keySet();
                    aooh.e(setKeySet, "keySet(...)");
                    if (setKeySet instanceof java.util.Collection) {
                        it = setKeySet.iterator();
                        while (it.hasNext()) {
                            if (persistableBundle.containsKey((java.lang.String) it.next())) {
                                if (defpackage.xer.d(persistableBundle) == xgkVar2.a()) {
                                    break;
                                }
                                throw new java.lang.IllegalStateException(xgkVar2 + " encodes a reason other than " + xgkVar2.a());
                            }
                        }
                    } else {
                        it = setKeySet.iterator();
                        while (it.hasNext()) {
                            if (persistableBundle.containsKey((java.lang.String) it.next())) {
                                if (defpackage.xer.d(persistableBundle) == xgkVar2.a()) {
                                    break;
                                }
                                throw new java.lang.IllegalStateException(xgkVar2 + " encodes a reason other than " + xgkVar2.a());
                            }
                        }
                    }
                    persistableBundle.putAll(persistableBundle2);
                    xojVar.e = xmxVar;
                    xojVar.a = xjzVar;
                    xojVar.g = null;
                    xojVar.f = null;
                    xojVar.d = 2;
                    if (xmbVarB.q(persistableBundle) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    xjzVar = xmxVar;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), th);
                    throw new defpackage.xoo(xjzVar, th, null);
                }
            } catch (java.util.concurrent.CancellationException e) {
                e = e;
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), e);
                throw e;
            } catch (defpackage.xoo e2) {
                e = e2;
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), e);
                throw e;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.xjz xjzVar2 = (defpackage.xjz) xojVar.a;
            defpackage.xmx xmxVar2 = xojVar.e;
            try {
                aooc.af(obj);
                return aojh.a;
            } catch (java.util.concurrent.CancellationException e3) {
                xmxVar = xmxVar2;
                e = e3;
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), e);
                throw e;
            } catch (defpackage.xoo e4) {
                xmxVar = xmxVar2;
                e = e4;
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), e);
                throw e;
            } catch (java.lang.Throwable th3) {
                xmxVar = xmxVar2;
                th = th3;
                xjzVar = xjzVar2;
                defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), th);
                throw new defpackage.xoo(xjzVar, th, null);
            }
        }
        defpackage.xfz xfzVar2 = xojVar.f;
        xjzVar = xojVar.g;
        xgkVar2 = (defpackage.xgk) xojVar.a;
        defpackage.xmx xmxVar3 = xojVar.e;
        try {
            aooc.af(obj);
            xfzVar = xfzVar2;
            xmxVar = xmxVar3;
            try {
                xmwVar = this.d;
                xmbVarB = xmwVar.b(xmxVar);
                if (xmbVarB == null) {
                    xmqVarD = xmwVar.d(xmxVar);
                    if (xmqVarD != null || !xmqVarD.h()) {
                        defpackage.xox.c("OnboardingTaskServiceServer", a.bx(defpackage.xfh.a(xmxVar), "No instance found for interrupt to token "));
                        throw new java.lang.IllegalStateException("Task cannot be found.");
                    }
                    defpackage.xox.b("OnboardingTaskServiceServer", a.bo(xfzVar, defpackage.xfh.a(xmxVar), "Task ", " is already complete, ignoring interrupt "));
                } else {
                    if (xmbVarB.a().c(xfzVar)) {
                        defpackage.xox.b("OnboardingTaskServiceServer", "Task " + xmbVarB.a() + " does not accept interrupt " + xfzVar);
                        throw new java.lang.IllegalStateException("Task cannot be interrupted.");
                    }
                    aooh.f(xgkVar2, "<this>");
                    android.os.PersistableBundle persistableBundle3 = xgkVar2.a().toPersistableBundle();
                    persistableBundle = new android.os.PersistableBundle(xgkVar2.toPersistableBundle());
                    setKeySet = persistableBundle3.keySet();
                    aooh.e(setKeySet, "keySet(...)");
                    if ((setKeySet instanceof java.util.Collection) || !setKeySet.isEmpty()) {
                        it = setKeySet.iterator();
                        while (it.hasNext()) {
                            if (persistableBundle.containsKey((java.lang.String) it.next())) {
                                if (defpackage.xer.d(persistableBundle) == xgkVar2.a()) {
                                    break;
                                }
                                throw new java.lang.IllegalStateException(xgkVar2 + " encodes a reason other than " + xgkVar2.a());
                            }
                        }
                    }
                    persistableBundle.putAll(persistableBundle3);
                    xojVar.e = xmxVar;
                    xojVar.a = xjzVar;
                    xojVar.g = null;
                    xojVar.f = null;
                    xojVar.d = 2;
                    if (xmbVarB.q(persistableBundle) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            } catch (java.lang.Throwable th4) {
                th = th4;
                defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), th);
                throw new defpackage.xoo(xjzVar, th, null);
            }
        } catch (java.util.concurrent.CancellationException e5) {
            e = e5;
            xmxVar = xmxVar3;
            defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), e);
            throw e;
        } catch (defpackage.xoo e6) {
            e = e6;
            xmxVar = xmxVar3;
            defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), e);
            throw e;
        } catch (java.lang.Throwable th5) {
            th = th5;
            xmxVar = xmxVar3;
            defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
            defpackage.xox.f("OnboardingTaskServiceServer", "Failure interrupting task for node ".concat(defpackage.xfh.a(xmxVar)), th);
            throw new defpackage.xoo(xjzVar, th, null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xjz] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final java.lang.Object d(defpackage.xmx xmxVar, android.os.PersistableBundle persistableBundle, aoln aolnVar) throws aois, defpackage.xoo {
        defpackage.xom xomVar;
        defpackage.xmx xmxVar2;
        defpackage.xmx xmxVar3;
        defpackage.xon xonVar = this;
        defpackage.xmx xmxVar4 = xmxVar;
        ?? r2 = "startTask[";
        if (aolnVar instanceof defpackage.xom) {
            xomVar = (defpackage.xom) aolnVar;
            int i = xomVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xomVar.c = i - Integer.MIN_VALUE;
            } else {
                xomVar = new defpackage.xom(xonVar, aolnVar);
            }
        } else {
            xomVar = new defpackage.xom(xonVar, aolnVar);
        }
        defpackage.xom xomVar2 = xomVar;
        java.lang.Object obj = xomVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = xomVar2.c;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        xmxVar3 = xomVar2.e;
                        xmxVar2 = xomVar2.d;
                        aooc.af(obj);
                    } else {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        defpackage.xmx xmxVar5 = xomVar2.e;
                        defpackage.xmx xmxVar6 = xomVar2.d;
                        aooc.af(obj);
                    }
                    return aojh.a;
                }
                aooc.af(obj);
                try {
                    defpackage.xox.a("OnboardingTaskServiceServer", "startTask[" + xmxVar4 + ']');
                    defpackage.xox.a("OnboardingTaskServiceServer", "Creating task for node ".concat(defpackage.xfh.a(xmxVar4)));
                    defpackage.xme xmeVar = (defpackage.xme) xonVar.e().get(xmxVar4.asNodeRef());
                    if (xmeVar == null) {
                        defpackage.xox.e("OnboardingTaskServiceServer", a.bg(xmxVar4, "Task for node ", " not found!"));
                        throw new java.lang.IllegalStateException("Task cannot be found.");
                    }
                    defpackage.xmb xmbVarA = xmeVar.a();
                    defpackage.xox.a("OnboardingTaskServiceServer", a.bi(xmbVarA, xmxVar4, "Initialising task instance token=", " task="));
                    if (xmbVarA.l()) {
                        defpackage.xox.g("OnboardingTaskServiceServer", a.bg(xmbVarA, "Task (", ") was already created. Please don't reuse the same task instance."));
                        throw new java.lang.IllegalStateException("Attempted to reuse the same task instance.");
                    }
                    xonVar.g(xmbVarA, xmxVar4);
                    defpackage.xmw xmwVar = xonVar.d;
                    xmwVar.l(xmxVar4);
                    xmwVar.j(xmxVar4, xmbVarA);
                    xmwVar.m(xmxVar4, new defpackage.xmo(defpackage.xfc.d(xmxVar4, xmbVarA.a())));
                    java.lang.AutoCloseable autoCloseableB = xonVar.i.b();
                    aosi aosiVar = new aosi((aoub) null);
                    defpackage.xmr xmrVar = new defpackage.xmr(aosiVar, 3);
                    try {
                        ajx ajxVar = new ajx(autoCloseableB, this, xmxVar4, xmbVarA, 10, (byte[]) null);
                        xonVar = this;
                        try {
                            try {
                                xmxVar2 = xmxVar;
                                xmwVar.i(xmxVar2, aoov.an(xonVar.j, (aolr) null, 0, new defpackage.xoh(xonVar, xmbVarA, persistableBundle, xmrVar, xmxVar, ajxVar, null), 3));
                                defpackage.xox.a("OnboardingTaskServiceServer", a.bh(xmxVar2, "startTask: Cached task execution for "));
                                xomVar2.d = xmxVar2;
                                xomVar2.e = xmxVar2;
                                xomVar2.c = 1;
                                if (aosiVar.fI(xomVar2) == aoluVar) {
                                    return aoluVar;
                                }
                                xmxVar3 = xmxVar2;
                            } catch (java.util.concurrent.CancellationException e) {
                                e = e;
                                xmxVar4 = xmxVar;
                                h(xonVar.d.c(xmxVar4), null);
                                throw e;
                            } catch (defpackage.xoo e2) {
                                e = e2;
                                xmxVar4 = xmxVar;
                                h(xonVar.d.c(xmxVar4), null);
                                throw e;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                xmxVar4 = xmxVar;
                                r2 = xmxVar4;
                                defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                                h(xonVar.d.c(xmxVar4), null);
                                throw new defpackage.xoo(r2, th, null);
                            }
                        } catch (java.util.concurrent.CancellationException e3) {
                            e = e3;
                            xmxVar4 = xmxVar;
                        } catch (defpackage.xoo e4) {
                            e = e4;
                            xmxVar4 = xmxVar;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            xmxVar4 = xmxVar;
                        }
                    } catch (java.util.concurrent.CancellationException e5) {
                        e = e5;
                        xonVar = this;
                    } catch (defpackage.xoo e6) {
                        e = e6;
                        xonVar = this;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        xonVar = this;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
                defpackage.xmw xmwVar2 = xonVar.d;
                xomVar2.d = xmxVar2;
                xomVar2.e = xmxVar3;
                xomVar2.c = 2;
                if (xmwVar2.e(xomVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            } catch (java.lang.Throwable th5) {
                th = th5;
            }
        } catch (java.util.concurrent.CancellationException e7) {
            e = e7;
        } catch (defpackage.xoo e8) {
            e = e8;
        }
    }

    public final java.util.Map e() {
        return (java.util.Map) this.m.a();
    }

    public final java.lang.Object f(defpackage.xmx xmxVar) throws defpackage.xoo {
        try {
            return this.d.a(xmxVar);
        } catch (java.util.concurrent.CancellationException e) {
            defpackage.xox.f("OnboardingTaskServiceServer", "Failure getting task metadata for node ".concat(defpackage.xfh.a(xmxVar)), e);
            throw e;
        } catch (defpackage.xoo e2) {
            defpackage.xox.f("OnboardingTaskServiceServer", "Failure getting task metadata for node ".concat(defpackage.xfh.a(xmxVar)), e2);
            throw e2;
        } catch (java.lang.Throwable th) {
            defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
            defpackage.xox.f("OnboardingTaskServiceServer", "Failure getting task metadata for node ".concat(defpackage.xfh.a(xmxVar)), th);
            throw new defpackage.xoo(xmxVar, th, null);
        }
    }

    public final void g(defpackage.xmb xmbVar, defpackage.xjz xjzVar) {
        java.lang.Object objAe;
        aooh.f(xmbVar, "task");
        if (xjzVar == null) {
            try {
                objAe = new defpackage.xjy(xmbVar);
            } catch (java.lang.Throwable th) {
                objAe = aooc.ae(th);
            }
            java.lang.Object objM = defpackage.xhy.m(xmbVar, defpackage.xfc.c());
            if (true == (objAe instanceof aoiv)) {
                objAe = objM;
            }
            xjzVar = (defpackage.xjz) objAe;
        }
        defpackage.xjz xjzVar2 = xjzVar;
        android.content.Context applicationContext = ((android.content.Context) aa$.ExternalSyntheticApiModelOutline1.m(this.h)).getApplicationContext();
        aooh.e(applicationContext, "<get-applicationContext>(...)");
        defpackage.xmw xmwVar = this.d;
        apbj apbjVar = this.j;
        java.lang.Object objM2 = aa$.ExternalSyntheticApiModelOutline1.m(this.k);
        aooh.e(objM2, "get(...)");
        defpackage.xly xlyVar = new defpackage.xly(applicationContext, xjzVar2, xmwVar, apbjVar.a, (defpackage.xpz) objM2, (defpackage.xkx) this.l.a(this, a[0]));
        if (!defpackage.xff.d(xlyVar, xmbVar.a())) {
            throw new java.lang.IllegalArgumentException("Provided context " + xlyVar + " does not refer to the task contract " + xmbVar.a());
        }
        xmbVar.f = xlyVar;
        xmbVar.b = xlyVar.d();
        xmbVar.i.a();
        xmbVar.k(false);
        emt emtVar = new emt(xmbVar.e(), xlyVar.d.plus(new aovh((aoub) null)).plus(new aosr(defpackage.xfh.a(xmbVar))));
        if (((ems) xmbVar.e()).a.aj(((ems) xmbVar.e()).a.ai(), emtVar)) {
            emtVar.b();
            xmbVar.d = emtVar;
        }
        xmbVar.e().e(emp.ON_CREATE);
        defpackage.xox.a("OnboardingTask(" + defpackage.xfh.a(xmbVar) + ')', "Task initialised. contract=" + xmbVar.a().identity() + ", implementation=" + xmbVar.getClass().getName());
        defpackage.xox.b("OnboardingTaskServiceServer", "Task initialised for node " + xjzVar2.identity() + '.');
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return ((defpackage.xht) this.b).a;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return this.b.getNodePackage();
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    @Override // defpackage.xhu
    public final java.lang.String identity() {
        throw null;
    }
}
