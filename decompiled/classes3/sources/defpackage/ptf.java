package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptf implements znb {
    public final android.telecom.Call a;
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    public final defpackage.znc d = new defpackage.pte(this, 0);
    public final zpz e;

    public ptf(zpz zpzVar, android.telecom.Call call) {
        this.e = zpzVar;
        this.a = call;
    }

    public final void a(java.lang.String str, android.os.Bundle bundle) {
        int iHashCode = str.hashCode();
        if (iHashCode == -731255741) {
            if (str.equals("android.telecom.event.CALL_REMOTELY_UNHELD")) {
                this.b.set(false);
                this.e.a(ajcm.a);
                return;
            }
            return;
        }
        if (iHashCode == 1317277546 && str.equals("android.telecom.event.CALL_REMOTELY_HELD")) {
            this.b.set(true);
            this.e.a(ajcm.a);
        }
    }
}
