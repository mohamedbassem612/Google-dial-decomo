package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dzm {
    public static void a(android.view.View view, android.view.PointerIcon pointerIcon) {
        aa$.ExternalSyntheticApiModelOutline1.m(view, pointerIcon);
    }

    public static boolean b(android.view.MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static void c(android.view.View view, float f) {
        try {
            mp$.ExternalSyntheticApiModelOutline1.m$1(view, f);
        } catch (java.lang.LinkageError unused) {
        }
    }

    public static float d(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return defpackage.ece.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float e(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return defpackage.ece.b(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static android.widget.EdgeEffect f(android.content.Context context, android.util.AttributeSet attributeSet) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.ece.c(context, attributeSet) : new android.widget.EdgeEffect(context);
    }
}
