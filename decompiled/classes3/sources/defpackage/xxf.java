package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xxf implements defpackage.xwc, defpackage.xva {
    private final defpackage.xwb a;
    private final defpackage.xwd b;
    private int c;
    private int d = -1;
    private defpackage.xuo e;
    private java.util.List f;
    private int g;
    private java.io.File h;
    private defpackage.xxg i;
    private volatile ucm j;

    public xxf(defpackage.xwd xwdVar, defpackage.xwb xwbVar) {
        this.b = xwdVar;
        this.a = xwbVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xvb] */
    @Override // defpackage.xwc
    public final void a() {
        ucm ucmVar = this.j;
        if (ucmVar != null) {
            ucmVar.c.d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, xvb] */
    @Override // defpackage.xwc
    public final boolean b() {
        java.util.List arrayList;
        defpackage.xwd xwdVar = this.b;
        java.util.List listD = xwdVar.d();
        boolean z = false;
        if (!listD.isEmpty()) {
            defpackage.xss xssVarA = xwdVar.c.a();
            java.lang.Class<?> cls = xwdVar.d.getClass();
            java.lang.Class cls2 = xwdVar.g;
            java.lang.Class cls3 = xwdVar.j;
            defpackage.uyg uygVar = xssVarA.h;
            defpackage.yga ygaVar = (defpackage.yga) ((java.util.concurrent.atomic.AtomicReference) uygVar.a).getAndSet(null);
            if (ygaVar == null) {
                ygaVar = new defpackage.yga(cls, cls2, cls3);
            } else {
                ygaVar.a(cls, cls2, cls3);
            }
            java.lang.Object obj = uygVar.b;
            synchronized (obj) {
                arrayList = (java.util.List) ((aec) obj).get(ygaVar);
            }
            ((java.util.concurrent.atomic.AtomicReference) uygVar.a).set(ygaVar);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = xssVarA.d.n(cls).iterator();
                while (it.hasNext()) {
                    for (java.lang.Class cls4 : xssVarA.g.E((java.lang.Class) it.next(), cls2)) {
                        if (!xssVarA.f.s(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                defpackage.uyg uygVar2 = xssVarA.h;
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(arrayList);
                java.lang.Object obj2 = uygVar2.b;
                synchronized (obj2) {
                    ((aec) obj2).put(new defpackage.yga(cls, cls2, cls3), listUnmodifiableList);
                }
            }
            if (!arrayList.isEmpty()) {
                while (true) {
                    if (this.f != null && d()) {
                        this.j = null;
                        while (!z && d()) {
                            java.util.List list = this.f;
                            int i = this.g;
                            this.g = i + 1;
                            defpackage.xzp xzpVar = (defpackage.xzp) list.get(i);
                            java.io.File file = this.h;
                            defpackage.xwd xwdVar2 = this.b;
                            this.j = xzpVar.b(file, xwdVar2.e, xwdVar2.f, xwdVar2.h);
                            if (this.j != null && xwdVar2.g(this.j.c.a())) {
                                this.j.c.g(xwdVar2.n, this);
                                z = true;
                            }
                        }
                        break;
                    }
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= arrayList.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= listD.size()) {
                            break;
                        }
                        this.d = 0;
                    }
                    defpackage.xuo xuoVar = (defpackage.xuo) listD.get(this.c);
                    java.lang.Class cls5 = (java.lang.Class) arrayList.get(this.d);
                    defpackage.xwd xwdVar3 = this.b;
                    this.i = new defpackage.xxg(xwdVar3.h(), xuoVar, xwdVar3.m, xwdVar3.e, xwdVar3.f, xwdVar3.a(cls5), cls5, xwdVar3.h);
                    java.io.File fileA = xwdVar3.c().a(this.i);
                    this.h = fileA;
                    if (fileA != null) {
                        this.e = xuoVar;
                        this.f = xwdVar3.f(fileA);
                        this.g = 0;
                    }
                }
            } else {
                defpackage.xwd xwdVar4 = this.b;
                if (!java.io.File.class.equals(xwdVar4.j)) {
                    throw new java.lang.IllegalStateException(hgb.l(xwdVar4.j, java.lang.String.valueOf(xwdVar4.d.getClass()), "Failed to find any load path from ", " to "));
                }
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
        this.a.d(this.e, obj, this.j.c, defpackage.xuc.d, this.i);
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
        this.a.c(this.i, exc, this.j.c, defpackage.xuc.d);
    }
}
