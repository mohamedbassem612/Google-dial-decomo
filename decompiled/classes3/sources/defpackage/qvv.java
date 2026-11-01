package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qvv implements zog {
    private final defpackage.qvx a;

    public qvv(defpackage.qvx qvxVar) {
        this.a = qvxVar;
    }

    public final int a() {
        return -20;
    }

    public final void b(android.telecom.Call.Details details) {
        defpackage.qvx qvxVar = this.a;
        j$.util.Optional optional = qvxVar.g;
        if (true == optional.isPresent()) {
            ((dsd) optional.get()).b((java.lang.Object) null);
        }
        qvxVar.g = j$.util.Optional.empty();
    }
}
