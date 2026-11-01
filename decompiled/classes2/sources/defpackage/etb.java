package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class etb {
    public final defpackage.etk a;
    public final defpackage.etk b;
    public java.lang.Object c;
    public java.lang.Object d;
    public int e;
    private final rai f;

    public etb(java.lang.Object obj, android.os.Looper looper, android.os.Looper looper2, defpackage.etc etcVar, rai raiVar) {
        this.a = etcVar.b(looper, null);
        this.b = etcVar.b(looper2, null);
        this.c = obj;
        this.d = obj;
        this.f = raiVar;
    }

    public final void a(java.lang.Runnable runnable) {
        defpackage.etk etkVar = this.a;
        if (etkVar.a().getThread().isAlive()) {
            etkVar.d(runnable);
        }
    }

    public final void b(java.lang.Runnable runnable) {
        defpackage.etk etkVar = this.b;
        if (etkVar.a().getThread().isAlive()) {
            etkVar.d(runnable);
        }
    }

    public final void c(java.lang.Object obj) {
        java.lang.Object obj2 = this.c;
        this.c = obj;
        if (obj2.equals(obj)) {
            return;
        }
        rai raiVar = this.f;
        ((java.lang.Integer) obj2).intValue();
        int iIntValue = ((java.lang.Integer) obj).intValue();
        defpackage.eyc eycVar = (defpackage.eyc) raiVar.a;
        eycVar.L();
        eycVar.g.e(iIntValue, false);
        eycVar.h.e(21, new defpackage.ezr(iIntValue, 1));
    }
}
