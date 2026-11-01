package com.android.dialer.shortcuts;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CallContactActivity extends uxz {
    private static final aimz n = aimz.i("com/android/dialer/shortcuts/CallContactActivity");
    private android.net.Uri p;

    /* JADX WARN: Multi-variable type inference failed */
    private final void w() {
        akzx akzxVarM = jxb.b.m();
        akzxVarM.u();
        jxb jxbVar = akzxVarM.b;
        jxbVar.c |= 1024;
        jxbVar.l = true;
        akzxVarM.u();
        jxb jxbVar2 = akzxVarM.b;
        jxbVar2.d = 13;
        jxbVar2.c |= 1;
        jxb jxbVarP = akzxVarM.p();
        android.net.Uri uriWithAppendedPath = this.p;
        defpackage.rho rhoVar = new defpackage.rho(this, jxbVarP);
        android.content.Context context = rhoVar.e;
        if (!zqz.a(context, "android.permission.CALL_PHONE")) {
            defpackage.rho.a.b().l("com/android/dialer/interactions/PhoneNumberInteraction", "startInteraction", 275, "PhoneNumberInteraction.java").v("Need phone permission: CALL_PHONE");
            dus.a((android.app.Activity) context, new java.lang.String[]{"android.permission.CALL_PHONE"}, 2);
            return;
        }
        java.lang.String[] strArrB = zqz.b(context, zqz.d);
        if (strArrB.length > 0) {
            defpackage.rho.a.b().l("com/android/dialer/interactions/PhoneNumberInteraction", "startInteraction", 285, "PhoneNumberInteraction.java").y("Need contact permissions: %s", java.util.Arrays.toString(strArrB));
            dus.a((android.app.Activity) context, strArrB, 1);
            return;
        }
        android.content.CursorLoader cursorLoader = rhoVar.f;
        if (cursorLoader != null) {
            cursorLoader.reset();
        }
        java.lang.String string = uriWithAppendedPath.toString();
        if (string.startsWith(android.provider.ContactsContract.Contacts.CONTENT_URI.toString())) {
            if (!string.endsWith("data")) {
                uriWithAppendedPath = android.net.Uri.withAppendedPath(uriWithAppendedPath, "data");
            }
        } else if (!string.startsWith(android.provider.ContactsContract.Data.CONTENT_URI.toString())) {
            throw new java.lang.UnsupportedOperationException(hgb.i(uriWithAppendedPath, "Input Uri must be contact Uri or data Uri (input: \"", "\")"));
        }
        rhoVar.f = new android.content.CursorLoader(context, uriWithAppendedPath, ((java.lang.Boolean) pez.bl(context).hS().a()).booleanValue() ? defpackage.rho.c : (java.lang.String[]) defpackage.rho.d.toArray(new java.lang.String[0]), "mimetype IN ('vnd.android.cursor.item/phone_v2', 'vnd.android.cursor.item/sip_address') AND data1 NOT NULL", null, null);
        rhoVar.f.registerListener(0, rhoVar);
        rhoVar.f.startLoading();
    }

    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if ("com.android.dialer.shortcuts.CALL_CONTACT".equals(getIntent().getAction())) {
            n.b().l("com/android/dialer/shortcuts/CallContactActivity", "onCreate", 53, "CallContactActivity.java").v("shortcut clicked");
            this.p = getIntent().getData();
            w();
        }
    }

    protected final void onDestroy() {
        super.onDestroy();
        n.b().l("com/android/dialer/shortcuts/CallContactActivity", "onDestroy", 62, "CallContactActivity.java").v("enter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalStateException(a.bj(i, "Unsupported request code: "));
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            w();
        } else {
            android.widget.Toast.makeText((android.content.Context) this, 2132018299, 0).show();
            finish();
        }
    }

    public final void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.p = (android.net.Uri) bundle.getParcelable("uri_key");
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("uri_key", this.p);
    }
}
