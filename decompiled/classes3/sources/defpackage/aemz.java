package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aemz implements defpackage.aadm {
    public final /* synthetic */ ajdd a;
    public final /* synthetic */ java.util.concurrent.Executor b;
    public final /* synthetic */ ahyc c;

    public /* synthetic */ aemz(ajdd ajddVar, java.util.concurrent.Executor executor, ahyc ahycVar) {
        this.a = ajddVar;
        this.b = executor;
        this.c = ahycVar;
    }

    @Override // defpackage.aadm
    public final void a(final aadl aadlVar) {
        com.google.android.gms.common.api.Status statusB = aadlVar.b();
        if (statusB.f == 14) {
            throw new java.lang.AssertionError("We never use the blocking API for these calls: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aadlVar))));
        }
        final ajdd ajddVar = this.a;
        if (statusB.c()) {
            final ahyc ahycVar = this.c;
            this.b.execute(new java.lang.Runnable() { // from class: aemy
                @Override // java.lang.Runnable
                public final void run() {
                    ahyc ahycVar2 = ahycVar;
                    ajdd ajddVar2 = ajddVar;
                    aadl aadlVar2 = aadlVar;
                    try {
                        try {
                            ajddVar2.o(ahycVar2.apply(aadlVar2));
                        } catch (java.lang.RuntimeException e) {
                            ajddVar2.p(e);
                        }
                    } finally {
                        aesg.d(aadlVar2);
                    }
                }
            });
        } else {
            ajddVar.p(new defpackage.aemu(aadlVar, statusB));
            aesg.d(aadlVar);
        }
    }
}
