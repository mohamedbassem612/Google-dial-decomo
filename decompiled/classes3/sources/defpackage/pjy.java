package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjy extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public pjy(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjy.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.plq plqVarA;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(3);
        java.lang.String str = (java.lang.String) list.get(4);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(5)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(6)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(7)).booleanValue();
        if (optional.isPresent()) {
            plqVarA = defpackage.plq.a(optional, 3);
        } else if (optional2.isPresent() && (!zBooleanValue || zBooleanValue3)) {
            plqVarA = zBooleanValue2 ? defpackage.plq.a(j$.util.Optional.of(context.getString(2132020648)), 4) : defpackage.plq.a(optional2, 4);
        } else if (optionalOfNullable.isPresent()) {
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(dxt.a().d((java.lang.String) optionalOfNullable.get(), dxv.a));
            }
            plqVarA = defpackage.plq.a(optionalOfNullable, 2);
        } else {
            plqVarA = defpackage.plq.a(j$.util.Optional.of(str), 5);
        }
        return aiql.z(plqVarA);
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.f;
        amzg amzgVar5 = this.e;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
