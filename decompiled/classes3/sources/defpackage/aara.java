package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aara extends aada implements com.google.android.gms.people.contactssync.DeviceContactsSyncClient {
    public static final /* synthetic */ int a = 0;
    private static final acxg l;
    private static final aais m;
    private static final aais n;

    static {
        aais aaisVar = new aais();
        n = aaisVar;
        defpackage.aaqv aaqvVar = new defpackage.aaqv();
        m = aaqvVar;
        l = new acxg("People.API", aaqvVar, aaisVar);
    }

    public aara(android.app.Activity activity) {
        super(activity, activity, l, aacu.q, aacz.a);
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final android.content.Intent createGoogleContactsSyncSettingsIntent(android.content.Context context, java.lang.String str) {
        aais.at(context, "Please provide a non-null context");
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity").setPackage(context.getPackageName());
        if (str != null) {
            intent.putExtra("authAccount", str);
        }
        return intent;
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final aaum getDeviceContactsSyncSetting() {
        aafq aafqVar = new aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{aaqf.v};
        aafqVar.a = new defpackage.aaav(this, 10);
        aafqVar.c = 2731;
        return super.i(0, aafqVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final aaum launchDeviceContactsSyncSettingActivity(android.content.Context context) {
        aais.at(context, "Please provide a non-null context");
        aafq aafqVar = new aafq();
        aafqVar.b = new com.google.android.gms.common.Feature[]{aaqf.v};
        aafqVar.a = new defpackage.zxc((java.lang.Object) this, (java.lang.Object) context, 13);
        aafqVar.c = 2733;
        return super.i(0, aafqVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final aaum registerSyncSettingUpdatedListener(com.google.android.gms.people.contactssync.DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        aafe aafeVarV = v(syncSettingUpdatedListener, "dataChangedListenerKey");
        defpackage.zxc zxcVar = new defpackage.zxc((java.lang.Object) this, (java.lang.Object) aafeVarV, 14);
        defpackage.aaav aaavVar = new defpackage.aaav(this, 9);
        aafl aaflVar = new aafl();
        aaflVar.c = aafeVarV;
        aaflVar.a = zxcVar;
        aaflVar.b = aaavVar;
        aaflVar.d = new com.google.android.gms.common.Feature[]{aaqf.u};
        aaflVar.f = 2729;
        return l(aaflVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final aaum unregisterSyncSettingUpdatedListener(com.google.android.gms.people.contactssync.DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        return j(aais.ay(syncSettingUpdatedListener, "dataChangedListenerKey"), 2730);
    }

    public aara(android.content.Context context) {
        super(context, (android.app.Activity) null, l, aacu.q, aacz.a);
    }
}
