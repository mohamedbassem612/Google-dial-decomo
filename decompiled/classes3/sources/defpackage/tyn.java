package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tyn extends defpackage.anqa {
    final /* synthetic */ android.os.ParcelFileDescriptor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyn(anty antyVar, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        super(antyVar);
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.anqa
    public final void a(anqw anqwVar, anph anphVar) {
        aooh.f(anqwVar, "status");
        aooh.f(anphVar, "trailers");
        try {
            super.a(anqwVar, anphVar);
        } finally {
            defpackage.typ.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$startOnDeviceRecognition$<anonymous>$<anonymous>$interceptCall$<anonymous>$start$<anonymous>", "onClose", 223, "SodaOnDeviceGrpcSession.kt").v("Closing read PFD in gRPC onClose");
            try {
                this.a.close();
            } catch (java.io.IOException e) {
                defpackage.typ.a.d().k(e).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$startOnDeviceRecognition$<anonymous>$<anonymous>$interceptCall$<anonymous>$start$<anonymous>", "onClose", 230, "SodaOnDeviceGrpcSession.kt").v("unable to close read end of pipe in onClose");
            }
        }
    }
}
