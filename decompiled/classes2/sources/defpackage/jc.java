package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jc {
    public static final java.lang.reflect.Field a;

    static {
        java.lang.NoSuchFieldException e;
        java.lang.reflect.Field declaredField;
        try {
            declaredField = android.widget.AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            try {
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (java.lang.NoSuchFieldException e3) {
            e = e3;
            declaredField = null;
        }
        a = declaredField;
    }
}
