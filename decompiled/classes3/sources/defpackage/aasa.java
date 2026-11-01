package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aasa extends aagp {
    private static volatile android.os.Bundle x;
    private static volatile android.os.Bundle y;
    public final java.lang.String a;
    public final java.lang.String v;
    public final android.content.Context w;
    private final java.util.HashMap z;

    static {
        android.os.Parcelable.Creator creator = com.google.android.gms.common.api.ApiMetadata.CREATOR;
    }

    public aasa(android.content.Context context, android.os.Looper looper, aadc aadcVar, aadd aaddVar, java.lang.String str, aagi aagiVar) {
        super(context.getApplicationContext(), looper, 5, aagiVar, aadcVar, aaddVar);
        this.z = new java.util.HashMap();
        this.w = context;
        this.a = str;
        this.v = aagiVar.e;
    }

    public static com.google.android.gms.common.api.Status O(int i, android.os.Bundle bundle) {
        return new com.google.android.gms.common.api.Status(i, (java.lang.String) null, bundle == null ? null : (android.app.PendingIntent) bundle.getParcelable("pendingIntent"), (com.google.android.gms.common.ConnectionResult) null);
    }

    public final void C() {
        java.util.HashMap map = this.z;
        synchronized (map) {
            if (o()) {
                for (defpackage.aarv aarvVar : map.values()) {
                    aarvVar.a.a();
                    try {
                        Q().a(aarvVar, false, 0, aazc.x());
                    } catch (android.os.RemoteException e) {
                        aaoo.G("Failed to unregister listener", e);
                    } catch (java.lang.IllegalStateException e2) {
                        aaoo.G("PeopleService is in unexpected state", e2);
                    }
                }
                this.z.clear();
            } else {
                this.z.clear();
            }
            throw th;
        }
        super.C();
    }

    protected final void D(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        if (i == 0) {
            i = 0;
            if (bundle != null) {
                N(bundle.getBundle("post_init_configuration"));
            }
        }
        super.D(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public final synchronized void N(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        defpackage.aasb.a = bundle.getBoolean("use_contactables_api", true);
        defpackage.aasl.a.b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        x = bundle.getBundle("config.email_type_map");
        y = bundle.getBundle("config.phone_type_map");
    }

    public final void P(aaec aaecVar, int i) {
        super.B();
        defpackage.aarw aarwVar = new defpackage.aarw(aaecVar);
        try {
            defpackage.aaru aaruVarQ = Q();
            com.google.android.gms.common.api.ApiMetadata apiMetadataX = aazc.x();
            android.os.Parcel parcelEP = aaruVarQ.eP();
            yld.f(parcelEP, aarwVar);
            parcelEP.writeInt(0);
            parcelEP.writeInt(0);
            parcelEP.writeString(null);
            parcelEP.writeString(null);
            parcelEP.writeInt(i);
            yld.d(parcelEP, apiMetadataX);
            aaruVarQ.eR(305, parcelEP);
        } catch (android.os.RemoteException unused) {
            aarwVar.b(8, null, null);
        }
    }

    public final defpackage.aaru Q() {
        return (defpackage.aaru) super.v();
    }

    public final int a() {
        return 12451000;
    }

    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return iInterfaceQueryLocalInterface instanceof defpackage.aaru ? (defpackage.aaru) iInterfaceQueryLocalInterface : new defpackage.aaru(iBinder);
    }

    protected final java.lang.String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    protected final java.lang.String d() {
        return "com.google.android.gms.people.service.START";
    }

    public final boolean e() {
        return true;
    }

    public final com.google.android.gms.common.Feature[] g() {
        return aaqf.H;
    }

    protected final android.os.Bundle h() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.v);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }
}
