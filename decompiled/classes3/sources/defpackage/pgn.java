package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgn extends amzm {
    private final amzg b;
    private final amzg c;

    public pgn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pgn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zCanAddCall = false;
        defpackage.zmo zmoVar = (defpackage.zmo) list.get(0);
        zzx zzxVar = (zzx) list.get(1);
        aooh.f(zmoVar, "addCallController");
        aooh.f(zzxVar, "directBoot");
        if (!zzxVar.m()) {
            j$.util.Optional optionalD = zmoVar.c.d();
            if (optionalD.isPresent()) {
                zCanAddCall = ((android.telecom.InCallService) optionalD.orElseThrow()).canAddCall();
            } else {
                a.bI(defpackage.zmo.a.b().m(aioa.b), "inCallService is empty.", "com/google/android/dialershared/incall/core/addcall/AddCallController", "canAddCall", '<', "AddCallController.java", zct.b);
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(zCanAddCall));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
