package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afap {
    public static final android.content.ClipData a = android.content.ClipData.newIntent("", new android.content.Intent());

    public static android.content.Intent a(android.content.Intent intent, int i) {
        ahvr.bN((i & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        ahvr.bN((i & 1) == 0 || d(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        ahvr.bN((i & 2) == 0 || d(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        ahvr.bN((i & 4) == 0 || d(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        ahvr.bN((i & 128) == 0 || d(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        ahvr.bN(intent.getComponent() != null, "Must set component on Intent.");
        if (d(0, 1)) {
            ahvr.bN(!d(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            ahvr.bN(d(i, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        android.content.Intent intent2 = new android.content.Intent(intent);
        if (!d(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!d(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!d(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!d(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(android.net.Uri.EMPTY, "*/*");
            }
            if (!d(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    public static android.app.PendingIntent b(android.content.Context context, int i, android.content.Intent intent, int i2) {
        return android.app.PendingIntent.getActivity(context, i, a(intent, i2), i2);
    }

    public static android.app.PendingIntent c(android.content.Context context, int i, android.content.Intent intent, int i2) {
        return android.app.PendingIntent.getBroadcast(context, i, a(intent, i2), i2);
    }

    private static boolean d(int i, int i2) {
        return (i & i2) == i2;
    }
}
