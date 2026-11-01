package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jwp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amyz g;
    private final amzg h;
    private final amyz i;
    private final amzg j;

    public jwp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amyz amyzVar3, amzg amzgVar6, amyz amyzVar4, amzg amzgVar7) {
        super(amyzVar2, new amzw(defpackage.jwp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amyzVar3;
        this.h = amzs.b(amzgVar6);
        this.i = amyzVar4;
        this.j = amzs.b(amzgVar7);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.content.Context context = (android.content.Context) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final j$.util.Optional optional = (j$.util.Optional) list.get(2);
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(4)).booleanValue();
        final long jLongValue = ((java.lang.Long) list.get(5)).longValue();
        final ajct ajctVar = (ajct) list.get(6);
        final amyz amyzVar = this.i;
        final amyz amyzVar2 = this.g;
        return aiql.z(uyg.J(new ajas() { // from class: jwm
            public final ajcq a() {
                final boolean z = zBooleanValue;
                final j$.util.Optional optional2 = optional;
                final aoin aoinVar = amyzVar;
                final long j = jLongValue;
                final android.content.Context context2 = context;
                final boolean z2 = zBooleanValue2;
                final aoin aoinVar2 = amyzVar2;
                final boolean z3 = zBooleanValue3;
                return ahvr.F(new java.util.concurrent.Callable() { // from class: jwl
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        android.content.Context context3 = context2;
                        long j2 = j;
                        aoin aoinVar3 = aoinVar;
                        if (z) {
                            j$.util.Optional optional3 = optional2;
                            if (optional3.isPresent() && ((android.os.PersistableBundle) optional3.orElseThrow()).getBoolean("display_hd_plus_icon_bool", false)) {
                                ((kgl) aoinVar3.a()).d(j2, 3);
                                pmm pmmVar = new pmm();
                                pmmVar.e(pms.c);
                                pmmVar.c(defpackage.hmr.f(context3, 2131231054));
                                pmmVar.d(2131231054);
                                pmmVar.b(context3.getString(2132018105));
                                return j$.util.Optional.of(pmmVar.a());
                            }
                        }
                        if (!z2) {
                            if (!z3) {
                                return j$.util.Optional.empty();
                            }
                            ((kgl) aoinVar3.a()).d(j2, 1);
                            pmm pmmVar2 = new pmm();
                            pmmVar2.e(pms.c);
                            pmmVar2.c(defpackage.hmr.f(context3, 2131231450));
                            pmmVar2.d(2131231450);
                            pmmVar2.b(context3.getString(2132018104));
                            return j$.util.Optional.of(pmmVar2.a());
                        }
                        aoin aoinVar4 = aoinVar2;
                        ((kgl) aoinVar3.a()).d(j2, 2);
                        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) aoinVar4.a();
                        pmm pmmVar3 = new pmm();
                        pmmVar3.e(pms.c);
                        pmmVar3.c(drawable);
                        pmmVar3.a = 0.5f;
                        pmmVar3.b = (byte) (pmmVar3.b | 16);
                        pmmVar3.d(2131231450);
                        pmmVar3.b(context3.getString(2132018104));
                        return j$.util.Optional.of(pmmVar3.a());
                    }
                }, ajctVar);
            }
        }));
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
