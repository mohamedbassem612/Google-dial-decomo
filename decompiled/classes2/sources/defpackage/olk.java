package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class olk extends defpackage.gmr {
    final /* synthetic */ defpackage.oll a;

    public olk(defpackage.oll ollVar) {
        j$.util.Objects.requireNonNull(ollVar);
        this.a = ollVar;
    }

    @Override // defpackage.gmr, defpackage.gmp
    public final void b(int i) {
        defpackage.oll ollVar = this.a;
        if (ollVar.k) {
            ollVar.k = false;
            return;
        }
        ollVar.a.i(ollVar.l);
        ollVar.c(i);
        ollVar.d(ollVar.l, i);
        ollVar.l = i;
    }
}
