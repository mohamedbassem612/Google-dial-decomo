package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aabn extends defpackage.aanh {
    final /* synthetic */ defpackage.aabo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aabn(defpackage.aabo aaboVar, android.os.Looper looper) {
        super(looper);
        j$.util.Objects.requireNonNull(aaboVar);
        this.a = aaboVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message == null || !(message.obj instanceof android.content.Intent)) {
            android.util.Log.w("Rpc", "Dropping invalid message");
            return;
        }
        defpackage.aabo aaboVar = this.a;
        android.content.Intent intent = (android.content.Intent) message.obj;
        intent.setExtrasClassLoader(new aabc());
        if (intent.hasExtra("google.messenger")) {
            com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat) {
                aaboVar.g = parcelableExtra;
            }
            if (parcelableExtra instanceof android.os.Messenger) {
                aaboVar.f = (android.os.Messenger) parcelableExtra;
            }
        }
        android.content.Intent intent2 = (android.content.Intent) message.obj;
        java.lang.String action = intent2.getAction();
        if (!j$.util.Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
            if (android.util.Log.isLoggable("Rpc", 3)) {
                android.util.Log.d("Rpc", "Unexpected response action: ".concat(java.lang.String.valueOf(action)));
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            java.util.regex.Matcher matcher = defpackage.aabo.b.matcher(stringExtra);
            if (!matcher.matches()) {
                if (android.util.Log.isLoggable("Rpc", 3)) {
                    android.util.Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                    return;
                }
                return;
            }
            java.lang.String strGroup = matcher.group(1);
            java.lang.String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                android.os.Bundle extras = intent2.getExtras();
                extras.putString("registration_id", strGroup2);
                aaboVar.c(strGroup, extras);
                return;
            }
            return;
        }
        java.lang.String stringExtra2 = intent2.getStringExtra("error");
        if (stringExtra2 == null) {
            android.util.Log.w("Rpc", "Unexpected response, no error or registration id ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent2.getExtras()))));
            return;
        }
        if (android.util.Log.isLoggable("Rpc", 3)) {
            android.util.Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
        }
        if (!stringExtra2.startsWith("|")) {
            defpackage.aec aecVar = aaboVar.c;
            synchronized (aecVar) {
                for (int i = 0; i < aecVar.d; i++) {
                    aaboVar.c((java.lang.String) aecVar.d(i), intent2.getExtras());
                }
            }
            return;
        }
        java.lang.String[] strArrSplit = stringExtra2.split("\\|");
        if (strArrSplit.length <= 2 || !j$.util.Objects.equals(strArrSplit[1], "ID")) {
            android.util.Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
            return;
        }
        java.lang.String str = strArrSplit[2];
        java.lang.String strSubstring = strArrSplit[3];
        if (strSubstring.startsWith(":")) {
            strSubstring = strSubstring.substring(1);
        }
        aaboVar.c(str, intent2.putExtra("error", strSubstring).getExtras());
    }
}
