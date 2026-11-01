package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afuu extends defpackage.lf {
    final /* synthetic */ defpackage.afuw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afuu(defpackage.afuw afuwVar, android.support.v7.widget.RecyclerView recyclerView) {
        super(recyclerView);
        j$.util.Objects.requireNonNull(afuwVar);
        this.c = afuwVar;
    }

    @Override // defpackage.lf, defpackage.dye
    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        defpackage.afup afupVar = this.c.e;
        int i = 0;
        int i2 = 0;
        while (true) {
            defpackage.afuw afuwVar = afupVar.g;
            if (i >= afuwVar.e.a()) {
                ebdVar.u(ni.s(i2, 1, false));
                return;
            }
            int iB = afuwVar.e.b(i);
            if (iB == 0 || iB == 1) {
                i2++;
            }
            i++;
        }
    }
}
