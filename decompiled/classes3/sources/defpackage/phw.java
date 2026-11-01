package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class phw extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public phw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.phw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final j$.util.Optional optional = (j$.util.Optional) list.get(1);
        final defpackage.zna znaVar = (defpackage.zna) list.get(2);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        final ssq ssqVar = (ssq) list.get(5);
        return aiql.z((j$.util.Optional) ((mgu) list.get(6)).b(new java.util.function.Function() { // from class: phq
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                if (!zBooleanValue && !zBooleanValue2) {
                    j$.util.Optional optional2 = optional;
                    if (optional2.isPresent()) {
                        ssq ssqVar2 = ssqVar;
                        java.lang.String strB = (java.lang.String) optional2.orElseThrow();
                        amdxVar.a = "RawNumber";
                        if (!ssqVar2.f(strB)) {
                            defpackage.zna znaVar2 = znaVar;
                            android.content.Context context2 = context;
                            if (java.util.Arrays.asList(context2.getResources().getStringArray(2130903041)).contains(strB) && znaVar2 == defpackage.zna.ALLOWED) {
                                amdxVar.a = "Unknown";
                                strB = context2.getString(2132020648);
                            }
                            if (znaVar2 == defpackage.zna.ALLOWED) {
                                if (strB.equals("PRIVATE") || strB.equals("P") || strB.equals("RES") || strB.equals("PRIVATENUMBER") || strB.equals("anonymous")) {
                                    strB = ssqVar2.b();
                                    amdxVar.a = "NumberIsPrivate";
                                } else if (strB.equals("UNAVAILABLE") || strB.equals("UNKNOWN") || strB.equals("UNA") || strB.equals("U")) {
                                    strB = context2.getString(2132020648);
                                    amdxVar.a = "NumberIsUnknown";
                                }
                            }
                        }
                        return j$.util.Optional.ofNullable(strB);
                    }
                }
                amdxVar.a = "empty";
                return j$.util.Optional.empty();
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.bG));
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
