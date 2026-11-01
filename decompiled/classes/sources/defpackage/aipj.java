package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aipj {
    public static final defpackage.aipl a = a(defpackage.aipl.d);

    private static defpackage.aipl a(java.lang.String[] strArr) {
        defpackage.aipu aipuVar;
        try {
            aipuVar = aipv.a;
        } catch (java.lang.NoClassDefFoundError unused) {
            aipuVar = null;
        }
        if (aipuVar != null) {
            return aipuVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            try {
                return (defpackage.aipl) java.lang.Class.forName(str).getConstructor(null).newInstance(null);
            } catch (java.lang.Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof java.lang.reflect.InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new java.lang.IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
