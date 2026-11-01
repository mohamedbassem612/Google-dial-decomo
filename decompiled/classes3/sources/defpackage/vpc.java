package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vpc {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/VoicemailSettingsFragmentPeer");
    public final aogc A;
    private final gpd B;
    public final agye b = new defpackage.vpa(this);
    public final agtk c = new defpackage.vpb(this);
    public j$.util.Optional d = j$.util.Optional.empty();
    public j$.util.Optional e = j$.util.Optional.empty();
    public android.telecom.PhoneAccountHandle f;
    public androidx.preference.Preference g;
    public androidx.preference.Preference h;
    public androidx.preference.Preference i;
    public androidx.preference.PreferenceScreen j;
    public com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat k;
    public com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat l;
    public com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat m;
    public com.android.dialer.common.preference.SwitchPreferenceWithClickableSummaryCompat n;
    public androidx.preference.Preference o;
    public final android.content.Context p;
    public final defpackage.ahey q;
    public final defpackage.voz r;
    public final rlv s;
    public final defpackage.vrp t;
    public final agtj u;
    public final ruc v;
    public final aoin w;
    public final twp x;
    public final ajwr y;
    public final tvn z;

    public vpc(android.content.Context context, defpackage.ahey aheyVar, defpackage.voz vozVar, rlv rlvVar, ajwr ajwrVar, defpackage.vrp vrpVar, aogc aogcVar, agtj agtjVar, twp twpVar, ruc rucVar, tvn tvnVar, gpd gpdVar, aoin aoinVar) {
        this.p = context;
        this.q = aheyVar;
        this.r = vozVar;
        this.s = rlvVar;
        this.y = ajwrVar;
        this.t = vrpVar;
        this.A = aogcVar;
        this.u = agtjVar;
        this.x = twpVar;
        this.v = rucVar;
        this.z = tvnVar;
        this.B = gpdVar;
        this.w = aoinVar;
    }

    public final void a() {
        this.k.R(false);
        this.l.R(false);
        this.m.R(false);
        this.n.R(false);
        this.o.R(false);
        this.h.R(false);
    }

    public final void b(boolean z) {
        defpackage.vrp vrpVar = this.t;
        vaf vafVar = vrpVar.g;
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.f;
        int i = 2;
        ajcq ajcqVarI = ahvr.I(ahrv.g(vafVar.a(phoneAccountHandle)).h(new defpackage.vrm(vrpVar, z, phoneAccountHandle, i), vrpVar.d), new defpackage.vll(vrpVar, phoneAccountHandle, z, i), vrpVar.c);
        this.u.i(defpackage.zoe.N(ajcqVarI), this.c);
        this.A.s(ajcqVarI, new agxj("voicemail_settings_store_data_source_key"));
        this.k.k(z);
        rlv rlvVar = this.s;
        if (z) {
            rlvVar.n(rmw.aX);
            this.B.i((java.lang.String) null).b(mce.dP);
        } else {
            rlvVar.n(rmw.aY);
            this.B.i((java.lang.String) null).b(mce.dQ);
        }
    }
}
