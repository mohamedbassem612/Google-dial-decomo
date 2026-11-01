package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pqp implements znb {
    private final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean();

    public final void a(java.lang.String str, android.os.Bundle bundle) {
        if (str.equals("android.telephony.event.EVENT_CALL_FORWARDED")) {
            this.a.set(true);
        }
    }

    public final boolean b() {
        return this.a.get();
    }
}
