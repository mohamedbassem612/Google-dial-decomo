package com.android.onboarding.config.foregroundpriority;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ForegroundPriority implements android.os.Parcelable, defpackage.xpa {
    public static final java.lang.String KEY_ACTION = "action";
    public static final java.lang.String KEY_DISABLED = "disabled";
    public static final java.lang.String KEY_NODE = "node";
    private final java.lang.String action;
    private final boolean disabled;
    private final java.lang.String node;
    public static final defpackage.xet Companion = new defpackage.xet();
    public static final android.os.Parcelable.Creator CREATOR = new gec(19);
    private static final j$.util.concurrent.ConcurrentHashMap regexCache = new j$.util.concurrent.ConcurrentHashMap();

    public /* synthetic */ ForegroundPriority(java.lang.String str, java.lang.String str2, boolean z, int i, aooc aoocVar) {
        this(1 == (i & 1) ? null : str, (i & 2) != 0 ? null : str2, ((i & 4) == 0) & z);
    }

    public static /* synthetic */ com.android.onboarding.config.foregroundpriority.ForegroundPriority copy$default(com.android.onboarding.config.foregroundpriority.ForegroundPriority foregroundPriority, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = foregroundPriority.node;
        }
        if ((i & 2) != 0) {
            str2 = foregroundPriority.action;
        }
        if ((i & 4) != 0) {
            z = foregroundPriority.disabled;
        }
        return foregroundPriority.copy(str, str2, z);
    }

    public final java.lang.String component1() {
        return this.node;
    }

    public final java.lang.String component2() {
        return this.action;
    }

    public final boolean component3() {
        return this.disabled;
    }

    public final com.android.onboarding.config.foregroundpriority.ForegroundPriority copy(java.lang.String str, java.lang.String str2, boolean z) {
        return new com.android.onboarding.config.foregroundpriority.ForegroundPriority(str, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.onboarding.config.foregroundpriority.ForegroundPriority) {
            com.android.onboarding.config.foregroundpriority.ForegroundPriority foregroundPriority = (com.android.onboarding.config.foregroundpriority.ForegroundPriority) obj;
            if (aooh.n(this.node, foregroundPriority.node) && aooh.n(this.action, foregroundPriority.action) && this.disabled == foregroundPriority.disabled) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final java.lang.String getNode() {
        return this.node;
    }

    public int hashCode() {
        java.lang.String str = this.node;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.action;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + anty.L(this.disabled);
    }

    public final boolean isDefault() {
        return this.node == null && this.action == null;
    }

    public final boolean matches(defpackage.xib xibVar, java.lang.String str) {
        java.lang.String str2 = this.node;
        if (str2 != null && (xibVar == null || !defpackage.xet.d(str2, xibVar.identity()))) {
            return false;
        }
        java.lang.String str3 = this.action;
        return str3 == null || (str != null && defpackage.xet.d(str3, str));
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.lang.String str = this.node;
        if (str != null) {
            persistableBundle.putString(KEY_NODE, str);
        }
        java.lang.String str2 = this.action;
        if (str2 != null) {
            persistableBundle.putString(KEY_ACTION, str2);
        }
        persistableBundle.putBoolean(KEY_DISABLED, this.disabled);
        return persistableBundle;
    }

    public java.lang.String toString() {
        return "ForegroundPriority(node=" + this.node + ", action=" + this.action + ", disabled=" + this.disabled + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeString(this.node);
        parcel.writeString(this.action);
        parcel.writeInt(this.disabled ? 1 : 0);
    }

    public ForegroundPriority(java.lang.String str) {
        this(str, null, false, 6, null);
    }

    public ForegroundPriority(java.lang.String str, java.lang.String str2) {
        this(str, str2, false, 4, null);
    }

    public ForegroundPriority(java.lang.String str, java.lang.String str2, boolean z) {
        this.node = str;
        this.action = str2;
        this.disabled = z;
    }

    public ForegroundPriority() {
        this(null, null, false, 7, null);
    }
}
