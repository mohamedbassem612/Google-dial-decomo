package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hjh implements ahdp {
    final /* synthetic */ defpackage.hjj a;

    public hjh(defpackage.hjj hjjVar) {
        j$.util.Objects.requireNonNull(hjjVar);
        this.a = hjjVar;
    }

    public final ahdo a(java.lang.String str) {
        defpackage.hjj hjjVar = this.a;
        defpackage.hkr hkrVar = hjjVar.b;
        com.google.apps.tiktok.account.AccountId accountIdL = hkrVar.l();
        defpackage.him himVar = hjjVar.a;
        agoo agooVar = (agoo) himVar.tw.a();
        zzx zzxVarOY = himVar.oY();
        ahdr ahdrVar = (ahdr) himVar.a.gj.a();
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) himVar.r.a();
        defpackage.him.iO();
        return new ahdo(accountIdL, agooVar, zzxVarOY, ahdrVar, hkrVar.c, executor, str);
    }
}
