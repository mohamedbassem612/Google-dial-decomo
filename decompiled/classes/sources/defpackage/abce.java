package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abce extends defpackage.aada implements defpackage.aadf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abce(android.content.Context context, byte[] bArr, byte[] bArr2) {
        super(context, null, defpackage.aapv.a, defpackage.aacu.q, defpackage.aacz.a);
        if (context == null) {
            defpackage.aooh.i("context");
        }
    }

    public final defpackage.aaum a(android.net.Uri uri, com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions readSignalOptions) {
        defpackage.aooh.f(uri, "entity");
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aarg(uri, readSignalOptions, 6);
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum b(android.net.Uri uri, com.google.android.libraries.abuse.hades.signals.gmsclient.SignalValue signalValue) {
        defpackage.aooh.f(uri, "entity");
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aarg(uri, signalValue, 7);
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum c() {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasx(this, 4);
        aafqVar.c = 4501;
        return super.i(0, aafqVar.a());
    }

    public final void d(aavm aavmVar) {
        defpackage.aafe aafeVarAz = defpackage.aais.az(aavmVar, this.g, aavm.class.getSimpleName());
        aave aaveVar = new aave(this, aafeVarAz, ((defpackage.aavk) this.e).a, 0);
        aaav aaavVar = new aaav(this, 13);
        defpackage.aafl aaflVar = new defpackage.aafl();
        aaflVar.a = aaveVar;
        aaflVar.b = aaavVar;
        aaflVar.c = aafeVarAz;
        aaflVar.d = new com.google.android.gms.common.Feature[]{defpackage.aavd.a};
        aaflVar.f = 4507;
        l(aaflVar.a());
    }

    public final defpackage.aaum e() {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasx(this, 3);
        aafqVar.c = 3901;
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum m(java.lang.String str) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aaav(str, 5);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aapy.a};
        aafqVar.b();
        aafqVar.c = 39302;
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum n(aaqe aaqeVar) {
        defpackage.aooh.f(aaqeVar, "consentItem");
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aaav(aaqeVar, 6);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aapy.a};
        aafqVar.c = 39301;
        return super.i(1, aafqVar.a());
    }

    public final defpackage.aaum o(long j, j$.time.Instant instant) {
        defpackage.aooh.f(instant, "time");
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.b();
        aafqVar.a = new aaps(j, instant, 2);
        aafqVar.c = 34601;
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum p(long j, j$.time.Instant instant) {
        defpackage.aooh.f(instant, "since");
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.b();
        aafqVar.a = new aaps(j, instant, 0);
        aafqVar.c = 34602;
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum q(android.net.Uri uri) {
        com.google.android.gms.mobstore.DeleteFileRequest deleteFileRequest = new com.google.android.gms.mobstore.DeleteFileRequest(uri);
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(this, deleteFileRequest, 12);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aamx.c};
        aafqVar.c = 7802;
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum r(android.net.Uri uri, int i) {
        com.google.android.gms.mobstore.OpenFileDescriptorRequest openFileDescriptorRequest = new com.google.android.gms.mobstore.OpenFileDescriptorRequest(uri, i);
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasv(this, openFileDescriptorRequest, 1);
        aafqVar.b = i == 1 ? new com.google.android.gms.common.Feature[]{defpackage.aamx.c} : null;
        aafqVar.c = 7801;
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum s(android.net.Uri uri, android.net.Uri uri2) {
        com.google.android.gms.mobstore.RenameRequest renameRequest = new com.google.android.gms.mobstore.RenameRequest(uri, uri2);
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(this, renameRequest, 11);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aamx.d};
        aafqVar.b();
        aafqVar.c = 7803;
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum t() {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aaav(this, 1);
        aafqVar.c = 1520;
        return super.i(0, aafqVar.a());
    }

    public abce(android.content.Context context, char[] cArr, byte[] bArr) {
        super(context, null, defpackage.aapj.a, defpackage.aacu.q, defpackage.aacz.a);
    }

    public abce(android.content.Context context, defpackage.zxw zxwVar) {
        super(context, null, defpackage.zxv.a, zxwVar, defpackage.aacz.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abce(android.content.Context context, char[] cArr) {
        super(context, null, defpackage.aaqd.a, defpackage.aacu.q, defpackage.aacz.a);
        if (context == null) {
            defpackage.aooh.i("context");
        }
    }

    public abce(android.content.Context context, byte[] bArr) {
        super(context, null, defpackage.aatj.a, defpackage.aacu.q, defpackage.aacz.a);
    }

    public abce(android.content.Context context, defpackage.aavk aavkVar) {
        super(context, null, defpackage.aavl.a, aavkVar, defpackage.aacz.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abce(android.content.Context context) {
        super(context, null, defpackage.abcg.a, defpackage.aacu.q, defpackage.aacz.a);
        if (context == null) {
            defpackage.aooh.i("context");
        }
    }
}
