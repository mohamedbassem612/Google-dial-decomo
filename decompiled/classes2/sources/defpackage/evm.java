package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class evm implements defpackage.evr {
    private final boolean a;
    private final java.util.ArrayList b = new java.util.ArrayList(1);
    private int c;
    private defpackage.evv d;

    protected evm(boolean z) {
        this.a = z;
    }

    @Override // defpackage.evr
    public /* synthetic */ java.util.Map e() {
        return java.util.Collections.EMPTY_MAP;
    }

    @Override // defpackage.evr
    public final void f(defpackage.ewm ewmVar) {
        ahvr.ci(ewmVar);
        java.util.ArrayList arrayList = this.b;
        if (arrayList.contains(ewmVar)) {
            return;
        }
        arrayList.add(ewmVar);
        this.c++;
    }

    protected final void g(int i) {
        defpackage.evv evvVar = this.d;
        java.lang.String str = eum.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((defpackage.ewm) this.b.get(i2)).a(evvVar, this.a, i);
        }
    }

    protected final void h() {
        defpackage.evv evvVar = this.d;
        java.lang.String str = eum.a;
        for (int i = 0; i < this.c; i++) {
            ((defpackage.ewm) this.b.get(i)).b(evvVar, this.a);
        }
        this.d = null;
    }

    protected final void i(defpackage.evv evvVar) {
        this.d = evvVar;
        for (int i = 0; i < this.c; i++) {
            ((defpackage.ewm) this.b.get(i)).d(evvVar, this.a);
        }
    }

    protected final void j() {
        for (int i = 0; i < this.c; i++) {
            ((defpackage.ewm) this.b.get(i)).c();
        }
    }
}
