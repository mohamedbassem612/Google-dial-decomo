package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uqv implements defpackage.uqt {
    public final gfj a = new defpackage.uqu(this);
    private final gfy b;

    public uqv(gfy gfyVar) {
        this.b = gfyVar;
    }

    @Override // defpackage.uqt
    public final ajcq a() {
        return dez.p(this.b, false, true, new ukw(10));
    }

    @Override // defpackage.uqt
    public final ajcq b() {
        return dez.p(this.b, true, false, new ukw(9));
    }

    @Override // defpackage.uqt
    public final ajcq c(int i) {
        return dez.p(this.b, true, false, new cos(i, 12));
    }

    @Override // defpackage.uqt
    public final ajcq d(aify aifyVar) {
        return dez.p(this.b, false, true, new uph(this, aifyVar, 2, (byte[]) null));
    }
}
