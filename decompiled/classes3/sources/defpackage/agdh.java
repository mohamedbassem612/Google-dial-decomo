package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agdh extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ android.widget.TextView b;
    final /* synthetic */ int c;
    final /* synthetic */ android.widget.TextView d;
    final /* synthetic */ defpackage.agdi e;

    public agdh(defpackage.agdi agdiVar, int i, android.widget.TextView textView, int i2, android.widget.TextView textView2) {
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
        j$.util.Objects.requireNonNull(agdiVar);
        this.e = agdiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.widget.TextView textView;
        defpackage.agdi agdiVar = this.e;
        agdiVar.d = this.a;
        agdiVar.c = null;
        android.widget.TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.c == 1 && (textView = agdiVar.h) != null) {
                textView.setText((java.lang.CharSequence) null);
            }
        }
        android.widget.TextView textView3 = this.d;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            textView3.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        android.widget.TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
