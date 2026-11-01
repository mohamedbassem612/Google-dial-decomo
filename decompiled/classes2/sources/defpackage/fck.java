package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fck extends android.os.Handler {
    final /* synthetic */ defpackage.fcm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fck(defpackage.fcm fcmVar, android.os.Looper looper) {
        super(looper);
        j$.util.Objects.requireNonNull(fcmVar);
        this.a = fcmVar;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        android.util.Pair pair = (android.util.Pair) message.obj;
        java.lang.Object obj = pair.first;
        java.lang.Object obj2 = pair.second;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                this.a.f(obj, obj2);
                return;
            }
            return;
        }
        defpackage.fcm fcmVar = this.a;
        if (obj == fcmVar.j) {
            if (fcmVar.f == 2 || fcmVar.i()) {
                fcmVar.j = null;
                if (obj2 instanceof java.lang.Exception) {
                    fcmVar.h.f((java.lang.Exception) obj2, false);
                    return;
                }
                try {
                    fcmVar.b.d((byte[]) ((defpackage.kvt) obj2).b);
                    defpackage.hjx hjxVar = fcmVar.h;
                    hjxVar.a = null;
                    ?? r4 = hjxVar.b;
                    aify aifyVarN = aify.n((java.util.Collection) r4);
                    r4.clear();
                    int size = aifyVarN.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        defpackage.fcm fcmVar2 = (defpackage.fcm) aifyVarN.get(i2);
                        if (fcmVar2.j()) {
                            fcmVar2.d(true);
                        }
                    }
                } catch (java.lang.Exception e) {
                    fcmVar.h.f(e, true);
                }
            }
        }
    }
}
