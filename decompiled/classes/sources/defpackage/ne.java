package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ne implements defpackage.emv {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ne(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        int i = this.$cid;
        if (i == 0) {
            int iOrdinal = empVar.ordinal();
            if (iOrdinal == 1) {
                ((defpackage.mz) this.a).e(true);
                return;
            }
            if (iOrdinal == 4) {
                ((defpackage.mz) this.a).e(false);
                return;
            } else {
                if (iOrdinal == 5) {
                    ((defpackage.fya) this.a).f();
                    ((defpackage.ems) this.b).d(this);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (empVar == defpackage.emp.ON_CREATE) {
                java.lang.Object obj = this.a;
                java.lang.Object obj2 = this.b;
                android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = ((defpackage.mp) obj).getOnBackInvokedDispatcher();
                defpackage.aooh.e(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
                ((defpackage.nf) obj2).f(onBackInvokedDispatcher);
                return;
            }
            return;
        }
        java.lang.Object obj3 = this.b;
        java.lang.Object obj4 = this.a;
        int iOrdinal2 = empVar.ordinal();
        if (iOrdinal2 == 1) {
            ((defpackage.kca) obj3).b.a();
            return;
        }
        if (iOrdinal2 == 2) {
            ((defpackage.cek) obj4).h(android.os.SystemClock.elapsedRealtime());
        } else if (iOrdinal2 == 3) {
            ((defpackage.kca) obj3).c.a(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - ((defpackage.cek) obj4).c()));
        }
    }

    public ne(defpackage.mz mzVar, defpackage.ems emsVar, int i) {
        this.$cid = i;
        this.a = mzVar;
        this.b = emsVar;
    }
}
