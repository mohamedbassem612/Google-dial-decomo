package com.android.onboarding.config.foregroundpriority;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ForegroundPriorityConfig implements android.os.Parcelable, defpackage.xpa {
    public static final java.lang.String KEY_PRIORITIES = "priorities";
    private final java.util.List priorities;
    public static final defpackage.xeu Companion = new defpackage.xeu();
    public static final android.os.Parcelable.Creator CREATOR = new gec(20);

    public ForegroundPriorityConfig(java.util.List list) {
        aooh.f(list, "priorities");
        this.priorities = list;
    }

    public static /* synthetic */ com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig copy$default(com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig foregroundPriorityConfig, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = foregroundPriorityConfig.priorities;
        }
        return foregroundPriorityConfig.copy(list);
    }

    public final java.util.List component1() {
        return this.priorities;
    }

    public final com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig copy(java.util.List list) {
        aooh.f(list, "priorities");
        return new com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig) && aooh.n(this.priorities, ((com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig) obj).priorities);
        }
        return true;
    }

    public final java.util.List getPriorities() {
        return this.priorities;
    }

    public int hashCode() {
        return this.priorities.hashCode();
    }

    public final defpackage.xex resolvePriority(defpackage.xib xibVar, java.lang.String str) {
        int i = 0;
        for (com.android.onboarding.config.foregroundpriority.ForegroundPriority foregroundPriority : this.priorities) {
            int i2 = i + 1;
            if (foregroundPriority.matches(xibVar, str)) {
                return foregroundPriority.getDisabled() ? defpackage.xew.a : new defpackage.xev(this.priorities.size() - i);
            }
            i = i2;
        }
        return defpackage.xew.a;
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        defpackage.xfh.k(persistableBundle, "priorities", this.priorities);
        return persistableBundle;
    }

    public java.lang.String toString() {
        return "ForegroundPriorityConfig(priorities=" + this.priorities + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        java.util.List list = this.priorities;
        parcel.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.android.onboarding.config.foregroundpriority.ForegroundPriority) it.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ForegroundPriorityConfig() {
        java.util.List list = null;
        this(list, 1, list);
    }

    public /* synthetic */ ForegroundPriorityConfig(java.util.List list, int i, aooc aoocVar) {
        this((i & 1) != 0 ? aokc.a : list);
    }
}
