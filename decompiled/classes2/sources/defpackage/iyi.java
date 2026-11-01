package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyi {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer");
    private static final defpackage.iyd x = new defpackage.iyd();
    private final ahey A;
    private final ok B;
    public final defpackage.iyc b;
    public final ixt c;
    public final agzc d;
    public final defpackage.iyy e;
    public final defpackage.iys f;
    public final agtj g;
    public final odp h;
    public final aoss i;
    public final aoin j;
    public final aoin k;
    public final ccp l;
    public ahak m;
    public boolean n;
    public boolean o;
    public boolean p;
    public java.lang.String q;
    public final agza r;
    public final defpackage.iyg s;
    public final defpackage.iye t;
    public final defpackage.iyf u;
    public final cop v;
    public final aais w;
    private final defpackage.odo y;
    private final rlv z;

    public iyi(defpackage.iyc iycVar, ixt ixtVar, agzc agzcVar, defpackage.iyy iyyVar, defpackage.iys iysVar, defpackage.odo odoVar, agtj agtjVar, odp odpVar, aoss aossVar, rlv rlvVar, aoin aoinVar, aais aaisVar, ahey aheyVar, cop copVar, aoin aoinVar2) {
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableGreetingsV2");
        aooh.f(copVar, "audioPlayback");
        this.b = iycVar;
        this.c = ixtVar;
        this.d = agzcVar;
        this.e = iyyVar;
        this.f = iysVar;
        this.y = odoVar;
        this.g = agtjVar;
        this.h = odpVar;
        this.i = aossVar;
        this.z = rlvVar;
        this.j = aoinVar;
        this.w = aaisVar;
        this.A = aheyVar;
        this.v = copVar;
        this.k = aoinVar2;
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.ixu.a, cdu.c);
        this.n = true;
        this.o = true;
        this.B = iycVar.O(x, new defpackage.kse(this, 1));
        this.r = odoVar.b(new defpackage.iyh(this, 0), false);
        this.s = new defpackage.iyg(this);
        this.t = new defpackage.iye(this);
        this.u = new defpackage.iyf(this);
    }

    public final java.util.List a(ixh ixhVar) {
        defpackage.jab jabVar;
        aokv aokvVar = new aokv(10);
        alat alatVar = ixhVar.e;
        aooh.e(alatVar, "getBeeslyGreetingsList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
        boolean z = false;
        for (java.util.Iterator it = alatVar.iterator(); it.hasNext(); it = it) {
            defpackage.ixd ixdVar = (defpackage.ixd) it.next();
            z |= ixdVar.b == 2;
            aooh.c(ixdVar);
            defpackage.iyc iycVar = this.b;
            ahey aheyVar = this.A;
            android.content.Context contextA = iycVar.A();
            java.lang.String str = ixhVar.d;
            java.lang.String str2 = this.q;
            brg brgVar = new brg(this, 16);
            aooh.f(ixdVar, "<this>");
            int iOrdinal = defpackage.ixc.a(ixdVar.b).ordinal();
            if (iOrdinal == 0) {
                defpackage.ixe ixeVar = ixdVar.b == 1 ? (defpackage.ixe) ixdVar.c : defpackage.ixe.a;
                aooh.e(ixeVar, "getBotGreeting(...)");
                defpackage.ixc ixcVar = defpackage.ixc.a;
                java.lang.Object objA = brgVar.a(ixcVar, ixdVar);
                java.lang.String str3 = ixeVar.b;
                aooh.e(str3, "getId(...)");
                java.lang.String string = contextA.getString(2132017507);
                aooh.e(string, "getString(...)");
                java.lang.String str4 = ixeVar.d;
                aooh.e(str4, "getLocalAudioUri(...)");
                long j = ixeVar.e;
                boolean zN = aooh.n(ixeVar.b, str);
                aomy aomyVar = ((defpackage.izx) objA).a;
                defpackage.heq heqVarT = defpackage.hgz.t(defpackage.ied.a.m());
                java.lang.String str5 = ixeVar.d;
                aooh.e(str5, "getLocalAudioUri(...)");
                heqVarT.H(str5);
                long j2 = aorh.a;
                heqVarT.F(aorh.g(aooh.B(ixeVar.e, aorj.d)));
                heqVarT.E(defpackage.iec.BEESLY_CUSTOM_GREETING);
                jabVar = new defpackage.jab(str3, string, str4, j, zN, ixcVar, aomyVar, new defpackage.eli(13), new defpackage.eli(14), new defpackage.izp(heqVarT.D(), aheyVar), false);
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new aois();
                    }
                    defpackage.ixc ixcVarA = defpackage.ixc.a(ixdVar.b);
                    java.util.Objects.toString(ixcVarA);
                    throw new java.lang.IllegalStateException("toUiModel - Unknown greeting type: ".concat(java.lang.String.valueOf(ixcVarA)));
                }
                defpackage.ixf ixfVar = ixdVar.b == 2 ? (defpackage.ixf) ixdVar.c : defpackage.ixf.a;
                aooh.e(ixfVar, "getCustomGreeting(...)");
                defpackage.ixc ixcVar2 = defpackage.ixc.b;
                java.lang.Object objA2 = brgVar.a(ixcVar2, ixdVar);
                java.lang.String str6 = ixfVar.b;
                aooh.e(str6, "getId(...)");
                java.lang.String str7 = ixfVar.e;
                aooh.e(str7, "getName(...)");
                java.lang.String str8 = ixfVar.c;
                aooh.e(str8, "getLocalAudioUri(...)");
                long j3 = ixfVar.d;
                boolean zN2 = aooh.n(ixfVar.b, str);
                defpackage.izx izxVar = (defpackage.izx) objA2;
                aomy aomyVar2 = izxVar.a;
                aomy aomyVar3 = izxVar.b;
                aomy aomyVar4 = izxVar.c;
                defpackage.heq heqVarT2 = defpackage.hgz.t(defpackage.ied.a.m());
                java.lang.String str9 = ixfVar.c;
                aooh.e(str9, "getLocalAudioUri(...)");
                heqVarT2.H(str9);
                long j4 = aorh.a;
                heqVarT2.F(aorh.g(aooh.B(ixfVar.d, aorj.d)));
                heqVarT2.E(defpackage.iec.BEESLY_CUSTOM_GREETING);
                jabVar = new defpackage.jab(str6, str7, str8, j3, zN2, ixcVar2, aomyVar2, aomyVar3, aomyVar4, new defpackage.izp(heqVarT2.D(), aheyVar), aooh.n(ixfVar.b, str2));
            }
            arrayList.add(jabVar);
        }
        aokvVar.addAll(arrayList);
        this.q = null;
        if ((!((java.lang.Boolean) this.j.a()).booleanValue() || !ixhVar.e.isEmpty()) && !z) {
            aokvVar.add(new defpackage.izw());
        }
        return ajsz.aX(aokvVar);
    }

    public final void b(java.lang.String str) {
        a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "handleSetAsDefault", 395, "BeeslyGreetingSettingsFragmentPeer.kt").y("handleSetAsDefault: id=%s", str);
        this.z.o(rmx.xN);
        this.g.j(new zoe(aosv.F(this.i, 0, new defpackage.iiw(this, str, (aoln) null, 17), 3)), new zoe(str), this.s);
    }

    public final void c(boolean z) {
        if (!z) {
            this.z.o(rmx.xJ);
            this.B.b(aojh.a);
        } else {
            a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "showItemLimitReachedDialog", 430, "BeeslyGreetingSettingsFragmentPeer.kt").v("show dialog to announce that the item limit reached");
            defpackage.iyk iykVar = new defpackage.iyk();
            amxr.g(iykVar);
            iykVar.r(this.b.I(), "BeeslyLimitReachedDialog");
        }
    }
}
