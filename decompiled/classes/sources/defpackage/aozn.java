package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aozn implements defpackage.aoxi {
    private final defpackage.aoxi a;
    private final defpackage.aonn b;

    public aozn(defpackage.aoxi aoxiVar, defpackage.aonn aonnVar) {
        this.a = aoxiVar;
        this.b = aonnVar;
    }

    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        return this.a.a(obj, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [apan] */
    /* JADX WARN: Type inference failed for: r2v3, types: [apan] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
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
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.aozm aozmVar;
        if (aolnVar instanceof defpackage.aozm) {
            aozmVar = (defpackage.aozm) aolnVar;
            int i = aozmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aozmVar.c = i - Integer.MIN_VALUE;
            } else {
                aozmVar = new defpackage.aozm(this, aolnVar);
            }
        } else {
            aozmVar = new defpackage.aozm(this, aolnVar);
        }
        java.lang.Object obj = aozmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        ?? r2 = aozmVar.c;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    defpackage.apan apanVar = aozmVar.d;
                    defpackage.aooc.af(obj);
                    r2 = apanVar;
                } else {
                    if (r2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.aooc.af(obj);
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj);
            defpackage.apan apanVar2 = new defpackage.apan(this.a, aozmVar.u());
            defpackage.aonn aonnVar = this.b;
            aozmVar.d = apanVar2;
            aozmVar.c = 1;
            java.lang.Object objA = aonnVar.a(apanVar2, aozmVar);
            r2 = apanVar2;
            if (objA == aoluVar) {
                return aoluVar;
            }
            r2.f();
            defpackage.aoxi aoxiVar = this.a;
            if (aoxiVar instanceof defpackage.aozn) {
                aozmVar.d = null;
                aozmVar.c = 2;
                if (((defpackage.aozn) aoxiVar).b(aozmVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            r2.f();
            throw th;
        }
    }
}
