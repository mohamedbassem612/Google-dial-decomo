package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tdd {
    public static final aimz a = aimz.i("com/android/dialer/rtt/settings/impl/service/AccessibilitySettingsService");
    public static final agxj b = new agxj("AccessibilitySettingsKey");
    public final ajct c;
    public final aoin d;
    public final zjs e;
    public final oko f;
    public final android.content.Context g;
    public final ajct h;
    public final android.media.AudioManager i;
    public final tcu j;
    public final okj k;
    public final oki l;
    public final defpackage.taq m;
    public final defpackage.sgi n;
    public final aogc o;
    public final agab p;

    public tdd(defpackage.taq taqVar, aoin aoinVar, ajct ajctVar, ajct ajctVar2, android.media.AudioManager audioManager, zjs zjsVar, oko okoVar, agab agabVar, aogc aogcVar, defpackage.sgi sgiVar, tcu tcuVar, android.content.Context context, okj okjVar, oki okiVar) {
        this.m = taqVar;
        this.c = ajctVar;
        this.h = ajctVar2;
        this.p = agabVar;
        this.o = aogcVar;
        this.d = aoinVar;
        this.e = zjsVar;
        this.f = okoVar;
        this.i = audioManager;
        this.n = sgiVar;
        this.j = tcuVar;
        this.g = context;
        this.k = okjVar;
        this.l = okiVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ajct, java.lang.Object] */
    public final void a(final int i) {
        defpackage.sgi sgiVar = this.n;
        final int i2 = 1;
        agsm.i(878, ahvr.H(sgiVar.b.eU(ahqx.i(new lqh(sgiVar, i, 5))), new ahyc() { // from class: uqy
            /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, rlv] */
            public final java.lang.Object apply(java.lang.Object obj) {
                defpackage.zul zulVar;
                android.app.UiModeManager uiModeManager;
                int i3 = i2;
                int i4 = 0;
                int i5 = 4;
                if (i3 != 0) {
                    zulVar = null;
                    if (i3 == 1) {
                        aimw aimwVarL = defpackage.tdd.a.b().l("com/android/dialer/rtt/settings/impl/service/AccessibilitySettingsService", "setTtySetting", 229, "AccessibilitySettingsService.java");
                        int i6 = i;
                        aimwVarL.w("successfully set TTY mode setting to: %s", i6);
                        android.content.Intent intent = new android.content.Intent("android.telecom.action.TTY_PREFERRED_MODE_CHANGED");
                        intent.putExtra("android.telecom.extra.TTY_PREFERRED_MODE", i6);
                        defpackage.tdd tddVar = (defpackage.tdd) this;
                        tddVar.g.sendBroadcast(intent);
                        tddVar.o.s(ajcm.a, defpackage.tdd.b);
                    } else {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                return i3 != 4 ? ((aemh) obj).g((java.lang.String) this, i) : ((aemh) obj).f((java.lang.String) this, i);
                            }
                            ((vku) this).d(i, j$.util.Optional.empty(), j$.util.Optional.empty(), 3);
                            throw new defpackage.vcx(((defpackage.vex) obj).getMessage(), defpackage.vbw.SMS_SERVER_NOT_RESPONDING);
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 31 && (uiModeManager = (android.app.UiModeManager) ((urg) this).b.getSystemService("uimode")) != null) {
                            int i7 = i;
                            if (i7 == 1) {
                                i4 = 1;
                            } else if (i7 == 2) {
                                i4 = 2;
                            }
                            rk$.ExternalSyntheticApiModelOutline0.m(uiModeManager, i4);
                            return null;
                        }
                    }
                } else {
                    zulVar = (defpackage.zul) obj;
                    akzx akzxVarM = amrq.a.m();
                    akzxVarM.u();
                    amrq amrqVar = akzxVarM.b;
                    amrqVar.c = i - 1;
                    amrqVar.b |= 1;
                    int iOrdinal = zulVar.ordinal();
                    if (iOrdinal == 0) {
                        i5 = 2;
                    } else if (iOrdinal == 1) {
                        i5 = 3;
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                throw new java.lang.IllegalStateException(java.lang.String.format("%s is not mapped!", zulVar));
                            }
                            i5 = 3;
                        } else {
                            i5 = 5;
                        }
                    }
                    java.lang.Object obj2 = this;
                    akzxVarM.u();
                    amrq amrqVar2 = akzxVarM.b;
                    amrqVar2.d = i5 - 1;
                    amrqVar2.b |= 2;
                    ((uqz) obj2).a.v(akzxVarM.p());
                }
                return zulVar;
            }
        }, this.h), "Failed to set TTY mode", new java.lang.Object[0]);
    }
}
