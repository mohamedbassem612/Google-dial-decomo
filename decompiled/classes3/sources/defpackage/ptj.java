package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptj implements defpackage.pug {
    private final defpackage.ptw a;
    private final defpackage.ptx b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final aoin g;

    public ptj(defpackage.ptw ptwVar, defpackage.ptx ptxVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5) {
        this.a = ptwVar;
        this.b = ptxVar;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.f = aoinVar4;
        this.g = aoinVar5;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        if (ptyVar.a != defpackage.zpo.f) {
            return j$.util.Optional.of((defpackage.pug) this.c.a());
        }
        if (ptyVar.h == 1) {
            return j$.util.Optional.of((defpackage.pug) this.d.a());
        }
        if (ptyVar.d.c()) {
            return j$.util.Optional.of((defpackage.pug) this.e.a());
        }
        if (ptyVar.e) {
            return j$.util.Optional.of((defpackage.pug) this.f.a());
        }
        return ptyVar.f ? j$.util.Optional.of((defpackage.pug) this.g.a()) : j$.util.Optional.empty();
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "ACTIVATED";
    }

    @Override // defpackage.pug
    public final void c() {
        defpackage.ptx ptxVar = this.b;
        ptxVar.a(true);
        ptxVar.g(false);
        this.a.a(new defpackage.ptm(1));
    }
}
