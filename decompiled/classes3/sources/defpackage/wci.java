package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wci implements defpackage.zik {
    private static final aimz a = aimz.i("com/android/dialer/wear/simulatedringing/impl/SimulatedRingingActionRequestReceiver");
    private final zjs b;

    public wci(zjs zjsVar) {
        aooh.f(zjsVar, "dialerTelecom");
        this.b = zjsVar;
    }

    @Override // defpackage.zik
    public final /* bridge */ /* synthetic */ java.lang.Object b(albh albhVar, aoln aolnVar) {
        defpackage.wcl wclVarB;
        defpackage.wcl wclVarB2;
        defpackage.wcn wcnVar = (defpackage.wcn) albhVar;
        if (wcnVar.b == 1) {
            wclVarB = defpackage.wcl.b(((java.lang.Integer) wcnVar.c).intValue());
            if (wclVarB == null) {
                wclVarB = defpackage.wcl.UNRECOGNIZED;
            }
        } else {
            wclVarB = defpackage.wcl.SIMULATED_RINGING_ACTION_REQUEST_EVENT_UNSPECIFIED;
        }
        int iOrdinal = wclVarB.ordinal();
        aimz aimzVar = a;
        if (iOrdinal == 1) {
            aimzVar.b().l("com/android/dialer/wear/simulatedringing/impl/SimulatedRingingActionRequestReceiver", "onCrossSurfaceEvent", 20, "SimulatedRingingActionRequestReceiver.kt").v("Received request to silence ringer from Wear. Silencing ringer.");
            zjs zjsVar = this.b;
            java.lang.Object objAj = aoov.aj(zjsVar.d, new zhb(zjsVar, (aoln) null, 15, (boolean[]) null), aolnVar);
            aolu aoluVar = aolu.a;
            if (objAj != aoluVar) {
                objAj = aojh.a;
            }
            return objAj != aoluVar ? aojh.a : objAj;
        }
        aimw aimwVarL = aimzVar.d().l("com/android/dialer/wear/simulatedringing/impl/SimulatedRingingActionRequestReceiver", "onCrossSurfaceEvent", 26, "SimulatedRingingActionRequestReceiver.kt");
        if (wcnVar.b == 1) {
            wclVarB2 = defpackage.wcl.b(((java.lang.Integer) wcnVar.c).intValue());
            if (wclVarB2 == null) {
                wclVarB2 = defpackage.wcl.UNRECOGNIZED;
            }
        } else {
            wclVarB2 = defpackage.wcl.SIMULATED_RINGING_ACTION_REQUEST_EVENT_UNSPECIFIED;
        }
        aimwVarL.y("Unexpected action request event: %s", wclVarB2);
        return aojh.a;
    }
}
