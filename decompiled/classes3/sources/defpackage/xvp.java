package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvp implements defpackage.xvd {
    private final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder a;

    public xvp(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public static boolean d() {
        return !"robolectric".equals(android.os.Build.FINGERPRINT);
    }

    @Override // defpackage.xvd
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final android.os.ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.xvd
    public final void b() {
    }
}
