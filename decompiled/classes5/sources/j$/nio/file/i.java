package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class i implements java.io.Closeable {
    public java.util.Set E() {
        return j$.com.android.tools.r8.a.G(new java.lang.Object[]{"basic"});
    }

    public java.lang.Iterable e() {
        throw new java.lang.UnsupportedOperationException("");
    }

    public abstract j$.nio.file.Path f(java.lang.String str, java.lang.String... strArr);

    public abstract j$.nio.file.PathMatcher i(java.lang.String str);

    public boolean isOpen() {
        return true;
    }

    public abstract java.lang.Iterable j();

    public java.lang.String m() {
        return "/";
    }

    public j$.com.android.tools.r8.a n() {
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean o() {
        return false;
    }

    public j$.nio.file.u0 q() {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract j$.nio.file.spi.c v();
}
