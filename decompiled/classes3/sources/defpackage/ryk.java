package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryk implements agtk {
    final /* synthetic */ defpackage.ryl a;

    public ryk(defpackage.ryl rylVar) {
        this.a = rylVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.ryl rylVar = this.a;
        rylVar.k.b(false);
        defpackage.ryl.a.c().k(th).l("com/android/dialer/patrick/account/sharing/ui/CallingCardSharingFragmentPeer$onDoneCallback$<anonymous>", "onFailure", 116, "CallingCardSharingFragmentPeer.kt").v("Failed to save My Calling Card.");
        rylVar.a().a(mcd.bi);
        defpackage.ryi ryiVar = rylVar.b;
        java.lang.String strY = ryiVar.Y(2132017953);
        aooh.e(strY, "getString(...)");
        defpackage.agby.q(ryiVar.H().findViewById(android.R.id.content), strY, -1).h();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto = (com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) obj2;
        aooh.f(parcelableProto, "patrickDataParcelableProto");
        defpackage.ryl rylVar = this.a;
        defpackage.sjl sjlVar = rylVar.k;
        sjlVar.b(false);
        aoin aoinVar = rylVar.h;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            defpackage.abxt abxtVar = defpackage.abxt.a;
            defpackage.abxt abxtVar2 = (defpackage.abxt) parcelableProto.a(defpackage.abxl.H(abxtVar.m()).L(), akzq.a());
            if (abxtVar2 == null) {
                aooh.e(abxtVar, "getDefaultInstance(...)");
            } else {
                abxtVar = abxtVar2;
            }
            sjlVar.f(new defpackage.qji(abxtVar, 17));
        }
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rylVar.l.c();
        } else {
            rylVar.c.a().a(-1, null);
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
