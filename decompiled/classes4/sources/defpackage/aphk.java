package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aphk {
    private static final java.util.List a;
    private static defpackage.aphi b;
    private static android.content.ComponentName c;

    static {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        a = linkedList;
        linkedList.add(defpackage.aphl.class);
        linkedList.add(defpackage.aphm.class);
        linkedList.add(defpackage.aphp.class);
        linkedList.add(defpackage.aphq.class);
        linkedList.add(defpackage.aphu.class);
        linkedList.add(defpackage.aphx.class);
        linkedList.add(defpackage.aphn.class);
        linkedList.add(defpackage.apho.class);
        linkedList.add(defpackage.aphr.class);
        linkedList.add(defpackage.aphs.class);
        linkedList.add(defpackage.aphz.class);
        linkedList.add(defpackage.aphw.class);
        linkedList.add(defpackage.aphy.class);
        linkedList.add(defpackage.aphv.class);
    }

    public static boolean a(android.content.Context context, int i) {
        defpackage.aphi aphiVar;
        try {
            if (b == null) {
                android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    c = launchIntentForPackage.getComponent();
                    android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    android.content.pm.ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                    if (resolveInfoResolveActivity != null && !resolveInfoResolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
                        java.lang.String str = resolveInfoResolveActivity.activityInfo.packageName;
                        java.util.Iterator it = a.iterator();
                        while (it.hasNext()) {
                            try {
                                aphiVar = (defpackage.aphi) ((java.lang.Class) it.next()).newInstance();
                            } catch (java.lang.Exception unused) {
                                aphiVar = null;
                            }
                            if (aphiVar != null && aphiVar.a().contains(str)) {
                                b = aphiVar;
                                break;
                            }
                        }
                        if (b == null) {
                            if (android.os.Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                                b = new defpackage.aphx();
                            } else if (android.os.Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
                                b = new defpackage.aphz();
                            } else if (android.os.Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                                b = new defpackage.aphr();
                            } else if (android.os.Build.MANUFACTURER.equalsIgnoreCase("VIVO") || android.os.Build.MANUFACTURER.equalsIgnoreCase("JOVI")) {
                                b = new defpackage.aphw();
                            } else if (android.os.Build.MANUFACTURER.equalsIgnoreCase("ZTE") || android.os.Build.MANUFACTURER.equalsIgnoreCase("NUBIA")) {
                                b = new defpackage.aphy();
                            } else {
                                b = (android.os.Build.MANUFACTURER.equalsIgnoreCase("TECNO") || android.os.Build.MANUFACTURER.equalsIgnoreCase("INFINIX") || android.os.Build.MANUFACTURER.equalsIgnoreCase("ITEL") || android.os.Build.MANUFACTURER.equalsIgnoreCase("TECNO MOBILE")) ? new defpackage.aphv() : new defpackage.aphl(1);
                            }
                        }
                    }
                } else {
                    android.util.Log.e("ShortcutBadger", "Unable to find launch intent for package ".concat(java.lang.String.valueOf(context.getPackageName())));
                }
                throw new defpackage.aphj("No default launcher available");
            }
            try {
                b.b(context, c, i);
                return true;
            } catch (java.lang.Exception e) {
                throw new defpackage.aphj(e);
            }
        } catch (defpackage.aphj e2) {
            if (android.util.Log.isLoggable("ShortcutBadger", 3)) {
                android.util.Log.d("ShortcutBadger", "Unable to execute badge", e2);
            }
            return false;
        }
    }
}
