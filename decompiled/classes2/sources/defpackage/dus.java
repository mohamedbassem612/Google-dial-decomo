package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dus extends dvx {
    public static void a(android.app.Activity activity, java.lang.String[] strArr, int i) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = hashSet.size();
                java.lang.String[] strArr2 = size > 0 ? new java.lang.String[length - size] : strArr;
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(java.lang.Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                }
                if (activity instanceof az) {
                }
                activity.requestPermissions(strArr, i);
                return;
            }
            if (android.text.TextUtils.isEmpty(strArr[i2])) {
                throw new java.lang.IllegalArgumentException("Permission request for permissions " + java.util.Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (android.os.Build.VERSION.SDK_INT < 33 && android.text.TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(java.lang.Integer.valueOf(i2));
            }
            i2++;
        }
    }

    public static boolean b(android.app.Activity activity, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 33 && android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 32) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        if (android.os.Build.VERSION.SDK_INT != 31) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((java.lang.Boolean) android.content.pm.PackageManager.class.getMethod("shouldShowRequestPermissionRationale", java.lang.String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
