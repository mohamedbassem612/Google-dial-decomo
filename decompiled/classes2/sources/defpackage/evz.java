package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class evz implements ahyp {
    private final /* synthetic */ int $cid;

    public final boolean a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                if (((java.lang.String) obj) != null) {
                    return true;
                }
                break;
            case 1:
                if (((java.util.Map.Entry) obj).getKey() != null) {
                    return true;
                }
                break;
            case 2:
                int i = defpackage.fls.c;
                return ((defpackage.fof) obj).b.equals("iTunSMPB");
            case 3:
                defpackage.fol folVar = (defpackage.fol) obj;
                int i2 = defpackage.fls.c;
                if (folVar.a.equals("com.apple.iTunes") && folVar.b.equals("iTunSMPB")) {
                    return true;
                }
                break;
            case 4:
                return ((defpackage.foo) obj).f.equals("TLEN");
            case 5:
                if (!(((defpackage.eqx) obj) instanceof defpackage.fnm)) {
                    return true;
                }
                break;
            case 6:
                return ((defpackage.euq) obj).a.equals("auxiliary.tracks.interleaved");
            case 7:
                return ((defpackage.euq) obj).a.equals("auxiliary.tracks.map");
            case 8:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ahvr.ci(bool);
                return bool.booleanValue();
            case 9:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                ahvr.ci(bool2);
                return bool2.booleanValue();
            case 10:
                int iAe = a.ae(((acvr) obj).m);
                if (iAe != 0 && iAe == 2) {
                    return true;
                }
                break;
            case 11:
                if (!android.text.TextUtils.isEmpty((java.lang.String) obj)) {
                    return true;
                }
                break;
            case 12:
                if (!((com.google.apps.tiktok.account.api.controller.ValidationResult) obj).c()) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                if (((android.util.Pair) obj).second != null) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((android.content.Context) obj) instanceof amyp;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((android.content.Context) obj) instanceof ahgi;
            default:
                return ((java.lang.String) obj).startsWith("com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker");
        }
        return false;
    }
}
