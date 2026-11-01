package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymp implements defpackage.yng {
    private final dsd a;

    public ymp(defpackage.ymr ymrVar, dsd dsdVar) {
        j$.util.Objects.requireNonNull(ymrVar);
        this.a = dsdVar;
    }

    @Override // defpackage.yng
    public final void a(int i) {
        this.a.d(new defpackage.ymi(2, i, "Inference failed.", null));
    }

    @Override // defpackage.yng
    public final void b(int i, com.google.android.apps.aicore.aidl.AiCoreException aiCoreException) {
        dsd dsdVar = this.a;
        if (aiCoreException != null) {
            dsdVar.d(new defpackage.ymi(aiCoreException.a, aiCoreException.b, aiCoreException.getMessage(), null));
        } else {
            dsdVar.d(new defpackage.ymi(2, i, "Inference failed.", null));
        }
    }

    @Override // defpackage.yng
    public final void c(java.lang.Object obj) {
        this.a.b(obj);
    }
}
