package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaxv extends defpackage.aaxt {
    private final defpackage.aaxg a;

    public aaxv(aaec aaecVar, defpackage.aaxg aaxgVar) {
        super(aaecVar);
        this.a = aaxgVar;
    }

    @Override // defpackage.aaxj
    public final void c(com.google.android.gms.wearable.internal.GetChannelInputStreamResponse getChannelInputStreamResponse) {
        defpackage.aawx aawxVar;
        android.os.ParcelFileDescriptor parcelFileDescriptor = getChannelInputStreamResponse.b;
        if (parcelFileDescriptor != null) {
            aawxVar = new defpackage.aawx(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            this.a.a(new defpackage.aawy(aawxVar, 1));
        } else {
            aawxVar = null;
        }
        i(new defpackage.aaww(new com.google.android.gms.common.api.Status(getChannelInputStreamResponse.a, (java.lang.String) null, (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null), aawxVar, 1));
    }
}
