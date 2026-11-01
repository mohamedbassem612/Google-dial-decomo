package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aclj implements defpackage.ahek {
    private final defpackage.aclb a;

    public aclj(defpackage.aclb aclbVar) {
        this.a = aclbVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.ajcq ajcqVarA;
        defpackage.acld acldVar = (defpackage.acld) this.a;
        android.content.Context context = acldVar.h;
        acldVar.g.a(context);
        if (defpackage.abyl.i(context)) {
            ajcqVarA = acldVar.a();
        } else {
            ((defpackage.aiob) defpackage.acld.a.b()).v("User is locked (Direct Boot mode). Deferring GrowthKit startup until unlock.");
            ajcqVarA = defpackage.abyl.b(context, new defpackage.xbw(acldVar, 17), acldVar.b);
        }
        defpackage.agsm.i(1247, ajcqVarA, "Failed to start GrowthKit after package replaced", new java.lang.Object[0]);
        return ajcqVarA;
    }
}
