package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xtv extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.xsv b;
    final /* synthetic */ defpackage.xsx c;
    final /* synthetic */ defpackage.xff d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtv(defpackage.xff xffVar, defpackage.xsv xsvVar, defpackage.xsx xsxVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = xffVar;
        this.b = xsvVar;
        this.c = xsxVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aows) obj, (aoln) obj2).b(aojh.a);
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
    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aows aowsVar = (aows) this.e;
            defpackage.xtt xttVar = new defpackage.xtt(aowsVar, this.d);
            defpackage.xsv xsvVar = this.b;
            aooh.f(xsvVar, "<this>");
            xsvVar.l(xttVar, xttVar, xsvVar, new fjq(3));
            defpackage.xtu xtuVar = new defpackage.xtu(this.c, xttVar, 0);
            this.a = 1;
            if (aooh.D(aowsVar, xtuVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.xtv xtvVar = new defpackage.xtv(this.d, this.b, this.c, aolnVar);
        xtvVar.e = obj;
        return xtvVar;
    }
}
