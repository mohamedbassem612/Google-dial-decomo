package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ieb {
    private static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    public static void a(java.io.OutputStream outputStream, defpackage.ids idsVar, int i) throws java.io.IOException {
        boolean z = idsVar.e > 2 || idsVar.d > 2;
        int i2 = true != z ? 16 : 40;
        d(outputStream, "RIFF");
        b(outputStream, i2 + 20 + i + (i % 2));
        d(outputStream, "WAVE");
        d(outputStream, "fmt ");
        b(outputStream, i2);
        c(outputStream, true != z ? 1 : -2);
        c(outputStream, idsVar.d);
        b(outputStream, idsVar.c);
        b(outputStream, idsVar.d * idsVar.c * idsVar.e);
        c(outputStream, idsVar.d * idsVar.e);
        c(outputStream, idsVar.e << 3);
        if (z) {
            c(outputStream, 22);
            c(outputStream, idsVar.e << 3);
            b(outputStream, 0);
            c(outputStream, 1);
            outputStream.write(a);
        }
        d(outputStream, "data");
        b(outputStream, i);
    }

    private static void b(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[4];
        java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(i);
        outputStream.write(bArr);
    }

    private static void c(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[2];
        java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN).putShort((short) i);
        outputStream.write(bArr);
    }

    private static void d(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        outputStream.write(str.getBytes());
    }
}
