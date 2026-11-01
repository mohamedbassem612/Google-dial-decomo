package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lnd extends aomh implements aonn {
    final /* synthetic */ defpackage.lnh a;
    final /* synthetic */ defpackage.lnl b;
    final /* synthetic */ defpackage.lmq c;
    final /* synthetic */ android.telecom.CallScreeningService.CallResponse.Builder d;
    final /* synthetic */ defpackage.okd e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnd(defpackage.lnh lnhVar, defpackage.lnl lnlVar, defpackage.lmq lmqVar, defpackage.okd okdVar, android.telecom.CallScreeningService.CallResponse.Builder builder, aoln aolnVar) {
        super(2, aolnVar);
        this.a = lnhVar;
        this.b = lnlVar;
        this.c = lmqVar;
        this.e = okdVar;
        this.d = builder;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b1  */
    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        aoss aossVar = (aoss) this.f;
        defpackage.lnl lnlVar = this.b;
        mgv mgvVar = mgv.eZ;
        int iAb = a.ab(lnlVar.c);
        if (iAb == 0) {
            iAb = 1;
        }
        defpackage.lnh lnhVar = this.a;
        zjv.i(lnhVar.e, mgvVar, ajsz.aY(gus.aw(mni.cF(iAb))), (mhc) null, 0, 28);
        defpackage.lmq lmqVar = this.c;
        if (!defpackage.lnh.g(lmqVar)) {
            throw new java.lang.IllegalStateException("trying to provide call response for outgoing call");
        }
        lnhVar.g = true;
        lnhVar.h = lnlVar;
        lnhVar.d(lmqVar, lnlVar);
        if (android.os.Build.VERSION.SDK_INT < 31) {
            defpackage.lnh.a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "respondToCall$<anonymous>", 514, "DialerCallScreeningServiceMixinImpl.kt").v("call composer attachments are not supported below S");
            defpackage.okd okdVar = this.e;
            android.telecom.Call.Details details = lmqVar.a;
            android.telecom.CallScreeningService.CallResponse callResponseM = fh$.ExternalSyntheticApiModelOutline0.m(this.d);
            aooh.e(callResponseM, "build(...)");
            okdVar.a(details, callResponseM);
        } else {
            aimz aimzVar = zih.a;
            aoov.al(aossVar, zih.b.plus(lnhVar.c), 1, new defpackage.lnc(null, lnhVar, this.e, lmqVar, this.d));
        }
        int iAb2 = a.ab(lnlVar.c);
        int i = (iAb2 != 0 ? iAb2 : 1) - 2;
        if (i == 2) {
            lnhVar.m.i((java.lang.String) null).b(mce.aM);
        } else if (i == 3) {
            lnhVar.m.i((java.lang.String) null).b(mce.aL);
        } else if (i != 4) {
            lnhVar.m.i((java.lang.String) null).b(mce.aK);
        } else {
            lnhVar.m.i((java.lang.String) null).b(mce.aM);
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.lnd lndVar = new defpackage.lnd(this.a, this.b, this.c, this.e, this.d, aolnVar);
        lndVar.f = obj;
        return lndVar;
    }
}
