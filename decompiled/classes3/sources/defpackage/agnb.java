package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agnb implements agtk {
    final /* synthetic */ defpackage.agnc a;

    public agnb(defpackage.agnc agncVar) {
        this.a = agncVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto = (com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) obj;
        aooh.f(parcelableProto, "operationWrapper");
        this.a.l.i(parcelableProto, th);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto = (com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) obj;
        com.google.apps.tiktok.account.api.controller.AccountActionResult accountActionResult = (com.google.apps.tiktok.account.api.controller.AccountActionResult) obj2;
        aooh.f(parcelableProto, "operationWrapper");
        aooh.f(accountActionResult, "result");
        this.a.l.j(parcelableProto, accountActionResult);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
