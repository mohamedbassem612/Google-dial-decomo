package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bct extends defpackage.cmv {
    final /* synthetic */ defpackage.bcu a;
    public defpackage.diy b;

    public bct(defpackage.bcu bcuVar) {
        this.a = bcuVar;
    }

    public final void b() {
        this.b = defpackage.wi.h(this, new aum(this, this.a, 10));
    }

    @Override // defpackage.cmv
    public final void dc() {
        defpackage.bcu bcuVar = this.a;
        bcuVar.a = this;
        if (bcuVar.b != null) {
            b();
        }
    }

    @Override // defpackage.cmv
    public final void u() {
        defpackage.bcu bcuVar = this.a;
        if (bcuVar.a == this) {
            bcuVar.a = null;
        }
        defpackage.diy diyVar = this.b;
        if (diyVar != null) {
            diyVar.b();
        }
        this.b = null;
    }
}
