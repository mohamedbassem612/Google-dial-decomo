package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajxg implements android.app.Application.ActivityLifecycleCallbacks {
    private final java.util.Queue a = new java.util.ArrayDeque(10);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.Intent intent = activity.getIntent();
        if (intent != null) {
            android.os.Bundle bundle2 = null;
            try {
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    java.lang.String strZ = defpackage.ajsz.z(extras);
                    if (!android.text.TextUtils.isEmpty(strZ)) {
                        java.util.Queue queue = this.a;
                        if (queue.contains(strZ)) {
                            return;
                        } else {
                            queue.add(strZ);
                        }
                    }
                    bundle2 = extras.getBundle("gcm.n.analytics_data");
                }
            } catch (java.lang.RuntimeException e) {
                android.util.Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
            }
            if (defpackage.ajsz.F(bundle2)) {
                if (bundle2 != null) {
                    if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                        defpackage.ajti ajtiVar = (defpackage.ajti) defpackage.ajtc.b().d(defpackage.ajti.class);
                        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                            android.util.Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        if (ajtiVar != null) {
                            java.lang.String string = bundle2.getString("google.c.a.c_id");
                            ajtiVar.b();
                            android.os.Bundle bundle3 = new android.os.Bundle();
                            bundle3.putString("source", "Firebase");
                            bundle3.putString("medium", "notification");
                            bundle3.putString("campaign", string);
                            ajtiVar.a();
                        } else {
                            android.util.Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                        }
                    } else if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                        android.util.Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                    }
                }
                defpackage.ajsz.C("_no", bundle2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
