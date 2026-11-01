package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dvx {
    public static int c(android.content.Context context, java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("permission must be non-null");
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
        }
        return new defpackage.dvr(context).a() ? 0 : -1;
    }

    public static android.content.res.ColorStateList d(android.content.Context context, int i) {
        return defpackage.dwk.a(context.getResources(), i, context.getTheme());
    }

    public static java.lang.String e(android.content.Context context, int i) {
        defpackage.dxe dxeVarC;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.lang.Object systemService = context.getSystemService("locale");
            dxeVarC = systemService != null ? defpackage.dxe.d(ae$.ExternalSyntheticApiModelOutline0.m(ae$.ExternalSyntheticApiModelOutline0.m(systemService))) : defpackage.dxe.a;
        } else {
            dxeVarC = defpackage.dxe.c(dut.a(context));
        }
        if (android.os.Build.VERSION.SDK_INT <= 32 && !dxeVarC.g()) {
            android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
            aa$.ExternalSyntheticApiModelOutline1.m(configuration, dxeVarC.b.a);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i);
    }

    public static void f(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, int i) {
        int i2;
        if ((i & 1) == 0) {
            i2 = i;
        } else {
            if ((i & 4) != 0) {
                throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            }
            i2 = i | 2;
        }
        int i3 = i2 & 4;
        if ((i2 & 2) == 0) {
            if (i3 == 0) {
                throw new java.lang.IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
        } else if (i3 != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            da$.ExternalSyntheticApiModelOutline1.m(context, broadcastReceiver, intentFilter, str, (android.os.Handler) null, i2);
            return;
        }
        if (i3 == 0 || str != null) {
            da$.ExternalSyntheticApiModelOutline1.m(context, broadcastReceiver, intentFilter, str, (android.os.Handler) null, i2 & 1);
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(context.getApplicationContext().getPackageName());
        int iMyPid = android.os.Process.myPid();
        int iMyUid = android.os.Process.myUid();
        java.lang.String packageName = context.getPackageName();
        java.lang.String strConcat = strValueOf.concat(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        if (defpackage.dff.i(context, strConcat, iMyPid, iMyUid, packageName) != 0) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(fn$.ExternalSyntheticApiModelOutline0.m(context));
            int iMyPid2 = android.os.Process.myPid();
            int iMyUid2 = android.os.Process.myUid();
            java.lang.String packageName2 = context.getPackageName();
            strConcat = strValueOf2.concat(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
            if (defpackage.dff.i(context, strConcat, iMyPid2, iMyUid2, packageName2) != 0) {
                throw new java.lang.RuntimeException(defpackage.a.bk(strConcat, "Permission ", " is required by your application to receive broadcasts, please add it to your manifest"));
            }
        }
        context.registerReceiver(broadcastReceiver, intentFilter, strConcat, null);
    }
}
