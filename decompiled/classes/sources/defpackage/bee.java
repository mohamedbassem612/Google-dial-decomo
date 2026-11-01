package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bee implements defpackage.cyi {
    private final defpackage.czo a;
    private final defpackage.bdy b;
    private final defpackage.aco c;
    private final defpackage.aogc d;

    /* JADX WARN: Type inference failed for: r1v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [bdy, java.lang.Object] */
    public bee(defpackage.aogc aogcVar, defpackage.czo czoVar) {
        this.d = aogcVar;
        this.a = czoVar;
        this.b = aogcVar.a.a();
        defpackage.aco acoVar = defpackage.acp.a;
        new defpackage.aco(6);
        this.c = new defpackage.aco(6);
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dpl
    public final float dh(long j) {
        return this.a.dh(j);
    }

    @Override // defpackage.dpf
    public final float di(float f) {
        return this.a.di(f);
    }

    @Override // defpackage.dpf
    public final float dj(int i) {
        return this.a.dj(i);
    }

    @Override // defpackage.dpf
    public final float dk(long j) {
        return this.a.dk(j);
    }

    @Override // defpackage.dpf
    public final float dl(float f) {
        return this.a.dl(f);
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final int mo1do(long j) {
        return this.a.mo1do(j);
    }

    @Override // defpackage.dpf
    public final int dp(float f) {
        return this.a.dp(f);
    }

    @Override // defpackage.dpf
    public final long dq(long j) {
        return this.a.dq(j);
    }

    @Override // defpackage.dpf
    public final long dr(long j) {
        return this.a.dr(j);
    }

    @Override // defpackage.dpl
    public final long ds(float f) {
        return this.a.ds(f);
    }

    @Override // defpackage.dpf
    public final long dt(float f) {
        return this.a.dt(f);
    }

    @Override // defpackage.cyi
    public final defpackage.cyf du(int i, int i2, java.util.Map map, defpackage.aonj aonjVar) {
        return this.a.du(i, i2, map, aonjVar);
    }

    @Override // defpackage.cyi
    public final defpackage.cyf dv(int i, int i2, defpackage.aonj aonjVar, defpackage.aonn aonnVar, java.util.Map map, defpackage.aonj aonjVar2) {
        return this.a.dv(i, i2, aonjVar, aonnVar, map, aonjVar2);
    }

    @Override // defpackage.cxf
    public final boolean dw() {
        return this.a.dw();
    }

    @Override // defpackage.cyi
    public final defpackage.cyf dx(int i, int i2, java.util.Map map, defpackage.aonj aonjVar) {
        throw null;
    }

    @Override // defpackage.cxf
    public final defpackage.dpq p() {
        return this.a.p();
    }

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
    public final java.util.List s(int i) {
        defpackage.aco acoVar = this.c;
        java.util.List list = (java.util.List) acoVar.a(i);
        if (list != null) {
            return list;
        }
        defpackage.bdy bdyVar = this.b;
        java.lang.Object objD = bdyVar.d(i);
        java.util.List listS = this.a.s(objD, this.d.bC(i, objD, bdyVar.c(i)));
        acoVar.g(i, listS);
        return listS;
    }
}
