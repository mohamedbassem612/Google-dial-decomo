package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajce extends ajac {
    private defpackage.ajcf a;

    public ajce(defpackage.ajcf ajcfVar) {
        this.a = ajcfVar;
    }

    protected final void a() {
        this.a = null;
    }

    protected final java.lang.String b() {
        defpackage.ajcf ajcfVar = this.a;
        if (ajcfVar == null) {
            return null;
        }
        ajcq[] ajcqVarArr = ajcfVar.d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = ajcfVar.c;
        return "inputCount=[" + ajcqVarArr.length + "], remaining=[" + atomicInteger.get() + ']';
    }

    public final boolean cancel(boolean z) {
        defpackage.ajcf ajcfVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        defpackage.ajcf ajcfVar2 = (defpackage.ajcf) j$.util.Objects.requireNonNull(ajcfVar);
        ajcfVar2.a = true;
        if (!z) {
            ajcfVar2.b = false;
        }
        ajcfVar2.a();
        return true;
    }
}
