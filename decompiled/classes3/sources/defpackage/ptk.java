package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptk implements defpackage.pug {
    private static final aimz a = aimz.i("com/android/dialer/incall/core/call/events/impl/AddedEventState");
    private final aoin b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final defpackage.puj f;
    private final defpackage.pun g;

    public ptk(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, defpackage.puj pujVar, defpackage.pun punVar) {
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.f = pujVar;
        this.g = punVar;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        int iOrdinal = ptyVar.b.ordinal();
        if (iOrdinal == 1) {
            return j$.util.Optional.of((defpackage.pug) this.e.a());
        }
        if (iOrdinal == 2) {
            return j$.util.Optional.of((defpackage.pug) this.c.a());
        }
        if (iOrdinal == 3) {
            a.bI(a.c().m(aioa.b), "interception mode set to DISCONNECTING without going through RINGING", "com/android/dialer/incall/core/call/events/impl/AddedEventState", "update", '5', "AddedEventState.java", zct.b);
            return j$.util.Optional.of((defpackage.pug) this.b.a());
        }
        int iOrdinal2 = ptyVar.a.ordinal();
        if (iOrdinal2 == 1) {
            return j$.util.Optional.empty();
        }
        if (iOrdinal2 != 2) {
            if (iOrdinal2 == 3) {
                return j$.util.Optional.of((defpackage.pug) this.c.a());
            }
            if (iOrdinal2 != 6) {
                if (iOrdinal2 == 7) {
                    return j$.util.Optional.of(this.f);
                }
                if (iOrdinal2 != 8) {
                    return iOrdinal2 != 11 ? j$.util.Optional.of((defpackage.pug) this.b.a()) : j$.util.Optional.of((defpackage.pug) this.e.a());
                }
                return j$.util.Optional.empty();
            }
        }
        android.telecom.DisconnectCause disconnectCause = ptyVar.c;
        return (disconnectCause == null || disconnectCause.getCode() != 5) ? j$.util.Optional.of((defpackage.pug) this.d.a()) : j$.util.Optional.of(this.g);
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "ADDED";
    }

    @Override // defpackage.pug
    public final void c() {
    }
}
