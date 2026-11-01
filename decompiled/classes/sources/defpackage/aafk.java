package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aafk implements java.lang.Runnable {
    private final /* synthetic */ int $cid;

    public aafk(defpackage.aiul aiulVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aiulVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 1) {
            defpackage.adq adqVar = defpackage.deg.G;
            synchronized (adqVar) {
                java.lang.Object[] objArr = adqVar.a;
                int i2 = adqVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    defpackage.deg degVar = (defpackage.deg) objArr[i3];
                    degVar.post(new jd(degVar, 19, (byte[]) null));
                }
            }
            return;
        }
        if (i == 2) {
            defpackage.aexb.e();
            return;
        }
        if (i == 4) {
            defpackage.ahns.k = null;
            return;
        }
        if (i == 5) {
            java.lang.Object objRemove = defpackage.ahns.e.remove();
            if (objRemove == defpackage.ahns.g) {
                defpackage.ahns.f.pop();
            } else {
                defpackage.ahns.f.push((defpackage.ahpj) objRemove);
            }
        }
    }

    public /* synthetic */ aafk(int i) {
        this.$cid = i;
    }
}
