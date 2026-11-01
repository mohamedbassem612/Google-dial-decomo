package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rxg {
    private static final aimz f = aimz.i("com/android/dialer/oem/MotorolaHiddenMenuKeySequence");
    private static defpackage.rxg g = null;
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.List c = new java.util.ArrayList();
    public final java.util.List d = new java.util.ArrayList();
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    public rxg(android.content.Context context, defpackage.rxi rxiVar) {
        this.e = false;
        java.lang.String[] stringArray = context.getResources().getStringArray(2130903088);
        java.lang.String str = null;
        if (stringArray.length > 0) {
            java.lang.String strCo = ahvr.co((java.lang.String) ((rxh) agab.aH(context, rxh.class)).be().t().orElse((java.lang.Object) null));
            boolean z = false;
            for (java.lang.String str2 : stringArray) {
                z = z || ahvr.r(strCo, str2);
            }
            if (z) {
                if (context.getPackageManager().hasSystemFeature("com.motorola.software.sprint.hidden_menu") && context.getResources().getBoolean(2131034153)) {
                    java.util.Collections.addAll(this.a, context.getResources().getStringArray(2130903091));
                    java.util.Collections.addAll(this.b, context.getResources().getStringArray(2130903092));
                    java.util.Collections.addAll(this.c, context.getResources().getStringArray(2130903089));
                    java.util.Collections.addAll(this.d, context.getResources().getStringArray(2130903090));
                    this.e = true;
                }
            }
        } else if (context.getPackageManager().hasSystemFeature("com.motorola.software.sprint.hidden_menu")) {
            java.util.Collections.addAll(this.a, context.getResources().getStringArray(2130903091));
            java.util.Collections.addAll(this.b, context.getResources().getStringArray(2130903092));
            java.util.Collections.addAll(this.c, context.getResources().getStringArray(2130903089));
            java.util.Collections.addAll(this.d, context.getResources().getStringArray(2130903090));
            this.e = true;
        }
        java.lang.reflect.Method method = rxiVar.b;
        if (method == null) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
                if (cls != null) {
                    rxiVar.b = cls.getMethod("get", java.lang.String.class);
                    method = rxiVar.b;
                } else {
                    method = null;
                }
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e) {
                a.bq(defpackage.rxi.a.c(), "unable to access system class", "com/android/dialer/oem/SystemPropertiesAccessor", "getSystemPropertiesGetMethod", 'E', "SystemPropertiesAccessor.java", e, zct.b);
            }
        }
        if (method != null) {
            try {
                str = (java.lang.String) method.invoke(null, "ro.carrier");
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
                a.bq(defpackage.rxi.a.c(), "unable to invoke system method", "com/android/dialer/oem/SystemPropertiesAccessor", "get", '1', "SystemPropertiesAccessor.java", e2, zct.b);
            }
        }
        if ("tracfone".equals(str)) {
            c("#83865625#", "com.motorola.extensions.TFUnlock");
            c("#83782887#", "com.motorola.extensions.TFStatus");
            this.e = true;
        }
        if (this.a.size() == this.b.size() && this.c.size() == this.d.size() && (!this.a.isEmpty() || !this.c.isEmpty())) {
            return;
        }
        f.d().i(zct.b).l("com/android/dialer/oem/MotorolaHiddenMenuKeySequence", "<init>", 119, "MotorolaHiddenMenuKeySequence.java").N("the key sequence array is not matching, turn off feature.key sequence: %d != %d, key pattern %d != %d", java.lang.Integer.valueOf(this.a.size()), java.lang.Integer.valueOf(this.b.size()), java.lang.Integer.valueOf(this.c.size()), java.lang.Integer.valueOf(this.d.size()));
        this.e = false;
    }

    public static synchronized defpackage.rxg a(android.content.Context context) {
        defpackage.rxg rxgVar;
        rxgVar = g;
        if (rxgVar == null) {
            rxgVar = new defpackage.rxg(context, new defpackage.rxi());
            g = rxgVar;
        }
        return rxgVar;
    }

    public static boolean b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        boolean z = false;
        try {
            android.content.Intent intent = new android.content.Intent(str2);
            intent.addFlags(335544320);
            intent.putExtra("HiddenMenuCode", str);
            android.content.pm.ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null || !resolveInfoResolveActivity.activityInfo.enabled) {
                f.d().i(zct.b).l("com/android/dialer/oem/MotorolaHiddenMenuKeySequence", "sendIntent", 187, "MotorolaHiddenMenuKeySequence.java").v("not able to resolve the intent");
            } else {
                ahqx.l(context, intent);
                z = true;
            }
        } catch (android.content.ActivityNotFoundException e) {
            a.bq(f.c(), "handleHiddenMenu Key Pattern Exception", "com/android/dialer/oem/MotorolaHiddenMenuKeySequence", "sendIntent", (char) 194, "MotorolaHiddenMenuKeySequence.java", e, zct.b);
        }
        return z;
    }

    private final void c(java.lang.String str, java.lang.String str2) {
        this.a.add(str);
        this.b.add(str2);
    }
}
