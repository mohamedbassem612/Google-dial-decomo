package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpv extends amzm {
    private final amzg b;

    public jpv(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jpv.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.aixx aixxVar;
        sql sqlVar = (sql) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(sqlVar, "consolidator");
        switch (sqlVar.b().ordinal()) {
            case 0:
                if (!sqlVar.t().isPresent()) {
                    zai zaiVar = sqlVar.u().c;
                    if (zaiVar == null) {
                        zaiVar = zai.a;
                    }
                    aixxVar = !zaiVar.equals(zai.a) ? defpackage.aixx.CALLER_TAG : defpackage.aixx.NOT_RESOLVED;
                } else {
                    aixxVar = defpackage.aixx.CALLER_TAG_FEEDBACK;
                }
                break;
            case 1:
                aixxVar = defpackage.aixx.CP2_DEFAULT_DIRECTORY;
                break;
            case 2:
                aixxVar = defpackage.aixx.CP2_EXTENDED_DIRECTORY;
                break;
            case 3:
                aixxVar = defpackage.aixx.CALLER_ID_BUSINESS;
                break;
            case 4:
                aixxVar = defpackage.aixx.CALLER_ID_INDIVIDUAL;
                break;
            case 5:
                aixxVar = defpackage.aixx.CNAP;
                break;
            case 6:
                aixxVar = defpackage.aixx.CEQUINT;
                break;
            case 7:
                aixxVar = defpackage.aixx.CALLER_ID_UNKNOWN;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aixxVar = defpackage.aixx.UNKNOWN_CONTACT_TYPE;
                break;
            case 12:
                aixxVar = defpackage.aixx.CALLER_ID_FEEDBACK;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aixxVar = defpackage.aixx.FIXED_DIALING_NUMBER;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aixxVar = defpackage.aixx.B2C_ENRICHED_CALLING;
                break;
            default:
                aixxVar = defpackage.aixx.UNKNOWN_CONTACT_TYPE;
                break;
        }
        return aiql.z(aixxVar);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
