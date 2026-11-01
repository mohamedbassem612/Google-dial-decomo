package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tdc implements java.util.concurrent.Callable {
    public final /* synthetic */ defpackage.tdd a;
    public final /* synthetic */ ajcq b;
    public final /* synthetic */ ajcq c;
    public final /* synthetic */ ajcq d;
    public final /* synthetic */ ajcq e;
    public final /* synthetic */ ajcq f;
    public final /* synthetic */ ajcq g;

    public /* synthetic */ tdc(defpackage.tdd tddVar, ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, ajcq ajcqVar4, ajcq ajcqVar5, ajcq ajcqVar6) {
        this.a = tddVar;
        this.b = ajcqVar;
        this.c = ajcqVar2;
        this.d = ajcqVar3;
        this.e = ajcqVar4;
        this.f = ajcqVar5;
        this.g = ajcqVar6;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        tcp tcpVar = (tcp) aiql.H(this.b);
        boolean zBooleanValue = ((java.lang.Boolean) aiql.H(this.c)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) aiql.H(this.d)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) aiql.H(this.e)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) aiql.H(this.f)).booleanValue();
        defpackage.tde tdeVar = (defpackage.tde) aiql.H(this.g);
        if (zBooleanValue4 && (tdeVar.equals(defpackage.tde.c) || tdeVar.equals(defpackage.tde.d))) {
            defpackage.tdd tddVar = this.a;
            tdeVar = defpackage.tde.b;
            tddVar.a(tdeVar.ordinal());
        }
        defpackage.tde tdeVar2 = tdeVar;
        if (tcpVar == null) {
            throw new java.lang.NullPointerException("Null rttConfiguration");
        }
        if (tdeVar2 != null) {
            return new defpackage.tdb(tcpVar, zBooleanValue, zBooleanValue2, zBooleanValue3, tdeVar2, zBooleanValue4);
        }
        throw new java.lang.NullPointerException("Null ttyModeConfiguration");
    }
}
