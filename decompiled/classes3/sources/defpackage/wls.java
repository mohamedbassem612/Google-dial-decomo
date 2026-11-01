package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wls extends amzm {
    private final amzg b;

    public wls(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.wls.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.wpg wpgVar = ((defpackage.abtr) obj).n().c;
        if (wpgVar == null) {
            wpgVar = defpackage.wpg.a;
        }
        defpackage.wow wowVarB = defpackage.wow.b(wpgVar.f);
        if (wowVarB == null) {
            wowVarB = defpackage.wow.UNRECOGNIZED;
        }
        return aiql.z(wowVarB);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
