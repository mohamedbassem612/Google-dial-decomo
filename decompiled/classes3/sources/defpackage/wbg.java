package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbg implements defpackage.zkc {
    final /* synthetic */ defpackage.wbk a;

    public wbg(defpackage.wbk wbkVar) {
        this.a = wbkVar;
    }

    @Override // defpackage.zkc
    public final void a(defpackage.zki zkiVar) {
        aooh.f(zkiVar, "message");
        for (defpackage.zkh zkhVar : zkiVar.d) {
            defpackage.zkx zkxVar = zkhVar.b == 4 ? (defpackage.zkx) zkhVar.c : defpackage.zkx.a;
            aooh.e(zkxVar, "getEchoToPhone(...)");
            defpackage.wbk.a.b().l("com/android/dialer/wear/echo/impl/relay/impl/EchoPhoneRelayImpl$EchoRelayWearDfpMessageReceiver", "onMessage", 103, "EchoPhoneRelayImpl.kt").y("Received DFP message: %s", zkxVar);
            int iAR = a.aR(zkxVar.b);
            if (iAR == 0) {
                iAR = 1;
            }
            int i = iAR - 2;
            defpackage.wbe wbeVar = i != 1 ? (i == 2 && this.a.d.b()) ? defpackage.wbe.f : null : defpackage.wbe.b;
            if (wbeVar != null) {
                defpackage.wbk wbkVar = this.a;
                wbkVar.i.i(((java.lang.Boolean) wbkVar.b.a()).booleanValue() ? ahvr.ag(wbkVar.e, wbkVar.h, new defpackage.vjf(wbkVar, wbeVar, (aoln) null, 7)) : aoov.an(wbkVar.e, (aolr) null, 0, new defpackage.wbf(wbkVar, wbeVar, (aoln) null, 0), 3));
            }
        }
    }
}
