package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class umd {
    public static final aimz a = aimz.i("com/android/dialer/spamnotification/impl/ui/SpamNotificationFragmentPeer");
    public final defpackage.ulz b;
    public final aoss c;
    public final defpackage.uly d;
    public final rwi e;
    public final defpackage.uhp f;
    public defpackage.uks g;
    public final defpackage.umc h;
    public final defpackage.ujp i;
    public final ajwr j;
    public final defpackage.uyg k;

    public umd(defpackage.ulz ulzVar, aoss aossVar, defpackage.uly ulyVar, defpackage.uyg uygVar, defpackage.ujp ujpVar, ajwr ajwrVar, rwi rwiVar, defpackage.uhp uhpVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajwrVar, "subscriptionMixin");
        aooh.f(rwiVar, "notificationManager");
        this.b = ulzVar;
        this.c = aossVar;
        this.d = ulyVar;
        this.k = uygVar;
        this.i = ujpVar;
        this.j = ajwrVar;
        this.e = rwiVar;
        this.f = uhpVar;
        this.h = new defpackage.umc(this);
    }

    public final void a() {
        aimz aimzVar = zih.a;
        aoov.al(this.c, zih.b.plus(aols.a), 1, new defpackage.uke((aoln) null, this, 4, (byte[]) null));
    }

    public final void b(rmw rmwVar) {
        defpackage.ulz ulzVar = this.b;
        defpackage.uku ukuVar = ulzVar.d;
        if (ukuVar == null) {
            ukuVar = defpackage.uku.a;
        }
        java.lang.String str = ukuVar.e;
        aooh.e(str, "getUniqueCallId(...)");
        defpackage.uku ukuVar2 = ulzVar.d;
        if (ukuVar2 == null) {
            ukuVar2 = defpackage.uku.a;
        }
        this.i.a(rmwVar, str, ukuVar2.f);
    }

    public final void c(defpackage.ult ultVar) {
        defpackage.ulu uluVar = new defpackage.ulu();
        amxr.g(uluVar);
        ahgl.b(uluVar, ultVar);
        uluVar.r(this.d.I(), "SpamNotificationDialogFragment");
    }

    public final void d(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("phone", str);
        defpackage.uly ulyVar = this.d;
        afsq.G(ulyVar, intent);
        ulyVar.H().finish();
    }
}
