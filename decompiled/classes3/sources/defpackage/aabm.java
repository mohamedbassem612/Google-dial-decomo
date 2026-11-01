package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aabm implements aaua {
    private final /* synthetic */ int $cid;

    public final java.lang.Object a(aaum aaumVar) throws java.io.IOException {
        java.lang.String string;
        int i = this.$cid;
        if (i == 0) {
            java.util.concurrent.Executor executor = aabo.a;
            android.content.Intent intent = (android.content.Intent) ((android.os.Bundle) aaumVar.g()).getParcelable("notification_data");
            if (intent != null) {
                return new com.google.android.gms.cloudmessaging.CloudMessage(intent);
            }
            return null;
        }
        if (i == 1) {
            java.util.concurrent.Executor executor2 = aabo.a;
            if (aaumVar.k()) {
                return (android.os.Bundle) aaumVar.g();
            }
            if (android.util.Log.isLoggable("Rpc", 3)) {
                android.util.Log.d("Rpc", "Error making request: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aaumVar.f()))));
            }
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE", aaumVar.f());
        }
        if (i == 2) {
            acxg acxgVar = defpackage.aany.a;
            return null;
        }
        if (i == 3) {
            android.os.Bundle bundle = (android.os.Bundle) aaumVar.h(java.io.IOException.class);
            if (bundle == null) {
                throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
            }
            string = bundle.getString("registration_id");
            if (string == null && (string = bundle.getString("unregistered")) == null) {
                java.lang.String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new java.io.IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new java.io.IOException(string2);
                }
                android.util.Log.w("FirebaseInstanceId", "Unexpected response: ".concat(bundle.toString()), new java.lang.Throwable());
                throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            if (i == 4) {
                return -1;
            }
            if (i == 5) {
                return 403;
            }
            android.os.Bundle bundle2 = (android.os.Bundle) aaumVar.h(java.io.IOException.class);
            if (bundle2 == null) {
                throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
            }
            string = bundle2.getString("registration_id");
            if (string == null && (string = bundle2.getString("unregistered")) == null) {
                java.lang.String string3 = bundle2.getString("error");
                if ("RST".equals(string3)) {
                    throw new java.io.IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new java.io.IOException(string3);
                }
                android.util.Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle2.toString()), new java.lang.Throwable());
                throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
            }
        }
        return string;
    }
}
