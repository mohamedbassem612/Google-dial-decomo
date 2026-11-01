package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aq extends defpackage.av {
    final /* synthetic */ defpackage.aw a;

    public aq(defpackage.aw awVar) {
        this.a = awVar;
    }

    @Override // defpackage.av
    public final void a() {
        defpackage.aw awVar = this.a;
        awVar.ai.ad();
        defpackage.env.b(awVar);
        android.os.Bundle bundle = awVar.h;
        awVar.ai.ae(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
