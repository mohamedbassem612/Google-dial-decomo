package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vmc {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService");
    public static final defpackage.vcr b;
    public static final defpackage.aenj c;
    public final android.content.Context d;
    public final defpackage.vls e;
    public final defpackage.vdo f;
    public final defpackage.vln g;
    public final defpackage.vli h;
    public final defpackage.ajct i;
    public final defpackage.ajct j;
    public final defpackage.ajct k;
    public final defpackage.rlv l;
    public final defpackage.zrw m;
    public final defpackage.oko n;
    public final defpackage.ruc o;
    public final defpackage.vze p;
    public final defpackage.rsr q;

    static {
        defpackage.akzx akzxVarM = defpackage.vcr.a.m();
        defpackage.vcq vcqVar = defpackage.vcq.a;
        akzxVarM.u();
        defpackage.vcr vcrVar = (defpackage.vcr) akzxVarM.b;
        j$.util.Objects.requireNonNull(vcqVar);
        vcrVar.c = vcqVar;
        vcrVar.b = 1;
        b = (defpackage.vcr) akzxVarM.r();
        c = new defpackage.aenj("REST_VVM_SERVICE_SYNC_MEMORY_SNAPSHOT");
    }

    public vmc(android.content.Context context, defpackage.vls vlsVar, defpackage.vdo vdoVar, defpackage.vze vzeVar, defpackage.vln vlnVar, defpackage.vli vliVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.rlv rlvVar, defpackage.zrw zrwVar, defpackage.rsr rsrVar, defpackage.oko okoVar, defpackage.ruc rucVar) {
        this.d = context;
        this.e = vlsVar;
        this.f = vdoVar;
        this.p = vzeVar;
        this.g = vlnVar;
        this.h = vliVar;
        this.i = ajctVar;
        this.j = ajctVar2;
        this.k = ajctVar3;
        this.l = rlvVar;
        this.m = zrwVar;
        this.q = rsrVar;
        this.n = okoVar;
        this.o = rucVar;
    }

    public final defpackage.ajcq a(defpackage.aify aifyVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "deleteLocalVoicemails", 271, "RestVvmSyncService.java")).w("Delete %d local voicemails", aifyVar.size());
        return aifyVar.isEmpty() ? defpackage.ajcm.a : defpackage.ahvr.H(this.f.c(aifyVar), new vmb(aifyVar, 5), this.i);
    }

    public final defpackage.ajcq b(j$.util.Optional optional, android.net.Uri uri, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (optional.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "downloadAudio", 466, "RestVvmSyncService.java")).v("Download voicemail audio");
            return defpackage.ahvr.I(this.e.a((java.lang.String) optional.orElseThrow()), new vjx(this, uri, phoneAccountHandle, 8, (char[]) null), this.i);
        }
        java.lang.String string = this.d.getString(2132021024);
        vdm vdmVar = new vdm();
        vdmVar.c(j$.util.Optional.of(string));
        return defpackage.ahvr.H(this.f.h(uri, vdmVar.a()), new vlk(16), this.i);
    }
}
