package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class v extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
        return new j$.util.concurrent.ThreadLocalRandom(0);
    }
}
