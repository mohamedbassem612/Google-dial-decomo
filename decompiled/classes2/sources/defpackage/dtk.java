package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dtk extends defpackage.dtj {
    public int m;

    public dtk(dtr dtrVar) {
        super(dtrVar);
        this.l = true != (dtrVar instanceof defpackage.dto) ? 3 : 2;
    }

    @Override // defpackage.dtj
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((dti) it.next()).f();
        }
    }
}
