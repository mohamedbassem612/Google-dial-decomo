package com.android.onboarding.config;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class OnboardingConfig implements android.os.Parcelable, defpackage.xpa {
    public static final java.lang.String KEY_CONFIG_URI = "configUri";
    public static final java.lang.String KEY_FOREGROUND_PRIORITY_CONFIG = "foregroundPriorityConfig";
    public static final java.lang.String KEY_WAITING_SCREEN_CONFIG = "waitingScreenConfig";
    public static final java.lang.String KEY_WORKER_FOREGROUND_PRIORITY_CONFIG = "workerForegroundPriorityConfig";
    private final java.lang.String configUri;
    private final com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig foregroundPriorityConfig;
    private final com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig;
    private final com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig;
    public static final defpackage.xer Companion = new defpackage.xer(0);
    public static final android.os.Parcelable.Creator CREATOR = new gec(17);

    public /* synthetic */ OnboardingConfig(com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig, com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig foregroundPriorityConfig, java.lang.String str, int i, aooc aoocVar) {
        this(1 == (i & 1) ? null : waitingScreenConfig, (i & 2) != 0 ? null : workerForegroundPriorityConfig, (i & 4) != 0 ? null : foregroundPriorityConfig, (i & 8) != 0 ? null : str);
    }

    public static /* synthetic */ com.android.onboarding.config.OnboardingConfig copy$default(com.android.onboarding.config.OnboardingConfig onboardingConfig, com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig, com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig foregroundPriorityConfig, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            waitingScreenConfig = onboardingConfig.waitingScreenConfig;
        }
        if ((i & 2) != 0) {
            workerForegroundPriorityConfig = onboardingConfig.workerForegroundPriorityConfig;
        }
        if ((i & 4) != 0) {
            foregroundPriorityConfig = onboardingConfig.foregroundPriorityConfig;
        }
        if ((i & 8) != 0) {
            str = onboardingConfig.configUri;
        }
        return onboardingConfig.copy(waitingScreenConfig, workerForegroundPriorityConfig, foregroundPriorityConfig, str);
    }

    public final com.android.onboarding.config.WaitingScreenConfig component1() {
        return this.waitingScreenConfig;
    }

    public final com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig component2() {
        return this.workerForegroundPriorityConfig;
    }

    public final com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig component3() {
        return this.foregroundPriorityConfig;
    }

    public final java.lang.String component4() {
        return this.configUri;
    }

    public final com.android.onboarding.config.OnboardingConfig copy(com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig, com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig foregroundPriorityConfig, java.lang.String str) {
        return new com.android.onboarding.config.OnboardingConfig(waitingScreenConfig, workerForegroundPriorityConfig, foregroundPriorityConfig, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.onboarding.config.OnboardingConfig) {
            com.android.onboarding.config.OnboardingConfig onboardingConfig = (com.android.onboarding.config.OnboardingConfig) obj;
            if (aooh.n(this.waitingScreenConfig, onboardingConfig.waitingScreenConfig) && aooh.n(this.workerForegroundPriorityConfig, onboardingConfig.workerForegroundPriorityConfig) && aooh.n(this.foregroundPriorityConfig, onboardingConfig.foregroundPriorityConfig) && aooh.n(this.configUri, onboardingConfig.configUri)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String getConfigUri() {
        return this.configUri;
    }

    public final com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig getForegroundPriorityConfig() {
        return this.foregroundPriorityConfig;
    }

    public final com.android.onboarding.config.WaitingScreenConfig getWaitingScreenConfig() {
        return this.waitingScreenConfig;
    }

    public final com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig getWorkerForegroundPriorityConfig() {
        return this.workerForegroundPriorityConfig;
    }

    public int hashCode() {
        com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig = this.waitingScreenConfig;
        int iHashCode = waitingScreenConfig == null ? 0 : waitingScreenConfig.hashCode();
        com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig = this.workerForegroundPriorityConfig;
        int iHashCode2 = workerForegroundPriorityConfig == null ? 0 : workerForegroundPriorityConfig.hashCode();
        int i = iHashCode * 31;
        com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig foregroundPriorityConfig = this.foregroundPriorityConfig;
        int iHashCode3 = (((i + iHashCode2) * 31) + (foregroundPriorityConfig == null ? 0 : foregroundPriorityConfig.hashCode())) * 31;
        java.lang.String str = this.configUri;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.waitingScreenConfig == null && this.workerForegroundPriorityConfig == null && this.foregroundPriorityConfig == null;
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        defpackage.xfh.i(persistableBundle, KEY_WAITING_SCREEN_CONFIG, this.waitingScreenConfig);
        defpackage.xfh.i(persistableBundle, KEY_WORKER_FOREGROUND_PRIORITY_CONFIG, this.workerForegroundPriorityConfig);
        defpackage.xfh.i(persistableBundle, KEY_FOREGROUND_PRIORITY_CONFIG, this.foregroundPriorityConfig);
        persistableBundle.putString(KEY_CONFIG_URI, this.configUri);
        return persistableBundle;
    }

    public java.lang.String toString() {
        return "OnboardingConfig(waitingScreenConfig=" + this.waitingScreenConfig + ", workerForegroundPriorityConfig=" + this.workerForegroundPriorityConfig + ", foregroundPriorityConfig=" + this.foregroundPriorityConfig + ", configUri=" + this.configUri + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig = this.waitingScreenConfig;
        if (waitingScreenConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            waitingScreenConfig.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.workerForegroundPriorityConfig, i);
        parcel.writeParcelable(this.foregroundPriorityConfig, i);
        parcel.writeString(this.configUri);
    }

    public OnboardingConfig(com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig) {
        this(waitingScreenConfig, null, null, null, 14, null);
    }

    public OnboardingConfig(com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig) {
        this(waitingScreenConfig, workerForegroundPriorityConfig, null, null, 12, null);
    }

    public OnboardingConfig(com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig, com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig foregroundPriorityConfig) {
        this(waitingScreenConfig, workerForegroundPriorityConfig, foregroundPriorityConfig, null, 8, null);
    }

    public OnboardingConfig(com.android.onboarding.config.WaitingScreenConfig waitingScreenConfig, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig, com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig foregroundPriorityConfig, java.lang.String str) {
        this.waitingScreenConfig = waitingScreenConfig;
        this.workerForegroundPriorityConfig = workerForegroundPriorityConfig;
        this.foregroundPriorityConfig = foregroundPriorityConfig;
        this.configUri = str;
    }

    public OnboardingConfig() {
        this(null, null, null, null, 15, null);
    }
}
