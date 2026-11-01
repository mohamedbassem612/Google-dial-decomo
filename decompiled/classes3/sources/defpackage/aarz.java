package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aarz implements defpackage.aaqh {
    private final com.google.android.gms.common.api.Status a;
    private final android.os.ParcelFileDescriptor b;

    public aarz(com.google.android.gms.common.api.Status status, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    public final void a() {
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.a;
    }

    @Override // defpackage.aaqh
    public final android.os.ParcelFileDescriptor c() {
        return this.b;
    }
}
