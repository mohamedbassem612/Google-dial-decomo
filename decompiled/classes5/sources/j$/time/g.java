package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ void a(long j) {
        throw new java.lang.IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static /* synthetic */ void b(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static /* synthetic */ void c(java.lang.String str, int i) {
        throw new j$.time.DateTimeException(str + i);
    }

    public static /* synthetic */ void d(java.lang.String str, int i, java.lang.Object obj) {
        throw new j$.time.DateTimeException(str + i + obj);
    }

    public static /* synthetic */ void e(java.lang.String str, java.lang.Object[] objArr) {
        throw new java.lang.IllegalStateException(java.lang.String.format(str, objArr));
    }

    public static /* synthetic */ void f(java.lang.String str) {
        throw new j$.time.temporal.n(str);
    }

    public static /* synthetic */ void g(java.lang.String str, int i) {
        throw new java.lang.IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void h(java.lang.String str) {
        throw new j$.time.DateTimeException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(java.lang.String str, int i) {
        throw new java.lang.IllegalArgumentException(str + ((char) i));
    }
}
