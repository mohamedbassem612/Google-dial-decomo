package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class iri implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.iqp a;
    public final /* synthetic */ iqm b;
    public final /* synthetic */ aoin c;
    public final /* synthetic */ aoin d;

    public /* synthetic */ iri(defpackage.iqp iqpVar, iqm iqmVar, aoin aoinVar, aoin aoinVar2, int i) {
        this.$cid = i;
        this.a = iqpVar;
        this.b = iqmVar;
        this.c = aoinVar;
        this.d = aoinVar2;
    }

    public final boolean a() {
        int i = this.$cid;
        defpackage.iqp iqpVar = this.a;
        if (i != 0) {
            if (iqpVar.c() && !this.b.b() && !((java.lang.Boolean) this.c.a()).booleanValue() && !((java.lang.Boolean) this.d.a()).booleanValue()) {
                return true;
            }
        } else if (iqpVar.c() && !this.b.b() && (((java.lang.Boolean) this.c.a()).booleanValue() || ((java.lang.Boolean) this.d.a()).booleanValue())) {
            return true;
        }
        return false;
    }
}
