package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tyo extends anne {
    final /* synthetic */ android.os.ParcelFileDescriptor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyo(ajsz ajszVar, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        super(ajszVar);
        this.a = parcelFileDescriptor;
    }

    public final void a(anty antyVar, anph anphVar) {
        aooh.f(antyVar, "responseListener");
        aooh.f(anphVar, "headers");
        super.a(new defpackage.tyn(antyVar, this.a), anphVar);
    }
}
