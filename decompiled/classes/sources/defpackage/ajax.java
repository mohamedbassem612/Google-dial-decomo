package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajax implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public ajax(defpackage.ajbg ajbgVar, defpackage.ajbc ajbcVar, int i) {
        this.$cid = i;
        this.a = ajbcVar;
        j$.util.Objects.requireNonNull(ajbgVar);
        this.b = ajbgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ajbc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ajba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ajat, java.lang.Object] */
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
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.ajbg) this.b).c.b.a(this.a, obj);
        }
        if (i != 1) {
            defpackage.ajbb ajbbVar = new defpackage.ajbb();
            ?? r1 = this.a;
            defpackage.ajbb ajbbVar2 = ((defpackage.ajbg) this.b).c.b;
            try {
                defpackage.ajbg ajbgVarA = r1.a(ajbbVar.a, obj);
                ajbgVarA.f(ajbbVar);
                return ajbgVarA.c.c;
            } finally {
                ajbbVar2.b(ajbbVar, defpackage.ajbm.INSTANCE);
            }
        }
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, this.a);
        try {
            defpackage.ajcq ajcqVarA = this.b.a(obj);
            if (ajcqVarA == null) {
                throw new java.lang.IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
            }
            defpackage.ahns.d(ahpeVar, ahpjVarD);
            return ajcqVarA;
        } catch (java.lang.Throwable th) {
            try {
                ahnn.b(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ahns.d(ahpeVar, ahpjVarD);
                throw th2;
            }
        }
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.toString();
        }
        if (i != 1) {
            return this.a.toString();
        }
        return "propagating=[" + this.b + ']';
    }

    public ajax(defpackage.ahpj ahpjVar, defpackage.ajat ajatVar, int i) {
        this.$cid = i;
        this.a = ahpjVar;
        this.b = ajatVar;
    }

    public ajax(defpackage.ajbg ajbgVar, defpackage.ajba ajbaVar, int i) {
        this.$cid = i;
        this.a = ajbaVar;
        j$.util.Objects.requireNonNull(ajbgVar);
        this.b = ajbgVar;
    }
}
