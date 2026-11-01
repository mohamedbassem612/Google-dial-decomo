package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afqv extends dye {
    final /* synthetic */ defpackage.afqy a;

    public afqv(defpackage.afqy afqyVar) {
        j$.util.Objects.requireNonNull(afqyVar);
        this.a = afqyVar;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        defpackage.afqy afqyVar = this.a;
        if (!afqyVar.c || afqyVar.a.A()) {
            ebdVar.x(false);
        } else {
            ebdVar.h(1048576);
            ebdVar.x(true);
        }
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (i == 1048576) {
            defpackage.afqy afqyVar = this.a;
            if (afqyVar.c && !afqyVar.a.A()) {
                afqyVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.i(view, i, bundle);
    }
}
