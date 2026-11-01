package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class j extends j$.util.h implements java.util.RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private java.lang.Object writeReplace() {
        return new j$.util.h(this.c);
    }

    @Override // j$.util.h, java.util.List
    public final java.util.List subList(int i, int i2) {
        j$.util.j jVar;
        synchronized (this.b) {
            jVar = new j$.util.j(this.c.subList(i, i2), this.b);
        }
        return jVar;
    }
}
