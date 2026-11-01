package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hkk implements defpackage.amwy, defpackage.amxu, defpackage.amyo {
    public final him a;
    final defpackage.amyz b;
    final defpackage.amyz c;
    final defpackage.amyz d;
    final defpackage.amyz e;
    final defpackage.amyz f;
    private final defpackage.hkh g;
    private final defpackage.hkk h = this;

    public hkk(him himVar, defpackage.hkh hkhVar) {
        this.a = himVar;
        this.g = hkhVar;
        this.b = new defpackage.hit(himVar, hkhVar, this, 1);
        this.c = new defpackage.hit(himVar, hkhVar, this, 2);
        this.d = defpackage.amyu.c(new defpackage.hit(himVar, hkhVar, this, 4));
        this.e = defpackage.amyu.c(new defpackage.hit(himVar, hkhVar, this, 3));
        this.f = defpackage.amyu.c(new defpackage.hit(himVar, hkhVar, this, 0));
    }

    @Override // defpackage.amxu
    public final defpackage.amxh a() {
        return (defpackage.amxh) this.d.a();
    }
}
