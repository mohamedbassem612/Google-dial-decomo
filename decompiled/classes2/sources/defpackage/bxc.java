package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bxc implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bxc(int i, java.lang.Object obj, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v21, types: [cer, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                cmw cmwVar = defpackage.bxd.a;
                ((czb) obj).s((czc) this.b, 0, -this.a, 0.0f);
                return aojh.a;
            case 1:
                cmw cmwVar2 = defpackage.bxd.a;
                ((czb) obj).s((czc) this.b, -this.a, 0, 0.0f);
                return aojh.a;
            case 2:
                return java.lang.Boolean.valueOf(((java.util.List) obj).addAll(this.a, this.b));
            case 3:
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((cpg) obj).i(this.a));
                aoot aootVar = (aoot) this.b;
                aootVar.a = boolValueOf;
                java.lang.Boolean bool = (java.lang.Boolean) aootVar.a;
                bool.booleanValue();
                return bool;
            case 4:
                return java.lang.Boolean.valueOf(((defpackage.hcb) this.b).o(this.a, ((java.lang.Long) obj).longValue()));
            case 5:
                apqr apqrVar = (apqr) obj;
                aooh.f(apqrVar, "primaryCallScope");
                zas zasVarI = ((rzu) this.b).b.i((java.lang.String) apqrVar.b);
                int i = this.a;
                if (i == 3 || i == 4) {
                    zasVarI.b(mce.hB);
                }
                return aojh.a;
            case 6:
                cra craVar = (cra) obj;
                int i2 = this.a;
                ajb ajbVar = abeb.a;
                aooh.f(craVar, "$this$graphicsLayer");
                ?? r4 = this.b;
                craVar.w(((java.lang.Number) r4.a()).floatValue());
                craVar.x(((java.lang.Number) r4.a()).floatValue());
                craVar.B(abeb.a(i2));
                return aojh.a;
            default:
                gjh gjhVar = (gjh) obj;
                gin ginVarA = gjhVar.a("DELETE FROM gnp_accounts WHERE account_type = ? AND account_specific_id = ?");
                try {
                    ginVarA.h(1, agab.bI(this.a));
                    java.lang.Object obj2 = this.b;
                    if (obj2 == null) {
                        ginVarA.i(2);
                    } else {
                        ginVarA.j(2, (java.lang.String) obj2);
                    }
                    ginVarA.m();
                    return java.lang.Integer.valueOf(dez.i(gjhVar));
                } finally {
                    ginVarA.close();
                }
        }
    }

    public /* synthetic */ bxc(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }
}
