package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajxb {
    public static final /* synthetic */ int a = 0;
    private static final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger((int) android.os.SystemClock.elapsedRealtime());

    public static int a() {
        return b.incrementAndGet();
    }

    public static java.lang.Integer b(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Integer.valueOf(android.graphics.Color.parseColor(str));
            } catch (java.lang.IllegalArgumentException unused) {
                android.util.Log.w("FirebaseMessaging", a.bk(str, "Color is invalid: ", ". Notification will use default color."));
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return java.lang.Integer.valueOf(context.getColor(i));
            } catch (android.content.res.Resources.NotFoundException unused2) {
                android.util.Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }
}
