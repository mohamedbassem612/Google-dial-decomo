package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ktj extends aaoo {
    private static final aimz d = aimz.i("com/android/dialer/callqualityrating/impl/CallQualityRatingFeedbackDataStoreImpl");
    public java.lang.String a;
    private final j$.util.Optional e;
    private final java.util.List f;
    private final ojo g;

    public ktj(j$.util.Optional optional, ojo ojoVar) {
        super((short[]) null);
        this.e = optional;
        this.f = new java.util.ArrayList();
        this.g = ojoVar;
    }

    private final byte[] aF(java.lang.String str) {
        j$.util.Optional optional = this.e;
        optional.isPresent();
        try {
            android.net.Uri uri = android.net.Uri.parse("content://" + ((java.lang.String) optional.orElseThrow()) + java.io.File.separator + str);
            ojo ojoVar = this.g;
            aooh.f(uri, "uri");
            android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(ojoVar.a.getContentResolver().openFileDescriptor(uri, "r"));
            byte[] bArr = new byte[autoCloseInputStream.available()];
            autoCloseInputStream.read(bArr);
            return bArr;
        } catch (java.io.IOException e) {
            hgb.g(d.c(), "IOException when trying to get %s file logs", str, "com/android/dialer/callqualityrating/impl/CallQualityRatingFeedbackDataStoreImpl", "getCsApkLogFile", 'r', "CallQualityRatingFeedbackDataStoreImpl.java", e, zct.b);
            return new byte[0];
        }
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.google.android.gms.feedback.FileTeleporter(aF("persistent_logs"), "persistent_logs"));
        arrayList.add(new com.google.android.gms.feedback.FileTeleporter(aF("webrtc_logs" + java.io.File.separator + this.a), "webrtc_logs"));
        arrayList.add(new com.google.android.gms.feedback.FileTeleporter(aF("rtc_event_logs" + java.io.File.separator + this.a), "rtc_event_logs"));
        return arrayList;
    }

    public final java.util.List b() {
        return this.f;
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        this.f.add(new android.util.Pair(str, str2));
    }
}
