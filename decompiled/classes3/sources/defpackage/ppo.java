package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ppo extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public ppo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.ppo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0053  */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        boolean z;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        long jLongValue = ((java.lang.Long) list.get(4)).longValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(5);
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        if (optional.isPresent()) {
            j$.util.Optional optional2 = ((omy) optional.orElseThrow()).b;
            if (optional2.isPresent()) {
                optionalEmpty = optional2;
                z = true;
            } else {
                z = zBooleanValue;
            }
        } else {
            z = zBooleanValue;
        }
        defpackage.pnh pnhVar = new defpackage.pnh(context, 8);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(pez.aq((android.content.Context) pnhVar.a, (java.lang.CharSequence) optionalOfNullable.get()));
        }
        return aiql.z(new defpackage.pol((java.lang.CharSequence) optionalOfNullable.orElse((java.lang.Object) null), z, (java.lang.Integer) optionalEmpty.orElse((java.lang.Object) null), zBooleanValue2, jLongValue));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
