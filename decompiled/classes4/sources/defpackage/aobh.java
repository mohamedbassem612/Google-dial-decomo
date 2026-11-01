package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobh implements defpackage.aobm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aobh(defpackage.aobu aobuVar, anmj anmjVar, int i) {
        this.$cid = i;
        this.a = anmjVar;
        j$.util.Objects.requireNonNull(aobuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [anmj, java.lang.Object] */
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
    @Override // defpackage.aobm
    public final void a(defpackage.aobs aobsVar) {
        int i = this.$cid;
        if (i == 0) {
            aobsVar.a.i((anmw) this.a);
        } else if (i != 1) {
            aobsVar.a.j((anmy) this.a);
        } else {
            aobsVar.a.h(this.a);
        }
    }

    public aobh(defpackage.aobu aobuVar, anmw anmwVar, int i) {
        this.$cid = i;
        this.a = anmwVar;
        j$.util.Objects.requireNonNull(aobuVar);
    }

    public aobh(defpackage.aobu aobuVar, anmy anmyVar, int i) {
        this.$cid = i;
        this.a = anmyVar;
        j$.util.Objects.requireNonNull(aobuVar);
    }
}
