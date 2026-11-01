package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xxj implements defpackage.xwc, defpackage.xwb {
    public final defpackage.xwd a;
    public final defpackage.xwb b;
    public volatile java.lang.Object c;
    public volatile defpackage.xwa d;
    private volatile int e;
    private volatile defpackage.xvz f;
    private volatile ucm g;

    public xxj(defpackage.xwd xwdVar, defpackage.xwb xwbVar) {
        this.a = xwdVar;
        this.b = xwbVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xvb] */
    @Override // defpackage.xwc
    public final void a() {
        ucm ucmVar = this.g;
        if (ucmVar != null) {
            ucmVar.c.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0134  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:59:0x0188 A[EDGE_INSN: B:59:0x0188->B:52:0x0188 BREAK  A[LOOP:0: B:42:0x0132->B:63:0x0132], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, xuo] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, xuo] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, xuo] */
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
    @Override // defpackage.xwc
    public final boolean b() throws java.lang.Throwable {
        boolean z;
        int i;
        defpackage.xwd xwdVar;
        boolean z2;
        if (this.c == null) {
            if (this.f != null) {
            }
            this.f = null;
            this.g = null;
            z = false;
            while (!z) {
                i = this.e;
                xwdVar = this.a;
                if (i < xwdVar.e().size()) {
                    break;
                    break;
                }
                java.util.List listE = xwdVar.e();
                int i2 = this.e;
                this.e = i2 + 1;
                this.g = (ucm) listE.get(i2);
                if (this.g == null) {
                }
            }
            return z;
        }
        java.lang.Object obj = this.c;
        this.c = null;
        try {
            int i3 = defpackage.yfx.a;
            long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            try {
                defpackage.xwd xwdVar2 = this.a;
                defpackage.xvd xvdVarA = xwdVar2.c.a().a(obj);
                java.lang.Object objA = xvdVarA.a();
                defpackage.xue xueVarP = xwdVar2.c.a().e.p(objA.getClass());
                if (xueVarP == null) {
                    throw new defpackage.xsr(objA.getClass());
                }
                defpackage.rju rjuVar = new defpackage.rju(xueVarP, objA, xwdVar2.h);
                defpackage.xwa xwaVar = new defpackage.xwa(this.g.a, xwdVar2.m);
                defpackage.xyb xybVarC = xwdVar2.c();
                xybVarC.c(xwaVar, rjuVar);
                if (android.util.Log.isLoggable("SourceGenerator", 2)) {
                    android.util.Log.v("SourceGenerator", "Finished encoding source to cache, key: " + xwaVar.toString() + ", data: " + java.lang.String.valueOf(obj) + ", encoder: " + xueVarP.toString() + ", duration: " + defpackage.yfx.a(jElapsedRealtimeNanos));
                }
                if (xybVarC.a(xwaVar) != null) {
                    this.d = xwaVar;
                    this.f = new defpackage.xvz(java.util.Collections.singletonList(this.g.a), xwdVar2, this);
                    this.g.c.e();
                    if (this.f != null || !this.f.b()) {
                        this.f = null;
                        this.g = null;
                        z = false;
                        while (!z) {
                            i = this.e;
                            xwdVar = this.a;
                            if (i < xwdVar.e().size()) {
                                break;
                            }
                            java.util.List listE2 = xwdVar.e();
                            int i4 = this.e;
                            this.e = i4 + 1;
                            this.g = (ucm) listE2.get(i4);
                            if (this.g == null && (xwdVar.o.c(this.g.c.ey()) || xwdVar.g(this.g.c.a()))) {
                                this.g.c.g(xwdVar.n, new defpackage.xxi(this, this.g));
                                z = true;
                            }
                        }
                        return z;
                    }
                } else {
                    if (android.util.Log.isLoggable("SourceGenerator", 3)) {
                        android.util.Log.d("SourceGenerator", "Attempt to write: " + java.lang.String.valueOf(this.d) + ", data: " + java.lang.String.valueOf(obj) + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
                    }
                    try {
                        this.b.d(this.g.a, xvdVarA.a(), this.g.c, this.g.c.ey(), this.g.a);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        z2 = true;
                        if (!z2) {
                            this.g.c.e();
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                z2 = false;
            }
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("SourceGenerator", 3)) {
                android.util.Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xvb] */
    @Override // defpackage.xwb
    public final void c(defpackage.xuo xuoVar, java.lang.Exception exc, defpackage.xvb xvbVar, defpackage.xuc xucVar) {
        this.b.c(xuoVar, exc, xvbVar, this.g.c.ey());
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xvb] */
    @Override // defpackage.xwb
    public final void d(defpackage.xuo xuoVar, java.lang.Object obj, defpackage.xvb xvbVar, defpackage.xuc xucVar, defpackage.xuo xuoVar2) {
        this.b.d(xuoVar, obj, xvbVar, this.g.c.ey(), xuoVar);
    }

    final boolean e(ucm ucmVar) {
        ucm ucmVar2 = this.g;
        return ucmVar2 != null && ucmVar2 == ucmVar;
    }
}
