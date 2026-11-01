package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pue implements defpackage.pug {
    private static final aimz a = aimz.i("com/android/dialer/incall/core/call/events/impl/DialingEndedEventState");
    private final defpackage.ptw b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final aoin g;

    public pue(defpackage.ptw ptwVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5) {
        this.b = ptwVar;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.f = aoinVar4;
        this.g = aoinVar5;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        int iOrdinal = ptyVar.a.ordinal();
        if (iOrdinal == 5) {
            return j$.util.Optional.of((defpackage.pug) this.c.a());
        }
        if (iOrdinal != 6) {
            return iOrdinal != 9 ? j$.util.Optional.of((defpackage.pug) this.g.a()) : j$.util.Optional.empty();
        }
        android.telecom.DisconnectCause disconnectCause = ptyVar.c;
        if (disconnectCause == null) {
            return j$.util.Optional.empty();
        }
        int code = disconnectCause.getCode();
        if (code != 0 && code != 1) {
            if (code == 2) {
                return j$.util.Optional.of((defpackage.pug) this.d.a());
            }
            if (code != 3 && code != 7 && code != 8 && code != 9) {
                if (code == 12) {
                    return j$.util.Optional.of((defpackage.pug) this.f.a());
                }
                a.bt(a.c().m(aioa.b), "Unknown cause %s", disconnectCause.getDescription(), "com/android/dialer/incall/core/call/events/impl/DialingEndedEventState", "handleDisconnected", 'N', "DialingEndedEventState.java", zct.b);
                return j$.util.Optional.of((defpackage.pug) this.g.a());
            }
        }
        return j$.util.Optional.of((defpackage.pug) this.e.a());
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "DIALING_ENDED";
    }

    @Override // defpackage.pug
    public final void c() {
        this.b.a(new defpackage.ptm(16));
    }
}
