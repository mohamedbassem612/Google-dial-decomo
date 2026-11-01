package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[j$.time.format.d0.values().length];
        a = iArr;
        try {
            iArr[j$.time.format.d0.EXCEEDS_PAD.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[j$.time.format.d0.ALWAYS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[j$.time.format.d0.NORMAL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            a[j$.time.format.d0.NOT_NEGATIVE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
    }
}
