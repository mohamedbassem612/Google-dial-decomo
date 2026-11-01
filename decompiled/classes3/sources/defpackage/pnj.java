package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pnj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;

    public pnj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11) {
        super(amyzVar2, new defpackage.amzw(defpackage.pnj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amzs.b(amzgVar11);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(0);
        android.content.Context context = (android.content.Context) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(4)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(5);
        long jLongValue = ((java.lang.Long) list.get(6)).longValue();
        ((java.lang.Boolean) list.get(7)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(8)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(9);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(10);
        boolean z = zpoVar == defpackage.zpo.d && zBooleanValue2;
        boolean z2 = optional.isPresent() || zBooleanValue3;
        defpackage.pnh pnhVar = new defpackage.pnh(context, 0);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(pez.aq((android.content.Context) pnhVar.a, (java.lang.CharSequence) optionalOfNullable.get()));
        }
        return aiql.z(new defpackage.pog((java.lang.CharSequence) optionalOfNullable.orElse((java.lang.Object) null), (java.lang.CharSequence) optional2.orElse((java.lang.Object) null), zBooleanValue4, zBooleanValue, z2, z, jLongValue));
    }

    protected final ajcq c() {
        amzg amzgVar = this.l;
        amzg amzgVar2 = this.k;
        amzg amzgVar3 = this.j;
        amzg amzgVar4 = this.i;
        amzg amzgVar5 = this.h;
        amzg amzgVar6 = this.g;
        amzg amzgVar7 = this.f;
        amzg amzgVar8 = this.e;
        amzg amzgVar9 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
