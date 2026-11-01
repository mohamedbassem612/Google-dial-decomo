package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ode extends amzm {
    private final amzg b;
    private final amzg c;

    public ode(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.ode.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) list.get(1);
        aooh.f(aossVar, "blockingScope");
        aooh.f(packageManager, "packageManager");
        android.content.Intent intentAddFlags = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("smsto:911")).addFlags(268435456);
        aooh.e(intentAddFlags, "addFlags(...)");
        return aosv.F(aossVar, 0, new defpackage.kdr(packageManager, intentAddFlags, (aoln) null, 20), 3);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
