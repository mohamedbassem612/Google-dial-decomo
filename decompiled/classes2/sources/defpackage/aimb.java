package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aimb implements defpackage.aimm {
    final /* synthetic */ defpackage.aizg a;
    final /* synthetic */ defpackage.aimc b;

    public aimb(defpackage.aimc aimcVar, defpackage.aizg aizgVar) {
        this.a = aizgVar;
        j$.util.Objects.requireNonNull(aimcVar);
        this.b = aimcVar;
    }

    @Override // defpackage.aimm
    public final void a(java.lang.Object obj) {
        int iB = this.b.a.b(obj);
        if (iB == 0) {
            iB = 0;
        }
        this.a.b(iB);
    }
}
