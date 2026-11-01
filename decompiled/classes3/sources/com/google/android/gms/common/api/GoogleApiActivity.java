package com.google.android.gms.common.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class GoogleApiActivity extends android.app.Activity implements android.content.DialogInterface.OnCancelListener {
    protected int a = 0;

    public static android.content.Intent a(android.content.Context context, android.app.PendingIntent pendingIntent, int i, boolean z) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.gms.common.api.GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    private final void b() {
        com.google.android.gms.common.api.GoogleApiActivity googleApiActivity;
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            android.util.Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) extras.get("pending_intent");
        java.lang.Integer num = (java.lang.Integer) extras.get("error_code");
        if (pendingIntent == null) {
            if (num == null) {
                android.util.Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            } else {
                aais.as(num);
                aabx.a.h(this, num.intValue(), 2, this);
                this.a = 1;
                return;
            }
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.a = 1;
            } catch (android.content.ActivityNotFoundException e) {
                e = e;
                android.content.ActivityNotFoundException activityNotFoundException = e;
                if (extras.getBoolean("notify_manager", true)) {
                    aaet.c(googleApiActivity).d(new com.google.android.gms.common.ConnectionResult(1, 22, (android.app.PendingIntent) null, (java.lang.String) null, (java.lang.Integer) null, (android.os.Bundle) null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    java.lang.String strConcat = "Activity not found while launching " + pendingIntent.toString() + '.';
                    if (android.os.Build.FINGERPRINT.contains("generic")) {
                        strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    android.util.Log.e("GoogleApiActivity", strConcat, activityNotFoundException);
                }
                googleApiActivity.a = 1;
                googleApiActivity.finish();
            } catch (android.content.IntentSender.SendIntentException e2) {
                e = e2;
                android.util.Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                googleApiActivity.finish();
            }
        } catch (android.content.ActivityNotFoundException e3) {
            e = e3;
            googleApiActivity = this;
        } catch (android.content.IntentSender.SendIntentException e4) {
            e = e4;
            googleApiActivity = this;
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                aaet aaetVarC = aaet.c(this);
                if (i2 == -1) {
                    aaetVarC.e();
                } else if (i2 == 0) {
                    aaetVarC.d(new com.google.android.gms.common.ConnectionResult(1, 13, (android.app.PendingIntent) null, (java.lang.String) null, (java.lang.Integer) null, (android.os.Bundle) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}
