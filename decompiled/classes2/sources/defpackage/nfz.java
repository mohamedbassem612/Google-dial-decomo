package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nfz extends amzm {
    private final amzg b;

    public nfz(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.nfz.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) throws aois {
        boolean z;
        defpackage.nmo nmoVar = (defpackage.nmo) obj;
        aooh.f(nmoVar, "lifecycleState");
        switch (nmoVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 9:
                z = false;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                z = true;
                break;
            case 16:
                throw new java.lang.IllegalStateException("Unrecognized DobbyLifecycleState");
            default:
                throw new aois();
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
