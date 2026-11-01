package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class utp implements defpackage.tgy {
    public final defpackage.ury a;
    public final ucm b;
    private final java.lang.String c;

    public utp(ucm ucmVar, defpackage.ury uryVar) {
        aooh.f(ucmVar, "timeKeeper");
        this.b = ucmVar;
        this.a = uryVar;
        this.c = snl.au(this, "TimeKeeperHistogramView");
    }

    @Override // defpackage.tgy
    public final java.lang.String a() {
        return this.c;
    }

    @Override // defpackage.tgy
    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.utp) {
            defpackage.utp utpVar = (defpackage.utp) obj;
            if (aooh.n(this.b, utpVar.b) && aooh.n(this.a, utpVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TimeKeeperSearchUiModel(timeKeeper=" + this.b + ", details=" + this.a + ')';
    }
}
