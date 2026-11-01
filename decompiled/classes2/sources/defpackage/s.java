package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class s extends defpackage.o {
    public final java.util.ArrayList al = new java.util.ArrayList();

    public void D() {
        q();
        java.util.ArrayList arrayList = this.al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                defpackage.o oVar = (defpackage.o) arrayList.get(i);
                if (oVar instanceof defpackage.s) {
                    ((defpackage.s) oVar).D();
                }
            }
        }
    }

    public final void F(defpackage.o oVar) {
        this.al.remove(oVar);
        oVar.r = null;
    }

    @Override // defpackage.o
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.o
    public final void n(int i, int i2) {
        super.n(i, i2);
        java.util.ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((defpackage.o) arrayList.get(i3)).n(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.o
    public final void q() {
        super.q();
        java.util.ArrayList arrayList = this.al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                defpackage.o oVar = (defpackage.o) arrayList.get(i);
                oVar.n(b(), c());
                if (!(oVar instanceof defpackage.p)) {
                    oVar.q();
                }
            }
        }
    }

    @Override // defpackage.o
    public final void z(defpackage.hiv hivVar) {
        super.z(hivVar);
        java.util.ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.o) arrayList.get(i)).z(hivVar);
        }
    }
}
