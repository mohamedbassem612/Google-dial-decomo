package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aisp extends defpackage.aiql {
    private final java.io.File a;

    public aisp(java.io.File file) {
        file.getClass();
        this.a = file;
    }

    public final java.io.FileInputStream ap() {
        return new java.io.FileInputStream(this.a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    @Override // defpackage.aiql
    public final byte[] h() {
        defpackage.aism aismVar = new defpackage.aism();
        try {
            java.io.FileInputStream fileInputStreamAp = ap();
            aismVar.c(fileInputStreamAp);
            long size = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamAp.getChannel()).size();
            int i = defpackage.aisk.a;
            defpackage.ahvr.bQ(((size > 0L ? 1 : (size == 0L ? 0 : -1)) ^ (-1)) >>> 31, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new java.lang.OutOfMemoryError(size + " bytes is too large to fit in a byte array");
            }
            int i2 = (int) size;
            byte[] bArrC = new byte[i2];
            int i3 = i2;
            while (i3 > 0) {
                int i4 = i2 - i3;
                int i5 = fileInputStreamAp.read(bArrC, i4, i3);
                if (i5 == -1) {
                    bArrC = java.util.Arrays.copyOf(bArrC, i4);
                    aismVar.close();
                    return bArrC;
                }
                i3 -= i5;
            }
            int i6 = fileInputStreamAp.read();
            if (i6 != -1) {
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(22);
                arrayDeque.add(bArrC);
                arrayDeque.add(new byte[]{(byte) i6});
                bArrC = defpackage.aisk.c(fileInputStreamAp, arrayDeque, i2 + 1);
            }
            aismVar.close();
            return bArrC;
        } catch (java.lang.Throwable th) {
            try {
                throw aismVar.a(th);
            } catch (java.lang.Throwable th2) {
                aismVar.close();
                throw th2;
            }
        }
    }

    public final java.lang.String toString() {
        return "Files.asByteSource(" + this.a.toString() + ')';
    }
}
