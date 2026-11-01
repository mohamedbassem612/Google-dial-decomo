package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iys extends ahao {
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624339, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        aooh.f(view, "view");
        aooh.f((defpackage.izw) obj, "data");
        ((androidx.compose.ui.platform.ComposeView) view).a(new cja(-766423825, true, new defpackage.izk(this, 1)));
    }

    public final void c(cmw cmwVar, cav cavVar, int i) {
        int i2 = i | 6;
        boolean z = (i2 & 3) != 2;
        cav cavVarB = cavVar.b(-411522661);
        if (cavVarB.H(z, i2 & 1)) {
            cmwVar = cmw.c;
            gus.aG(false, false, cfo.j(725715580, new brg(cmwVar, 20), cavVarB), cavVarB, 384, 3);
        } else {
            cavVarB.s();
        }
        cmw cmwVar2 = cmwVar;
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(this, cmwVar2, i, 4, null);
        }
    }
}
