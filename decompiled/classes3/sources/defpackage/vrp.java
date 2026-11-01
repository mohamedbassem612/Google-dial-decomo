package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vrp {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/service/VoicemailSettingsDataService");
    public final android.content.Context b;
    public final ajct c;
    public final ajct d;
    public final agsm e;
    public final vth f;
    public final vaf g;
    public final aoin h;
    public ajcq i;
    public final twp j;
    public final defpackage.wts k;
    public final ahbv l;
    public final gat m;
    public final rsr n;
    private final aogc o;

    public vrp(android.content.Context context, ajct ajctVar, ajct ajctVar2, agsm agsmVar, aogc aogcVar, twp twpVar, ahbv ahbvVar, gat gatVar, vth vthVar, vaf vafVar, rsr rsrVar, defpackage.wts wtsVar, aoin aoinVar) {
        this.b = context;
        this.c = ajctVar;
        this.d = ajctVar2;
        this.e = agsmVar;
        this.o = aogcVar;
        this.j = twpVar;
        this.l = ahbvVar;
        this.m = gatVar;
        this.f = vthVar;
        this.g = vafVar;
        this.n = rsrVar;
        this.h = aoinVar;
        this.k = wtsVar;
    }

    public final void a() {
        a.b().l("com/android/dialer/voicemail/settings/service/VoicemailSettingsDataService", "onSodaStatusChange", 138, "VoicemailSettingsDataService.java").v("onSodaStatusChange");
        this.o.s(ajcm.a, new agxj("voicemail_settings_store_data_source_key"));
    }
}
