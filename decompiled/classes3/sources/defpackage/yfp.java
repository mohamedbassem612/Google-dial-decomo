package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yfp {
    public static final /* synthetic */ int a = 0;
    private static final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference();

    public static java.nio.ByteBuffer a(java.io.InputStream inputStream, boolean z) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) b.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (java.lang.Throwable th) {
                b.set(bArr);
                throw th;
            }
        }
        b.set(bArr);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return z ? java.nio.ByteBuffer.wrap(byteArray) : b(java.nio.ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
    }

    public static java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer) {
        return (java.nio.ByteBuffer) byteBuffer.position(0);
    }

    public static void c(java.nio.ByteBuffer byteBuffer, java.io.File file) throws java.lang.Throwable {
        java.io.RandomAccessFile randomAccessFile;
        b(byteBuffer);
        java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            try {
                fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBuffer);
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.force(false);
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                randomAccessFile.close();
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException unused2) {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (java.io.IOException unused4) {
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static byte[] d(java.nio.ByteBuffer byteBuffer) {
        aogw aogwVar = null;
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            aogwVar = new aogw(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        if (aogwVar != null && aogwVar.b == 0 && aogwVar.a == ((byte[]) aogwVar.c).length) {
            return byteBuffer.array();
        }
        java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        b(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }
}
