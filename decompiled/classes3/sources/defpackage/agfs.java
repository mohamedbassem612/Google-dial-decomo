package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfs implements android.view.ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ com.google.android.setupcompat.internal.TemplateLayout a;

    public agfs(com.google.android.setupcompat.internal.TemplateLayout templateLayout) {
        j$.util.Objects.requireNonNull(templateLayout);
        this.a = templateLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.setupcompat.internal.TemplateLayout templateLayout = this.a;
        templateLayout.getViewTreeObserver().removeOnPreDrawListener(templateLayout.f);
        templateLayout.setXFraction(templateLayout.e);
        return true;
    }
}
