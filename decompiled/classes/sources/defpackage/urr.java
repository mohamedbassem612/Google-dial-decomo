package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class urr implements defpackage.ahek {
    public final defpackage.zth a;
    public final defpackage.ajct b;
    public final defpackage.aoin c;

    public urr(defpackage.zth zthVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        this.a = zthVar;
        this.b = ajctVar;
        this.c = aoinVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.guy guyVar = new defpackage.guy(this, 19);
        defpackage.ajct ajctVar = this.b;
        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(defpackage.ahvr.F(guyVar, ajctVar), new defpackage.jwf(this, 17), ajctVar);
        defpackage.agsm.i(933, ajcqVarI, "Failed to migrate theme preferences!", new java.lang.Object[0]);
        return ajcqVarI;
    }
}
