package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjf extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amyz k;

    public pjf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        final boolean zBooleanValue4 = ((java.lang.Boolean) list.get(3)).booleanValue();
        final j$.util.Optional optional = (j$.util.Optional) list.get(4);
        final boolean zBooleanValue5 = ((java.lang.Boolean) list.get(5)).booleanValue();
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(6);
        mgu mguVar = (mgu) list.get(7);
        final boolean zBooleanValue6 = ((java.lang.Boolean) list.get(8)).booleanValue();
        final amyz amyzVar = this.k;
        java.lang.Boolean bool = (java.lang.Boolean) mguVar.a(new java.util.function.Supplier() { // from class: pim
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                boolean z = true;
                if (zBooleanValue5) {
                    j$.util.Optional optionalOfNullable = optional;
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(!((android.os.PersistableBundle) optionalOfNullable.get()).getBoolean("rtt_upgrade_supported_for_downgraded_vt_call")));
                    }
                    java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                    if (((java.lang.Boolean) optionalOfNullable.orElse(bool2)).booleanValue()) {
                        return bool2;
                    }
                }
                if (!zBooleanValue || zBooleanValue2 || zBooleanValue3 || zBooleanValue4 || zBooleanValue6 || (((java.lang.Boolean) amyzVar.a()).booleanValue() && !((java.lang.Boolean) optional2.orElse(java.lang.Boolean.TRUE)).booleanValue())) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }).a(mfy.ba).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.e;
        amzg amzgVar7 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
