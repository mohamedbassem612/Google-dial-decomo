package com.android.onboarding.config.workerforegroundpriority;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class WorkerForegroundPriority implements android.os.Parcelable, defpackage.xpa {
    public static final java.lang.String KEY_PRIORITY = "priority";
    public static final java.lang.String KEY_WORKER_ID = "workerId";
    private final int priority;
    private final int workerId;
    public static final defpackage.xey Companion = new defpackage.xey();
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(1);

    public WorkerForegroundPriority(int i, int i2) {
        this.workerId = i;
        this.priority = i2;
    }

    public static /* synthetic */ com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority copy$default(com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority workerForegroundPriority, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = workerForegroundPriority.workerId;
        }
        if ((i3 & 2) != 0) {
            i2 = workerForegroundPriority.priority;
        }
        return workerForegroundPriority.copy(i, i2);
    }

    public final int component1() {
        return this.workerId;
    }

    public final int component2() {
        return this.priority;
    }

    public final com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority copy(int i, int i2) {
        return new com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority) {
            com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority workerForegroundPriority = (com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority) obj;
            if (this.workerId == workerForegroundPriority.workerId && this.priority == workerForegroundPriority.priority) {
                return true;
            }
        }
        return false;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getWorkerId() {
        return this.workerId;
    }

    public int hashCode() {
        return (this.workerId * 31) + this.priority;
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt(KEY_WORKER_ID, this.workerId);
        persistableBundle.putInt(KEY_PRIORITY, this.priority);
        return persistableBundle;
    }

    public java.lang.String toString() {
        return "WorkerForegroundPriority(workerId=" + this.workerId + ", priority=" + this.priority + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeInt(this.workerId);
        parcel.writeInt(this.priority);
    }
}
