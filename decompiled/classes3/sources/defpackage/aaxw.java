package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxw extends defpackage.aaxt {
    private final defpackage.aawt a;
    private final defpackage.aaxg b;

    public aaxw(aaec aaecVar, defpackage.aaxg aaxgVar, defpackage.aawt aawtVar) {
        super(aaecVar);
        this.b = aaxgVar;
        this.a = aawtVar;
    }

    @Override // defpackage.aaxj
    public final void d(com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        defpackage.aawz aawzVar;
        android.os.ParcelFileDescriptor parcelFileDescriptor = getChannelOutputStreamResponse.b;
        if (parcelFileDescriptor != null) {
            aawzVar = new defpackage.aawz(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor), getChannelOutputStreamResponse.c, this.a);
            this.b.a(new defpackage.aawy(aawzVar, 0));
        } else {
            aawzVar = null;
        }
        i(new defpackage.aaww(new com.google.android.gms.common.api.Status(getChannelOutputStreamResponse.a, (java.lang.String) null, (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null), aawzVar, 0));
    }
}
