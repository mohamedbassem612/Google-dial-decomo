package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wee extends android.widget.FrameLayout {
    public defpackage.wdv a;
    public defpackage.aprf b;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        defpackage.wdv wdvVar = this.a;
        if (wdvVar != null) {
            wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl$PrimaryViewHolder", "<init>", 1096, "BubbleImpl.java").v("OnConfigurationChangedListener");
            wdx wdxVar = wdvVar.b;
            int i = wdxVar.y;
            if (i == 3 || i == 4) {
                wdxVar.b(0, false);
            }
            defpackage.wdw wdwVar = wdvVar.a;
            defpackage.web webVar = wdwVar.a;
            int i2 = webVar.g - webVar.e;
            wdwVar.a = new defpackage.web(wdwVar.b, wdxVar);
            defpackage.web webVar2 = wdwVar.a;
            webVar2.b();
            ejz ejzVar = webVar2.k;
            wdx wdxVar2 = webVar2.c;
            ejzVar.j(defpackage.web.c(wdxVar2.i) ? webVar2.f : webVar2.d);
            if (i2 != 0) {
                int dimensionPixelOffset = webVar2.a.getResources().getDimensionPixelOffset(2131165385);
                wdxVar2.i.y = (int) (((((double) (wdxVar2.i.y - dimensionPixelOffset)) / ((double) i2)) * ((double) (webVar2.g - webVar2.e))) + ((double) dimensionPixelOffset));
            }
            webVar2.l.j(webVar2.m.a(wdxVar2.i));
            wdxVar.l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.b == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            return ((defpackage.wdu) this.b.a).b();
        }
        return true;
    }
}
