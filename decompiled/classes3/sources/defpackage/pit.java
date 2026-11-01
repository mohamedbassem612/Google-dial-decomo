package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pit implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ pit(android.os.Bundle bundle, android.os.Bundle bundle2, android.content.Context context, int i) {
        this.$cid = i;
        this.a = bundle;
        this.b = bundle2;
        this.c = context;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        boolean z;
        int i = this.$cid;
        if (i == 0) {
            return (pez.af((android.os.Bundle) this.a) || pez.af((android.os.Bundle) this.b)) ? j$.util.Optional.of(((android.content.Context) this.c).getString(2132017684)) : j$.util.Optional.empty();
        }
        if (i == 1) {
            if (!((j$.util.Optional) this.b).isPresent() || this.a != defpackage.zna.ALLOWED) {
                return j$.util.Optional.empty();
            }
            java.lang.String strE = ((defpackage.sql) this.c).e();
            return !android.text.TextUtils.isEmpty(strE) ? j$.util.Optional.of(strE) : j$.util.Optional.empty();
        }
        if (i != 2) {
            java.lang.Object obj = this.a;
            if (i != 3) {
                return ((vfr) this.b).c.j((android.telecom.PhoneAccountHandle) this.c, (defpackage.vcn) obj);
            }
            return ((zzx) obj).m() ? aiql.z(java.lang.Boolean.FALSE) : ahvr.H(((aogc) this.c).bk(), new defpackage.pqn(16), (java.util.concurrent.Executor) this.b);
        }
        j$.util.Optional optionalE = ((tkl) this.c).e();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (!((java.lang.Boolean) optionalE.orElse(bool)).booleanValue()) {
            return bool;
        }
        j$.util.Optional optional = (j$.util.Optional) this.b;
        if (optional.isPresent()) {
            java.lang.Object obj2 = this.a;
            defpackage.pzp pzpVar = (defpackage.pzp) optional.orElseThrow();
            aoin aoinVar = (aoin) ((defpackage.pzt) obj2).a.get(pzpVar);
            if (aoinVar == null) {
                throw new java.lang.AssertionError(java.lang.String.format("screen for %s is not bound", pzpVar.name()));
            }
            z = ((defpackage.pzs) aoinVar.a()).d();
        }
        return java.lang.Boolean.valueOf(z);
    }

    public /* synthetic */ pit(j$.util.Optional optional, defpackage.zna znaVar, defpackage.sql sqlVar, int i) {
        this.$cid = i;
        this.b = optional;
        this.a = znaVar;
        this.c = sqlVar;
    }

    public /* synthetic */ pit(tkl tklVar, j$.util.Optional optional, defpackage.pzt pztVar, int i) {
        this.$cid = i;
        this.c = tklVar;
        this.b = optional;
        this.a = pztVar;
    }

    public /* synthetic */ pit(vfr vfrVar, android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vcn vcnVar, int i) {
        this.$cid = i;
        this.b = vfrVar;
        this.c = phoneAccountHandle;
        this.a = vcnVar;
    }

    public /* synthetic */ pit(zzx zzxVar, aogc aogcVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.a = zzxVar;
        this.c = aogcVar;
        this.b = ajctVar;
    }
}
