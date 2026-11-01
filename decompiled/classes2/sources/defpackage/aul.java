package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aul extends dap implements ddb, dan {
    public aonj a;
    public boolean b = true;
    public boolean c = true;
    public final aonj d = new defpackage.auj(this, 0);
    public final aowi e = aooh.H(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, (aonj) null, 6);
    public final cwd f;
    public defpackage.bhm g;
    private ddb h;
    private defpackage.ni i;

    public aul(defpackage.bhm bhmVar, aonj aonjVar) {
        this.g = bhmVar;
        this.a = aonjVar;
        defpackage.bil bilVar = new defpackage.bil(this, 1);
        cvf cvfVar = cvy.a;
        cwd cwdVar = new cwd((java.lang.Object) null, (java.lang.Object) null, (java.lang.Object[]) null, bilVar);
        V(cwdVar);
        this.f = cwdVar;
    }

    public final /* synthetic */ boolean C() {
        return false;
    }

    public final /* synthetic */ void cM() {
        n();
    }

    public final void dc() {
        this.i = new defpackage.ni(android.view.ViewConfiguration.get(wl.f(this).getContext()), (byte[]) null);
    }

    public final void n() {
        this.f.n();
        ddb ddbVar = this.h;
        if (ddbVar != null) {
            ddbVar.n();
        }
    }

    public final void p(cvf cvfVar, defpackage.cvg cvgVar, long j) {
        defpackage.ni niVar = this.i;
        if (this.c) {
            java.util.List list = cvfVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((defpackage.cvm) list.get(i)).i == 2) {
                    if (niVar == null || this.h != null) {
                        break;
                        break;
                    }
                    defpackage.blu bluVar = new defpackage.blu(this, niVar, 1);
                    cvf cvfVar2 = cvy.a;
                    cwd cwdVar = new cwd((java.lang.Object) null, (java.lang.Object) null, (java.lang.Object[]) null, bluVar);
                    V(cwdVar);
                    this.h = cwdVar;
                    break;
                }
            }
        }
        this.f.p(cvfVar, cvgVar, j);
        ddb ddbVar = this.h;
        if (ddbVar != null) {
            ddbVar.p(cvfVar, cvgVar, j);
        }
    }

    public final /* synthetic */ void q() {
        n();
    }

    public final /* synthetic */ void D() {
    }
}
