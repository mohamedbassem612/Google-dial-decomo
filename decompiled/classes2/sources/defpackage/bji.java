package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bji implements defpackage.bgw {
    final /* synthetic */ aomy a;
    final /* synthetic */ aomy b;
    final /* synthetic */ defpackage.blz c;
    private long d = 9205357640488583168L;
    private long e = 9205357640488583168L;
    private long f = 0;
    private defpackage.bks g = defpackage.bkr.a;

    public bji(aomy aomyVar, aomy aomyVar2, defpackage.blz blzVar) {
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = blzVar;
    }

    @Override // defpackage.bgw
    public final void a() {
        defpackage.blz blzVar = this.c;
        if (bma.a(blzVar, g())) {
            blzVar.d();
        }
        this.d = 9205357640488583168L;
        this.e = 9205357640488583168L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [cxi, java.lang.Object] */
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
    @Override // defpackage.bgw
    public final void b(long j) {
        ?? A = this.b.a();
        if (A != 0) {
            defpackage.blz blzVar = this.c;
            if (A.u() && bma.a(blzVar, g())) {
                this.f = mni.bl(this.f, j);
                long jAM = mni.aM(mni.bl(this.d, this.f), mni.aM(A.k(0L), this.e));
                if (blzVar.g(A, jAM, this.d, this.g, true)) {
                    this.d = jAM;
                    this.e = A.k(0L);
                    this.f = 0L;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [cxi, java.lang.Object] */
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
    @Override // defpackage.bgw
    public final void c(long j, defpackage.bks bksVar) {
        this.g = bksVar;
        ?? A = this.b.a();
        if (A != 0) {
            defpackage.blz blzVar = this.c;
            if (!A.u()) {
                return;
            }
            blzVar.e(A, j, this.g, true);
            this.d = j;
            this.e = A.k(0L);
        }
        if (bma.a(this.c, g())) {
            this.f = 0L;
        }
    }

    @Override // defpackage.bgw
    public final void d() {
        defpackage.blz blzVar = this.c;
        if (bma.a(blzVar, g())) {
            blzVar.d();
        }
        this.d = 9205357640488583168L;
        this.e = 9205357640488583168L;
    }

    public final long g() {
        return ((java.lang.Number) this.a.a()).longValue();
    }

    @Override // defpackage.bgw
    public final void e() {
    }

    @Override // defpackage.bgw
    public final void f() {
    }
}
