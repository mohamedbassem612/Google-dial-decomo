package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apqy {
    public static final /* synthetic */ int a = 0;

    static {
        java.lang.System.lineSeparator();
        java.lang.String str = apqz.c.d;
        java.lang.String str2 = apqz.b.d;
    }

    public static char[] a() {
        return new char[8192];
    }

    public static void b(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        j$.util.Objects.requireNonNull(inputStream, "inputStream");
        j$.util.Objects.requireNonNull(outputStream, "outputStream");
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }
}
