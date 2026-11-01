package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggu implements android.view.ViewTreeObserver.OnPreDrawListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.lang.Object b;

    public aggu(com.google.android.setupdesign.GlifLayout glifLayout, android.widget.ScrollView scrollView, int i, byte[] bArr) {
        this.$cid = i;
        this.a = scrollView;
        j$.util.Objects.requireNonNull(glifLayout);
        this.b = glifLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.$cid;
        if (i == 0) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) this.a;
            if (scrollView.getViewTreeObserver().isAlive()) {
                scrollView.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            ((com.google.android.setupdesign.GlifLayout) this.b).r();
            return true;
        }
        android.view.View view = this.a;
        if (i == 1) {
            android.widget.ScrollView scrollView2 = (android.widget.ScrollView) view;
            if (scrollView2.getViewTreeObserver().isAlive()) {
                scrollView2.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            ((com.google.android.setupdesign.GlifLayout) this.b).r();
            return true;
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        defpackage.aghz aghzVar = (defpackage.aghz) this.b;
        if (textView.getLineCount() <= aghzVar.e) {
            return true;
        }
        textView.setTextSize(0, aghzVar.c);
        ft$.ExternalSyntheticApiModelOutline0.m(textView, java.lang.Math.round(aghzVar.d + aghzVar.c));
        textView.invalidate();
        return false;
    }

    public aggu(com.google.android.setupdesign.GlifLayout glifLayout, android.widget.ScrollView scrollView, int i) {
        this.$cid = i;
        this.a = scrollView;
        j$.util.Objects.requireNonNull(glifLayout);
        this.b = glifLayout;
    }

    public aggu(defpackage.aghz aghzVar, android.widget.TextView textView, int i) {
        this.$cid = i;
        this.a = textView;
        j$.util.Objects.requireNonNull(aghzVar);
        this.b = aghzVar;
    }
}
