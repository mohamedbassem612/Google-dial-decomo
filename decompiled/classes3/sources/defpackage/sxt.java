package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class sxt implements agtk {
    final /* synthetic */ defpackage.sxv a;

    public sxt(defpackage.sxv sxvVar) {
        j$.util.Objects.requireNonNull(sxvVar);
        this.a = sxvVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        aimw aimwVarL = defpackage.sxv.a.c().i(zct.b).k(th).l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoFragmentPeer$1", "onFailure", 80, "TidepodsRevelioDemoFragmentPeer.java");
        defpackage.sxv sxvVar = this.a;
        aimwVarL.y("failed playing demo audio for: %s", sxvVar.c.f);
        sxvVar.a();
    }

    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        int iAS;
        defpackage.sxn sxnVarA = ((com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) obj2).a(defpackage.sxn.a, akzq.a());
        if ((sxnVarA.b & 1) == 0 || (iAS = a.aS(sxnVarA.c)) == 0 || iAS != 3) {
            return;
        }
        this.a.a();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
