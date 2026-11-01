package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eez {
    public final defpackage.aosi a;
    public java.util.List b;
    final /* synthetic */ defpackage.eei c;
    private final defpackage.apdp d;
    private final defpackage.aolr e;

    public eez(defpackage.eei eeiVar, java.util.List list, defpackage.aolr aolrVar) {
        if (list == null) {
            defpackage.aooh.i("initTasksList");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        this.c = eeiVar;
        this.d = new defpackage.apdp();
        this.a = new defpackage.aosi(null);
        this.e = aolrVar;
        this.b = defpackage.ajsz.bZ(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [apdp] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [apdp] */
    /* JADX WARN: Type inference failed for: r0v9, types: [apdp] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eez] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5, types: [apdp] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    public final java.lang.Object a(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.eey eeyVar;
        defpackage.apdp apdpVar;
        ?? r6;
        ?? r0;
        if (aolnVar instanceof defpackage.eey) {
            eeyVar = (defpackage.eey) aolnVar;
            int i = eeyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eeyVar.c = i - Integer.MIN_VALUE;
            } else {
                eeyVar = new defpackage.eey(this, aolnVar);
            }
        } else {
            eeyVar = new defpackage.eey(this, aolnVar);
        }
        java.lang.Object obj = eeyVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = eeyVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                if (this.a.x()) {
                    return defpackage.aojh.a;
                }
                apdpVar = this.d;
                eeyVar.d = apdpVar;
                eeyVar.c = 1;
                if (apdpVar.b(eeyVar) == obj2) {
                    r6 = apdpVar;
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0 = eeyVar.d;
                    try {
                        defpackage.aooc.af(obj);
                        r0 = r0;
                        defpackage.aosi aosiVar = this.a;
                        defpackage.aojh aojhVar = defpackage.aojh.a;
                        aosiVar.Q(aojhVar);
                        r0.d();
                        obj2 = defpackage.aojh.a;
                        r6 = aojhVar;
                        r6 = r6;
                        return obj2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r0.d();
                        throw th;
                    }
                }
                defpackage.apdp apdpVar2 = eeyVar.d;
                defpackage.aooc.af(obj);
                r6 = apdpVar2;
            }
            r6 = apdpVar;
            if (this.a.x()) {
                obj2 = defpackage.aojh.a;
                r6.d();
                r6 = r6;
            } else {
                eeyVar.d = r6;
                eeyVar.c = 2;
                if (b(eeyVar) != obj2) {
                    r6 = r6;
                    r0 = r6;
                    defpackage.aosi aosiVar2 = this.a;
                    defpackage.aojh aojhVar2 = defpackage.aojh.a;
                    aosiVar2.Q(aojhVar2);
                    r0.d();
                    obj2 = defpackage.aojh.a;
                    r6 = aojhVar2;
                }
            }
            r6 = r6;
            return obj2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            r0 = r6;
            r0.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    protected final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.ecy ecyVar;
        if (aolnVar instanceof defpackage.ecy) {
            ecyVar = (defpackage.ecy) aolnVar;
            int i = ecyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecyVar.b = i - Integer.MIN_VALUE;
            } else {
                ecyVar = new defpackage.ecy(this, aolnVar);
            }
        } else {
            ecyVar = new defpackage.ecy(this, aolnVar);
        }
        java.lang.Object obj = ecyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ecyVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        ecyVar.b = 1;
        obj = null;
        defpackage.aolr aolrVar = this.e;
        defpackage.edj edjVar = new defpackage.edj(this.c, (defpackage.gjy) obj, this, (defpackage.aoln) null, 1);
        ecyVar.b = 2;
        if (defpackage.aoov.aj(aolrVar, edjVar, ecyVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }
}
