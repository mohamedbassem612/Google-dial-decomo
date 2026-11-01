package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yko {
    public static final /* synthetic */ int a = 0;
    private static final aoir b = aooc.ah(3, new uoq(5));

    public static final long a(android.graphics.drawable.Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        return (((long) java.lang.Float.floatToRawIntBits(drawable.getIntrinsicWidth())) << 32) | (((long) java.lang.Float.floatToRawIntBits(drawable.getIntrinsicHeight())) & 4294967295L);
    }

    public static final android.os.Handler b() {
        return (android.os.Handler) b.a();
    }
}
