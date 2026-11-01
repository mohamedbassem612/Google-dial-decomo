package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afuo extends dye {
    final /* synthetic */ int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ afup c;

    public afuo(afup afupVar, int i, boolean z) {
        this.a = i;
        this.b = z;
        j$.util.Objects.requireNonNull(afupVar);
        this.c = afupVar;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        int i = this.a;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            afuw afuwVar = this.c.g;
            if (afuwVar.e.b(i3) == 2 || afuwVar.e.b(i3) == 3) {
                i2--;
            }
        }
        ebdVar.v(ni.r(i2, 1, 1, 1, this.b, view.isSelected()));
    }
}
