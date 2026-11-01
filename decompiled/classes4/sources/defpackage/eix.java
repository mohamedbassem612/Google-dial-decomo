package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class eix extends defpackage.eiw {
    public static final java.lang.reflect.Method a = d();

    private static java.lang.reflect.Method d() {
        try {
            return java.lang.String.class.getMethod("encodedLength", java.nio.charset.Charset.class);
        } catch (java.lang.ReflectiveOperationException unused) {
            return null;
        }
    }

    public final int c(java.lang.String str) {
        try {
            return ((java.lang.Integer) a.invoke(str, java.nio.charset.StandardCharsets.UTF_8)).intValue();
        } catch (java.lang.ReflectiveOperationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
