package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xok extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    long e;
    long f;
    long g;
    int h;
    final /* synthetic */ defpackage.xon i;
    final /* synthetic */ defpackage.xmx j;
    private /* synthetic */ java.lang.Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xok(defpackage.xon xonVar, defpackage.xmx xmxVar, aoln aolnVar) {
        super(2, aolnVar);
        this.i = xonVar;
        this.j = xmxVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0135 A[ADDED_TO_REGION, EDGE_INSN: B:120:0x0135->B:61:0x0135 BREAK  A[LOOP:0: B:48:0x00fb->B:54:0x0124], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0105 A[Catch: all -> 0x0129, xoo -> 0x012d, CancellationException -> 0x0131, TryCatch #3 {all -> 0x0129, blocks: (B:54:0x0124, B:48:0x00fb, B:50:0x0105, B:52:0x010b, B:61:0x0135, B:63:0x0147, B:65:0x0158, B:66:0x015d, B:77:0x017f, B:79:0x0193, B:84:0x01a1, B:86:0x01b0, B:87:0x01b5, B:95:0x01ec, B:96:0x0219, B:43:0x00ca, B:45:0x00d4, B:47:0x00e2), top: B:108:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[Catch: all -> 0x0129, xoo -> 0x012d, CancellationException -> 0x0131, TryCatch #3 {all -> 0x0129, blocks: (B:54:0x0124, B:48:0x00fb, B:50:0x0105, B:52:0x010b, B:61:0x0135, B:63:0x0147, B:65:0x0158, B:66:0x015d, B:77:0x017f, B:79:0x0193, B:84:0x01a1, B:86:0x01b0, B:87:0x01b5, B:95:0x01ec, B:96:0x0219, B:43:0x00ca, B:45:0x00d4, B:47:0x00e2), top: B:108:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0158 A[Catch: all -> 0x0129, xoo -> 0x012d, CancellationException -> 0x0131, TryCatch #3 {all -> 0x0129, blocks: (B:54:0x0124, B:48:0x00fb, B:50:0x0105, B:52:0x010b, B:61:0x0135, B:63:0x0147, B:65:0x0158, B:66:0x015d, B:77:0x017f, B:79:0x0193, B:84:0x01a1, B:86:0x01b0, B:87:0x01b5, B:95:0x01ec, B:96:0x0219, B:43:0x00ca, B:45:0x00d4, B:47:0x00e2), top: B:108:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f A[Catch: all -> 0x0129, xoo -> 0x012d, CancellationException -> 0x0131, TRY_ENTER, TryCatch #3 {all -> 0x0129, blocks: (B:54:0x0124, B:48:0x00fb, B:50:0x0105, B:52:0x010b, B:61:0x0135, B:63:0x0147, B:65:0x0158, B:66:0x015d, B:77:0x017f, B:79:0x0193, B:84:0x01a1, B:86:0x01b0, B:87:0x01b5, B:95:0x01ec, B:96:0x0219, B:43:0x00ca, B:45:0x00d4, B:47:0x00e2), top: B:108:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0193 A[Catch: all -> 0x0129, xoo -> 0x012d, CancellationException -> 0x0131, TRY_LEAVE, TryCatch #3 {all -> 0x0129, blocks: (B:54:0x0124, B:48:0x00fb, B:50:0x0105, B:52:0x010b, B:61:0x0135, B:63:0x0147, B:65:0x0158, B:66:0x015d, B:77:0x017f, B:79:0x0193, B:84:0x01a1, B:86:0x01b0, B:87:0x01b5, B:95:0x01ec, B:96:0x0219, B:43:0x00ca, B:45:0x00d4, B:47:0x00e2), top: B:108:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:81:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1 A[Catch: all -> 0x0129, xoo -> 0x012d, CancellationException -> 0x0131, TRY_ENTER, TryCatch #3 {all -> 0x0129, blocks: (B:54:0x0124, B:48:0x00fb, B:50:0x0105, B:52:0x010b, B:61:0x0135, B:63:0x0147, B:65:0x0158, B:66:0x015d, B:77:0x017f, B:79:0x0193, B:84:0x01a1, B:86:0x01b0, B:87:0x01b5, B:95:0x01ec, B:96:0x0219, B:43:0x00ca, B:45:0x00d4, B:47:0x00e2), top: B:108:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0 A[Catch: all -> 0x0129, xoo -> 0x012d, CancellationException -> 0x0131, TryCatch #3 {all -> 0x0129, blocks: (B:54:0x0124, B:48:0x00fb, B:50:0x0105, B:52:0x010b, B:61:0x0135, B:63:0x0147, B:65:0x0158, B:66:0x015d, B:77:0x017f, B:79:0x0193, B:84:0x01a1, B:86:0x01b0, B:87:0x01b5, B:95:0x01ec, B:96:0x0219, B:43:0x00ca, B:45:0x00d4, B:47:0x00e2), top: B:108:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ec A[Catch: all -> 0x0129, xoo -> 0x012d, CancellationException -> 0x0131, TRY_ENTER, TryCatch #3 {all -> 0x0129, blocks: (B:54:0x0124, B:48:0x00fb, B:50:0x0105, B:52:0x010b, B:61:0x0135, B:63:0x0147, B:65:0x0158, B:66:0x015d, B:77:0x017f, B:79:0x0193, B:84:0x01a1, B:86:0x01b0, B:87:0x01b5, B:95:0x01ec, B:96:0x0219, B:43:0x00ca, B:45:0x00d4, B:47:0x00e2), top: B:108:0x00ca }] */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x01ec, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [xmw] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xjz] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4, types: [xjz] */
    /* JADX WARN: Type inference failed for: r1v7, types: [xjz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [xjz] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, xmx] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, xjz, xni] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, xni] */
    /* JADX WARN: Type inference failed for: r3v18, types: [xmx, xni] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [xmw] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [xmw] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
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
        aoxi aoxiVar;
        ?? r3;
        ?? r2;
        defpackage.xon xonVar;
        long jA;
        long jA2;
        ?? r6;
        long j;
        aoxi aoxiVar2;
        aoxd aoxdVar;
        ?? r4;
        ?? r7;
        ?? r5;
        ?? r8;
        ?? r9;
        avg avgVar;
        ?? r10;
        defpackage.xmq xmqVarC;
        aowi aowiVar;
        defpackage.xhn xhnVarB;
        defpackage.xhn xhnVarB2;
        ?? r1 = aolu.a;
        ?? r11 = this.h;
        try {
            if (r11 != 0) {
                try {
                    if (r11 == 1) {
                        defpackage.xmx xmxVar = (defpackage.xmx) this.d;
                        defpackage.xon xonVar2 = (defpackage.xon) this.c;
                        java.lang.Object obj2 = this.b;
                        java.lang.Object obj3 = this.a;
                        aoxiVar = (aoxi) this.k;
                        try {
                            aooc.af(obj);
                            r3 = xmxVar;
                            r2 = obj2;
                            xonVar = xonVar2;
                            r6 = obj3;
                            try {
                                int i = defpackage.xon.g;
                                if (xonVar.d.d(r3) == null && xonVar.e().containsKey(r3.asNodeRef())) {
                                    long j2 = aorh.a;
                                    aorj aorjVar = aorj.c;
                                    jA2 = aooh.A(10, aorjVar);
                                    jA = aooh.A(100, aorjVar);
                                    j = 0;
                                    while (true) {
                                        int i2 = defpackage.xon.g;
                                        if (xonVar.d.d(r3) == null) {
                                            break;
                                        }
                                        break;
                                        break;
                                        j = aorh.j(j, jA2);
                                    }
                                }
                                int i3 = defpackage.xon.g;
                                r10 = xonVar.d;
                                xmqVarC = r10.c(r3);
                                if (r10.c(r3).h()) {
                                    defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r3, "Task(", ") is already complete. Closing metadata observer."));
                                    xhnVarB2 = xmqVarC.b();
                                    if (xhnVarB2 == null) {
                                        xhnVarB2 = new defpackage.xhn();
                                    }
                                    this.k = r6;
                                    this.a = r2;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.h = 3;
                                    if (aoxiVar.a(xhnVarB2, this) != r1) {
                                        return aojh.a;
                                    }
                                    return r1;
                                }
                                aooh.f((java.lang.Object) r3, "token");
                                aowiVar = (aowi) r10.f.get(new defpackage.xjy(r3));
                                if (aowiVar != null) {
                                    aoxdVar = new aoxd(aowiVar, false);
                                } else {
                                    aoxdVar = null;
                                }
                                if (aoxdVar == null) {
                                    defpackage.xox.e("TaskStateManager", a.bF((byte) 93, (java.lang.Object) r3, "Could not find the metadata channel to observe. ["));
                                    defpackage.xox.e("OnboardingTaskServiceServer", "Metadata flow not found for node " + defpackage.xfh.a(r3) + '.');
                                    throw new java.lang.IllegalStateException("Metadata cannot be found.");
                                }
                                defpackage.xox.a("TaskStateManager", a.bF((byte) 93, (java.lang.Object) r3, "Found the metadata channel to observe. ["));
                                xhnVarB = xmqVarC.b();
                                if (xhnVarB == null) {
                                    xhnVarB = new defpackage.xhn();
                                }
                                this.k = aoxiVar;
                                this.a = r6;
                                this.b = r2;
                                this.c = r3;
                                this.d = aoxdVar;
                                this.h = 4;
                                if (aoxiVar.a(xhnVarB, this) == r1) {
                                    return r1;
                                }
                                r8 = r6;
                                aoxiVar2 = aoxiVar;
                                r4 = r2;
                                r9 = r3;
                                avgVar = new avg((java.lang.Object) r9, aoxiVar2, 8, (byte[]) null);
                                this.k = r8;
                                this.a = r4;
                                this.b = null;
                                this.c = null;
                                this.d = null;
                                this.h = 5;
                                if (aoxdVar.fM(avgVar, this) == r1) {
                                    return r1;
                                }
                                return aojh.a;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                r1 = r2;
                                r7 = r6;
                                r11 = r7;
                                defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                                defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), th);
                                throw new defpackage.xoo(r11, th, null);
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            r1 = obj2;
                            r7 = obj3;
                            r11 = r7;
                            defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                            defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), th);
                            throw new defpackage.xoo(r11, th, null);
                        }
                    }
                    if (r11 != 2) {
                        if (r11 == 3) {
                            java.lang.Object obj4 = this.a;
                            aooc.af(obj);
                            return aojh.a;
                        }
                        if (r11 != 4) {
                            java.lang.Object obj5 = this.a;
                            aooc.af(obj);
                        } else {
                            aoxd aoxdVar2 = (aoxh) this.d;
                            defpackage.xmx xmxVar2 = (defpackage.xmx) this.c;
                            java.lang.Object obj6 = this.b;
                            java.lang.Object obj7 = this.a;
                            aoxiVar2 = (aoxi) this.k;
                            try {
                                aooc.af(obj);
                                aoxdVar = aoxdVar2;
                                r4 = obj6;
                                r9 = xmxVar2;
                                r8 = obj7;
                                try {
                                    avgVar = new avg((java.lang.Object) r9, aoxiVar2, 8, (byte[]) null);
                                    this.k = r8;
                                    this.a = r4;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.h = 5;
                                    if (aoxdVar.fM(avgVar, this) == r1) {
                                        return r1;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    r1 = r4;
                                    r5 = r8;
                                    r11 = r5;
                                    defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), th);
                                    throw new defpackage.xoo(r11, th, null);
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r1 = obj6;
                                r5 = obj7;
                                r11 = r5;
                                defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
                                defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), th);
                                throw new defpackage.xoo(r11, th, null);
                            }
                        }
                        return aojh.a;
                    }
                    long j3 = this.g;
                    jA = this.f;
                    jA2 = this.e;
                    defpackage.xmx xmxVar3 = (defpackage.xmx) this.d;
                    defpackage.xon xonVar3 = (defpackage.xon) this.c;
                    java.lang.Object obj8 = this.b;
                    java.lang.Object obj9 = this.a;
                    aoxiVar = (aoxi) this.k;
                    try {
                        aooc.af(obj);
                        r3 = xmxVar3;
                        r2 = obj8;
                        r6 = obj9;
                        xonVar = xonVar3;
                        j = aorh.j(j3, jA2);
                        while (true) {
                            int i4 = defpackage.xon.g;
                            if (xonVar.d.d(r3) == null || aorh.a(j, jA) >= 0) {
                                break;
                            }
                            this.k = aoxiVar;
                            this.a = r6;
                            this.b = r2;
                            this.c = xonVar;
                            this.d = r3;
                            this.e = jA2;
                            this.f = jA;
                            this.g = j;
                            this.h = 2;
                            if (aosv.k(jA2, this) == r1) {
                                return r1;
                            }
                            j = aorh.j(j, jA2);
                        }
                        int i5 = defpackage.xon.g;
                        r10 = xonVar.d;
                        xmqVarC = r10.c(r3);
                        if (r10.c(r3).h()) {
                            defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r3, "Task(", ") is already complete. Closing metadata observer."));
                            xhnVarB2 = xmqVarC.b();
                            if (xhnVarB2 == null) {
                                xhnVarB2 = new defpackage.xhn();
                            }
                            this.k = r6;
                            this.a = r2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.h = 3;
                            if (aoxiVar.a(xhnVarB2, this) != r1) {
                                return aojh.a;
                            }
                            return r1;
                        }
                        aooh.f((java.lang.Object) r3, "token");
                        aowiVar = (aowi) r10.f.get(new defpackage.xjy(r3));
                        if (aowiVar != null) {
                            aoxdVar = new aoxd(aowiVar, false);
                        } else {
                            aoxdVar = null;
                        }
                        if (aoxdVar == null) {
                            defpackage.xox.e("TaskStateManager", a.bF((byte) 93, (java.lang.Object) r3, "Could not find the metadata channel to observe. ["));
                            defpackage.xox.e("OnboardingTaskServiceServer", "Metadata flow not found for node " + defpackage.xfh.a(r3) + '.');
                            throw new java.lang.IllegalStateException("Metadata cannot be found.");
                        }
                        defpackage.xox.a("TaskStateManager", a.bF((byte) 93, (java.lang.Object) r3, "Found the metadata channel to observe. ["));
                        xhnVarB = xmqVarC.b();
                        if (xhnVarB == null) {
                            xhnVarB = new defpackage.xhn();
                        }
                        this.k = aoxiVar;
                        this.a = r6;
                        this.b = r2;
                        this.c = r3;
                        this.d = aoxdVar;
                        this.h = 4;
                        if (aoxiVar.a(xhnVarB, this) == r1) {
                            return r1;
                        }
                        r8 = r6;
                        aoxiVar2 = aoxiVar;
                        r4 = r2;
                        r9 = r3;
                        avgVar = new avg((java.lang.Object) r9, aoxiVar2, 8, (byte[]) null);
                        this.k = r8;
                        this.a = r4;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.h = 5;
                        if (aoxdVar.fM(avgVar, this) == r1) {
                            return r1;
                        }
                        return aojh.a;
                    } catch (java.util.concurrent.CancellationException e) {
                        e = e;
                        r1 = obj8;
                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), e);
                        throw e;
                    } catch (defpackage.xoo e2) {
                        e = e2;
                        r1 = obj8;
                        defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), e);
                        throw e;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        r1 = obj8;
                        r11 = obj9;
                    }
                } catch (java.util.concurrent.CancellationException e3) {
                    e = e3;
                    r1 = 3;
                } catch (defpackage.xoo e4) {
                    e = e4;
                    r1 = 3;
                }
            } else {
                aooc.af(obj);
                aoxiVar = (aoxi) this.k;
                r11 = this.j;
                defpackage.xon xonVar4 = this.i;
                try {
                    try {
                        int i6 = defpackage.xon.g;
                        defpackage.xmw xmwVar = xonVar4.d;
                        this.k = aoxiVar;
                        this.a = r11;
                        this.b = r11;
                        this.c = xonVar4;
                        this.d = r11;
                        this.h = 1;
                        if (xmwVar.g(this) == r1) {
                            return r1;
                        }
                        ?? r12 = r11;
                        xonVar = xonVar4;
                        r3 = r12;
                        r2 = r11;
                        r6 = r12;
                        int i7 = defpackage.xon.g;
                        if (xonVar.d.d(r3) == null) {
                            long j4 = aorh.a;
                            aorj aorjVar2 = aorj.c;
                            jA2 = aooh.A(10, aorjVar2);
                            jA = aooh.A(100, aorjVar2);
                            j = 0;
                            while (true) {
                                int i8 = defpackage.xon.g;
                                if (xonVar.d.d(r3) == null) {
                                    break;
                                    break;
                                }
                                break;
                                break;
                                j = aorh.j(j, jA2);
                            }
                        }
                        int i9 = defpackage.xon.g;
                        r10 = xonVar.d;
                        xmqVarC = r10.c(r3);
                        if (r10.c(r3).h()) {
                            defpackage.xox.b("OnboardingTaskServiceServer", a.bg((java.lang.Object) r3, "Task(", ") is already complete. Closing metadata observer."));
                            xhnVarB2 = xmqVarC.b();
                            if (xhnVarB2 == null) {
                                xhnVarB2 = new defpackage.xhn();
                            }
                            this.k = r6;
                            this.a = r2;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.h = 3;
                            if (aoxiVar.a(xhnVarB2, this) != r1) {
                                return aojh.a;
                            }
                            return r1;
                        }
                        aooh.f((java.lang.Object) r3, "token");
                        aowiVar = (aowi) r10.f.get(new defpackage.xjy(r3));
                        if (aowiVar != null) {
                            aoxdVar = new aoxd(aowiVar, false);
                        } else {
                            aoxdVar = null;
                        }
                        if (aoxdVar == null) {
                            defpackage.xox.e("TaskStateManager", a.bF((byte) 93, (java.lang.Object) r3, "Could not find the metadata channel to observe. ["));
                            defpackage.xox.e("OnboardingTaskServiceServer", "Metadata flow not found for node " + defpackage.xfh.a(r3) + '.');
                            throw new java.lang.IllegalStateException("Metadata cannot be found.");
                        }
                        defpackage.xox.a("TaskStateManager", a.bF((byte) 93, (java.lang.Object) r3, "Found the metadata channel to observe. ["));
                        xhnVarB = xmqVarC.b();
                        if (xhnVarB == null) {
                            xhnVarB = new defpackage.xhn();
                        }
                        this.k = aoxiVar;
                        this.a = r6;
                        this.b = r2;
                        this.c = r3;
                        this.d = aoxdVar;
                        this.h = 4;
                        if (aoxiVar.a(xhnVarB, this) == r1) {
                            return r1;
                        }
                        r8 = r6;
                        aoxiVar2 = aoxiVar;
                        r4 = r2;
                        r9 = r3;
                        avgVar = new avg((java.lang.Object) r9, aoxiVar2, 8, (byte[]) null);
                        this.k = r8;
                        this.a = r4;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.h = 5;
                        if (aoxdVar.fM(avgVar, this) == r1) {
                            return r1;
                        }
                        return aojh.a;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r1 = r11;
                    }
                } catch (java.util.concurrent.CancellationException e5) {
                    e = e5;
                    r1 = r11;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), e);
                    throw e;
                } catch (defpackage.xoo e6) {
                    e = e6;
                    r1 = r11;
                    defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), e);
                    throw e;
                }
            }
        } catch (java.util.concurrent.CancellationException e7) {
            e = e7;
        } catch (defpackage.xoo e8) {
            e = e8;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        defpackage.xox.f("OnboardingTaskServiceServer", "Server action failed", th);
        defpackage.xox.f("OnboardingTaskServiceServer", "Failure observing task metadata for node ".concat(defpackage.xfh.a(r1)), th);
        throw new defpackage.xoo(r11, th, null);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.xok xokVar = new defpackage.xok(this.i, this.j, aolnVar);
        xokVar.k = obj;
        return xokVar;
    }
}
