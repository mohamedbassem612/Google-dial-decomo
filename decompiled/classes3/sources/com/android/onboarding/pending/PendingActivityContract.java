package com.android.onboarding.pending;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.android.onboarding.contracts.annotations.InternalOnboardingApi
public final class PendingActivityContract implements com.android.onboarding.pending.PendingContract$ErasedActivity, android.os.Parcelable, defpackage.xpa {
    public static final defpackage.xkg CREATOR = new defpackage.xkg(0);
    public final com.android.onboarding.utils.persistable.PersistableIntent a;

    /* JADX INFO: compiled from: PG */
    public final class Resolved implements com.android.onboarding.pending.PendingContract$Activity, android.os.Parcelable, defpackage.xib {
        public static final defpackage.xkh CREATOR = new defpackage.xkh(0);
        public final com.android.onboarding.pending.PendingActivityContract a;

        public Resolved(com.android.onboarding.pending.PendingActivityContract pendingActivityContract) {
            this.a = pendingActivityContract;
        }

        @Override // com.android.onboarding.pending.PendingContract$Activity
        public final /* synthetic */ com.android.onboarding.pending.PendingContract$ErasedActivity a() {
            throw null;
        }

        @Override // defpackage.xhu
        public final defpackage.xhs asComponentRef() {
            throw null;
        }

        @Override // defpackage.xib
        public final defpackage.xhz asNodeRef() {
            return new defpackage.xia(this.a);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return this.a.describeContents();
        }

        public final boolean equals(java.lang.Object obj) {
            return this.a.equals(obj);
        }

        @Override // defpackage.xhu
        public final java.lang.String getNodeComponent() {
            return this.a.getNodeComponent();
        }

        @Override // defpackage.xib
        public final java.lang.String getNodeName() {
            return this.a.getNodeName();
        }

        @Override // defpackage.xhu
        public final java.lang.String getNodePackage() {
            return defpackage.xhp.e(this.a);
        }

        @Override // defpackage.xhu
        public final java.lang.String getSubcomponent() {
            throw null;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // defpackage.xib, defpackage.xhu
        public final java.lang.String identity() {
            return defpackage.xfc.b(this.a);
        }

        @Override // defpackage.xpa
        public final android.os.PersistableBundle toPersistableBundle() {
            return this.a.toPersistableBundle();
        }

        public final java.lang.String toString() {
            return this.a.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            aooh.f(parcel, "p0");
            this.a.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PendingActivityContract(android.content.Intent intent) {
        this(new com.android.onboarding.utils.persistable.PersistableIntent(intent));
        aooh.f(intent, "intent");
    }

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a.describeContents();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof com.android.onboarding.pending.PendingActivityContract) && aooh.n(this.a, ((com.android.onboarding.pending.PendingActivityContract) obj).a);
        }
        return true;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        java.lang.String string = this.a.b.getString("com.android.onboarding.pending.COMPONENT");
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        java.lang.String string = this.a.b.getString("com.android.onboarding.pending.NODE");
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfc.b(this);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = this.a.toPersistableBundle();
        persistableBundle.putString("com.android.onboarding.pending.TYPE", "ACTIVITY");
        return persistableBundle;
    }

    public final java.lang.String toString() {
        java.lang.String strB = defpackage.xfc.b(this);
        com.android.onboarding.utils.persistable.PersistableIntent persistableIntent = this.a;
        return "PendingContract.Activity(contract=" + strB + ",action=" + persistableIntent.a + ",package=" + persistableIntent.c + ",targetUserId=" + persistableIntent.b.getInt("com.android.onboarding.pending.TARGET_USER_ID", android.os.Process.myUid() / 100000) + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "p0");
        this.a.writeToParcel(parcel, i);
    }

    public PendingActivityContract(com.android.onboarding.utils.persistable.PersistableIntent persistableIntent) {
        this.a = persistableIntent;
    }

    @Override // com.android.onboarding.pending.PendingContract$Activity
    public final com.android.onboarding.pending.PendingContract$ErasedActivity a() {
        return this;
    }
}
