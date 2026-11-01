package com.bumptech.glide.load.data;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ParcelFileDescriptorRewinder$InternalRewinder {
    private final android.os.ParcelFileDescriptor a;

    public ParcelFileDescriptorRewinder$InternalRewinder(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    public android.os.ParcelFileDescriptor rewind() throws java.io.IOException {
        try {
            android.system.Os.lseek(this.a.getFileDescriptor(), 0L, android.system.OsConstants.SEEK_SET);
            return this.a;
        } catch (android.system.ErrnoException e) {
            throw new java.io.IOException(e);
        }
    }
}
