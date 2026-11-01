package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class val {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/notification/impl/MwiNotifierImpl");
    public final android.content.Context b;
    public final defpackage.rwi c;
    public final defpackage.vao d;
    public final defpackage.ajct e;
    public final defpackage.ajct f;
    public final defpackage.ssq g;
    public final defpackage.vyu h;
    public final defpackage.zjs i;
    public final defpackage.oko j;
    public final defpackage.aoin k;
    public final defpackage.vze l;
    public final defpackage.ahbv m;
    public final defpackage.zjm n;
    public final defpackage.zzx o;

    public val(android.content.Context context, defpackage.rwi rwiVar, defpackage.vao vaoVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ssq ssqVar, defpackage.zjm zjmVar, defpackage.zzx zzxVar, defpackage.ahbv ahbvVar, defpackage.vyu vyuVar, defpackage.zjs zjsVar, defpackage.oko okoVar, defpackage.vze vzeVar, defpackage.aoin aoinVar) {
        this.b = context;
        this.c = rwiVar;
        this.d = vaoVar;
        this.e = ajctVar;
        this.f = ajctVar2;
        this.g = ssqVar;
        this.n = zjmVar;
        this.o = zzxVar;
        this.m = ahbvVar;
        this.h = vyuVar;
        this.i = zjsVar;
        this.j = okoVar;
        this.l = vzeVar;
        this.k = aoinVar;
    }

    public static java.lang.String d(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z) {
        java.lang.String id;
        if (!z) {
            return "LegacyVoicemail";
        }
        if (android.os.Build.VERSION.SDK_INT < 33) {
            int i = defpackage.airu.a;
            id = airt.a.b(phoneAccountHandle.getId(), java.nio.charset.StandardCharsets.UTF_8).toString();
        } else {
            id = phoneAccountHandle.getId();
        }
        return java.lang.String.format("%s:%s", "LegacyVoicemail_", id);
    }

    private final defpackage.ajcq e() {
        return defpackage.ahvr.F(new tvg(this, 20), this.f);
    }

    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.I(e(), new defpackage.uhj(this, phoneAccountHandle, 13, null), this.e);
    }

    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle, vaj vajVar) {
        return defpackage.ahvr.I(e(), new sue(this, phoneAccountHandle, vajVar, 10, (byte[]) null), this.e);
    }

    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle, vaj vajVar) {
        defpackage.val valVar;
        android.telecom.PhoneAccountHandle phoneAccountHandle2;
        vaj vajVar2;
        defpackage.ajcq ajcqVarI;
        if (vajVar.f) {
            ajcqVarI = defpackage.aiql.z(java.lang.Boolean.TRUE);
            valVar = this;
            phoneAccountHandle2 = phoneAccountHandle;
            vajVar2 = vajVar;
        } else {
            defpackage.zzx zzxVar = this.o;
            j$.util.Objects.requireNonNull(zzxVar);
            valVar = this;
            phoneAccountHandle2 = phoneAccountHandle;
            vajVar2 = vajVar;
            ajcqVarI = defpackage.ahvr.I(defpackage.ahvr.F(new tvg(zzxVar, 19), this.f), new sue(valVar, phoneAccountHandle2, vajVar2, 11, (byte[]) null), valVar.e);
        }
        return defpackage.ahvr.I(ajcqVarI, new sue(valVar, phoneAccountHandle2, vajVar2, 8, (byte[]) null), valVar.e);
    }
}
