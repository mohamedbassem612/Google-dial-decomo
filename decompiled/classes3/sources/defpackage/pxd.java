package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxd extends amzm {
    private final amzg b;
    private final amzg c;

    public pxd(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pxd.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.pvr pvrVar = (defpackage.pvr) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) pvrVar.i.get();
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((android.telecom.VideoProfile) optionalOfNullable.get()).getVideoState()));
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(defpackage.zcy.b(((java.lang.Integer) optionalOfNullable.get()).intValue()));
        }
        return aiql.z((j$.util.Optional) new mgr(mguVar, optionalOfNullable).a(mfy.bS).g(new defpackage.pvu(0)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
