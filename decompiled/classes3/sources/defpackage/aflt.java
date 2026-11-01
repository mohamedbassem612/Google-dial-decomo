package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aflt implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public aflt(defpackage.afqu afquVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afquVar);
        this.a = afquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agaf agafVarA;
        android.content.Context context;
        int iY = 0;
        switch (this.$cid) {
            case 0:
                defpackage.aflv aflvVar = (defpackage.aflv) this.a;
                aflvVar.j = true;
                aflvVar.u.finish();
                break;
            case 1:
                defpackage.aflh aflhVar = (defpackage.aflh) this.a;
                defpackage.aflg aflgVar = aflhVar.a;
                if (aflgVar != null) {
                    aflgVar.a(2);
                    aflhVar.a = null;
                }
                break;
            case 2:
                defpackage.afqu afquVar = (defpackage.afqu) this.a;
                afquVar.b = false;
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = afquVar.c;
                ecm ecmVar = bottomSheetBehavior.z;
                if (ecmVar != null && ecmVar.l()) {
                    afquVar.a(afquVar.a);
                } else if (bottomSheetBehavior.y == 2) {
                    bottomSheetBehavior.u(afquVar.a);
                }
                break;
            case 3:
                com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) this.a;
                if (materialButton.g && materialButton.i && (agafVarA = materialButton.b.a(false)) != null) {
                    iY = (int) (agafVarA.y() * 0.11f);
                }
                materialButton.h = iY;
                materialButton.u();
                materialButton.invalidate();
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((aogc) this.a).I(true);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.afxm) this.a).e();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.afxm afxmVar = (defpackage.afxm) this.a;
                ((defpackage.afyf) afxmVar.getCurrentDrawable()).l(false, false, true);
                if (afxmVar.getProgressDrawable() == null || !afxmVar.getProgressDrawable().isVisible()) {
                    if (afxmVar.getIndeterminateDrawable() == null || !afxmVar.getIndeterminateDrawable().isVisible()) {
                        afxmVar.setVisibility(4);
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((defpackage.afzu) this.a).h();
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                android.widget.EditText editText = ((com.google.android.material.search.SearchView) this.a).k;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                agab.H(editText).showSoftInput(editText, 1);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((com.google.android.material.search.SearchView) this.a).i();
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                android.widget.EditText editText2 = ((com.google.android.material.search.SearchView) this.a).k;
                if (editText2.requestFocus()) {
                    editText2.sendAccessibilityEvent(8);
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((android.view.View) this.a).requestFocus();
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.afpb afpbVar = new defpackage.afpb();
                defpackage.afzu afzuVar = (defpackage.afzu) this.a;
                afpbVar.a(afzuVar.f(true));
                java.util.Iterator it = afzuVar.i(true).iterator();
                while (it.hasNext()) {
                    afpbVar.b((ejz) it.next());
                }
                afpbVar.c(new defpackage.afzk(afzuVar, afpbVar, 1, null));
                afpbVar.e();
                afzuVar.m = afpbVar;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((com.google.android.material.search.SearchView) this.a).d();
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.afzu afzuVar2 = (defpackage.afzu) this.a;
                com.google.android.material.internal.ClippableRoundedCornerLayout clippableRoundedCornerLayout = afzuVar2.c;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                android.animation.AnimatorSet animatorSetG = afzuVar2.g(true);
                animatorSetG.addListener(new defpackage.afzl(afzuVar2, animatorSetG));
                animatorSetG.start();
                afzuVar2.n = animatorSetG;
                break;
            case 15:
                defpackage.agbj agbjVar = (defpackage.agbj) this.a;
                agbjVar.j = -1;
                agbjVar.invalidate();
                break;
            case 16:
                defpackage.agbv agbvVar = (defpackage.agbv) this.a;
                defpackage.agbu agbuVar = agbvVar.j;
                if (agbuVar != null && (context = agbvVar.i) != null) {
                    int iHeight = baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m((android.view.WindowManager) context.getSystemService("window"))).height();
                    int[] iArr = new int[2];
                    agbuVar.getLocationInWindow(iArr);
                    int height = iHeight - (iArr[1] + agbuVar.getHeight());
                    int translationY = (int) agbuVar.getTranslationY();
                    int i = agbvVar.q;
                    int i2 = height + translationY;
                    if (i2 < i) {
                        android.view.ViewGroup.LayoutParams layoutParams = agbuVar.getLayoutParams();
                        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                            android.util.Log.w(defpackage.agbv.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        } else {
                            agbvVar.r = agbvVar.q;
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += agbvVar.q - i2;
                            agbuVar.requestLayout();
                        }
                    } else {
                        agbvVar.r = i;
                    }
                    break;
                }
                break;
            case 17:
                ((defpackage.agbv) this.a).f(3);
                break;
            case 18:
                defpackage.agbv agbvVar2 = (defpackage.agbv) this.a;
                defpackage.agbu agbuVar2 = agbvVar2.j;
                if (agbuVar2 != null) {
                    if (agbuVar2.getParent() != null) {
                        agbuVar2.setVisibility(0);
                    }
                    if (agbuVar2.c != 1) {
                        int iB = agbvVar2.b();
                        agbuVar2.setTranslationY(iB);
                        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                        valueAnimator.setIntValues(iB, 0);
                        valueAnimator.setInterpolator(agbvVar2.f);
                        valueAnimator.setDuration(agbvVar2.e);
                        valueAnimator.addListener(new defpackage.agbm(agbvVar2));
                        valueAnimator.addUpdateListener(new defpackage.afvi(agbvVar2, 4, (char[]) null));
                        valueAnimator.start();
                    } else {
                        android.animation.ValueAnimator valueAnimatorC = agbvVar2.c(0.0f, 1.0f);
                        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(agbvVar2.g);
                        valueAnimatorOfFloat.addUpdateListener(new defpackage.afvi(agbvVar2, 3, (byte[]) null));
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.playTogether(valueAnimatorC, valueAnimatorOfFloat);
                        animatorSet.setDuration(agbvVar2.c);
                        animatorSet.addListener(new defpackage.agbr(agbvVar2));
                        animatorSet.start();
                    }
                }
                break;
            case 19:
                ((defpackage.agcs) this.a).f(true);
                break;
            default:
                defpackage.agdb agdbVar = (defpackage.agdb) this.a;
                boolean zIsPopupShowing = agdbVar.a.isPopupShowing();
                agdbVar.k(zIsPopupShowing);
                agdbVar.c = zIsPopupShowing;
                break;
        }
    }

    public /* synthetic */ aflt(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public aflt(defpackage.agbv agbvVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public aflt(defpackage.afxm afxmVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afxmVar);
        this.a = afxmVar;
    }

    public aflt(defpackage.agbv agbvVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public aflt(defpackage.afxm afxmVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afxmVar);
        this.a = afxmVar;
    }

    public aflt(defpackage.agbv agbvVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }
}
