package com.google.android.libraries.onegoogle.accountmanagement;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AddAccountActivity extends android.app.Activity {
    private boolean a;

    private final void a(android.os.Bundle bundle) {
        this.a = bundle.getBoolean("isAddActivityStarted");
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9) {
            defpackage.aeiu aeiuVar = defpackage.aeiu.a;
            if (aeiuVar.b) {
                aeiuVar.b = false;
                aeiuVar.c = ahyn.h(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        defpackage.aeiu.a.b = true;
        if (bundle != null) {
            a(bundle);
        }
        if (this.a) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        intent.putExtra("account_types", new java.lang.String[]{"com.google"});
        startActivityForResult(intent, 9);
        this.a = true;
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        a(bundle);
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isAddActivityStarted", this.a);
    }
}
