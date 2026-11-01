package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dwb {
    public static final /* synthetic */ int a = 0;
    private static volatile java.util.List b;
    private static volatile defpackage.dve c;

    private dwb() {
    }

    public static java.util.List a(android.content.Context context) {
        android.os.Bundle bundle;
        java.lang.String string;
        if (b == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Intent intent = new android.content.Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                android.content.pm.ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((defpackage.dvl) java.lang.Class.forName(string, false, defpackage.dwb.class.getClassLoader()).getMethod("getInstance", android.content.Context.class).invoke(null, context));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static void b(android.content.Context context, java.lang.String str) {
        dzk.x(context);
        dzk.x(str);
        hq$.ExternalSyntheticApiModelOutline1.m(hq$.ExternalSyntheticApiModelOutline1.m(context.getSystemService(hq$.ExternalSyntheticApiModelOutline1.m())), str);
        java.util.Iterator it = a(context).iterator();
        if (it.hasNext()) {
            java.util.Collections.singletonList(str);
            throw null;
        }
    }

    public static void c(android.content.Context context) {
        if (c == null) {
            try {
                c = (defpackage.dve) java.lang.Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, defpackage.dwb.class.getClassLoader()).getMethod("getInstance", android.content.Context.class).invoke(null, context);
            } catch (java.lang.Exception unused) {
            }
            if (c == null) {
                c = new defpackage.dve();
            }
        }
        defpackage.dve dveVar = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        b(r7, (java.lang.String) r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        r7 = (defpackage.dvl) r0.next();
        java.util.Collections.singletonList(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r7, defpackage.aaj r8) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwb.d(android.content.Context, aaj):void");
    }
}
