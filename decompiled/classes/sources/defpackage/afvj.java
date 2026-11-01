package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afvj extends defpackage.gkz {
    private static final void f(gli gliVar) {
        android.view.View view = gliVar.b;
        if (view instanceof android.widget.TextView) {
            gliVar.a.put("android:textscale:scale", java.lang.Float.valueOf(((android.widget.TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.gkz
    public final android.animation.Animator a(android.view.ViewGroup viewGroup, gli gliVar, gli gliVar2) {
        if (gliVar != null && gliVar2 != null && (gliVar.b instanceof android.widget.TextView)) {
            android.view.View view = gliVar2.b;
            if (view instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) view;
                java.util.Map map = gliVar.a;
                java.util.Map map2 = gliVar2.a;
                float fFloatValue = map.get("android:textscale:scale") != null ? ((java.lang.Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
                float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((java.lang.Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
                if (fFloatValue != fFloatValue2) {
                    android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
                    valueAnimatorOfFloat.addUpdateListener(new afvi(this, textView, 0));
                    return valueAnimatorOfFloat;
                }
            }
        }
        return null;
    }

    @Override // defpackage.gkz
    public final void b(gli gliVar) {
        f(gliVar);
    }

    @Override // defpackage.gkz
    public final void c(gli gliVar) {
        f(gliVar);
    }
}
