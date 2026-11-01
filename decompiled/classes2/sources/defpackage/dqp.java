package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dqp extends dap implements dcp, dan {
    public bek a;
    private final cpg b;

    public dqp() {
        cpg cpgVar = new cpg(0, true, new defpackage.gfw((java.lang.Object) this, 1, (byte[]) null), 9);
        V(cpgVar);
        this.b = cpgVar;
    }

    public final bek b() {
        aoot aootVar = new aoot();
        den.u(this, new defpackage.bxq(aootVar, this, 11));
        return (bek) aootVar.a;
    }

    public final void v() {
        cpg cpgVar = this.b;
        bek bekVarB = b();
        if (cpgVar.e().b()) {
            bek bekVar = this.a;
            if (bekVar != null) {
                bekVar.a();
            }
            if (bekVarB != null) {
                bekVarB.d();
            } else {
                bekVarB = null;
            }
            this.a = bekVarB;
        }
    }
}
