package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sza extends amzm {
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

    public sza(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10) {
        super(amyzVar2, new defpackage.amzw(defpackage.sza.class), amyzVar);
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
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        lgj lgjVar = (lgj) list.get(0);
        rsr rsrVar = (rsr) list.get(1);
        java.lang.Object obj2 = (java.lang.CharSequence) list.get(2);
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        defpackage.zna znaVar = (defpackage.zna) list.get(4);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(5);
        ajct ajctVar = (ajct) list.get(6);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(7)).booleanValue();
        if (optional.isPresent() && (lgjVar == lgj.e || lgjVar == lgj.d)) {
            return aiql.z(((defpackage.tan) optional.orElseThrow()).d);
        }
        if (lgjVar != lgj.c && lgjVar != lgj.d) {
            return ahvr.H(this.e.d(), new defpackage.syf(5), ajctVar);
        }
        if (zBooleanValue && android.os.Build.VERSION.SDK_INT >= 31) {
            return this.k.d();
        }
        j$.util.Optional optionalQ = rsrVar.q(znaVar);
        if (optionalQ.isPresent()) {
            return aiql.z((java.lang.CharSequence) optionalQ.orElseThrow());
        }
        if (optional2.isPresent()) {
            obj2 = java.lang.String.valueOf(obj2) + " • " + ((java.lang.String) optional2.orElseThrow());
        }
        return aiql.z(obj2);
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
