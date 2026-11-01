package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dap extends defpackage.cmv {
    public final int E;
    public defpackage.cmv F;

    public dap(defpackage.kaw kawVar, defpackage.aomy aomyVar) {
        this();
        V(new defpackage.bze(kawVar, aomyVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cmv] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private final void cP(int i, boolean z) {
        ?? r2;
        defpackage.cmv cmvVar;
        int i2 = this.u;
        this.u = i;
        if (i2 != i) {
            if (L() == this) {
                this.v = i;
            }
            if (this.D) {
                defpackage.cmv cmvVar2 = this.t;
                while (r2 != 0) {
                    i |= r2.u;
                    r2.u = i;
                    if (r2 == cmvVar2) {
                        break;
                    }
                    this = this;
                    r2 = r2.w;
                }
                if (z && r2 == cmvVar2) {
                    i = defpackage.dcl.c(cmvVar2);
                    cmvVar2.u = i;
                }
                this = this;
                this = this;
                int i3 = 0;
                if (r2 != 0 && (cmvVar = r2.x) != null) {
                    i3 = cmvVar.v;
                }
                int i4 = i | i3;
                for (?? r3 = r2; r3 != 0; r3 = r3.w) {
                    i4 |= r3.u;
                    r3.v = i4;
                }
            }
        }
    }

    @Override // defpackage.cmv
    public final void N() {
        super.N();
        for (defpackage.cmv cmvVar = this.F; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.T(this.z);
            if (!cmvVar.D) {
                cmvVar.N();
            }
        }
    }

    @Override // defpackage.cmv
    public final void O() {
        for (defpackage.cmv cmvVar = this.F; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.O();
        }
        super.O();
    }

    @Override // defpackage.cmv
    public final void P() {
        super.P();
        for (defpackage.cmv cmvVar = this.F; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.P();
        }
    }

    @Override // defpackage.cmv
    public final void Q() {
        for (defpackage.cmv cmvVar = this.F; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.Q();
        }
        super.Q();
    }

    @Override // defpackage.cmv
    public final void R() {
        super.R();
        for (defpackage.cmv cmvVar = this.F; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.R();
        }
    }

    @Override // defpackage.cmv
    public final void S(defpackage.cmv cmvVar) {
        this.t = cmvVar;
        for (defpackage.cmv cmvVar2 = this.F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
            cmvVar2.S(cmvVar);
        }
    }

    @Override // defpackage.cmv
    public final void T(defpackage.dck dckVar) {
        this.z = dckVar;
        for (defpackage.cmv cmvVar = this.F; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.T(dckVar);
        }
    }

    public final void U(defpackage.dao daoVar) {
        defpackage.cmv cmvVar = null;
        for (defpackage.cmv cmvVar2 = this.F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
            if (cmvVar2 == daoVar) {
                if (cmvVar2.D) {
                    defpackage.dcl.f(cmvVar2);
                    cmvVar2.R();
                    cmvVar2.O();
                }
                cmvVar2.S(cmvVar2);
                cmvVar2.v = 0;
                if (cmvVar == null) {
                    this.F = cmvVar2.x;
                } else {
                    cmvVar.x = cmvVar2.x;
                }
                cmvVar2.x = null;
                cmvVar2.w = null;
                int i = this.u;
                int iC = defpackage.dcl.c(this);
                cP(iC, true);
                if (this.D && (i & 2) != 0 && (iC & 2) == 0) {
                    defpackage.dce dceVar = defpackage.cfo.A(this).v;
                    this.t.T(null);
                    dceVar.h();
                    return;
                }
                return;
            }
            cmvVar = cmvVar2;
        }
        java.util.Objects.toString(daoVar);
        throw new java.lang.IllegalStateException("Could not find delegate: ".concat(java.lang.String.valueOf(daoVar)));
    }

    public final void V(defpackage.dao daoVar) {
        defpackage.cmv cmvVarL = daoVar.L();
        if (cmvVarL != daoVar) {
            if (true != (daoVar instanceof defpackage.cmv)) {
                daoVar = null;
            }
            defpackage.cmv cmvVar = daoVar != null ? ((defpackage.cmv) daoVar).w : null;
            if (cmvVarL != this.t || !defpackage.aooh.n(cmvVar, this)) {
                throw new java.lang.IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (cmvVarL.D) {
            defpackage.cwh.d("Cannot delegate to an already attached node");
        }
        cmvVarL.S(this.t);
        int i = this.u;
        int iC = defpackage.dcl.c(cmvVarL);
        cmvVarL.u = iC;
        int i2 = iC & 2;
        int i3 = this.u;
        if (i2 != 0 && (i3 & 2) != 0 && !(this instanceof defpackage.dbd)) {
            defpackage.cwh.d(defpackage.a.bi(cmvVarL, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
        }
        cmvVarL.x = this.F;
        this.F = cmvVarL;
        cmvVarL.w = this;
        cP(this.u | iC, false);
        if (this.D) {
            if (i2 == 0 || (i & 2) != 0) {
                T(this.z);
            } else {
                defpackage.dce dceVar = defpackage.cfo.A(this).v;
                this.t.T(null);
                dceVar.h();
            }
            cmvVarL.N();
            cmvVarL.Q();
            defpackage.dcl.d(cmvVarL);
        }
    }

    public dap() {
        this.E = defpackage.dcl.b(this);
    }
}
