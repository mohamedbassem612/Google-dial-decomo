package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pto implements defpackage.pug {
    private static final aimz a = aimz.i("com/android/dialer/incall/core/call/events/impl/AudioProcessingEndedEventState");
    private final aoin b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final aoin g;
    private final defpackage.ptw h;
    private final defpackage.ptx i;

    public pto(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, defpackage.ptw ptwVar, defpackage.ptx ptxVar) {
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.f = aoinVar5;
        this.g = aoinVar6;
        this.h = ptwVar;
        this.i = ptxVar;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        if (ptyVar.g) {
            defpackage.ptx ptxVar = this.i;
            ptxVar.b.set(true);
            ptxVar.d.a(ajcm.a);
        }
        int iOrdinal = ptyVar.b.ordinal();
        if (iOrdinal == 2) {
            return j$.util.Optional.of((defpackage.pug) this.c.a());
        }
        if (iOrdinal == 3) {
            return j$.util.Optional.of((defpackage.pug) this.e.a());
        }
        int iOrdinal2 = ptyVar.a.ordinal();
        if (iOrdinal2 == 3) {
            return j$.util.Optional.of((defpackage.pug) this.c.a());
        }
        if (iOrdinal2 != 9) {
            if (iOrdinal2 == 5) {
                return j$.util.Optional.of((defpackage.pug) this.d.a());
            }
            if (iOrdinal2 != 6) {
                return j$.util.Optional.of((defpackage.pug) this.b.a());
            }
        }
        android.telecom.DisconnectCause disconnectCause = ptyVar.c;
        if (disconnectCause == null) {
            return j$.util.Optional.empty();
        }
        int code = disconnectCause.getCode();
        if (code == 1) {
            return j$.util.Optional.of((defpackage.pug) this.g.a());
        }
        if (code == 3 || code == 5) {
            return j$.util.Optional.of((defpackage.pug) this.f.a());
        }
        if (code == 6) {
            return j$.util.Optional.of((defpackage.pug) this.e.a());
        }
        a.bt(a.c().m(aioa.b), "Unknown cause %s", disconnectCause.getDescription(), "com/android/dialer/incall/core/call/events/impl/AudioProcessingEndedEventState", "handleDisconnected", 'k', "AudioProcessingEndedEventState.java", zct.b);
        return j$.util.Optional.of((defpackage.pug) this.b.a());
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "AUDIO_PROCESSING_ENDED";
    }

    @Override // defpackage.pug
    public final void c() {
        this.i.c(false);
        this.h.a(new defpackage.ptm(4));
    }
}
