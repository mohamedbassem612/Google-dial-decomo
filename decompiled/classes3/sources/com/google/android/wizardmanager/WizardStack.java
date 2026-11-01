package com.google.android.wizardmanager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class WizardStack implements android.os.Parcelable, defpackage.xpa {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(1);
    static final java.lang.String SIZE_KEY = "size";
    private final java.util.List stack;

    public WizardStack(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.stack = arrayList;
        parcel.readTypedList(arrayList, com.google.android.wizardmanager.WizardAction.CREATOR);
    }

    public static void dump(com.google.android.wizardmanager.WizardStack wizardStack) {
        if (wizardStack == null) {
            defpackage.agmc.p("DUMP WizardStack instance is null");
            return;
        }
        int i = 0;
        for (com.google.android.wizardmanager.WizardAction wizardAction : wizardStack.stack) {
            defpackage.agmc.p(a.bs(i, "DUMP action[", "]="));
            com.google.android.wizardmanager.WizardAction.dump("  ", wizardAction);
            i++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.wizardmanager.WizardStack) {
            return this.stack.equals(((com.google.android.wizardmanager.WizardStack) obj).stack);
        }
        return false;
    }

    public int hashCode() {
        return this.stack.hashCode();
    }

    public java.lang.String indentedToString(boolean z) {
        java.lang.String id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = this.stack.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            com.google.android.wizardmanager.WizardAction wizardAction = (com.google.android.wizardmanager.WizardAction) this.stack.get(size);
            if (z) {
                id = wizardAction.indentedToString();
            } else {
                id = wizardAction.getId();
                if (id != null) {
                    id = id.replace("android.resource://", "").replaceFirst("com.google.android.setupwizard/xml", "suw");
                }
            }
            sb.append(id);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public com.google.android.wizardmanager.WizardAction peek() {
        if (this.stack.isEmpty()) {
            throw new java.lang.IllegalStateException("Cannot get current action on empty stack");
        }
        java.util.List list = this.stack;
        return (com.google.android.wizardmanager.WizardAction) list.get(list.size() - 1);
    }

    public com.google.android.wizardmanager.WizardAction pop() {
        return (com.google.android.wizardmanager.WizardAction) this.stack.remove(this.stack.size() - 1);
    }

    public void push(com.google.android.wizardmanager.WizardAction wizardAction) {
        this.stack.add(wizardAction);
    }

    public void setTop(com.google.android.wizardmanager.WizardAction wizardAction) {
        if (this.stack.isEmpty()) {
            throw new java.lang.IllegalStateException("Cannot replace current action on empty stack");
        }
        java.util.List list = this.stack;
        list.set(list.size() - 1, wizardAction);
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt(SIZE_KEY, this.stack.size());
        for (int i = 0; i < this.stack.size(); i++) {
            defpackage.xfh.i(persistableBundle, java.lang.String.valueOf(i), (defpackage.xpa) this.stack.get(i));
        }
        return persistableBundle;
    }

    public java.lang.String toString() {
        return this.stack.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedList(this.stack);
    }

    public WizardStack() {
        this.stack = new java.util.ArrayList();
    }

    public WizardStack(com.google.android.wizardmanager.WizardStack wizardStack) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.stack = arrayList;
        arrayList.addAll(wizardStack.stack);
    }
}
