package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aakt implements aaui {
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ com.google.android.gms.duokit.StartCallRequest b;
    public final /* synthetic */ zzx c;
    public final /* synthetic */ acxg d;

    public /* synthetic */ aakt(zzx zzxVar, android.content.Context context, acxg acxgVar, com.google.android.gms.duokit.StartCallRequest startCallRequest) {
        this.c = zzxVar;
        this.a = context;
        this.d = acxgVar;
        this.b = startCallRequest;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aakh */
    public final void d(java.lang.Object obj) {
        android.content.pm.ApplicationInfo applicationInfo;
        zzx zzxVar = this.c;
        com.google.android.gms.duokit.StartCallRequest startCallRequest = this.b;
        aakj aakjVar = (aakj) obj;
        try {
            com.google.android.gms.duokit.StartCallResponse startCallResponse = new com.google.android.gms.duokit.StartCallResponse();
            com.google.android.gms.duokit.DuoId duoId = startCallRequest.a;
            int i = duoId.a;
            acxg acxgVar = this.d;
            if (i != 1) {
                android.util.Log.w("DuoKitStartCall", "Only call to phone numbers is supported");
                acxgVar.r(5);
                throw new aakh("Only phone number calling is supported.");
            }
            int i2 = startCallRequest.b;
            boolean z = i2 == 1;
            ahwt ahwtVarH = android.text.TextUtils.isEmpty(startCallRequest.d) ? ahwt.a : ahyn.h(startCallRequest.d);
            boolean zB = aakjVar.b();
            android.content.Context context = this.a;
            if (zB) {
                android.content.Intent intentAddFlags = new android.content.Intent("com.google.android.gms.duokit.action.DUO_CALL").setData(android.net.Uri.parse(java.lang.String.format("%s:%s", "tel", duoId.b))).setClassName(context, com.google.android.gms.duokit.DuoKitContainerActivity.class.getName()).putExtra("com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY", z).addFlags(268435456);
                if (ahwtVarH.f()) {
                    intentAddFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (java.lang.String) ahwtVarH.b());
                }
                context.startActivity(intentAddFlags);
                akzx akzxVarM = amlx.a.m();
                int i3 = i2 == 1 ? 5 : 4;
                akzxVarM.u();
                akzxVarM.b.b = a.Q(i3);
                amlx amlxVarP = akzxVarM.p();
                akzx akzxVarM2 = ammf.a.m();
                akzxVarM2.u();
                akzxVarM2.b.d = 3;
                java.lang.Object obj2 = acxgVar.b;
                akzxVarM2.u();
                ammf ammfVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(obj2);
                ammfVar.e = (java.lang.String) obj2;
                akzxVarM2.u();
                akzxVarM2.b.f = a.S(4);
                akzxVarM2.u();
                ammf ammfVar2 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(amlxVarP);
                ammfVar2.c = amlxVarP;
                ammfVar2.b = 3;
                acxgVar.m(akzxVarM2.p());
            } else {
                if (!startCallRequest.c || context.getPackageManager().resolveActivity(new android.content.Intent("com.google.android.apps.tachyon.action.CALL").setData(android.net.Uri.parse(java.lang.String.format("%s:%s", "tel", "+14255555555"))).setPackage("com.google.android.apps.tachyon"), 65536) != null) {
                    android.util.Log.w("DuoKitStartCall", "Duo installed but can't handle the API");
                    acxgVar.r(5);
                    throw new aakh("Failed to handle the API call");
                }
                acxgVar.r(7);
                try {
                    android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || !applicationInfo.enabled) {
                        aaoo.q(context);
                        acxgVar.q(5);
                    } else {
                        android.content.Intent intentAddFlags2 = new android.content.Intent("com.google.android.gms.duokit.action.INSTALL_DUO_VIA_ALLEYOOP").setClassName(context, com.google.android.gms.duokit.DuoKitContainerActivity.class.getName()).addFlags(268435456);
                        if (ahwtVarH.f()) {
                            intentAddFlags2.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (java.lang.String) ahwtVarH.b());
                        }
                        context.startActivity(intentAddFlags2);
                        acxgVar.q(4);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
            }
            zzxVar.i(startCallResponse);
        } catch (aakh e) {
            zzxVar.h(e);
        }
    }
}
