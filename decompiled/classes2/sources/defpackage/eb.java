package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eb extends defpackage.eaa {
    final /* synthetic */ defpackage.ee a;

    public eb(defpackage.ee eeVar) {
        this.a = eeVar;
    }

    @Override // defpackage.eaa, defpackage.dzz
    public final void a() {
        android.view.View view;
        defpackage.ee eeVar = this.a;
        if (eeVar.j && (view = eeVar.e) != null) {
            view.setTranslationY(0.0f);
            eeVar.c.setTranslationY(0.0f);
        }
        eeVar.c.setVisibility(8);
        eeVar.c.a(false);
        eeVar.l = null;
        defpackage.ex exVar = eeVar.h;
        if (exVar != null) {
            exVar.a(eeVar.g);
            eeVar.g = null;
            eeVar.h = null;
        }
        android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = eeVar.b;
        if (actionBarOverlayLayout != null) {
            int i = dzs.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
