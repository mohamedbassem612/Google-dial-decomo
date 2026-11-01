package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaeg extends defpackage.aanh {
    public final void a(aadm aadmVar, defpackage.aadl aadlVar) {
        java.lang.ThreadLocal threadLocal = com.google.android.gms.common.api.internal.BasePendingResult.b;
        sendMessage(obtainMessage(1, new android.util.Pair(aadmVar, aadlVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) message.obj).j(com.google.android.gms.common.api.Status.d);
                return;
            }
            android.util.Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new java.lang.Exception());
            return;
        }
        android.util.Pair pair = (android.util.Pair) message.obj;
        aadm aadmVar = (aadm) pair.first;
        defpackage.aadl aadlVar = (defpackage.aadl) pair.second;
        try {
            aadmVar.a(aadlVar);
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.common.api.internal.BasePendingResult.k(aadlVar);
            throw e;
        }
    }
}
