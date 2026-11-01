package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aisy implements java.util.function.Supplier {
    int a;
    final /* synthetic */ java.util.Iterator b;
    final /* synthetic */ java.lang.String c;

    public aisy(defpackage.aisz aiszVar, java.util.Iterator it, java.lang.String str) {
        this.b = it;
        this.c = str;
        j$.util.Objects.requireNonNull(aiszVar);
        this.a = 0;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        if (this.a == -1) {
            return null;
        }
        java.util.Iterator it = this.b;
        if (!it.hasNext()) {
            java.lang.String str = this.c;
            int i = this.a;
            defpackage.aisu aisuVarB = defpackage.aisu.b(str, i, str.length() - i);
            this.a = -1;
            return aisuVarB;
        }
        defpackage.aisu aisuVar = (defpackage.aisu) it.next();
        java.lang.String str2 = this.c;
        int i2 = this.a;
        defpackage.aisu aisuVarB2 = defpackage.aisu.b(str2, i2, aisuVar.b - i2);
        this.a = aisuVar.c;
        return aisuVarB2;
    }
}
