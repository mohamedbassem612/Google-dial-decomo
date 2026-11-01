package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ja {
    public static java.lang.reflect.Method a;
    public static java.lang.reflect.Method b;
    public static java.lang.reflect.Method c;
    public static boolean d;

    static {
        try {
            java.lang.Class cls = java.lang.Float.TYPE;
            java.lang.reflect.Method declaredMethod = android.widget.AbsListView.class.getDeclaredMethod("positionSelector", java.lang.Integer.TYPE, android.view.View.class, java.lang.Boolean.TYPE, cls, cls);
            a = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Method declaredMethod2 = android.widget.AdapterView.class.getDeclaredMethod("setSelectedPositionInt", java.lang.Integer.TYPE);
            b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            java.lang.reflect.Method declaredMethod3 = android.widget.AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", java.lang.Integer.TYPE);
            c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (java.lang.NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
