package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aeuw implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ aeuw(defpackage.adqb adqbVar, defpackage.ajct ajctVar, defpackage.adon adonVar, android.content.Context context, int i) {
        this.$cid = i;
        this.c = adqbVar;
        this.d = ajctVar;
        this.b = adonVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ajct, java.lang.Object, java.util.concurrent.Executor] */
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
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        int i = this.$cid;
        if (i == 0) {
            ?? r0 = this.d;
            ?? r1 = this.c;
            return ((defpackage.gou) this.a).D(this.b, r1, r0);
        }
        if (i == 1) {
            ?? r4 = this.d;
            r4.getClass();
            java.lang.Object obj = this.b;
            obj.getClass();
            defpackage.adon adonVar = (defpackage.adon) obj;
            java.lang.String str = adonVar.h;
            if (defpackage.ahvr.cp(str)) {
                throw new java.lang.IllegalArgumentException("Superpack name can't be empty.");
            }
            java.lang.Object obj2 = this.a;
            java.lang.Object obj3 = this.c;
            boolean z = adonVar.g;
            int i2 = adonVar.i;
            defpackage.adqb adqbVar = (defpackage.adqb) obj3;
            adqbVar.c = str;
            adqbVar.d = i2;
            adqbVar.e = z;
            adqbVar.f = r4;
            return defpackage.ajck.w(adqbVar.h.a((android.content.Context) obj2, r4)).y(new defpackage.adpy(adqbVar, str, i2, (defpackage.ajct) r4, 0), r4).x(new defpackage.jtv(obj3, str, 15), r4);
        }
        if (i == 2) {
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.b;
            return defpackage.apni.r((java.lang.String[]) this.d, (android.net.Uri) this.a, (java.lang.String) obj5, (java.lang.String) obj4);
        }
        java.lang.String path = ((java.io.File) this.d.call()).getPath();
        path.getClass();
        java.lang.Object obj6 = this.b;
        java.lang.Object obj7 = this.a;
        java.lang.Object obj8 = this.c;
        defpackage.gje gjeVar = new defpackage.gje();
        defpackage.gir girVarK = defpackage.dzk.K((android.content.Context) obj7);
        girVarK.a = path;
        defpackage.aewz aewzVar = (defpackage.aewz) obj6;
        girVarK.b = (defpackage.giq) aewzVar.e;
        girVarK.c = aewzVar.b;
        girVarK.d = aewzVar.c;
        defpackage.git gitVarA = gjeVar.a(girVarK.a());
        gitVarA.d(((defpackage.ahks) obj8).a);
        return gitVarA;
    }

    public /* synthetic */ aeuw(defpackage.ahks ahksVar, java.util.concurrent.Callable callable, android.content.Context context, defpackage.aewz aewzVar, int i) {
        this.$cid = i;
        this.c = ahksVar;
        this.d = callable;
        this.a = context;
        this.b = aewzVar;
    }

    public /* synthetic */ aeuw(defpackage.gou gouVar, defpackage.ajcu ajcuVar, defpackage.amwu amwuVar, defpackage.aoin aoinVar, int i) {
        this.$cid = i;
        this.a = gouVar;
        this.b = ajcuVar;
        this.c = amwuVar;
        this.d = aoinVar;
    }

    public /* synthetic */ aeuw(java.lang.String[] strArr, android.net.Uri uri, java.lang.String str, java.lang.String str2, int i) {
        this.$cid = i;
        this.d = strArr;
        this.a = uri;
        this.b = str;
        this.c = str2;
    }
}
