package com.google.android.wizardmanager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class WizardBranchArray extends android.util.SparseArray implements android.os.Parcelable, defpackage.xpa {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(20);
    static final java.lang.String DEFAULT_ACTION_ID_KEY = "default_action_id";
    static final java.lang.String DEFAULT_PRIMARY_ACTION_ID_KEY = "default_primary_action_id";
    static final java.lang.String MAP_KEY = "map";
    static final java.lang.String PRIMARY_MAP_KEY = "primary_map";
    static final java.lang.String SPLITTER = ",";
    private java.lang.String defaultActionIds;
    private java.lang.String defaultPrimaryActionId;
    private android.util.SparseArray primaryActionIds = new android.util.SparseArray();

    /* JADX INFO: renamed from: -$$Nest$fputdefaultActionIds, reason: not valid java name */
    public static /* bridge */ /* synthetic */ void m48$$Nest$fputdefaultActionIds(com.google.android.wizardmanager.WizardBranchArray wizardBranchArray, java.lang.String str) {
        wizardBranchArray.defaultActionIds = str;
    }

    /* JADX INFO: renamed from: -$$Nest$fputdefaultPrimaryActionId, reason: not valid java name */
    public static /* bridge */ /* synthetic */ void m49$$Nest$fputdefaultPrimaryActionId(com.google.android.wizardmanager.WizardBranchArray wizardBranchArray, java.lang.String str) {
        wizardBranchArray.defaultPrimaryActionId = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.wizardmanager.WizardBranchArray)) {
            return false;
        }
        com.google.android.wizardmanager.WizardBranchArray wizardBranchArray = (com.google.android.wizardmanager.WizardBranchArray) obj;
        if (!j$.util.Objects.equals(this.defaultActionIds, wizardBranchArray.defaultActionIds) || !j$.util.Objects.equals(this.defaultPrimaryActionId, wizardBranchArray.defaultPrimaryActionId) || size() != wizardBranchArray.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            int iKeyAt = keyAt(i);
            if (!j$.util.Objects.equals((java.lang.String) get(iKeyAt), (java.lang.String) wizardBranchArray.get(iKeyAt))) {
                return false;
            }
        }
        if (this.primaryActionIds.size() != wizardBranchArray.primaryActionIds.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.primaryActionIds.size(); i2++) {
            int iKeyAt2 = this.primaryActionIds.keyAt(i2);
            if (!j$.util.Objects.equals((java.lang.String) this.primaryActionIds.get(iKeyAt2), (java.lang.String) wizardBranchArray.primaryActionIds.get(iKeyAt2))) {
                return false;
            }
        }
        return true;
    }

    public java.lang.String getActionId(int i) {
        java.util.List actionIds = getActionIds(i);
        if (actionIds == null || actionIds.isEmpty()) {
            return null;
        }
        return (java.lang.String) actionIds.get(0);
    }

    public java.util.List getActionIds(int i) {
        java.lang.String str = (java.lang.String) get(i);
        if (str == null && i < -1) {
            str = (java.lang.String) get(-2);
            if (android.util.Log.isLoggable("WizardManager", 3) && str != null) {
                defpackage.agmc.p("getActionIds: resultCode=" + i + " not mapped, falling back to RESULT_TASK_GENERIC_ERROR (-2): " + str);
            }
        }
        if (str == null) {
            str = this.defaultActionIds;
        }
        if (str == null) {
            return null;
        }
        return defpackage.agmc.r(str.split(SPLITTER));
    }

    public java.lang.String getDefaultActionId() {
        java.util.List defaultActionIds = getDefaultActionIds();
        if (defaultActionIds == null || defaultActionIds.isEmpty()) {
            return null;
        }
        return (java.lang.String) defaultActionIds.get(0);
    }

    public java.util.List getDefaultActionIds() {
        java.lang.String str = this.defaultActionIds;
        if (str == null) {
            return null;
        }
        return defpackage.agmc.r(str.split(SPLITTER));
    }

    public java.lang.String getDefaultPrimaryActionId() {
        return this.defaultPrimaryActionId;
    }

    public java.lang.String getPrimaryActionId(int i) {
        if (indexOfKey(i) >= 0) {
            return (java.lang.String) this.primaryActionIds.get(i);
        }
        if (i >= -1 || indexOfKey(-2) < 0) {
            return this.defaultPrimaryActionId;
        }
        java.lang.String str = (java.lang.String) this.primaryActionIds.get(-2);
        if (!android.util.Log.isLoggable("WizardManager", 3)) {
            return str;
        }
        defpackage.agmc.p("getPrimaryActionId: resultCode=" + i + " not mapped, falling back to RESULT_TASK_GENERIC_ERROR (-2) primaryActionId: " + str);
        return str;
    }

    public int hashCode() {
        int iHash = j$.util.Objects.hash(new java.lang.Object[]{this.defaultActionIds, this.defaultPrimaryActionId});
        for (int i = 0; i < size(); i++) {
            java.lang.String str = (java.lang.String) get(keyAt(i));
            iHash = (iHash * 31) + (str != null ? str.hashCode() : 0);
        }
        for (int i2 = 0; i2 < this.primaryActionIds.size(); i2++) {
            android.util.SparseArray sparseArray = this.primaryActionIds;
            java.lang.String str2 = (java.lang.String) sparseArray.get(sparseArray.keyAt(i2));
            iHash = (iHash * 31) + (str2 != null ? str2.hashCode() : 0);
        }
        return iHash;
    }

    public void put(int i, java.util.List list, java.lang.String str) {
        put(i, android.text.TextUtils.join(SPLITTER, list));
        putPrimaryActionId(i, str);
    }

    public void putPrimaryActionId(int i, java.lang.String str) {
        android.util.SparseArray sparseArray = this.primaryActionIds;
        if (str != null) {
            sparseArray.put(i, str);
        } else {
            sparseArray.remove(i);
        }
    }

    public void setDefaultActionId(java.lang.String str) {
        this.defaultActionIds = str;
    }

    public void setDefaultActionIds(java.util.List list, java.lang.String str) {
        this.defaultActionIds = android.text.TextUtils.join(SPLITTER, list);
        this.defaultPrimaryActionId = str;
    }

    public void setDefaultPrimaryActionId(java.lang.String str) {
        this.defaultPrimaryActionId = str;
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString(DEFAULT_ACTION_ID_KEY, this.defaultActionIds);
        persistableBundle.putString(DEFAULT_PRIMARY_ACTION_ID_KEY, this.defaultPrimaryActionId);
        android.os.PersistableBundle persistableBundle2 = new android.os.PersistableBundle();
        for (int i = 0; i < size(); i++) {
            persistableBundle2.putString(java.lang.String.valueOf(keyAt(i)), (java.lang.String) valueAt(i));
        }
        persistableBundle.putPersistableBundle(MAP_KEY, persistableBundle2);
        android.os.PersistableBundle persistableBundle3 = new android.os.PersistableBundle();
        for (int i2 = 0; i2 < this.primaryActionIds.size(); i2++) {
            persistableBundle3.putString(java.lang.String.valueOf(this.primaryActionIds.keyAt(i2)), (java.lang.String) this.primaryActionIds.valueAt(i2));
        }
        persistableBundle.putPersistableBundle(PRIMARY_MAP_KEY, persistableBundle3);
        return persistableBundle;
    }

    @Override // android.util.SparseArray
    public java.lang.String toString() {
        return super.toString() + " default=" + this.defaultActionIds + " defaultPrimary=" + this.defaultPrimaryActionId + " primaryMap=" + java.lang.String.valueOf(this.primaryActionIds);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.defaultActionIds);
        parcel.writeString(this.defaultPrimaryActionId);
        parcel.writeSparseArray(this);
        parcel.writeSparseArray(this.primaryActionIds);
    }

    public void setDefaultActionIds(java.util.List list) {
        setDefaultActionIds(list, null);
    }

    public void put(int i, java.util.List list) {
        put(i, list, null);
    }
}
