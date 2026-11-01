package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aahm {
    public static final defpackage.aais a = new defpackage.aais();

    public static defpackage.aaum a(defpackage.aadh aadhVar, defpackage.aahl aahlVar) {
        return c(aadhVar, aahlVar);
    }

    public static void b(defpackage.aadh aadhVar) {
        c(aadhVar, new defpackage.aahj());
    }

    public static defpackage.aaum c(final defpackage.aadh aadhVar, final defpackage.aahl aahlVar) {
        final defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        aadhVar.d(new defpackage.aadg() { // from class: aahk
            @Override // defpackage.aadg
            public final void a(com.google.android.gms.common.api.Status status) {
                defpackage.zzx zzxVar2 = zzxVar;
                if (status.c()) {
                    zzxVar2.i(aahlVar.a(aadhVar.f(java.util.concurrent.TimeUnit.MILLISECONDS)));
                } else {
                    zzxVar2.h(defpackage.aehj.bY(status));
                }
            }
        });
        return (defpackage.aaum) zzxVar.a;
    }
}
