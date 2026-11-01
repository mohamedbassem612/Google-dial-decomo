package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahcx implements defpackage.ahek {
    public final /* synthetic */ j$.util.Optional a;
    public final /* synthetic */ defpackage.ahbz b;
    public final /* synthetic */ defpackage.adag c;

    public /* synthetic */ ahcx(defpackage.adag adagVar, j$.util.Optional optional, defpackage.ahbz ahbzVar) {
        this.c = adagVar;
        this.a = optional;
        this.b = ahbzVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        if (!defpackage.agab.aT(this.c, this.a)) {
            return defpackage.ajcm.a;
        }
        defpackage.ajcq ajcqVarD = this.b.d(true);
        defpackage.agsm.i(1370, ajcqVarD, "Failed to obtain initial snapshot", new java.lang.Object[0]);
        return ajcqVarD;
    }
}
