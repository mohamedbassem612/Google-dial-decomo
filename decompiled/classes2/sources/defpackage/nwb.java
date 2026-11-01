package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nwb {
    public static final aimz a = aimz.i("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl");
    public final android.content.Context b;
    public final oko c;
    public final ajct d;
    public final ajcu e;
    public final zjs f;
    public final android.telephony.SubscriptionManager g;
    public final android.telephony.TelephonyManager h;
    public final aoin i;
    public aigf j = aikj.b;
    private final defpackage.kvt k;

    public nwb(android.content.Context context, oko okoVar, ajct ajctVar, ajcu ajcuVar, zjs zjsVar, android.telephony.TelephonyManager telephonyManager, defpackage.kvt kvtVar, aoin aoinVar) {
        this.b = context;
        this.c = okoVar;
        this.d = ajctVar;
        this.e = ajcuVar;
        this.f = zjsVar;
        this.h = telephonyManager;
        this.k = kvtVar;
        this.i = aoinVar;
        this.g = (android.telephony.SubscriptionManager) context.getSystemService("telephony_subscription_service");
    }

    public final ajcq a(int i) {
        return ahvr.F(new defpackage.lqh(this, i, 2), this.d);
    }

    public final ajcq b(j$.util.Optional optional) {
        ajcq ajcqVarF = ahvr.F(new defpackage.lgc(this, 19), this.d);
        lix lixVar = new lix(11);
        ajcu ajcuVar = this.e;
        return ahvr.I(ahvr.H(ajcqVarF, lixVar, ajcuVar), new defpackage.ljp(this, optional, 7), ajcuVar);
    }

    public final ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ahvr.I(this.k.h(), new defpackage.ljp(this, phoneAccountHandle, 9, null), this.e);
    }

    public final ajcq d(int[] iArr) {
        return ahvr.I(aiql.v((aify) j$.util.DesugarArrays.stream(iArr).mapToObj(new defpackage.nvy(this, 0)).collect(aido.a)), new defpackage.ljp(this, iArr, 8), this.e);
    }
}
