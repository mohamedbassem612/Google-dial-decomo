package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
@java.lang.Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static org.chromium.net.UploadDataProvider create(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return new defpackage.apuh(new apue(parcelFileDescriptor, 0));
    }

    public static org.chromium.net.UploadDataProvider create(java.io.File file) {
        return new defpackage.apuh(new apue(file, 1));
    }

    public static org.chromium.net.UploadDataProvider create(java.nio.ByteBuffer byteBuffer) {
        return new defpackage.apuf(byteBuffer.slice());
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr) {
        return defpackage.aoil.m(bArr, 0, bArr.length);
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr, int i, int i2) {
        return defpackage.aoil.m(bArr, i, i2);
    }
}
