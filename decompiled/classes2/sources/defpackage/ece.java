package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ece {
    public static float a(android.widget.EdgeEffect edgeEffect) {
        try {
            return ac$.ExternalSyntheticApiModelOutline0.m(edgeEffect);
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        try {
            return ac$.ExternalSyntheticApiModelOutline0.m(edgeEffect, f, f2);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static android.widget.EdgeEffect c(android.content.Context context, android.util.AttributeSet attributeSet) {
        try {
            return new android.widget.EdgeEffect(context, attributeSet);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public static java.lang.String d(egm egmVar) {
        return anty.G(egmVar.j());
    }
}
