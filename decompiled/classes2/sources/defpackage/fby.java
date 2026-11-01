package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fby {
    public static final aihd a;

    static {
        a = android.os.Build.VERSION.SDK_INT < 32 ? aihd.t(12, 252, 6396, 4) : aihd.v(12, 252, 6396, 4, 3145980, 82172, new java.lang.Integer[]{737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172});
    }

    public static int a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            int iIntValue = num.intValue();
            if (a.contains(num)) {
                return iIntValue;
            }
        }
        return 0;
    }
}
