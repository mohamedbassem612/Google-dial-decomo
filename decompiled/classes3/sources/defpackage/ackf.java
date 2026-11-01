package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackf extends aw {
    public static final aiof a = aiof.i("GnpSdk");
    public acxg ak;
    private ok al;
    public aoin b;
    public acal c;
    public java.lang.String d;
    public akgw e = akgw.a;

    public final void g(android.content.Context context) {
        super.g(context);
        try {
            java.lang.Object obj = defpackage.adxj.a(context).hc().get(defpackage.ackf.class);
            if (obj == null) {
                throw new java.lang.IllegalStateException("InternalFragmentInjector not found for PermissionRequestFragment");
            }
            java.lang.Object objA = ((aoin) obj).a();
            aooh.d(objA, "null cannot be cast to non-null type com.google.android.libraries.internal.growth.growthkit.inject.FragmentInjector<com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.permissionprompt.PermissionRequestFragment>");
            ((defpackage.abzv) objA).a(this);
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = dwz.b() ? (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) C().getParcelable("promo_context", com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext.class) : (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) C().getParcelable("promo_context");
            if (promoContext == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            akjx akjxVar = promoContext.c().h;
            if (akjxVar == null) {
                akjxVar = akjx.a;
            }
            if (akjxVar.c == 6) {
                akjx akjxVar2 = promoContext.c().h;
                if (akjxVar2 == null) {
                    akjxVar2 = akjx.a;
                }
                defpackage.akju akjuVar = akjxVar2.c == 6 ? (defpackage.akju) akjxVar2.d : defpackage.akju.a;
                aooh.e(akjuVar, "getPermissionUi(...)");
                defpackage.akjt akjtVar = akjuVar.e;
                if (akjtVar == null) {
                    akjtVar = defpackage.akjt.b;
                }
                java.lang.Object obj2 = new alam(akjtVar.c, defpackage.akjt.a).get(0);
                aooh.e(obj2, "get(...)");
                akgw akgwVar = (akgw) obj2;
                this.e = akgwVar;
                this.d = defpackage.abxl.x(akgwVar);
                this.al = O(new pa(), new defpackage.acke(this, promoContext, 0));
            }
        } catch (java.lang.RuntimeException e) {
            hgb.b(a.d(), "Failed to inject members.", e);
        }
    }

    public final void l() {
        ok okVar;
        super.l();
        java.lang.String str = this.d;
        if (str == null || (okVar = this.al) == null) {
            return;
        }
        okVar.b(str);
    }
}
