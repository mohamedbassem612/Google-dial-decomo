package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptn implements defpackage.pug {
    private static final aimz a = aimz.i("com/android/dialer/incall/core/call/events/impl/AnsweringEndedEventState");
    private final defpackage.ptx b;
    private final defpackage.ptw c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final aoin g;
    private final aoin h;
    private final aoin i;
    private final aoin j;

    public ptn(defpackage.ptx ptxVar, defpackage.ptw ptwVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7) {
        this.b = ptxVar;
        this.c = ptwVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.f = aoinVar3;
        this.g = aoinVar4;
        this.h = aoinVar5;
        this.i = aoinVar6;
        this.j = aoinVar7;
    }

    private final j$.util.Optional d(defpackage.pty ptyVar) {
        android.telecom.DisconnectCause disconnectCause = ptyVar.c;
        if (disconnectCause == null) {
            return j$.util.Optional.empty();
        }
        int code = disconnectCause.getCode();
        if (code != 2) {
            if (code == 3 || code == 5) {
                return j$.util.Optional.of((defpackage.pug) this.f.a());
            }
            if (code != 6) {
                if (code == 12) {
                    return j$.util.Optional.of((defpackage.pug) this.h.a());
                }
                a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/call/events/impl/AnsweringEndedEventState", "handleDisconnected", 118, "AnsweringEndedEventState.java").I("Unknown cause %s. Disconnect Cause %s.", disconnectCause.getDescription(), new akct(akcs.a, java.lang.Integer.valueOf(code)));
                return j$.util.Optional.of((defpackage.pug) this.i.a());
            }
        }
        return j$.util.Optional.of((defpackage.pug) this.e.a());
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        if (ptyVar.b == defpackage.zmx.d) {
            return j$.util.Optional.of((defpackage.pug) this.e.a());
        }
        int iOrdinal = ptyVar.a.ordinal();
        if (iOrdinal == 5) {
            return j$.util.Optional.of((defpackage.pug) this.d.a());
        }
        if (iOrdinal == 6) {
            return d(ptyVar);
        }
        if (iOrdinal != 9) {
            if (iOrdinal == 11) {
                return j$.util.Optional.of((defpackage.pug) this.g.a());
            }
        } else if (((java.lang.Boolean) this.j.a()).booleanValue()) {
            return d(ptyVar);
        }
        return j$.util.Optional.of((defpackage.pug) this.i.a());
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "ANSWERING_ENDED";
    }

    @Override // defpackage.pug
    public final void c() {
        this.b.f(false);
        this.c.a(new defpackage.ptm(2));
    }
}
