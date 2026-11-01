package com.google.android.gms.duokit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DuoKitContainerActivity extends android.app.Activity {
    private final void a() {
        java.lang.String str = getIntent().hasExtra("com.google.android.apps.tachyon.extra.REFERRER") ? java.lang.String.format("%s-%s-%s", "duokit", getPackageName(), getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER")) : java.lang.String.format("%s-%s", "duokit", getPackageName());
        try {
            startActivityForResult(new android.content.Intent("android.intent.action.VIEW").setData(android.net.Uri.parse(java.lang.String.format("market://details?id=%s&allow_update=1&referrer=%s", "com.google.android.apps.tachyon", str))).putExtra("overlay", true).putExtra("callerId", getPackageName()).putExtra("referrer", str).putExtra("allow_update", true).setPackage("com.android.vending"), 0);
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.w("DuoKitContainerActivity", "Cannot launch AlleyOop activity", e);
            aaoo.q(this);
        }
        finish();
    }

    private final void b() {
        c(new android.content.Intent("android.intent.action.MAIN").setPackage("com.google.android.apps.tachyon"), 0);
    }

    private final void c(android.content.Intent intent, int i) {
        intent.putExtra("com.google.android.gms.duokit.extra.DUOKIT_VERSION", "0.0.1");
        if (getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER") != null) {
            intent.putExtra("com.google.android.apps.tachyon.extra.REFERRER", getIntent().getStringExtra("com.google.android.apps.tachyon.extra.REFERRER"));
        }
        try {
            startActivityForResult(intent, i);
        } catch (android.content.ActivityNotFoundException e) {
            android.util.Log.e("DuoKitContainerActivity", "No activity found to handle intent", e);
            android.widget.Toast.makeText(this, 2132019480, 0).show();
        }
        if (i == 0) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (android.util.Log.isLoggable("DuoKitContainerActivity", 4)) {
            android.util.Log.i("DuoKitContainerActivity", a.bf(i2, i, "onActivityResult with requestCode: ", ", resultCode: "));
        }
        if (i == 100) {
            if (i2 != 0) {
                finish();
            } else {
                android.util.Log.w("DuoKitContainerActivity", "Start group request failed, try to launch Duo");
                b();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String action = getIntent().getAction();
        if (action == null) {
            android.util.Log.e("DuoKitContainerActivity", "null action");
            finish();
            return;
        }
        switch (action.hashCode()) {
            case -1769882372:
                if (action.equals("com.google.android.gms.duokit.action.LAUNCH_DUO")) {
                    b();
                    return;
                }
                break;
            case -1611836229:
                if (action.equals("com.google.android.gms.duokit.action.INSTALL_DUO_VIA_ALLEYOOP")) {
                    a();
                    return;
                }
                break;
            case -704052074:
                if (action.equals("com.google.android.gms.duokit.action.DUO_START_GROUP_FLOW")) {
                    c(new android.content.Intent("com.google.android.apps.tachyon.action.CALL_GROUP_MEMBERS").setPackage("com.google.android.apps.tachyon").putStringArrayListExtra("members", getIntent().getStringArrayListExtra("members")), 100);
                    return;
                }
                break;
            case 179439980:
                if (action.equals("com.google.android.gms.duokit.action.REGISTER_DUO")) {
                    android.content.Intent intent = new android.content.Intent("com.google.android.apps.tachyon.action.REGISTER").setPackage("com.google.android.apps.tachyon");
                    if (getIntent().hasExtra("com.google.android.apps.tachyon.extra.CALLEES")) {
                        intent.putExtra("com.google.android.apps.tachyon.extra.CALLEES", getIntent().getStringArrayListExtra("com.google.android.apps.tachyon.extra.CALLEES"));
                    }
                    c(intent, 0);
                    return;
                }
                break;
            case 1616149577:
                if (action.equals("com.google.android.gms.duokit.action.DUO_CALL")) {
                    android.net.Uri data = getIntent().getData();
                    c(new android.content.Intent("com.google.android.apps.tachyon.action.CALL").setPackage("com.google.android.apps.tachyon").setData(data).putExtra("com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY", getIntent().getBooleanExtra("com.google.android.apps.tachyon.extra.IS_AUDIO_ONLY", false)), 0);
                    return;
                }
                break;
        }
        android.util.Log.e("DuoKitContainerActivity", "Container activity called without an action! Not launching any activity.");
        finish();
    }
}
