package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eel extends defpackage.aomh implements defpackage.aonj {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.eem d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eel(defpackage.eem eemVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.d = eemVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.eel(this.d, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
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
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        ?? r0;
        ?? r1;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        ?? r2 = this.c;
        try {
            try {
                try {
                    if (r2 == 0) {
                        defpackage.aooc.af(obj);
                        defpackage.eem eemVar = this.d;
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(eemVar.a);
                        defpackage.efa efaVar = eemVar.b;
                        this.a = fileInputStream;
                        this.b = null;
                        this.c = 1;
                        obj = efaVar.b(fileInputStream);
                        r2 = fileInputStream;
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (r2 != 1) {
                            r0 = this.b;
                            try {
                                defpackage.aooc.af(obj);
                                r1 = r0;
                                defpackage.ajsz.ak(r1, null);
                                return obj;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    defpackage.ajsz.ak(r0, th);
                                    throw th2;
                                }
                            }
                        }
                        java.lang.Object obj2 = this.a;
                        defpackage.aooc.af(obj);
                        r2 = obj2;
                    }
                    defpackage.ajsz.ak(r2, null);
                } catch (java.io.FileNotFoundException unused) {
                    defpackage.eem eemVar2 = this.d;
                    java.io.File file = eemVar2.a;
                    if (!file.exists()) {
                        return this.d.b.a();
                    }
                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
                    try {
                        defpackage.efa efaVar2 = eemVar2.b;
                        this.a = null;
                        this.b = fileInputStream2;
                        this.c = 2;
                        obj = efaVar2.b(fileInputStream2);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        r1 = fileInputStream2;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        r0 = fileInputStream2;
                        throw th;
                    }
                }
                return obj;
            } catch (java.lang.Exception e) {
                if (e instanceof java.io.FileNotFoundException) {
                    throw dzr.j(this.d.a.getParent(), e);
                }
                throw e;
            }
        } catch (java.lang.Throwable th4) {
            try {
                throw th4;
            } catch (java.lang.Throwable th5) {
                defpackage.ajsz.ak(r2, th4);
                throw th5;
            }
        }
    }
}
