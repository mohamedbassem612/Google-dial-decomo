package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fmr implements defpackage.fma {
    final /* synthetic */ defpackage.fms a;
    private final long b;

    public fmr(defpackage.fms fmsVar, long j) {
        j$.util.Objects.requireNonNull(fmsVar);
        this.a = fmsVar;
        this.b = j;
    }

    @Override // defpackage.fma
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        defpackage.fms fmsVar = this.a;
        defpackage.fly flyVarB = fmsVar.a[0].b(j);
        int i = 1;
        while (true) {
            defpackage.fmv[] fmvVarArr = fmsVar.a;
            if (i >= fmvVarArr.length) {
                return flyVarB;
            }
            defpackage.fly flyVarB2 = fmvVarArr[i].b(j);
            if (flyVarB2.a.c < flyVarB.a.c) {
                flyVarB = flyVarB2;
            }
            i++;
        }
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return true;
    }
}
