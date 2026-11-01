package com.google.android.gms.auth;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class UserRecoverableAuthException extends zwj {
    public final android.content.Intent a;
    public final int b;

    public UserRecoverableAuthException(java.lang.String str, android.content.Intent intent, int i) {
        super(str);
        this.a = intent;
        this.b = i;
    }

    public static com.google.android.gms.auth.UserRecoverableAuthException a(java.lang.String str, android.content.Intent intent) {
        aais.as(intent);
        return new com.google.android.gms.auth.UserRecoverableAuthException(str, intent, 2);
    }
}
