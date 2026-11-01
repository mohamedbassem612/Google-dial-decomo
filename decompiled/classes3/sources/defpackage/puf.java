package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class puf implements defpackage.pug {
    private static final aimz b = aimz.i("com/android/dialer/incall/core/call/events/impl/DisconnectedEventState");
    public final android.telecom.Call a;
    private final defpackage.ptw c;
    private final defpackage.ptx d;
    private final aoin e;
    private final j$.util.Optional f;

    public puf(defpackage.ptw ptwVar, defpackage.ptx ptxVar, aoin aoinVar, android.telecom.Call call, j$.util.Optional optional) {
        this.c = ptwVar;
        this.d = ptxVar;
        this.e = aoinVar;
        this.a = call;
        this.f = optional;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        if (ptyVar.a == defpackage.zpo.g) {
            return j$.util.Optional.empty();
        }
        a.bI(b.c().m(aioa.b), "disconnected call is ALIVE", "com/android/dialer/incall/core/call/events/impl/DisconnectedEventState", "update", '2', "DisconnectedEventState.java", zct.b);
        return j$.util.Optional.of((defpackage.pug) this.e.a());
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "DISCONNECTED";
    }

    @Override // defpackage.pug
    public final void c() {
        defpackage.pmv pmvVar = new defpackage.pmv(this, 17);
        j$.util.Optional optional = this.f;
        optional.isPresent();
        java.lang.Object obj = pmvVar.a;
        ((defpackage.pzo) optional.get()).c(((defpackage.puf) obj).a, 16);
        defpackage.ptx ptxVar = this.d;
        ptxVar.d(false);
        ptxVar.e(false);
        this.c.a(new defpackage.ptm(19));
    }
}
