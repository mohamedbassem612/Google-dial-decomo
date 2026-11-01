package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;

    public pjj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final j$.util.Optional optional = (j$.util.Optional) list.get(2);
        final j$.util.Optional optional2 = (j$.util.Optional) list.get(3);
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(4)).booleanValue();
        final j$.util.Optional optional3 = (j$.util.Optional) list.get(5);
        final android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) list.get(6);
        final j$.util.Optional optional4 = (j$.util.Optional) list.get(7);
        return aiql.z((j$.util.Optional) ((mgu) list.get(8)).b(new java.util.function.Function() { // from class: pip
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj2) {
                defpackage.amdx amdxVar = (defpackage.amdx) obj2;
                j$.util.Optional optional5 = optional3;
                android.content.pm.PackageManager packageManager2 = packageManager;
                if (zBooleanValue) {
                    android.content.Context context2 = context;
                    j$.util.Optional optionalOfNullable = optional;
                    amdxVar.a = "SharedData";
                    nzu nzuVar = new nzu(context2, 20);
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = j$.util.Optional.ofNullable(((android.content.Context) nzuVar.a).getString(2132020097, (java.lang.String) optionalOfNullable.get()));
                    }
                    return j$.util.Optional.of((java.lang.String) optionalOfNullable.orElse(context2.getString(2132020096)));
                }
                j$.util.Optional optionalOfNullable2 = optional2;
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((android.telecom.StatusHints) optionalOfNullable2.get()).getLabel());
                }
                if (true == optionalOfNullable2.isPresent() && android.text.TextUtils.isEmpty((java.lang.CharSequence) optionalOfNullable2.get())) {
                    optionalOfNullable2 = j$.util.Optional.empty();
                }
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((java.lang.CharSequence) optionalOfNullable2.get()).toString());
                }
                if (optionalOfNullable2.isPresent()) {
                    amdxVar.a = "StatusHint";
                    return optionalOfNullable2;
                }
                if (!zBooleanValue2) {
                    j$.util.Optional optional6 = optional4;
                    amdxVar.a = "CallProvider";
                    return optional6;
                }
                try {
                    android.content.pm.ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(((android.telecom.GatewayInfo) optional5.orElseThrow()).getGatewayProviderPackageName(), 0);
                    amdxVar.a = "Gateway";
                    return j$.util.Optional.of(packageManager2.getApplicationLabel(applicationInfo).toString());
                } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.SecurityException e) {
                    amdxVar.a = "GatewayNotFound";
                    a.bq(defpackage.piz.a.c(), "Gateway Application Not Found.", "com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceConnectionLabel", (char) 816, "CallInfoProducerModule.java", e, zct.b);
                    return j$.util.Optional.empty();
                }
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).a(mfy.bb));
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.f;
        amzg amzgVar6 = this.e;
        amzg amzgVar7 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
