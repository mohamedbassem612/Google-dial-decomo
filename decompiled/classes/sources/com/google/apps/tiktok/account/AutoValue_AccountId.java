package com.google.apps.tiktok.account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AutoValue_AccountId extends com.google.apps.tiktok.account.AccountId {
    public final int a;

    public AutoValue_AccountId(int i) {
        this.a = i;
    }

    @Override // com.google.apps.tiktok.account.AccountId
    @java.lang.Deprecated
    public final int a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.apps.tiktok.account.AccountId) && this.a == ((com.google.apps.tiktok.account.AccountId) obj).a();
        }
        return true;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final java.lang.String toString() {
        return "AccountId{id=" + this.a + '}';
    }
}
