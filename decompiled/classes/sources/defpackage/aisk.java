package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aisk {
    public static final /* synthetic */ int a = 0;

    static {
        new defpackage.aisi();
    }

    public static long a(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        defpackage.ahvr.ci(inputStream);
        defpackage.ahvr.ci(outputStream);
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static byte[] b(java.io.InputStream inputStream) {
        defpackage.ahvr.ci(inputStream);
        return c(inputStream, new java.util.ArrayDeque(20), 0);
    }

    public static byte[] c(java.io.InputStream inputStream, java.util.Queue queue, int i) throws java.io.IOException {
        int i2;
        int iMin = java.lang.Math.min(8192, java.lang.Math.max(128, java.lang.Integer.highestOneBit(i) << 1));
        loop0: while (true) {
            i2 = 2147483639;
            if (i >= 2147483639) {
                if (inputStream.read() == -1) {
                    break;
                }
                throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
            }
            int iMin2 = java.lang.Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = inputStream.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    i2 = i;
                    break loop0;
                }
                i3 += i4;
                i += i4;
            }
            iMin = defpackage.aiql.T(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        return defpackage.a.g(queue, i2);
    }

    public static int d(java.io.InputStream inputStream, byte[] bArr, int i) throws java.io.IOException {
        defpackage.ahvr.ci(inputStream);
        int i2 = 0;
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("len (%s) cannot be negative", java.lang.Integer.valueOf(i)));
        }
        defpackage.ahvr.bX(0, i, bArr.length);
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }
}
