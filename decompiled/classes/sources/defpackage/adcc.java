package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adcc implements defpackage.adbv {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.ahyn a;
    final /* synthetic */ android.content.Context b;

    public adcc(defpackage.ahyn ahynVar, android.content.Context context, int i) {
        this.$cid = i;
        this.a = ahynVar;
        this.b = context;
    }

    @Override // defpackage.adbv
    public final void a(java.lang.String str, int i) {
        if (this.$cid != 0) {
            if (i == 1) {
                defpackage.ahyn ahynVar = this.a;
                if (ahynVar.f()) {
                    defpackage.abrz.Z(this.b, (java.lang.Class) ahynVar.b(), str);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            defpackage.ahyn ahynVar2 = this.a;
            if (ahynVar2.f()) {
                defpackage.abrz.Z(this.b, (java.lang.Class) ahynVar2.b(), str);
            }
        }
    }

    @Override // defpackage.adbv
    public final void b(java.lang.String str, int i) {
        if (this.$cid != 0) {
            if (i == 0) {
                defpackage.ahyn ahynVar = this.a;
                if (ahynVar.f()) {
                    defpackage.abrz.aa(this.b, (java.lang.Class) ahynVar.b(), str);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 0) {
            defpackage.ahyn ahynVar2 = this.a;
            if (ahynVar2.f()) {
                defpackage.abrz.aa(this.b, (java.lang.Class) ahynVar2.b(), str);
            }
        }
    }
}
