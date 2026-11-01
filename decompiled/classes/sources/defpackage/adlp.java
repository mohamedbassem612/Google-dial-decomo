package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adlp implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.ajcq a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ adlp(defpackage.aogc aogcVar, java.lang.Object obj, defpackage.adii adiiVar, defpackage.ajcq ajcqVar, int i) {
        this.$cid = i;
        this.d = aogcVar;
        this.c = obj;
        this.b = adiiVar;
        this.a = ajcqVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v13, types: [aexi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [aexi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [ajat, java.lang.Object] */
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
    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.adlt) this.b).d((java.lang.String) this.c, (defpackage.adlx) this.d);
            return this.a;
        }
        if (i == 1) {
            defpackage.aiof aiofVar = defpackage.adhn.a;
            java.lang.Object obj = this.c;
            defpackage.aogc aogcVar = (defpackage.aogc) this.d;
            aogcVar.ai(obj);
            ?? r1 = aogcVar.a;
            java.lang.Object obj2 = this.b;
            synchronized (r1) {
                r1.remove(obj);
            }
            synchronized (obj2) {
                defpackage.ajdd ajddVar = ((defpackage.adii) obj2).b;
                if (ajddVar != null) {
                    ajddVar.o(null);
                }
            }
            return this.a;
        }
        int i2 = 2;
        if (i == 2) {
            java.lang.Object obj3 = this.b;
            defpackage.afgz afgzVar = new defpackage.afgz(obj3, i2);
            ?? r4 = this.c;
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            int i3 = defpackage.ajan.c;
            defpackage.ajcq ajcqVar = this.a;
            defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar, afgzVar);
            ajcqVar.c(ajalVar, defpackage.aiql.t(ajbmVar, ajalVar));
            defpackage.ajal ajalVar2 = new defpackage.ajal(ajalVar, this.d);
            ajalVar.c(ajalVar2, defpackage.aiql.t(r4, ajalVar2));
            defpackage.accg accgVar = new defpackage.accg(obj3, ajalVar, ajalVar2, 4);
            long j = defpackage.ahqx.a;
            defpackage.ajal ajalVar3 = new defpackage.ajal(ajalVar2, new defpackage.ajax(defpackage.ahns.c(false), accgVar, 1));
            ajalVar2.c(ajalVar3, defpackage.aiql.t(ajbmVar, ajalVar3));
            return ajalVar3;
        }
        if (i != 3) {
            ?? r0 = this.d;
            defpackage.ajsx ajsxVar = r0 != 0 ? (defpackage.ajsx) defpackage.aiql.H(r0) : null;
            defpackage.ajcq ajcqVar2 = this.a;
            byte[] bArr = ajcqVar2 != null ? (byte[]) defpackage.aiql.H(ajcqVar2) : null;
            if (ajsxVar == null) {
                return defpackage.aiql.z(null);
            }
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.b;
            return bArr == null ? ((defpackage.gou) obj5).e.g((java.lang.String) obj4, ajsxVar) : ((defpackage.gou) obj5).e.h((java.lang.String) obj4, ajsxVar, bArr);
        }
        defpackage.accg accgVar2 = new defpackage.accg(this.b, this.d, this.c, 5);
        long j2 = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), accgVar2, 1);
        defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
        int i4 = defpackage.ajan.c;
        defpackage.ajcq ajcqVar3 = this.a;
        defpackage.ajal ajalVar4 = new defpackage.ajal(ajcqVar3, ajaxVar);
        ajcqVar3.c(ajalVar4, defpackage.aiql.t(ajbmVar2, ajalVar4));
        return ajalVar4;
    }

    public /* synthetic */ adlp(java.lang.Object obj, defpackage.ajcq ajcqVar, defpackage.ajat ajatVar, java.util.concurrent.Executor executor, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = ajcqVar;
        this.d = ajatVar;
        this.c = executor;
    }

    public /* synthetic */ adlp(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, defpackage.ajcq ajcqVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = str;
        this.d = obj2;
        this.a = ajcqVar;
    }
}
