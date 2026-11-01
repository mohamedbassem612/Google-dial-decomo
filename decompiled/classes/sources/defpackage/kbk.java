package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kbk {
    public final defpackage.kbi a;
    public final defpackage.aoin b;
    public final defpackage.agsm c;
    public final defpackage.mau d;
    public final defpackage.agtj e;
    public final defpackage.kbj f;
    public final defpackage.cop g;
    public final defpackage.aais h;
    public final defpackage.rsr i;

    public kbk(defpackage.kbi kbiVar, defpackage.aoin aoinVar, defpackage.aais aaisVar, defpackage.agsm agsmVar, defpackage.mau mauVar, defpackage.rsr rsrVar, defpackage.agtj agtjVar, defpackage.cop copVar) {
        if (agsmVar == null) {
            defpackage.aooh.i("androidFutures");
        }
        if (mauVar == null) {
            defpackage.aooh.i("conversationHistoryActionProvider");
        }
        if (agtjVar == null) {
            defpackage.aooh.i("futuresMixin");
        }
        if (copVar == null) {
            defpackage.aooh.i("audioPlayback");
        }
        this.a = kbiVar;
        this.b = aoinVar;
        this.h = aaisVar;
        this.c = agsmVar;
        this.d = mauVar;
        this.i = rsrVar;
        this.e = agtjVar;
        this.g = copVar;
        this.f = new defpackage.kbj(this);
    }

    public static final androidx.coordinatorlayout.widget.CoordinatorLayout a(defpackage.kbi kbiVar) {
        android.view.View viewFindViewById = kbiVar.H().findViewById(2131428497);
        defpackage.aooh.d(viewFindViewById, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        return (androidx.coordinatorlayout.widget.CoordinatorLayout) viewFindViewById;
    }
}
