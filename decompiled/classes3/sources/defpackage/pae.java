package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pae extends amzm {
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
    private final amzg m;
    private final amzg n;

    public pae(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13) {
        super(amyzVar2, new defpackage.amzw(defpackage.pae.class), amyzVar);
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
        this.m = amzs.b(amzgVar12);
        this.n = amzs.b(amzgVar13);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        aify aifyVar = (aify) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(3);
        defpackage.pab pabVar = (defpackage.pab) list.get(4);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(5)).booleanValue();
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(6);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(7)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(8)).booleanValue();
        jxs jxsVar = (jxs) list.get(9);
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(10)).booleanValue();
        defpackage.pom pomVar = (defpackage.pom) list.get(11);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(12);
        j$.util.Optional.empty();
        j$.util.Optional.empty();
        j$.util.Optional.empty();
        if (str == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null chips");
        }
        if (optional == null) {
            throw new java.lang.NullPointerException("Null selectedCenterFragmentKey");
        }
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null selectedFeatureIndicatorLabel");
        }
        if (pabVar == null) {
            throw new java.lang.NullPointerException("Null statusBarTheme");
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qdg) optionalOfNullable.get()).c));
        }
        boolean zBooleanValue5 = ((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue();
        if (jxsVar == null) {
            throw new java.lang.NullPointerException("Null locationModel");
        }
        if (pomVar == null) {
            throw new java.lang.NullPointerException("Null contactGridDataModel");
        }
        if (optional3 != null) {
            return aiql.z(j$.util.Optional.of(new defpackage.pac(aifyVar, str, optional, optional2, pabVar, zBooleanValue, zBooleanValue2, zBooleanValue5, jxsVar, zBooleanValue3, zBooleanValue4, pomVar, optional3)));
        }
        throw new java.lang.NullPointerException("Null callBackground");
    }

    protected final ajcq c() {
        amzg amzgVar = this.n;
        amzg amzgVar2 = this.m;
        amzg amzgVar3 = this.l;
        amzg amzgVar4 = this.k;
        amzg amzgVar5 = this.j;
        amzg amzgVar6 = this.i;
        amzg amzgVar7 = this.h;
        amzg amzgVar8 = this.g;
        amzg amzgVar9 = this.f;
        amzg amzgVar10 = this.e;
        amzg amzgVar11 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
