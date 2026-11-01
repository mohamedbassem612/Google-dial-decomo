package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hp implements dxw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            hq.b((hq) this.a, (android.graphics.Typeface) obj);
            return;
        }
        if (i == 1) {
            super/*android.widget.Button*/.setTypeface((android.graphics.Typeface) obj);
            return;
        }
        if (i == 2) {
            ((aowj) this.a).b((defpackage.gqd) obj);
            return;
        }
        if (i != 3) {
            ahyn ahynVarH = ahyn.h((java.lang.Integer) obj);
            aeim aeimVar = (aeim) this.a;
            aeimVar.e = ahynVarH;
            aeimVar.a(aeimVar.d);
            return;
        }
        rki rkiVar = (rki) obj;
        aooh.f(rkiVar, "<destruct>");
        boolean z = rkiVar.a;
        aimw aimwVarL = defpackage.loi.a.b().l("com/android/dialer/chocolatechip/impl/ui/ChocolateChipFragmentPeer", "onCreate$<anonymous>$<anonymous>", 209, "ChocolateChipFragmentPeer.kt");
        defpackage.loi loiVar = (defpackage.loi) this.a;
        aimwVarL.L("oldEmbedded: %s, newEmbedded: %s", loiVar.s, z);
        loiVar.s = z;
        defpackage.lom lomVar = loiVar.p;
        if (lomVar != null) {
            android.net.Uri uri = loiVar.q;
            if (uri == null || !z) {
                uri = null;
            }
            lomVar.y(uri);
        }
        loiVar.r = z;
        android.view.View viewFindViewById = loiVar.d.N().findViewById(2131429377);
        if (viewFindViewById != null) {
            int i2 = 0;
            if (!z && !loiVar.f()) {
                i2 = 8;
            }
            viewFindViewById.setVisibility(i2);
        }
    }
}
