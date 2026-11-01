package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class abqy extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        boolean z;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.util.WeakHashMap weakHashMap = abrb.a;
        synchronized (weakHashMap) {
            java.lang.Boolean bool = (java.lang.Boolean) weakHashMap.remove(threadCurrentThread);
            z = true;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (!zBooleanValue) {
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        java.lang.ThreadLocal threadLocal = defpackage.abqz.a;
        if (!"Filter".equals(threadCurrentThread.getName()) && !"Feedback".equals(threadCurrentThread.getName())) {
            java.lang.String name = threadCurrentThread.getName();
            if (!j$.util.Objects.equals(name, "Instr: com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner") && (name == null || !name.startsWith("SimpleServer ConnectionThread "))) {
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
