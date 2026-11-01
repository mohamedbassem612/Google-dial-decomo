package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqb implements defpackage.gqa {
    public final defpackage.gqo b;

    public gqb(defpackage.gqo gqoVar, defpackage.gqj gqjVar) {
        aooh.f(gqoVar, "windowBackend");
        aooh.f(gqjVar, "engagementModeBackend");
        this.b = gqoVar;
        new java.util.concurrent.locks.ReentrantLock();
        new java.util.LinkedHashMap();
    }

    @Override // defpackage.gqa
    public final aoxh a(android.content.Context context) {
        aooh.f(context, "context");
        aoxa aoxaVar = new aoxa(new defpackage.blj(this, context, (aoln) null, 5));
        aosp aospVar = aoth.a;
        return aoov.aC(aoxaVar, apcg.a);
    }
}
