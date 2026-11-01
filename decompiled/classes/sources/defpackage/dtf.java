package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dtf extends defpackage.dsy {
    public java.util.ArrayList aI = new java.util.ArrayList();

    @Override // defpackage.dsy
    public final void S(defpackage.ajxw ajxwVar) {
        super.S(ajxwVar);
        int size = this.aI.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.dsy) this.aI.get(i)).S(ajxwVar);
        }
    }

    public void T() {
        java.util.ArrayList arrayList = this.aI;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                defpackage.dsy dsyVar = (defpackage.dsy) this.aI.get(i);
                if (dsyVar instanceof defpackage.dtf) {
                    ((defpackage.dtf) dsyVar).T();
                }
            }
        }
    }

    public final void Y(defpackage.dsy dsyVar) {
        this.aI.remove(dsyVar);
        dsyVar.s();
    }

    @Override // defpackage.dsy
    public void s() {
        this.aI.clear();
        super.s();
    }
}
