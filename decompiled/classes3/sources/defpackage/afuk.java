package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afuk implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int a = 0;
    private final defpackage.afuj b;
    private final android.view.View[] c;

    public afuk(defpackage.afuj afujVar, android.view.View... viewArr) {
        this.b = afujVar;
        this.c = viewArr;
    }

    public static defpackage.afuk a(android.view.View... viewArr) {
        return new defpackage.afuk(new defpackage.afui(3), viewArr);
    }

    public static defpackage.afuk b(android.view.View... viewArr) {
        return new defpackage.afuk(new defpackage.afui(1), viewArr);
    }

    public static defpackage.afuk c(android.view.View... viewArr) {
        return new defpackage.afuk(new defpackage.afui(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = 0;
        while (true) {
            android.view.View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            this.b.a(valueAnimator, viewArr[i]);
            i++;
        }
    }
}
