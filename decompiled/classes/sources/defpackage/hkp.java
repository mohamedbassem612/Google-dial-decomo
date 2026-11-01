package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hkp implements defpackage.amwz, defpackage.amxs, defpackage.amyb, defpackage.amyo {
    private final him b;
    private final defpackage.hkh c;
    private final defpackage.hkp d = this;
    final defpackage.amyz a = defpackage.amyu.c(new defpackage.hje());

    public hkp(him himVar, defpackage.hkh hkhVar) {
        this.b = himVar;
        this.c = hkhVar;
    }

    @Override // defpackage.amyb
    public final defpackage.amxh a() {
        return (defpackage.amxh) this.a.a();
    }

    @Override // defpackage.amxs
    public final defpackage.hjd b() {
        return new defpackage.hjd(this.b, this.c);
    }
}
