package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vgi {
    public final /* synthetic */ vbu a;
    public final /* synthetic */ j$.util.Optional b;
    public final /* synthetic */ defpackage.vgm c;
    final /* synthetic */ vgj d;

    public vgi(vgj vgjVar, vbu vbuVar, j$.util.Optional optional, defpackage.vgm vgmVar) {
        this.a = vbuVar;
        this.b = optional;
        this.c = vgmVar;
        j$.util.Objects.requireNonNull(vgjVar);
        this.d = vgjVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int a() {
        vgj vgjVar = this.d;
        if (!((java.lang.Boolean) vgjVar.b.a()).booleanValue() && !((java.lang.Boolean) vgjVar.d.a()).booleanValue()) {
            vgj.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/configuration/impl/OmtpConfigurationLoaderImpl$2", "networkCapability", 182, "OmtpConfigurationLoaderImpl.java").v("legacy vvmNetworkCapabilityEnabled flag is false");
            return 12;
        }
        vbu vbuVar = this.a;
        if ((vbuVar.b & 1024) == 0) {
            vgj.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/configuration/impl/OmtpConfigurationLoaderImpl$2", "networkCapability", 187, "OmtpConfigurationLoaderImpl.java").v("vvmNetworkCapability is not set for the carrier, using NET_CAPABILITY_INTERNET");
            return 12;
        }
        java.lang.String str = vbuVar.n;
        switch (str.hashCode()) {
            case -1340279100:
                if (str.equals("wifi_p2p")) {
                    return 6;
                }
                break;
            case 3352:
                if (str.equals("ia")) {
                    return 7;
                }
                break;
            case 98292:
                if (str.equals("cbs")) {
                    return 5;
                }
                break;
            case 99837:
                if (str.equals("dun")) {
                    return 2;
                }
                break;
            case 104399:
                if (str.equals("ims")) {
                    return 4;
                }
                break;
            case 108243:
                if (str.equals("mms")) {
                    return 0;
                }
                break;
            case 112738:
                if (str.equals("rcs")) {
                    return 8;
                }
                break;
            case 3113290:
                if (str.equals("eims")) {
                    return 10;
                }
                break;
            case 3149046:
                if (str.equals("fota")) {
                    return 3;
                }
                break;
            case 3541982:
                if (str.equals("supl")) {
                    return 1;
                }
                break;
            case 3673178:
                if (str.equals("xcap")) {
                    return 9;
                }
                break;
            case 570410817:
                if (str.equals("internet")) {
                    return 12;
                }
                break;
        }
        a.bt(vgj.a.d(), "unknown network capability %s", str, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/configuration/impl/OmtpConfigurationLoaderImpl$2", "mapVvmNetworkCapability", (char) 210, "OmtpConfigurationLoaderImpl.java", zct.a);
        return 12;
    }

    public final j$.util.Optional b() {
        defpackage.vdj vdjVar = new defpackage.vdj(this.c, 7);
        j$.util.Optional optional = this.b;
        if (true != optional.isPresent()) {
            return optional;
        }
        j$.util.Optional optionalD = ((defpackage.vjd) optional.get()).d((defpackage.vgm) vdjVar.a);
        optionalD.getClass();
        return optionalD;
    }

    public final boolean c() {
        vbu vbuVar = this.a;
        return (vbuVar.b & 32768) != 0 && vbuVar.s;
    }

    public final boolean d() {
        vbu vbuVar = this.a;
        return (vbuVar.b & 4) != 0 && vbuVar.e;
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.d.c.a()).booleanValue() && this.a.w;
    }

    public final boolean f() {
        return this.a.k;
    }
}
