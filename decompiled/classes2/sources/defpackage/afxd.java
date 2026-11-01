package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afxd extends gkz {
    public static final /* synthetic */ int w = 0;

    public final android.animation.Animator a(android.view.ViewGroup viewGroup, defpackage.gli gliVar, defpackage.gli gliVar2) {
        if (gliVar == null || gliVar2 == null) {
            return null;
        }
        java.util.Map map = gliVar.a;
        if (map.get("NavigationRailLabelVisibility") == null) {
            return null;
        }
        java.util.Map map2 = gliVar2.a;
        if (map2.get("NavigationRailLabelVisibility") == null || ((java.lang.Integer) map.get("NavigationRailLabelVisibility")).intValue() != 8 || ((java.lang.Integer) map2.get("NavigationRailLabelVisibility")).intValue() != 0) {
            return null;
        }
        android.view.View view = gliVar2.b;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.mh(view, 17, null));
        return valueAnimatorOfFloat;
    }

    public final void b(defpackage.gli gliVar) {
        gliVar.a.put("NavigationRailLabelVisibility", java.lang.Integer.valueOf(gliVar.b.getVisibility()));
    }

    public final void c(defpackage.gli gliVar) {
        gliVar.a.put("NavigationRailLabelVisibility", java.lang.Integer.valueOf(gliVar.b.getVisibility()));
    }
}
