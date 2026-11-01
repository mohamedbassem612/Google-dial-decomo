package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cuz {
    public final defpackage.cxi a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final defpackage.adq g = new defpackage.adq(16);
    public final defpackage.cve f = new defpackage.cve();
    public final defpackage.acx h = new defpackage.acx(10);

    public cuz(defpackage.cxi cxiVar) {
        this.a = cxiVar;
    }

    public final void a() {
        if (this.d) {
            this.d = true;
        } else {
            this.f.d.g();
        }
    }

    public final void b() {
        if (this.b) {
            this.c = true;
            return;
        }
        defpackage.cfc cfcVar = this.f.d;
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cvd) objArr[i2]).a();
        }
        a();
    }

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
    public final void c(defpackage.cmv cmvVar) {
        if (this.b) {
            this.e = true;
            this.g.q(cmvVar);
            return;
        }
        defpackage.cve cveVar = this.f;
        defpackage.adq adqVar = cveVar.e;
        adqVar.l();
        adqVar.q(cveVar);
        while (adqVar.g()) {
            defpackage.cve cveVar2 = (defpackage.cve) adqVar.h(adqVar.b - 1);
            int i = 0;
            while (true) {
                defpackage.cfc cfcVar = cveVar2.d;
                if (i < cfcVar.b) {
                    defpackage.cvd cvdVar = (defpackage.cvd) cfcVar.a[i];
                    if (defpackage.aooh.n(cvdVar.a, cmvVar)) {
                        cfcVar.m(cvdVar);
                        cvdVar.a();
                    } else {
                        adqVar.q(cvdVar);
                        i++;
                    }
                }
            }
        }
    }
}
