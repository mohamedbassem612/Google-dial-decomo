package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fcn extends android.os.Handler {
    final /* synthetic */ defpackage.fcq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcn(defpackage.fcq fcqVar, android.os.Looper looper) {
        super(looper);
        j$.util.Objects.requireNonNull(fcqVar);
        this.a = fcqVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr != null) {
            for (defpackage.fcm fcmVar : this.a.b) {
                fcmVar.h();
                if (java.util.Arrays.equals(fcmVar.g, bArr)) {
                    if (message.what == 2 && fcmVar.f == 4) {
                        java.lang.String str = eum.a;
                        fcmVar.d(false);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
