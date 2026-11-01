package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aipa implements defpackage.aiow {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiow
    public final /* synthetic */ void a(defpackage.ainp ainpVar, java.util.Iterator it, java.lang.Object obj) {
        if (!ainpVar.b) {
            throw new java.lang.IllegalStateException("non repeating key");
        }
        if (!ainpVar.c || defpackage.aipl.a() <= 20) {
            ainpVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(ainpVar.a, it.next());
            }
        }
    }
}
