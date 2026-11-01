package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pul implements defpackage.pug {
    private final /* synthetic */ int $cid;
    private final defpackage.ptw a;
    private final defpackage.ptx b;
    private final aoin c;
    private final aoin d;
    private final aoin e;

    public pul(defpackage.ptw ptwVar, defpackage.ptx ptxVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, int i) {
        this.$cid = i;
        this.a = ptwVar;
        this.b = ptxVar;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        if (this.$cid != 0) {
            int iOrdinal = ptyVar.a.ordinal();
            if (iOrdinal != 4) {
                return (iOrdinal == 6 || iOrdinal == 9) ? j$.util.Optional.of((defpackage.pug) this.c.a()) : j$.util.Optional.of((defpackage.pug) this.e.a());
            }
            return j$.util.Optional.of((defpackage.pug) this.d.a());
        }
        int iOrdinal2 = ptyVar.a.ordinal();
        if (iOrdinal2 == 4) {
            return j$.util.Optional.empty();
        }
        if (iOrdinal2 != 5) {
            return (iOrdinal2 == 6 || iOrdinal2 == 9) ? j$.util.Optional.of((defpackage.pug) this.d.a()) : j$.util.Optional.of((defpackage.pug) this.e.a());
        }
        return j$.util.Optional.of((defpackage.pug) this.c.a());
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return this.$cid != 0 ? "DEACTIVATED" : "SUSPENDED";
    }

    @Override // defpackage.pug
    public final void c() {
        int i = this.$cid;
        defpackage.ptx ptxVar = this.b;
        if (i != 0) {
            ptxVar.a(false);
            this.a.a(new defpackage.ptm(14));
        } else {
            ptxVar.g(true);
            this.a.a(new defpackage.pui(10));
        }
    }

    public pul(defpackage.ptw ptwVar, defpackage.ptx ptxVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = ptwVar;
        this.b = ptxVar;
        this.c = aoinVar;
        this.e = aoinVar2;
        this.d = aoinVar3;
    }
}
