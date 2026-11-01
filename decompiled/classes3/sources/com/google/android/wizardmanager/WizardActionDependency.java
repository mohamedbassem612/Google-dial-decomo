package com.google.android.wizardmanager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class WizardActionDependency implements android.os.Parcelable, defpackage.xpa {
    private static final java.lang.String ACTION_ID_KEY = "action_id";
    private static final java.lang.String CHILDREN_KEY = "children";
    private static final java.lang.String DEPENDENCY_TYPE_KEY = "dependency_type";
    private static final java.lang.String GROUPING_TYPE_KEY = "grouping_type";
    private static final java.lang.String REQUIREMENT_TYPE_KEY = "requirement_type";
    private static final java.lang.String RESULT_CODE_KEY = "result_code";
    private final java.lang.String actionId;
    private final java.util.List children;
    private final defpackage.agmf groupingType;
    private final defpackage.agmg requirementType;
    private final java.lang.Integer resultCode;
    private final defpackage.agme type;
    public static final defpackage.agmc Companion = new defpackage.agmc();
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(19);

    private WizardActionDependency(defpackage.agme agmeVar, defpackage.agmf agmfVar, java.lang.String str, java.util.List list, defpackage.agmg agmgVar, java.lang.Integer num) {
        this.type = agmeVar;
        this.groupingType = agmfVar;
        this.actionId = str;
        this.requirementType = agmgVar;
        this.resultCode = num;
        java.util.List listBZ = ajsz.bZ(list);
        this.children = listBZ;
        if (agmfVar == defpackage.agmf.NOT && listBZ.size() != 1) {
            throw new java.lang.IllegalArgumentException("NOT dependency group must contain exactly one child, got " + listBZ.size());
        }
        if (num == null || agmgVar == defpackage.agmg.COMPLETED) {
            return;
        }
        java.util.Objects.toString(agmgVar);
        throw new java.lang.IllegalArgumentException("resultCode can only be specified when requirementType is COMPLETED, got ".concat(java.lang.String.valueOf(agmgVar)));
    }

    public static final com.google.android.wizardmanager.WizardActionDependency action(java.lang.String str, defpackage.agme agmeVar, defpackage.agmg agmgVar) {
        aooh.f(str, "actionId");
        aooh.f(agmeVar, "type");
        aooh.f(agmgVar, "requirementType");
        return defpackage.agmc.k(str, agmeVar, agmgVar, 8);
    }

    public static final com.google.android.wizardmanager.WizardActionDependency allOf(java.util.List list) {
        aooh.f(list, CHILDREN_KEY);
        return defpackage.agmc.h(list, defpackage.agme.EXECUTION);
    }

    public static final com.google.android.wizardmanager.WizardActionDependency anyOf(java.util.List list) {
        aooh.f(list, CHILDREN_KEY);
        return defpackage.agmc.i(list, defpackage.agme.EXECUTION);
    }

    public static final com.google.android.wizardmanager.WizardActionDependency not(com.google.android.wizardmanager.WizardActionDependency wizardActionDependency) {
        aooh.f(wizardActionDependency, "child");
        return defpackage.agmc.j(wizardActionDependency, defpackage.agme.EXECUTION);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aooh.n(getClass(), obj.getClass())) {
            com.google.android.wizardmanager.WizardActionDependency wizardActionDependency = (com.google.android.wizardmanager.WizardActionDependency) obj;
            if (this.type == wizardActionDependency.type && this.groupingType == wizardActionDependency.groupingType && aooh.n(this.actionId, wizardActionDependency.actionId) && aooh.n(this.children, wizardActionDependency.children) && this.requirementType == wizardActionDependency.requirementType && aooh.n(this.resultCode, wizardActionDependency.resultCode)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String getActionId() {
        return this.actionId;
    }

    public final java.util.List getChildren() {
        return this.children;
    }

    public final defpackage.agmf getGroupingType() {
        return this.groupingType;
    }

    public final defpackage.agmg getRequirementType() {
        return this.requirementType;
    }

    public final java.lang.Integer getResultCode() {
        return this.resultCode;
    }

    public final defpackage.agme getType() {
        return this.type;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.type, this.groupingType, this.actionId, this.children, this.requirementType, this.resultCode});
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final boolean isSatisfied(defpackage.agmd agmdVar) throws aois {
        boolean zA;
        aooh.f(agmdVar, "checker");
        int iOrdinal = this.groupingType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                java.util.List list = this.children;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((com.google.android.wizardmanager.WizardActionDependency) it.next()).isSatisfied(agmdVar)) {
                            return false;
                        }
                    }
                }
            } else {
                if (iOrdinal == 2) {
                    java.util.List list2 = this.children;
                    if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                        return false;
                    }
                    java.util.Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((com.google.android.wizardmanager.WizardActionDependency) it2.next()).isSatisfied(agmdVar)) {
                        }
                    }
                    return false;
                }
                if (iOrdinal != 3) {
                    throw new aois();
                }
                if (((com.google.android.wizardmanager.WizardActionDependency) ajsz.bM(this.children)).isSatisfied(agmdVar)) {
                    return false;
                }
            }
        } else {
            if (this.actionId == null) {
                return false;
            }
            int iOrdinal2 = this.requirementType.ordinal();
            if (iOrdinal2 == 0) {
                zA = agmdVar.a();
            } else if (iOrdinal2 == 1) {
                zA = agmdVar.b();
            } else {
                if (iOrdinal2 != 2) {
                    throw new aois();
                }
                zA = agmdVar.c();
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt(GROUPING_TYPE_KEY, this.groupingType.e);
        persistableBundle.putInt(DEPENDENCY_TYPE_KEY, this.type.c);
        java.lang.String str = this.actionId;
        if (str != null) {
            persistableBundle.putString(ACTION_ID_KEY, str);
        }
        if (!this.children.isEmpty()) {
            defpackage.xfh.k(persistableBundle, CHILDREN_KEY, this.children);
        }
        persistableBundle.putInt(REQUIREMENT_TYPE_KEY, this.requirementType.d);
        java.lang.Integer num = this.resultCode;
        if (num != null) {
            persistableBundle.putInt(RESULT_CODE_KEY, num.intValue());
        }
        return persistableBundle;
    }

    public java.lang.String toString() {
        return "WizardActionDependency{type=" + this.type + ", groupingType=" + this.groupingType + ", actionId='" + this.actionId + "', children=" + this.children + ", requirementType=" + this.requirementType + ", resultCode=" + this.resultCode + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeInt(this.type.c);
        parcel.writeInt(this.groupingType.e);
        parcel.writeString(this.actionId);
        parcel.writeTypedList(this.children);
        parcel.writeInt(this.requirementType.d);
        parcel.writeByte(this.resultCode != null ? (byte) 1 : (byte) 0);
        java.lang.Integer num = this.resultCode;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
    }

    public static final com.google.android.wizardmanager.WizardActionDependency allOf(java.util.List list, defpackage.agme agmeVar) {
        return defpackage.agmc.h(list, agmeVar);
    }

    public static final com.google.android.wizardmanager.WizardActionDependency anyOf(java.util.List list, defpackage.agme agmeVar) {
        return defpackage.agmc.i(list, agmeVar);
    }

    public static final com.google.android.wizardmanager.WizardActionDependency not(com.google.android.wizardmanager.WizardActionDependency wizardActionDependency, defpackage.agme agmeVar) {
        return defpackage.agmc.j(wizardActionDependency, agmeVar);
    }

    public static final com.google.android.wizardmanager.WizardActionDependency action(java.lang.String str) {
        aooh.f(str, "actionId");
        return defpackage.agmc.k(str, null, null, 14);
    }

    public static final com.google.android.wizardmanager.WizardActionDependency action(java.lang.String str, defpackage.agme agmeVar) {
        aooh.f(str, "actionId");
        aooh.f(agmeVar, "type");
        return defpackage.agmc.k(str, agmeVar, null, 12);
    }

    public static final com.google.android.wizardmanager.WizardActionDependency action(java.lang.String str, defpackage.agme agmeVar, defpackage.agmg agmgVar, java.lang.Integer num) {
        return defpackage.agmc.g(str, agmeVar, agmgVar, num);
    }

    public /* synthetic */ WizardActionDependency(defpackage.agme agmeVar, defpackage.agmf agmfVar, java.lang.String str, java.util.List list, defpackage.agmg agmgVar, java.lang.Integer num, aooc aoocVar) {
        this(agmeVar, agmfVar, str, list, agmgVar, num);
    }

    public /* synthetic */ WizardActionDependency(defpackage.agme agmeVar, defpackage.agmf agmfVar, java.lang.String str, java.util.List list, defpackage.agmg agmgVar, java.lang.Integer num, int i, aooc aoocVar) {
        this(agmeVar, agmfVar, str, list, (i & 16) != 0 ? defpackage.agmg.COMPLETED : agmgVar, (i & 32) != 0 ? null : num);
    }
}
