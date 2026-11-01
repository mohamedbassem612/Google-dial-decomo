package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uon extends aoof implements aomy {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, boolean[][] zArr) {
        super(0, obj, fh$.ExternalSyntheticApiModelOutline0.m(), "get", "get()Ljava/lang/Object;", 0);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                defpackage.uoo uooVar = (defpackage.uoo) this.e;
                java.lang.String[] strArr = defpackage.uoo.a;
                unc uncVarB = uooVar.b();
                unc uncVar = uncVarB instanceof unc ? uncVarB : null;
                if (uncVar != null) {
                    uooVar.j.o(uncVar.b ? rmx.rS : rmx.rR);
                }
                umx umxVar = uooVar.c;
                umxVar.h.s(aosv.F(umxVar.c, 0, new defpackage.txf(umxVar, (aoln) null, 20, (byte[]) null), 3), umx.a);
                return aojh.a;
            case 1:
                defpackage.uoo uooVar2 = (defpackage.uoo) this.e;
                java.lang.String[] strArr2 = defpackage.uoo.a;
                uooVar2.q.b(defpackage.uoo.a);
                return aojh.a;
            case 2:
                defpackage.uoo uooVar3 = (defpackage.uoo) this.e;
                java.lang.String[] strArr3 = defpackage.uoo.a;
                uooVar3.j.o(rmx.rU);
                uooVar3.v.a();
                return aojh.a;
            case 3:
                defpackage.uoo uooVar4 = (defpackage.uoo) this.e;
                java.lang.String[] strArr4 = defpackage.uoo.a;
                unc uncVarB2 = uooVar4.b();
                unc uncVar2 = uncVarB2 instanceof unc ? uncVarB2 : null;
                if (uncVar2 != null) {
                    uooVar4.j.o(rmx.rT);
                    aoov.an(uooVar4.g, (aolr) null, 0, new defpackage.ufr(uooVar4, uncVar2.a, (aoln) null, 17), 3);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.uzk uzkVar = (defpackage.uzk) this.e;
                uzkVar.b.o(rmx.sl);
                android.content.Context context = uzkVar.a;
                android.content.Intent flags = new android.content.Intent("com.google.android.contacts.action.BESTIES_WIDGET_DIALER_MARQUEE_ENTRYPOINT_ACTIVITY").setFlags(268435456);
                aooh.e(flags, "setFlags(...)");
                ahqx.l(context, flags);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((android.app.Activity) this.e).getComponentName();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return java.lang.Boolean.valueOf(((android.app.Activity) this.e).isFinishing());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((mp) this.e).getComponentName();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return java.lang.Boolean.valueOf(((mp) this.e).isFinishing());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((android.app.Activity) this.e).getComponentName();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return java.lang.Boolean.valueOf(((android.app.Activity) this.e).isFinishing());
            default:
                return (defpackage.xmb) aa$.ExternalSyntheticApiModelOutline1.m(fh$.ExternalSyntheticApiModelOutline0.m(this.e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i) {
        super(0, obj, defpackage.uoo.class, "toggleHideContacts", "toggleHideContacts()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, char[] cArr) {
        super(0, obj, defpackage.uoo.class, "viewAllContacts", "viewAllContacts()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, short[] sArr) {
        super(0, obj, defpackage.uoo.class, "onDrop", "onDrop()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, int[] iArr) {
        super(0, obj, defpackage.uzk.class, "openVipOnboarding", "openVipOnboarding$third_party_java_src_android_app_dialer_java_com_android_dialer_vip_impl_marquee_promo()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, boolean[] zArr) {
        super(0, obj, android.app.Activity.class, "getComponentName", "getComponentName()Landroid/content/ComponentName;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, float[] fArr) {
        super(0, obj, android.app.Activity.class, "isFinishing", "isFinishing()Z", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, byte[][] bArr) {
        super(0, obj, mp.class, "getComponentName", "getComponentName()Landroid/content/ComponentName;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, char[][] cArr) {
        super(0, obj, mp.class, "isFinishing", "isFinishing()Z", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(java.lang.Object obj, int i, byte[] bArr) {
        super(0, obj, defpackage.uoo.class, "onAddPermissionsClicked", "onAddPermissionsClicked()V", 0);
        this.$cid = i;
    }
}
