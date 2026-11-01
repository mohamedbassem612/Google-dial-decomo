package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agbb extends defpackage.agax {
    public agbb(android.view.View view) {
        d(view);
    }

    private void d(android.view.View view) {
        view.setOutlineProvider(new defpackage.agba(this));
    }

    @Override // defpackage.agax
    public final void a(android.view.View view) {
        view.setClipToOutline(true);
        view.invalidateOutline();
    }

    @Override // defpackage.agax
    public final boolean c() {
        return false;
    }
}
