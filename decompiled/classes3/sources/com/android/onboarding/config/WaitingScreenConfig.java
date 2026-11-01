package com.android.onboarding.config;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class WaitingScreenConfig implements android.os.Parcelable, defpackage.xpa {
    public static final java.lang.String KEY_CONTRACT = "contract";
    private final java.lang.String contract;
    public static final defpackage.xes Companion = new defpackage.xes();
    public static final android.os.Parcelable.Creator CREATOR = new gec(18);

    public /* synthetic */ WaitingScreenConfig(java.lang.String str, int i, aooc aoocVar) {
        this(1 == (i & 1) ? null : str);
    }

    public static /* synthetic */ com.android.onboarding.config.WaitingScreenConfig copy$default(com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = waitingScreenConfig.contract;
        }
        return waitingScreenConfig.copy(str);
    }

    public final java.lang.String component1() {
        return this.contract;
    }

    public final com.android.onboarding.config.WaitingScreenConfig copy(java.lang.String str) {
        return new com.android.onboarding.config.WaitingScreenConfig(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.android.onboarding.config.WaitingScreenConfig) && aooh.n(this.contract, ((com.android.onboarding.config.WaitingScreenConfig) obj).contract);
        }
        return true;
    }

    public final java.lang.String getContract() {
        return this.contract;
    }

    public int hashCode() {
        java.lang.String str = this.contract;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString(KEY_CONTRACT, this.contract);
        return persistableBundle;
    }

    public java.lang.String toString() {
        return "WaitingScreenConfig(contract=" + this.contract + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeString(this.contract);
    }

    public WaitingScreenConfig(java.lang.String str) {
        this.contract = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WaitingScreenConfig() {
        java.lang.String str = null;
        this(str, 1, str);
    }
}
