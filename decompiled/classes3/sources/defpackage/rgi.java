package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgi {
    public static final aimz a = aimz.i("com/android/dialer/incall/voicefeaturecombiner/templates/promo/ui/VoiceFeaturePromoFragmentPeer");
    public final java.util.Map b;
    public final defpackage.rge c;
    public final defpackage.agzc d;
    public final odo e;
    public final defpackage.rfv f;
    public j$.util.Optional g = j$.util.Optional.empty();
    public final odm h = new defpackage.rgf(this);
    public final zpm i;
    public final defpackage.rhx j;
    public final vwb k;
    public final defpackage.afpl l;

    public rgi(vwb vwbVar, defpackage.afpl afplVar, java.util.Map map, defpackage.rhx rhxVar, defpackage.rge rgeVar, defpackage.agzc agzcVar, odo odoVar, zpm zpmVar, defpackage.rfv rfvVar) {
        this.k = vwbVar;
        this.l = afplVar;
        this.b = map;
        this.j = rhxVar;
        this.c = rgeVar;
        this.d = agzcVar;
        this.e = odoVar;
        this.i = zpmVar;
        this.f = rfvVar;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optional = this.g;
        defpackage.qkv qkvVar = new defpackage.qkv(this, 16);
        if (true != optional.isPresent()) {
            return optional;
        }
        java.lang.Object obj = optional.get();
        java.lang.Object obj2 = qkvVar.a;
        j$.util.Optional optionalD = ((defpackage.rgi) obj2).j.d(((defpackage.rfd) obj).a);
        optionalD.getClass();
        return optionalD;
    }
}
