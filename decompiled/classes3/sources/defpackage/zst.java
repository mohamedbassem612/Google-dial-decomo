package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zst implements agtk {
    final /* synthetic */ defpackage.zsu a;

    public zst(defpackage.zsu zsuVar) {
        j$.util.Objects.requireNonNull(zsuVar);
        this.a = zsuVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        if (th instanceof defpackage.agtp) {
            defpackage.zsu.a.b().l("com/google/android/dialershared/precall/impl/PrecallFragmentPeer$PrecallFuturesMixinCallback", "onFailure", 207, "PrecallFragmentPeer.java").v("parcelled before completionfinished, aborting call");
        } else {
            a.by(defpackage.zsu.a.c(), "failed to run a precall integration.", "com/google/android/dialershared/precall/impl/PrecallFragmentPeer$PrecallFuturesMixinCallback", "onFailure", (char) 209, "PrecallFragmentPeer.java", th);
        }
    }

    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.zsu zsuVar = this.a;
        j$.util.Optional optional = zsuVar.f;
        optional.isPresent();
        ((gou) optional.get()).m();
        defpackage.zsr zsrVarA = ((com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) obj2).a(defpackage.zsr.a, akzq.a());
        zta ztaVarA = zsuVar.e.a(zsuVar.h);
        aimz aimzVar = defpackage.zsu.a;
        aimw aimwVarL = aimzVar.b().l("com/google/android/dialershared/precall/impl/PrecallFragmentPeer$PrecallFuturesMixinCallback", "onSuccess", 182, "PrecallFragmentPeer.java");
        defpackage.zsz zszVarB = defpackage.zsz.b(zsrVarA.c);
        if (zszVarB == null) {
            zszVarB = defpackage.zsz.DECISION_UNSPECIFIED;
        }
        aimwVarL.I("decision for %s: %s", ztaVarA, zszVarB);
        defpackage.zrx zrxVar = zsrVarA.d;
        if (zrxVar == null) {
            zrxVar = defpackage.zrx.a;
        }
        zsuVar.b = zrxVar;
        defpackage.zsz zszVarB2 = defpackage.zsz.b(zsrVarA.c);
        if (zszVarB2 == null) {
            zszVarB2 = defpackage.zsz.DECISION_UNSPECIFIED;
        }
        int iOrdinal = zszVarB2.ordinal();
        if (iOrdinal == 1) {
            zsuVar.h++;
            zsuVar.b();
            return;
        }
        if (iOrdinal == 2) {
            ztaVarA.a(zsuVar.b).r(zsuVar.c.I(), "PRECALL_ACTION_DIALOG_TAG");
            return;
        }
        if (iOrdinal == 4) {
            zsuVar.c();
            return;
        }
        aimw aimwVarL2 = aimzVar.c().m(aioa.a).l("com/google/android/dialershared/precall/impl/PrecallFragmentPeer$PrecallFuturesMixinCallback", "onSuccess", 199, "PrecallFragmentPeer.java");
        defpackage.zsz zszVarB3 = defpackage.zsz.b(zsrVarA.c);
        if (zszVarB3 == null) {
            zszVarB3 = defpackage.zsz.DECISION_UNSPECIFIED;
        }
        aimwVarL2.y("unexpected decision %s", zszVarB3.name());
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
