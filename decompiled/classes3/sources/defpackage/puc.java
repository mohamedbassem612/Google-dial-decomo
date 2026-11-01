package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class puc implements defpackage.pug {
    public final java.lang.String a;
    private final defpackage.ptw b;
    private final defpackage.ptx c;
    private final defpackage.zqj d;
    private final aoin e;
    private final j$.util.Optional f;

    public puc(defpackage.ptw ptwVar, defpackage.ptx ptxVar, defpackage.zqj zqjVar, aoin aoinVar, java.lang.String str, j$.util.Optional optional) {
        this.b = ptwVar;
        this.c = ptxVar;
        this.d = zqjVar;
        this.e = aoinVar;
        this.a = str;
        this.f = optional;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        return j$.util.Optional.of((defpackage.pug) this.e.a());
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "CONNECTED";
    }

    @Override // defpackage.pug
    public final void c() {
        defpackage.pmv pmvVar = new defpackage.pmv(this, 16);
        j$.util.Optional optional = this.f;
        optional.isPresent();
        java.lang.Object obj = pmvVar.a;
        ((defpackage.pzo) optional.get()).d(((defpackage.puc) obj).a, 6);
        this.c.d(true);
        this.d.f = true;
        this.b.a(new defpackage.ptm(13));
    }
}
