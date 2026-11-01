package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aavr extends aavn {
    private final aaec a;
    private final aavo b;
    private final defpackage.zyp c;

    public aavr(aavo aavoVar, aaec aaecVar, defpackage.zyp zypVar) {
        this.b = aavoVar;
        this.a = aaecVar;
        this.c = zypVar;
    }

    public final void b(com.google.android.gms.common.api.Status status) {
        boolean zC = status.c();
        aaec aaecVar = this.a;
        if (zC) {
            aaecVar.c(com.google.android.gms.common.api.Status.a);
        } else {
            aaecVar.c(status);
        }
    }

    public final void c(com.google.android.gms.common.api.Status status) {
        if (!status.c()) {
            this.a.c(status);
            return;
        }
        defpackage.zyp zypVar = this.c;
        if (zypVar == null) {
            this.a.c(com.google.android.gms.common.api.Status.a);
        } else {
            this.b.a(zypVar, this);
        }
    }
}
