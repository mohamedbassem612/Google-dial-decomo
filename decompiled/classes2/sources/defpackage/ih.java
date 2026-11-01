package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ih {
    public static final add a = new add(30);
    public static android.graphics.Paint b;

    public static float a(float f) {
        if (f >= 1.0f) {
            return java.lang.Math.min(f, 1000.0f);
        }
        return 1.0f;
    }

    static void b(android.widget.TextView textView, java.lang.String str) {
        if (j$.util.Objects.equals(da$.ExternalSyntheticApiModelOutline1.m(textView), str)) {
            aa$.ExternalSyntheticApiModelOutline0.m(textView, "");
        }
        aa$.ExternalSyntheticApiModelOutline0.m(textView, str);
    }
}
