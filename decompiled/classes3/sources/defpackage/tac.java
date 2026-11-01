package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tac extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public tac(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.tac.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        defpackage.abwd abwdVar = (defpackage.abwd) list.get(2);
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        defpackage.tjw tjwVar = new defpackage.tjw((byte[]) null);
        tjwVar.c(defpackage.abwd.a);
        if (str == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        tjwVar.a = str;
        tjwVar.c(abwdVar);
        java.lang.String string = context.getString(2132020657);
        if (string == null) {
            throw new java.lang.NullPointerException("Null callerSaidText");
        }
        tjwVar.d = string;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null summaryText");
        }
        tjwVar.c = optional;
        java.lang.Object obj4 = tjwVar.a;
        if (obj4 != null && (obj2 = tjwVar.b) != null && (obj3 = tjwVar.d) != null) {
            return aiql.z(j$.util.Optional.of(new defpackage.tao((java.lang.String) obj4, (defpackage.abwd) obj2, (java.lang.String) obj3, (j$.util.Optional) tjwVar.c)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (tjwVar.a == null) {
            sb.append(" callId");
        }
        if (tjwVar.b == null) {
            sb.append(" photoInfo");
        }
        if (tjwVar.d == null) {
            sb.append(" callerSaidText");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
