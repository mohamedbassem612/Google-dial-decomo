package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acoa implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;
    public final /* synthetic */ java.lang.Object i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ acoa(defpackage.acob acobVar, java.lang.String str, zzl zzlVar, ajcq ajcqVar, ajcq ajcqVar2, ahyn ahynVar, ajcq ajcqVar3, acnl acnlVar, ajcq ajcqVar4, aclw aclwVar, int i) {
        this.$cid = i;
        this.a = acobVar;
        this.b = str;
        this.c = zzlVar;
        this.d = ajcqVar;
        this.e = ajcqVar2;
        this.f = ahynVar;
        this.g = ajcqVar3;
        this.h = acnlVar;
        this.i = ajcqVar4;
        this.j = aclwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v20, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v1, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aclv, acni, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [amzg, java.lang.Object] */
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
    public final ajcq a() {
        if (this.$cid != 0) {
            ?? r1 = this.d;
            ?? r3 = this.e;
            ?? r4 = this.g;
            ?? r5 = this.i;
            ?? r6 = this.b;
            ajcq ajcqVarD = r1.d();
            ajcq ajcqVarD2 = r3.d();
            ajcq ajcqVarD3 = r4.d();
            ajcq ajcqVarD4 = r5.d();
            ajcq ajcqVarD5 = r6.d();
            ahda ahdaVarAk = ahvr.ak(new ajcq[]{ajcqVarD, ajcqVarD2, ajcqVarD3, ajcqVarD4, ajcqVarD5});
            java.lang.Object obj = this.c;
            return ahdaVarAk.o(new lez(ajcqVarD5, (defpackage.qbe) this.a, ajcqVarD2, ajcqVarD3, ajcqVarD, ajcqVarD4, (ley) this.h, (lee) this.j, (android.content.Context) obj, 0), (java.util.concurrent.Executor) this.f);
        }
        java.lang.Object obj2 = this.b;
        defpackage.agbc agbcVarA = defpackage.aclx.a();
        agbcVarA.d((java.lang.String) obj2);
        agbcVarA.b = this.c;
        agbcVarA.e((albh) aiql.H((java.util.concurrent.Future) this.d));
        agbcVarA.g = (defpackage.aiva) aiql.H((java.util.concurrent.Future) this.e);
        agbcVarA.e = (java.lang.Integer) ((ahyn) this.f).e();
        agbcVarA.d = (int[]) aiql.H((java.util.concurrent.Future) this.g);
        defpackage.acob acobVar = (defpackage.acob) this.a;
        defpackage.acnm acnmVar = acobVar.a;
        ?? r7 = this.h;
        acnmVar.h(r7);
        agbcVarA.a = 1;
        acnmVar.b(r7);
        int[] iArr = (int[]) aiql.H((java.util.concurrent.Future) this.i);
        acmi acmiVarF = abrz.f((acni) r7);
        apdi apdiVar = defpackage.acoz.a;
        acmiVarF.c(apdiVar);
        akzs akzsVar = ((alaa) acmiVarF).n;
        alac alacVar = (alac) apdiVar.a;
        if (akzsVar.l(alacVar) || iArr != null) {
            acmi acmiVarF2 = abrz.f((acni) r7);
            acmiVarF2.c(apdiVar);
            java.lang.Object objJ = ((alaa) acmiVarF2).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            java.util.HashSet hashSet = new java.util.HashSet((java.util.Collection) ((defpackage.acoy) objJ).b);
            if (iArr != null) {
                hashSet.addAll(aiql.U(iArr));
            }
            agbcVarA.c = aiql.W(hashSet);
        }
        return acobVar.b.b(agbcVarA.c(), ((aclw) this.j).b);
    }

    public /* synthetic */ acoa(amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, defpackage.qbe qbeVar, ley leyVar, lee leeVar, android.content.Context context, ajct ajctVar, int i) {
        this.$cid = i;
        this.d = amzgVar;
        this.e = amzgVar2;
        this.g = amzgVar3;
        this.i = amzgVar4;
        this.b = amzgVar5;
        this.a = qbeVar;
        this.h = leyVar;
        this.j = leeVar;
        this.c = context;
        this.f = ajctVar;
    }
}
