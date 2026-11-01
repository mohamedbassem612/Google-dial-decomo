package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyy extends ahao {
    private static final void d(android.widget.TextView textView, boolean z) {
        float fD = defpackage.hhb.d(textView);
        if (z) {
            fD = 0.0f;
        } else if (!mni.be()) {
            fD = -fD;
        }
        android.view.ViewPropertyAnimator viewPropertyAnimatorWithEndAction = textView.animate().translationX(fD).setDuration(500L).withEndAction(new defpackage.ioi(textView, 5));
        aooh.e(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
        textView.setTag(2131427565, viewPropertyAnimatorWithEndAction);
        viewPropertyAnimatorWithEndAction.start();
    }

    public final android.view.View a(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624029, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) throws aois {
        defpackage.iec iecVar;
        defpackage.jab jabVar = (defpackage.jab) obj;
        aooh.f(view, "view");
        aooh.f(jabVar, "data");
        android.view.View viewFindViewById = view.findViewById(2131427564);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(2131427560);
        aooh.e(viewFindViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(2131427551);
        aooh.e(viewFindViewById3, "findViewById(...)");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(2131427563);
        java.lang.Object tag = textView.getTag(2131427566);
        byte[] bArr = null;
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        boolean z = (str == null || aooh.n(jabVar.a, str)) ? false : true;
        java.lang.String str2 = jabVar.a;
        textView.setTag(2131427566, str2);
        if (z) {
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(250L).withEndAction(new defpackage.gra(textView, jabVar, 20, bArr)).start();
        } else {
            textView.animate().cancel();
            textView.setText(str2);
            textView.setAlpha(1.0f);
        }
        java.lang.Object tag2 = imageView.getTag(2131427561);
        android.view.ViewPropertyAnimator viewPropertyAnimator = tag2 instanceof android.view.ViewPropertyAnimator ? (android.view.ViewPropertyAnimator) tag2 : null;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        imageView.clearAnimation();
        java.lang.Object tag3 = textView.getTag(2131427565);
        android.view.ViewPropertyAnimator viewPropertyAnimator2 = tag3 instanceof android.view.ViewPropertyAnimator ? (android.view.ViewPropertyAnimator) tag3 : null;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        textView.clearAnimation();
        java.lang.Object tag4 = imageView.getTag(2131427562);
        java.lang.Boolean bool = tag4 instanceof java.lang.Boolean ? (java.lang.Boolean) tag4 : null;
        boolean z2 = jabVar.d;
        imageView.setTag(2131427562, java.lang.Boolean.valueOf(z2));
        if (z2) {
            if (aooh.n(bool, java.lang.Boolean.FALSE)) {
                imageView.setScaleX(0.0f);
                imageView.setScaleY(0.0f);
                imageView.setVisibility(0);
                android.view.ViewPropertyAnimator viewPropertyAnimatorWithEndAction = imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(500L).withEndAction(new defpackage.ioi(imageView, 6));
                aooh.e(viewPropertyAnimatorWithEndAction, "withEndAction(...)");
                imageView.setTag(2131427561, viewPropertyAnimatorWithEndAction);
                viewPropertyAnimatorWithEndAction.start();
                d(textView, true);
            } else {
                imageView.setVisibility(0);
            }
        } else if (aooh.n(bool, java.lang.Boolean.TRUE)) {
            android.view.ViewPropertyAnimator viewPropertyAnimatorWithEndAction2 = imageView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(500L).withEndAction(new defpackage.ioi(imageView, 7));
            aooh.e(viewPropertyAnimatorWithEndAction2, "withEndAction(...)");
            imageView.setTag(2131427561, viewPropertyAnimatorWithEndAction2);
            viewPropertyAnimatorWithEndAction2.start();
            d(textView, false);
        } else {
            imageView.setVisibility(4);
            float fD = defpackage.hhb.d(view);
            if (!mni.be()) {
                fD = -fD;
            }
            textView.setTranslationX(fD);
        }
        defpackage.ixc ixcVar = jabVar.e;
        imageButton.setEnabled((ixcVar == defpackage.ixc.a && z2) ? false : true);
        aooh.c(imageButton);
        imageButton.setOnClickListener(new defpackage.gr(jabVar, 9, null));
        defpackage.heq heqVarL = defpackage.hhb.l(defpackage.iek.a.m());
        java.lang.String str3 = jabVar.b;
        long j = aorh.a;
        long jG = aorh.g(aooh.B(jabVar.c, aorj.d));
        int iOrdinal = ixcVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            iecVar = defpackage.iec.BEESLY_CUSTOM_GREETING;
        } else {
            if (iOrdinal != 2) {
                throw new aois();
            }
            iecVar = defpackage.iec.UNKNOWN;
        }
        defpackage.heq heqVarT = defpackage.hgz.t(defpackage.ied.a.m());
        heqVarT.H(str3);
        heqVarT.F(jG);
        heqVarT.E(iecVar);
        heqVarL.z(heqVarT.D());
        defpackage.hgz.c(viewFindViewById3, heqVarL.y());
    }

    public final void f(android.view.View view) {
        aooh.f(view, "view");
        android.view.View viewFindViewById = view.findViewById(2131427551);
        aooh.e(viewFindViewById, "findViewById(...)");
        defpackage.hgz.f(viewFindViewById);
    }
}
