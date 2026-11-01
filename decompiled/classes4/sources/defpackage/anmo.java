package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anmo extends defpackage.anmv implements java.io.Closeable {
    public final anmw a;
    public java.util.concurrent.ScheduledFuture b;
    private final defpackage.anmv h;
    private java.util.ArrayList i;
    private defpackage.anmp j;
    private java.lang.Throwable k;
    private boolean l;

    public anmo(defpackage.anmv anmvVar) {
        super(anmvVar, anmvVar.f);
        this.a = anmvVar.b();
        this.h = new defpackage.anmv(this, this.f);
    }

    @Override // defpackage.anmv
    public final defpackage.anmv a() {
        return this.h.a();
    }

    @Override // defpackage.anmv
    public final anmw b() {
        return this.a;
    }

    @Override // defpackage.anmv
    public final java.lang.Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.anmv
    public final void d(defpackage.anmp anmpVar, java.util.concurrent.Executor executor) {
        e(new defpackage.anmr(executor, anmpVar, this));
    }

    public final void e(defpackage.anmr anmrVar) {
        synchronized (this) {
            if (i()) {
                anmrVar.a();
            } else {
                java.util.ArrayList arrayList = this.i;
                if (arrayList == null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(anmrVar);
                    defpackage.anmo anmoVar = this.e;
                    if (anmoVar != null) {
                        this.j = new defpackage.aoce(this, 1);
                        anmoVar.e(new defpackage.anmr(defpackage.anmq.INSTANCE, this.j, this));
                    }
                } else {
                    arrayList.add(anmrVar);
                }
            }
        }
    }

    @Override // defpackage.anmv
    public final void f(defpackage.anmv anmvVar) {
        this.h.f(anmvVar);
    }

    @Override // defpackage.anmv
    public final void g(defpackage.anmp anmpVar) {
        h(anmpVar, this);
    }

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
    public final void h(defpackage.anmp anmpVar, defpackage.anmv anmvVar) {
        synchronized (this) {
            java.util.ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    defpackage.anmr anmrVar = (defpackage.anmr) this.i.get(size);
                    if (anmrVar.a == anmpVar && anmrVar.b == anmvVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    defpackage.anmo anmoVar = this.e;
                    if (anmoVar != null) {
                        anmoVar.h(this.j, anmoVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.anmv
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

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
    public final void j(java.lang.Throwable th) {
        int i;
        boolean z;
        java.util.concurrent.ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (this.l) {
                z = false;
                scheduledFuture = null;
            } else {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                java.util.ArrayList arrayList = this.i;
                if (arrayList != null) {
                    defpackage.anmp anmpVar = this.j;
                    this.j = null;
                    this.i = null;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        defpackage.anmr anmrVar = (defpackage.anmr) arrayList.get(i2);
                        if (anmrVar.b == this) {
                            anmrVar.a();
                        }
                    }
                    int size2 = arrayList.size();
                    for (i = 0; i < size2; i++) {
                        defpackage.anmr anmrVar2 = (defpackage.anmr) arrayList.get(i);
                        if (anmrVar2.b != this) {
                            anmrVar2.a();
                        }
                    }
                    defpackage.anmo anmoVar = this.e;
                    if (anmoVar != null) {
                        anmoVar.h(anmpVar, anmoVar);
                    }
                }
            }
        }
    }

    public anmo(defpackage.anmv anmvVar, anmw anmwVar) {
        super(anmvVar, anmvVar.f);
        this.a = anmwVar;
        this.h = new defpackage.anmv(this, this.f);
    }
}
