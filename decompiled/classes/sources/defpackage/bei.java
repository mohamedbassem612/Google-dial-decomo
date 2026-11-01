package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class bei {
    private final defpackage.aco a;

    public bei() {
        defpackage.aco acoVar = defpackage.acp.a;
        this.a = new defpackage.aco(6);
    }

    public abstract defpackage.bef b(int i, int i2, int i3, long j);

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
    public final java.util.List e(defpackage.bee beeVar, int i, long j) {
        defpackage.aco acoVar = this.a;
        java.util.List list = (java.util.List) acoVar.a(i);
        if (list != null) {
            return list;
        }
        java.util.List listS = beeVar.s(i);
        int size = listS.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((defpackage.cyd) listS.get(i2)).v(j));
        }
        acoVar.g(i, arrayList);
        return arrayList;
    }
}
