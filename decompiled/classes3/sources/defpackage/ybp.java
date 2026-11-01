package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybp {
    private static final defpackage.yfw a = new defpackage.yfv(new defpackage.ybo());

    public static boolean a(android.graphics.BitmapFactory.Options options) {
        if (android.os.Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == android.graphics.Bitmap.Config.HARDWARE) {
            return ((java.lang.Boolean) a.a()).booleanValue();
        }
        return false;
    }
}
