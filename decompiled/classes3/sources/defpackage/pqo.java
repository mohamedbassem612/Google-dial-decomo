package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqo implements defpackage.zpn, zne {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/call/CallDirectionImpl");
    public final ajcq b;
    public dsd c;
    private final android.telecom.Call d;

    public pqo(android.telecom.Call call, ajcu ajcuVar, long j) {
        this.d = call;
        this.b = ahrv.g(dff.m(new hyd(this, 6))).j(j, java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).e(java.util.concurrent.TimeoutException.class, new defpackage.pqn(0), ajcuVar);
    }

    private final void c(defpackage.zmy zmyVar) {
        this.c.b(zmyVar);
    }

    @Override // defpackage.zpn
    public final void a() {
        android.telecom.Call call = this.d;
        int iM = da$.ExternalSyntheticApiModelOutline0.m(call.getDetails());
        if (iM == -1) {
            c(defpackage.zmy.c);
            return;
        }
        if (iM == 0) {
            c(defpackage.zmy.a);
        } else if (iM == 1) {
            c(defpackage.zmy.b);
        } else {
            a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/call/CallDirectionImpl", "onCallScopeCreated", 93, "CallDirectionImpl.java").w("unknown direction %d", da$.ExternalSyntheticApiModelOutline0.m(call.getDetails()));
            c(defpackage.zmy.c);
        }
    }

    public final void b(android.telecom.Call call, int i) {
        int iOrdinal = defpackage.zpo.a(i).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    c(defpackage.zmy.a);
                    return;
                } else if (iOrdinal != 7 && iOrdinal != 8) {
                    c(defpackage.zmy.c);
                    return;
                }
            }
            c(defpackage.zmy.b);
        }
    }
}
