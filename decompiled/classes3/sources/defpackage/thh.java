package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class thh extends aomh implements aono {
    int a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ long c;
    final /* synthetic */ defpackage.thj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thh(defpackage.thj thjVar, aoln aolnVar) {
        super(3, aolnVar);
        this.d = thjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long jLongValue = ((java.lang.Number) obj2).longValue();
        defpackage.thh thhVar = new defpackage.thh(this.d, (aoln) obj3);
        thhVar.b = (java.util.List) obj;
        thhVar.c = jLongValue;
        return thhVar.b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
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
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        ?? r6 = this.b;
        long j = this.c;
        defpackage.thj thjVar = this.d;
        this.a = 1;
        java.lang.Object objB = thjVar.b(r6, j, this);
        return objB == aoluVar ? aoluVar : objB;
    }
}
