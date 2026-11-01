package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyp extends ylc implements android.os.IInterface {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyp(nye nyeVar, int i) {
        super("com.google.android.apps.tachyon.telecom.IHandoverFallbackSource");
        this.$cid = i;
        this.a = nyeVar;
    }

    private final void a() {
        if (aehj.bO((android.content.Context) this.a, android.os.Binder.getCallingUid())) {
            return;
        }
        throw new java.lang.SecurityException("Calling UID " + android.os.Binder.getCallingUid() + " is not Google Play services.");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        aadh zyjVar;
        aadh zylVar;
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 == 1) {
                if (i != 1) {
                    if (i == 2) {
                        ((nye) this.a).a();
                    }
                    return false;
                }
                java.lang.Object obj = this.a;
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                nye nyeVar = (nye) obj;
                android.telecom.Call.Callback nycVar = new nyc(nyeVar);
                android.telecom.Call call = nyeVar.b;
                call.registerCallback(nycVar, handler);
                call.disconnect();
                return true;
            }
            if (i2 != 2) {
                if (i == 2) {
                    ((aafe) this.a).b(new defpackage.aaly(this, 5));
                    return true;
                }
                return false;
            }
            if (i == 2) {
                com.google.android.gms.common.api.Status statusA = yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable samplerDecisionParcelable = (com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable) yld.a(parcel, com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable.CREATOR);
                yld.c(parcel);
                aais.au(statusA, samplerDecisionParcelable, (zzx) this.a);
                return true;
            }
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                a();
                defpackage.zyo.a((android.content.Context) this.a).b();
            }
            return false;
        }
        a();
        android.content.Context context = (android.content.Context) this.a;
        defpackage.zyt zytVarC = defpackage.zyt.c(context);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountA = zytVarC.a();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptionsB = com.google.android.gms.auth.api.signin.GoogleSignInOptions.e;
        if (googleSignInAccountA != null) {
            googleSignInOptionsB = zytVarC.b();
        }
        aais.as(googleSignInOptionsB);
        defpackage.zyd zydVar = new defpackage.zyd(context, googleSignInOptionsB);
        aade aadeVar = ((aada) zydVar).i;
        if (googleSignInAccountA != null) {
            android.content.Context context2 = ((aada) zydVar).b;
            int iA = zydVar.a();
            defpackage.zyn.a.b("Revoking access");
            java.lang.String strD = defpackage.zyt.c(context2).d("refreshToken");
            defpackage.zyn.a(context2);
            if (iA == 3) {
                int i3 = defpackage.zyf.b;
                if (strD == null) {
                    com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(4, (java.lang.String) null, (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null);
                    aais.aj(!status.c(), "Status code must not be SUCCESS");
                    zylVar = new defpackage.aadi(status);
                    zylVar.l(status);
                } else {
                    defpackage.zyf zyfVar = new defpackage.zyf(strD);
                    new java.lang.Thread(zyfVar).start();
                    zylVar = zyfVar.a;
                }
            } else {
                zylVar = new defpackage.zyl(aadeVar);
                aadeVar.c(zylVar);
            }
            aahm.b(zylVar);
        } else {
            android.content.Context context3 = ((aada) zydVar).b;
            int iA2 = zydVar.a();
            defpackage.zyn.a.b("Signing out");
            defpackage.zyn.a(context3);
            if (iA2 == 3) {
                com.google.android.gms.common.api.Status status2 = com.google.android.gms.common.api.Status.a;
                zyjVar = new defpackage.aafo(aadeVar);
                zyjVar.l(status2);
            } else {
                zyjVar = new defpackage.zyj(aadeVar);
                aadeVar.c(zyjVar);
            }
            aahm.b(zyjVar);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyp(android.content.Context context, int i) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.$cid = i;
        this.a = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyp(zzx zzxVar, int i) {
        super("com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
        this.$cid = i;
        this.a = zzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyp(aafe aafeVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.$cid = i;
        this.a = aafeVar;
    }
}
