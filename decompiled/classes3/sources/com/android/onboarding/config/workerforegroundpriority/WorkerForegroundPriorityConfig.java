package com.android.onboarding.config.workerforegroundpriority;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class WorkerForegroundPriorityConfig implements android.os.Parcelable, defpackage.xpa {
    public static final java.lang.String KEY_PRIORITIES = "priorities";
    private final java.util.List priorities;
    public static final defpackage.xez Companion = new defpackage.xez();
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(0);

    public WorkerForegroundPriorityConfig(java.util.List list) {
        aooh.f(list, "priorities");
        this.priorities = list;
    }

    public static /* synthetic */ com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig copy$default(com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig workerForegroundPriorityConfig, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = workerForegroundPriorityConfig.priorities;
        }
        return workerForegroundPriorityConfig.copy(list);
    }

    public final java.util.List component1() {
        return this.priorities;
    }

    public final com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig copy(java.util.List list) {
        aooh.f(list, "priorities");
        return new com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig) && aooh.n(this.priorities, ((com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig) obj).priorities);
        }
        return true;
    }

    public final java.util.List getPriorities() {
        return this.priorities;
    }

    public final java.lang.Integer getPriority(int i) {
        java.lang.Object next;
        java.util.Iterator it = this.priorities.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority) next).getWorkerId() != i);
        com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority workerForegroundPriority = (com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority) next;
        if (workerForegroundPriority != null) {
            return java.lang.Integer.valueOf(workerForegroundPriority.getPriority());
        }
        return null;
    }

    public int hashCode() {
        return this.priorities.hashCode();
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        defpackage.xfh.k(persistableBundle, "priorities", this.priorities);
        return persistableBundle;
    }

    public java.lang.String toString() {
        return "WorkerForegroundPriorityConfig(priorities=" + this.priorities + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        java.util.List list = this.priorities;
        parcel.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority) it.next()).writeToParcel(parcel, i);
        }
    }
}
