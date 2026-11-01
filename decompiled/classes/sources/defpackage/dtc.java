package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dtc extends defpackage.dsy {
    public defpackage.dsy[] ar = new defpackage.dsy[4];
    public int as = 0;

    public final void T(java.util.ArrayList arrayList, int i, dtq dtqVar) {
        for (int i2 = 0; i2 < this.as; i2++) {
            dtqVar.d(this.ar[i2]);
        }
        for (int i3 = 0; i3 < this.as; i3++) {
            dum.b(this.ar[i3], i, arrayList, dtqVar);
        }
    }
}
