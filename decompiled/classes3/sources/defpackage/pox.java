package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pox extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public pox(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.pox.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.CharSequence charSequenceAq;
        defpackage.pok pokVar;
        java.util.List list = (java.util.List) obj;
        int i = 0;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        java.lang.String str = (java.lang.String) optional.orElse((java.lang.Object) null);
        if (android.text.TextUtils.isEmpty(str)) {
            charSequenceAq = null;
        } else {
            charSequenceAq = pez.aq(context, str);
            i = 1;
        }
        defpackage.pmp pmpVar = (defpackage.pmp) optional2.orElse((java.lang.Object) null);
        int i2 = i | 2;
        if (zBooleanValue || zBooleanValue2) {
            i2 = i | 6;
            pokVar = new defpackage.pok(abja.gn);
        } else {
            pokVar = null;
        }
        int i3 = ~i2;
        if (1 == (i3 & 1)) {
            charSequenceAq = null;
        }
        if ((i3 & 2) != 0) {
            pmpVar = null;
        }
        return aiql.z(new defpackage.poj(charSequenceAq, pmpVar, (i3 & 4) == 0 ? pokVar : null));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
