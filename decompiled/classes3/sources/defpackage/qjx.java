package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qjx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amyz h;
    private final amzg i;

    public qjx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amyz amyzVar3, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.qjx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amyzVar3;
        this.i = amzs.b(amzgVar7);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(1);
        java.lang.CharSequence charSequenceAq = (java.lang.CharSequence) list.get(2);
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) list.get(3);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        rmt rmtVar = (rmt) list.get(5);
        android.content.Context context = (android.content.Context) list.get(6);
        if (rmtVar == rmt.f && ((java.lang.Boolean) this.h.a()).booleanValue() && optional2.isPresent()) {
            charSequenceAq = pez.aq(context, android.text.TextUtils.concat((java.lang.CharSequence) optional2.orElseThrow(), " • ", charSequenceAq));
        }
        defpackage.qig qigVar = new defpackage.qig();
        qigVar.c(defpackage.qio.BASIC);
        qigVar.d(optional);
        qigVar.e(j$.util.Optional.of(charSequence));
        qigVar.b(charSequenceAq);
        qigVar.a = charSequence2;
        qigVar.b = (byte) (qigVar.b | 16);
        return aiql.z(qigVar.a());
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
