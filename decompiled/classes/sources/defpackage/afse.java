package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afse implements defpackage.afsf {
    private java.lang.Long a;

    @Override // defpackage.afsf
    public final boolean a() {
        java.lang.Long l = this.a;
        if (l == null) {
            try {
                java.lang.reflect.Method declaredMethod = android.os.Build.class.getDeclaredMethod("getLong", java.lang.String.class);
                declaredMethod.setAccessible(true);
                l = (java.lang.Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.a = l;
            } catch (java.lang.Exception unused) {
                l = -1L;
                this.a = l;
            }
        }
        return l.longValue() >= 40100;
    }
}
