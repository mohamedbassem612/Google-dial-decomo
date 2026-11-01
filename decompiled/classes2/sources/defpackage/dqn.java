package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dqn extends cmv implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener, coy {
    private android.view.ViewTreeObserver a;
    private final aonj b = new dih(this, 6);
    private final aonj c = new dih(this, 7);

    private final cpg b() {
        boolean z;
        if (!((cmv) this).t.D) {
            cwh.d("visitLocalDescendants called on an unattached node");
        }
        cmv cmvVar = ((cmv) this).t;
        if ((cmvVar.v & 1024) != 0) {
            boolean z2 = false;
            for (cpg cpgVar = cmvVar.x; cpgVar != null; cpgVar = ((cmv) cpgVar).x) {
                if ((((cmv) cpgVar).u & 1024) != 0) {
                    cpg cpgVarX = cpgVar;
                    cfc cfcVar = null;
                    while (cpgVarX != null) {
                        if (cpgVarX instanceof cpg) {
                            cpg cpgVar2 = cpgVarX;
                            if (z2) {
                                return cpgVar2;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (((cmv) cpgVarX).u & 1024) != 0 && (cpgVarX instanceof dap)) {
                            int i = 0;
                            for (cpg cpgVar3 = ((dap) cpgVarX).F; cpgVar3 != null; cpgVar3 = ((cmv) cpgVar3).x) {
                                if ((((cmv) cpgVar3).u & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cpgVarX = cpgVar3;
                                    } else {
                                        if (cfcVar == null) {
                                            cfcVar = new cfc(new cmv[16]);
                                        }
                                        if (cpgVarX != null) {
                                            cfcVar.n(cpgVarX);
                                        }
                                        cfcVar.n(cpgVar3);
                                        cpgVarX = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        cpgVarX = cfo.x(cfcVar);
                    }
                }
            }
        }
        throw new java.lang.IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    public final void c(defpackage.cow cowVar) {
        cowVar.a(false);
        cowVar.c(this.b);
        cowVar.d(this.c);
    }

    public final void dc() {
        android.view.ViewTreeObserver viewTreeObserver = wl.f(this).getViewTreeObserver();
        this.a = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) throws aois {
        if (cfo.A(this).k != null) {
            android.view.View viewG = defpackage.dpm.g(this);
            cou couVar = cfo.C(this).F;
            dcv dcvVarC = cfo.C(this);
            boolean z = (view == null || aooh.n(view, dcvVarC) || !defpackage.dpm.h(viewG, view)) ? false : true;
            boolean z2 = (view2 == null || aooh.n(view2, dcvVarC) || !defpackage.dpm.h(viewG, view2)) ? false : true;
            if (z) {
                if (z2 || !b().e().b()) {
                    return;
                }
                couVar.j(false, false, 8);
                return;
            }
            if (z2) {
                cpg cpgVarB = b();
                if (cpgVarB.e().a()) {
                    return;
                }
                defpackage.rx.x(cpgVarB);
            }
        }
    }

    public final void u() {
        android.view.ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.a = null;
        wl.f(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
