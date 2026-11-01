package com.google.apps.tiktok.account.api.controller;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AutoValue_ValidationResult extends com.google.apps.tiktok.account.api.controller.ValidationResult {
    private final boolean a;
    private final boolean b;
    private final android.content.Intent c;

    public AutoValue_ValidationResult(boolean z, boolean z2, android.content.Intent intent) {
        this.a = z;
        this.b = z2;
        this.c = intent;
    }

    @Override // com.google.apps.tiktok.account.api.controller.ValidationResult
    public final android.content.Intent a() {
        return this.c;
    }

    @Override // com.google.apps.tiktok.account.api.controller.ValidationResult
    public final boolean b() {
        return this.b;
    }

    @Override // com.google.apps.tiktok.account.api.controller.ValidationResult
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.apps.tiktok.account.api.controller.ValidationResult) {
            com.google.apps.tiktok.account.api.controller.ValidationResult validationResult = (com.google.apps.tiktok.account.api.controller.ValidationResult) obj;
            if (this.a == validationResult.c() && this.b == validationResult.b()) {
                android.content.Intent intent = this.c;
                if (intent == null) {
                    if (validationResult.a() == null) {
                        return true;
                    }
                } else if (intent.equals(validationResult.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.content.Intent intent = this.c;
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ (intent == null ? 0 : intent.hashCode());
    }

    public final java.lang.String toString() {
        return "ValidationResult{isValid=" + this.a + ", clearState=" + this.b + ", getIntentToMeet=" + java.lang.String.valueOf(this.c) + '}';
    }
}
