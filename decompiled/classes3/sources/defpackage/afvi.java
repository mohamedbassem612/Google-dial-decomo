package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afvi implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public afvi(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(bottomSheetBehavior);
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        switch (this.$cid) {
            case 0:
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                android.widget.TextView textView = (android.widget.TextView) this.a;
                textView.setScaleX(fFloatValue);
                textView.setScaleY(fFloatValue);
                break;
            case 1:
                float fFloatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                agaf agafVar = ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.a).e;
                if (agafVar != null) {
                    agafVar.S(fFloatValue2);
                }
                break;
            case 2:
                ((defpackage.agbv) this.a).j.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                float fFloatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                defpackage.agbu agbuVar = ((defpackage.agbv) this.a).j;
                agbuVar.setScaleX(fFloatValue3);
                agbuVar.setScaleY(fFloatValue3);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.agbv) this.a).j.setTranslationY(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.agbv) this.a).j.setTranslationY(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((com.google.android.material.tabs.TabLayout) this.a).scrollTo(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                ((com.google.android.material.textfield.TextInputLayout) this.a).q.p(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public afvi(afvj afvjVar, android.widget.TextView textView, int i) {
        this.$cid = i;
        this.a = textView;
        j$.util.Objects.requireNonNull(afvjVar);
    }

    public afvi(defpackage.agbv agbvVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public afvi(defpackage.agbv agbvVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public afvi(defpackage.agbv agbvVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public afvi(defpackage.agbv agbvVar, int i, short[] sArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public afvi(com.google.android.material.tabs.TabLayout tabLayout, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(tabLayout);
        this.a = tabLayout;
    }

    public afvi(com.google.android.material.textfield.TextInputLayout textInputLayout, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(textInputLayout);
        this.a = textInputLayout;
    }
}
