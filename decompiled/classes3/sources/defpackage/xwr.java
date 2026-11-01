package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwr implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public xwr(fyr fyrVar, int i) {
        this.$cid = i;
        this.b = fyrVar;
        this.a = new java.util.concurrent.atomic.AtomicReference(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yeq] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, yeq] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, yeq] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.concurrent.Future] */
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
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ?? r0 = this.a;
            synchronized (r0.a()) {
                java.lang.Object obj = this.b;
                synchronized (obj) {
                    try {
                        if (((defpackage.xwu) obj).a.c(r0)) {
                            try {
                                ((defpackage.yer) r0).e(((defpackage.xwu) obj).j, 5);
                            } catch (java.lang.Throwable th) {
                                throw new defpackage.xvy(th);
                            }
                        }
                        ((defpackage.xwu) obj).d();
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
            }
            return;
        }
        if (i == 1) {
            fzd fzdVar = (fzd) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            if (fzdVar != null) {
                java.util.Iterator it = ((fyr) this.b).j.iterator();
                while (it.hasNext()) {
                    ((aonj) it.next()).a(fzdVar);
                }
                return;
            }
            return;
        }
        if (i == 2) {
            ?? r1 = this.a;
            synchronized (r1.a()) {
                java.lang.Object obj2 = this.b;
                synchronized (obj2) {
                    try {
                        if (((defpackage.xwu) obj2).a.c(r1)) {
                            ((defpackage.xwu) obj2).l.d();
                            try {
                                r1.d(((defpackage.xwu) obj2).l, ((defpackage.xwu) obj2).h);
                                ((defpackage.xwu) this.b).g(this.a);
                            } catch (java.lang.Throwable th3) {
                                throw new defpackage.xvy(th3);
                            }
                        }
                        ((defpackage.xwu) this.b).d();
                    } catch (java.lang.Throwable th4) {
                        throw th4;
                    }
                }
            }
            return;
        }
        if (i == 3) {
            try {
                this.a.run();
                return;
            } finally {
                ((defpackage.acxs) this.b).a();
            }
        }
        java.lang.Object obj3 = this.b;
        java.lang.Object obj4 = ((defpackage.ahwd) obj3).e;
        ?? r5 = this.a;
        synchronized (obj4) {
            try {
                try {
                    ((defpackage.ahwd) obj3).f = (defpackage.ahwa) aiql.H((java.util.concurrent.Future) r5);
                    throw null;
                } catch (java.lang.Throwable th5) {
                    throw th5;
                }
            } catch (java.lang.Exception unused) {
            } finally {
                defpackage.ahwc ahwcVar = ((defpackage.ahwd) obj3).g;
                if (ahwcVar != null && ahwcVar.a == r5) {
                    ((defpackage.ahwd) obj3).g = null;
                }
            }
        }
    }

    public xwr(defpackage.xwu xwuVar, defpackage.yeq yeqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xwuVar);
        this.b = xwuVar;
        this.a = yeqVar;
    }

    public xwr(defpackage.xwu xwuVar, defpackage.yeq yeqVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xwuVar);
        this.b = xwuVar;
        this.a = yeqVar;
    }

    public xwr(defpackage.acxs acxsVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(acxsVar);
        this.b = acxsVar;
        this.a = runnable;
    }

    public xwr(defpackage.ahwd ahwdVar, ajcr ajcrVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ahwdVar);
        this.b = ahwdVar;
        this.a = ajcrVar;
    }
}
