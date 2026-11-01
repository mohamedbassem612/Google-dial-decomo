package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t extends j$.util.o implements java.util.RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private java.lang.Object writeReplace() {
        return new j$.util.o(this.b);
    }

    @Override // j$.util.o, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new j$.util.t(this.b.subList(i, i2));
    }
}
