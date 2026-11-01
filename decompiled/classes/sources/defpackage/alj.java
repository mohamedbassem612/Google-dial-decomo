package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alj implements defpackage.cbm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public alj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.cbm
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.alg) this.a).k();
            return;
        }
        if (i == 1) {
            java.lang.Object obj = ((defpackage.aiyy) this.a).a;
            if (obj == null) {
                throw new java.lang.IllegalStateException("Launcher has not been initialized");
            }
            ((defpackage.ok) obj).a();
            return;
        }
        if (i == 2) {
            ((defpackage.bdw) this.a).d = null;
            return;
        }
        java.lang.Object obj2 = this.a;
        if (i != 3) {
            defpackage.bek bekVar = (defpackage.bek) obj2;
            bekVar.d = true;
            bekVar.c = 0;
            bekVar.b();
            return;
        }
        defpackage.beo beoVar = (defpackage.beo) obj2;
        defpackage.apkl apklVar = beoVar.f;
        if (apklVar != null) {
            apklVar.a = false;
        }
        beoVar.f = null;
    }
}
