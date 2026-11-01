package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onn extends amzm {
    private final amzg b;
    private final amzg c;

    public onn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.onn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        android.os.Bundle extras;
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        one oneVar = (one) list.get(0);
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(1);
        if (oneVar.a() && (extras = details.getExtras()) != null && (extras.containsKey("com.google.android.ims.fides_call_state") || extras.containsKey("android.ims.fides_call_state"))) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
