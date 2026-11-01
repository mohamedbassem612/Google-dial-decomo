package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpr extends defpackage.ub {
    public final rlv f;
    public final ipc g;
    private final java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpr(defpackage.tt ttVar, java.lang.String str, ipc ipcVar, rlv rlvVar) {
        super(ttVar);
        aooh.f(ttVar, "carContext");
        aooh.f(str, "errorMessage");
        aooh.f(ipcVar, "carCallErrorMessageFlow");
        aooh.f(rlvVar, "loggingBindings");
        this.h = str;
        this.g = ipcVar;
        this.f = rlvVar;
        this.b.c(new defpackage.hpq(this));
    }

    @Override // defpackage.ub
    public final defpackage.ze a() {
        defpackage.xo xoVar = new defpackage.xo(androidx.car.app.model.CarText.create(this.h));
        defpackage.xc xcVar = new defpackage.xc();
        xcVar.c(androidx.car.app.model.Action.BACK);
        androidx.car.app.model.Header headerA = xcVar.a();
        if (headerA.getStartHeaderAction() != null) {
            xoVar.f = headerA.getStartHeaderAction();
        }
        if (headerA.getTitle() != null) {
            xoVar.b = headerA.getTitle();
        }
        if (!headerA.getEndHeaderActions().isEmpty()) {
            vx vxVar = new vx();
            java.util.Iterator it = headerA.getEndHeaderActions().iterator();
            while (it.hasNext()) {
                vxVar.b((androidx.car.app.model.Action) it.next());
            }
            xoVar.g = vxVar.a();
        }
        xoVar.i = headerA;
        androidx.car.app.model.CarIcon carIcon = new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(this.a, 2131231350)));
        defpackage.zk.b.a((androidx.car.app.model.CarIcon) j$.util.Objects.requireNonNull(carIcon));
        xoVar.e = carIcon;
        return xoVar.a();
    }
}
