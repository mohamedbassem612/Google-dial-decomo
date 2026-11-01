package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfn {
    private static final xtq a = new xtq("PersistableBundles", (byte[]) null);

    public static android.os.Bundle a(android.os.PersistableBundle persistableBundle) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }

    public static android.os.PersistableBundle b(android.os.PersistableBundle persistableBundle, android.os.PersistableBundle persistableBundle2, android.os.PersistableBundle... persistableBundleArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList(persistableBundle, persistableBundle2));
        java.util.Collections.addAll(arrayList, persistableBundleArr);
        android.os.PersistableBundle persistableBundle3 = new android.os.PersistableBundle();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.os.PersistableBundle persistableBundle4 = (android.os.PersistableBundle) arrayList.get(i);
            for (java.lang.String str : persistableBundle4.keySet()) {
                afsq.s(!persistableBundle3.containsKey(str), java.lang.String.format("Found duplicate key [%s] while attempting to merge bundles.", str));
            }
            persistableBundle3.putAll(persistableBundle4);
        }
        return persistableBundle3;
    }

    public static boolean c(android.os.PersistableBundle persistableBundle, android.os.PersistableBundle persistableBundle2) {
        return persistableBundle == persistableBundle2 || e(persistableBundle).equals(e(persistableBundle2));
    }

    public static void d(android.os.PersistableBundle persistableBundle) {
        anty.aI(persistableBundle, "PersistableBundle cannot be null!");
        for (java.lang.String str : persistableBundle.keySet()) {
            java.lang.Object obj = persistableBundle.get(str);
            afsq.s(f(obj), java.lang.String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
        }
    }

    private static android.util.ArrayMap e(android.os.BaseBundle baseBundle) {
        if (baseBundle.isEmpty()) {
            return new android.util.ArrayMap(0);
        }
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(baseBundle.size());
        for (java.lang.String str : baseBundle.keySet()) {
            java.lang.Object obj = baseBundle.get(str);
            if (f(obj)) {
                arrayMap.put(str, baseBundle.get(str));
            } else {
                a.B(java.lang.String.format("Unknown/unsupported data type [%s] for key %s", obj, str));
            }
        }
        return arrayMap;
    }

    private static boolean f(java.lang.Object obj) {
        return (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.String) || (obj instanceof java.lang.Boolean);
    }
}
