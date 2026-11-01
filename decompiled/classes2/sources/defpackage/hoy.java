package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hoy extends defpackage.ub {
    public final defpackage.hoz f;
    public final rlv g;
    public final defpackage.hox h;
    public final zpm i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoy(defpackage.tt ttVar, defpackage.hoz hozVar, rlv rlvVar, zpm zpmVar) {
        super(ttVar);
        aooh.f(ttVar, "carContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(zpmVar, "callScopes");
        this.f = hozVar;
        this.g = rlvVar;
        this.i = zpmVar;
        this.h = new defpackage.hox(this);
        this.b.c(new defpackage.how(ttVar, this));
    }

    @Override // defpackage.ub
    public final defpackage.ze a() {
        defpackage.xi xiVar = new defpackage.xi();
        for (defpackage.hpa hpaVar : this.f.a) {
            defpackage.yh yhVar = new defpackage.yh();
            yhVar.f(hpaVar.b.getLabel());
            java.lang.CharSequence charSequence = hpaVar.c;
            if (charSequence != null) {
                yhVar.c(charSequence);
            }
            boolean z = hpaVar.d;
            yhVar.a = z;
            if (!z) {
                yhVar.c(hpaVar.e);
            }
            yhVar.d(new androidx.car.app.model.CarIcon(new defpackage.wj(androidx.core.graphics.drawable.IconCompat.g(this.a, 2131231606))), 4);
            yhVar.e(new defpackage.hnc(this, hpaVar, 6));
            xiVar.b(yhVar.a());
        }
        androidx.car.app.model.ItemList itemListA = xiVar.a();
        defpackage.xl xlVar = new defpackage.xl();
        defpackage.xc xcVar = new defpackage.xc();
        xcVar.e(this.a.getString(2132017279));
        xcVar.c(new defpackage.vw(androidx.car.app.model.Action.BACK).a());
        xlVar.b(xcVar.a());
        xlVar.d(itemListA);
        return xlVar.a();
    }
}
