package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uix extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public uix(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.uix.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.uiw uiwVar = (defpackage.uiw) list.get(0);
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(1);
        defpackage.vaa vaaVar = (defpackage.vaa) list.get(2);
        aooh.f(uiwVar, "spamStatusInCallUpdater");
        aooh.f(details, "callDetails");
        aooh.f(vaaVar, "callScopedSpamStatusCache");
        aooh.f(details, "callDetails");
        java.lang.Object obj2 = vaaVar.a;
        aimw aimwVarL = swa.a.b().l("com/android/dialer/prefetchedcall/datacache/PrefetchedCallDataCache", "get", 202, "PrefetchedCallDataCache.kt");
        ajml ajmlVar = (ajml) obj2;
        swa swaVar = (swa) ajmlVar.b;
        aimwVarL.y("%s: enter", swaVar.d);
        defpackage.svu svuVar = new defpackage.svu(ajmlVar.a, swaVar.b.a(details));
        defpackage.svt svtVarA = swaVar.a(svuVar);
        java.lang.Object objB = null;
        if (svtVarA == null) {
            swa swaVar2 = swaVar.c;
            svtVarA = swaVar2 != null ? swaVar2.a(svuVar) : null;
        }
        if (svtVarA != null) {
            aosy aosyVar = svtVarA.a;
            if (aosyVar.x()) {
                objB = aosyVar.b();
            }
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((uip) objB);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
