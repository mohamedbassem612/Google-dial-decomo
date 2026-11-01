package androidx.car.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class CarAppPermissionActivity extends mp {
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            android.content.pm.ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
            int i = applicationInfo.metaData != null ? applicationInfo.metaData.getInt("androidx.car.app.theme") : 0;
            android.content.Context contextCreateConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i != 0) {
                contextCreateConfigurationContext.setTheme(i);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = contextCreateConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        android.content.Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected intent action for CarAppPermissionActivity: ");
            sb.append(intent == null ? "null Intent" : intent.getAction());
            android.util.Log.e("CarApp", sb.toString());
            finish();
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        androidx.car.app.IOnRequestPermissionsListener iOnRequestPermissionsListenerAsInterface = androidx.car.app.IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
        java.lang.String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
        if (iOnRequestPermissionsListenerAsInterface != null && stringArray != null) {
            O(new oz(), new acke(this, iOnRequestPermissionsListenerAsInterface, 1)).b(stringArray);
        } else {
            android.util.Log.e("CarApp", "Intent to request permissions is missing the callback binder");
            finish();
        }
    }
}
