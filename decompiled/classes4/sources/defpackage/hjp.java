package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class hjp extends afsq {
    final /* synthetic */ hjq a;

    public hjp(hjq hjqVar) {
        j$.util.Objects.requireNonNull(hjqVar);
        this.a = hjqVar;
    }

    public final /* bridge */ /* synthetic */ afof a(android.accounts.Account account) {
        hjq hjqVar = this.a;
        hkt hktVar = hjqVar.b;
        return new afod((rai) hktVar.o.a(), (aolr) hjqVar.a.bY.a(), hktVar.d(), hktVar.e(), hktVar.c(), account);
    }
}
