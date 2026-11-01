package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoan {
    public final defpackage.anok a;
    public anmm b;
    public boolean c = false;
    public defpackage.anmn d = defpackage.anmn.a(anmm.d);

    public aoan(defpackage.anok anokVar, anmm anmmVar) {
        this.a = anokVar;
        this.b = anmmVar;
    }

    public final anmm a() {
        return this.d.a;
    }

    public final void b(anmm anmmVar) {
        boolean z;
        this.b = anmmVar;
        if (anmmVar == anmm.b || anmmVar == anmm.c) {
            z = true;
        } else if (anmmVar != anmm.d) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
