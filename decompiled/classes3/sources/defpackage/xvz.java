package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xvz implements defpackage.xwc, defpackage.xva {
    private final java.util.List a;
    private final defpackage.xwd b;
    private final defpackage.xwb c;
    private int d = -1;
    private defpackage.xuo e;
    private java.util.List f;
    private int g;
    private java.io.File h;
    private volatile ucm i;

    public xvz(java.util.List list, defpackage.xwd xwdVar, defpackage.xwb xwbVar) {
        this.a = list;
        this.b = xwdVar;
        this.c = xwbVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xvb] */
    @Override // defpackage.xwc
    public final void a() {
        ucm ucmVar = this.i;
        if (ucmVar != null) {
            ucmVar.c.d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, xvb] */
    @Override // defpackage.xwc
    public final boolean b() {
        boolean z;
        while (true) {
            z = false;
            if (this.f != null && d()) {
                this.i = null;
                while (!z && d()) {
                    java.util.List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    defpackage.xzp xzpVar = (defpackage.xzp) list.get(i);
                    java.io.File file = this.h;
                    defpackage.xwd xwdVar = this.b;
                    this.i = xzpVar.b(file, xwdVar.e, xwdVar.f, xwdVar.h);
                    if (this.i != null && xwdVar.g(this.i.c.a())) {
                        this.i.c.g(xwdVar.n, this);
                        z = true;
                    }
                }
                break;
            }
            int i2 = this.d + 1;
            this.d = i2;
            java.util.List list2 = this.a;
            if (i2 >= list2.size()) {
                break;
            }
            defpackage.xuo xuoVar = (defpackage.xuo) list2.get(this.d);
            defpackage.xwd xwdVar2 = this.b;
            java.io.File fileA = xwdVar2.c().a(new defpackage.xwa(xuoVar, xwdVar2.m));
            this.h = fileA;
            if (fileA != null) {
                this.e = xuoVar;
                this.f = xwdVar2.f(fileA);
                this.g = 0;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xvb] */
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
        this.c.d(this.e, obj, this.i.c, defpackage.xuc.c, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xvb] */
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
        this.c.c(this.e, exc, this.i.c, defpackage.xuc.c);
    }
}
