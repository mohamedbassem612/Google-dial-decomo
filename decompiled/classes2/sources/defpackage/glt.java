package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class glt extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.glw a;

    public glt(defpackage.glw glwVar) {
        this.a = glwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Drawable, glw] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        ?? r3 = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(r3.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gls) arrayList.get(i)).b(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Drawable, glw] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        ?? r3 = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(r3.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.gls) arrayList.get(i)).c(r3);
        }
    }
}
