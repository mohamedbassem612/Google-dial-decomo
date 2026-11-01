package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptw {
    private static final aimz a = aimz.i("com/android/dialer/incall/core/call/events/impl/CallEventSender");
    private final zzx b;

    public ptw(zzx zzxVar) {
        this.b = zzxVar;
    }

    public final void a(defpackage.ptv ptvVar) {
        ailj ailjVarK = this.b.e().k();
        while (ailjVarK.hasNext()) {
            try {
                agsm.d("com/android/dialer/incall/core/call/events/impl/CallEventSender", "sendEvent", 38, ptvVar.a(ailjVarK.next()).a(), zct.b, "listener returned failed future", new java.lang.Object[0]);
            } catch (java.lang.RuntimeException e) {
                a.bq(a.c(), "failed calling event listener", "com/android/dialer/incall/core/call/events/impl/CallEventSender", "sendEvent", ',', "CallEventSender.java", e, zct.b);
            }
        }
    }
}
