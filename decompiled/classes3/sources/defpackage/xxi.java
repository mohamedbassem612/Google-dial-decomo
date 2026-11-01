package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xxi implements defpackage.xva {
    final /* synthetic */ defpackage.xxj a;
    final /* synthetic */ ucm b;

    public xxi(defpackage.xxj xxjVar, ucm ucmVar) {
        this.b = ucmVar;
        j$.util.Objects.requireNonNull(xxjVar);
        this.a = xxjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xuo] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, xvb] */
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
    @Override // defpackage.xva
    public final void c(java.lang.Object obj) {
        defpackage.xxj xxjVar = this.a;
        ucm ucmVar = this.b;
        if (xxjVar.e(ucmVar)) {
            defpackage.xwm xwmVar = xxjVar.a.o;
            if (obj != null && xwmVar.c(ucmVar.c.ey())) {
                xxjVar.c = obj;
                ((defpackage.xwf) xxjVar.b).g(2);
            } else {
                defpackage.xwb xwbVar = xxjVar.b;
                ?? r2 = ucmVar.a;
                ?? r4 = ucmVar.c;
                xwbVar.d(r2, obj, r4, r4.ey(), xxjVar.d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, xvb] */
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
    @Override // defpackage.xva
    public final void f(java.lang.Exception exc) {
        defpackage.xxj xxjVar = this.a;
        ucm ucmVar = this.b;
        if (xxjVar.e(ucmVar)) {
            defpackage.xwa xwaVar = xxjVar.d;
            ?? r3 = ucmVar.c;
            xxjVar.b.c(xwaVar, exc, r3, r3.ey());
        }
    }
}
