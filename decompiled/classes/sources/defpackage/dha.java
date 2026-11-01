package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dha implements defpackage.cay, defpackage.emv {
    public final defpackage.deg a;
    public final defpackage.cay b;
    public boolean c;
    public defpackage.ems d;
    public defpackage.aonn e = defpackage.dfi.a;

    public dha(defpackage.deg degVar, defpackage.cay cayVar) {
        this.a = degVar;
        this.b = cayVar;
    }

    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        if (empVar == defpackage.emp.ON_DESTROY) {
            d();
        } else {
            if (empVar != defpackage.emp.ON_CREATE || this.c) {
                return;
            }
            e(this.e);
        }
    }

    @Override // defpackage.cay
    public final void d() {
        if (!this.c) {
            this.c = true;
            defpackage.deg degVar = this.a;
            degVar.setTag(2131429523, null);
            defpackage.ems emsVar = this.d;
            if (emsVar != null) {
                emsVar.d(this);
            }
            this.d = null;
            defpackage.dfq dfqVar = degVar.g;
            if (dfqVar != null) {
                dfqVar.a.a();
            }
            degVar.g = null;
        }
        this.b.d();
    }

    @Override // defpackage.cay
    public final void e(defpackage.aonn aonnVar) {
        defpackage.bet betVar = new defpackage.bet(this, aonnVar, 8);
        defpackage.deg degVar = this.a;
        if (((java.lang.Boolean) degVar.l.a()).booleanValue()) {
            betVar.a(degVar.e);
        } else {
            degVar.z = betVar;
        }
    }
}
