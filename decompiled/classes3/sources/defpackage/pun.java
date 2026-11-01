package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pun implements defpackage.pug {
    private final /* synthetic */ int $cid;
    private final defpackage.ptw a;
    private final defpackage.ptx b;
    private final aoin c;
    private final aoin d;

    public pun(defpackage.ptw ptwVar, defpackage.ptx ptxVar, aoin aoinVar, aoin aoinVar2, int i) {
        this.$cid = i;
        this.a = ptwVar;
        this.b = ptxVar;
        this.c = aoinVar;
        this.d = aoinVar2;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        int i = this.$cid;
        if (i == 0) {
            if (ptyVar.a != defpackage.zpo.f) {
                return j$.util.Optional.of((defpackage.pug) this.d.a());
            }
            if (ptyVar.f) {
                return ptyVar.d.c() ? j$.util.Optional.of((defpackage.pug) this.c.a()) : j$.util.Optional.empty();
            }
            return j$.util.Optional.of((defpackage.pug) this.d.a());
        }
        if (i != 1) {
            if (ptyVar.a != defpackage.zpo.f) {
                return j$.util.Optional.of((defpackage.pug) this.d.a());
            }
            if (ptyVar.d.c()) {
                return j$.util.Optional.of((defpackage.pug) this.c.a());
            }
            return ptyVar.e ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.pug) this.d.a());
        }
        int iOrdinal = ptyVar.a.ordinal();
        if (iOrdinal == 6) {
            return j$.util.Optional.of((defpackage.pug) this.c.a());
        }
        if (iOrdinal != 9) {
            return ptyVar.b == defpackage.zmx.d ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.pug) this.d.a());
        }
        return j$.util.Optional.empty();
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? "VIDEO_REQUEST_SENT" : "DISCONNECTION_STARTED";
        }
        return "VIDEO_REQUEST_RECEIVED";
    }

    @Override // defpackage.pug
    public final void c() {
        int i = this.$cid;
        if (i == 0) {
            this.b.h(true);
            this.a.a(new defpackage.pui(13));
            return;
        }
        defpackage.ptx ptxVar = this.b;
        if (i != 1) {
            ptxVar.i(true);
            this.a.a(new defpackage.pui(14));
        } else {
            ptxVar.g(false);
            ptxVar.e(true);
            this.a.a(new defpackage.ptm(20));
        }
    }

    public pun(defpackage.ptx ptxVar, defpackage.ptw ptwVar, aoin aoinVar, aoin aoinVar2, int i) {
        this.$cid = i;
        this.b = ptxVar;
        this.a = ptwVar;
        this.c = aoinVar;
        this.d = aoinVar2;
    }
}
