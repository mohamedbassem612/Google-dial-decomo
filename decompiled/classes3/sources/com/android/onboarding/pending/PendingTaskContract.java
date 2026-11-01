package com.android.onboarding.pending;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.android.onboarding.contracts.annotations.InternalOnboardingApi
public final class PendingTaskContract implements com.android.onboarding.pending.PendingContract$ErasedTask, android.os.Parcelable {
    public static final defpackage.xkk CREATOR = new defpackage.xkk(0);
    public final android.os.PersistableBundle e;

    /* JADX INFO: compiled from: PG */
    public final class Resolved implements com.android.onboarding.pending.PendingContract$Task, android.os.Parcelable, defpackage.xkd, defpackage.xhg {
        public static final defpackage.xkl CREATOR = new defpackage.xkl(0);
        public final com.android.onboarding.pending.PendingTaskContract d;
        private final defpackage.xhg e;

        public Resolved(com.android.onboarding.pending.PendingTaskContract pendingTaskContract, defpackage.xhg xhgVar) {
            this.d = pendingTaskContract;
            this.e = xhgVar;
        }

        @Override // defpackage.xhu
        public final defpackage.xhs asComponentRef() {
            throw null;
        }

        @Override // defpackage.xib
        public final defpackage.xhz asNodeRef() {
            return new defpackage.xia(this.d);
        }

        @Override // defpackage.xkd
        public final j$.time.Duration b() {
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return this.d.describeContents();
        }

        public final boolean equals(java.lang.Object obj) {
            return this.d.equals(obj);
        }

        @Override // defpackage.xhu
        public final java.lang.String getNodeComponent() {
            return this.d.getNodeComponent();
        }

        @Override // defpackage.xib
        public final java.lang.String getNodeName() {
            return this.d.getNodeName();
        }

        @Override // defpackage.xhu
        public final java.lang.String getNodePackage() {
            return defpackage.xhp.e(this.d);
        }

        @Override // defpackage.xhi
        public final defpackage.xhf getResultDecoder() {
            return this.e.getResultDecoder();
        }

        @Override // defpackage.xhj
        public final defpackage.xhf getResultEncoder() {
            throw null;
        }

        @Override // defpackage.xhu
        public final java.lang.String getSubcomponent() {
            throw null;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // defpackage.xib, defpackage.xhu
        public final java.lang.String identity() {
            return defpackage.xfc.b(this.d);
        }

        @Override // defpackage.xpa
        public final android.os.PersistableBundle toPersistableBundle() {
            return this.d.toPersistableBundle();
        }

        public final java.lang.String toString() {
            return this.d.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            aooh.f(parcel, "p0");
            this.d.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PendingTaskContract(android.os.PersistableBundle persistableBundle, defpackage.xib xibVar, com.android.onboarding.utils.persistable.PersistableIntent persistableIntent, int i, java.lang.String str, j$.time.Duration duration) {
        this(persistableBundle);
        aooh.f(persistableIntent, "taskServiceIntent");
        aooh.f(str, "targetPackageName");
        java.lang.String nodeComponent = xibVar.getNodeComponent();
        aooh.f(nodeComponent, "value");
        this.e.putString("com.android.onboarding.pending.COMPONENT", nodeComponent);
        java.lang.String nodeName = xibVar.getNodeName();
        aooh.f(nodeName, "value");
        this.e.putString("com.android.onboarding.pending.NODE", nodeName);
        this.e.putLong("com.android.onboarding.pending.CREATOR_ID", -1L);
        aooh.f(persistableIntent, "value");
        defpackage.xfh.i(this.e, "com.android.onboarding.pending.SERVICE_INTENT", persistableIntent);
        this.e.putInt("com.android.onboarding.pending.TARGET_USER_ID", i);
        aooh.f(str, "value");
        this.e.putString("com.android.onboarding.pending.TARGET_PACKAGE_NAME", str);
        if (duration != null) {
            this.e.putLong("com.android.onboarding.pending.TIMEOUT_IN_SECONDS", duration.getSeconds());
        }
    }

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // defpackage.xkd
    public final j$.time.Duration b() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.e.describeContents();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.android.onboarding.pending.PendingTaskContract) && defpackage.xff.l(this.e, ((com.android.onboarding.pending.PendingTaskContract) obj).e);
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        java.lang.String string = this.e.getString("com.android.onboarding.pending.COMPONENT");
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        java.lang.String string = this.e.getString("com.android.onboarding.pending.NODE");
        if (string != null) {
            return string;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhi
    public final defpackage.xhf getResultDecoder() {
        return new defpackage.xmc(1);
    }

    @Override // defpackage.xhj
    public final defpackage.xhf getResultEncoder() {
        throw null;
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        return defpackage.xff.m(this.e);
    }

    @Override // defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfc.b(this);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        return new android.os.PersistableBundle(this.e);
    }

    public final java.lang.String toString() {
        android.os.PersistableBundle persistableBundle = this.e;
        java.lang.String strB = defpackage.xfc.b(this);
        java.lang.String string = persistableBundle.getString("com.android.onboarding.pending.TARGET_PACKAGE_NAME");
        if (string == null) {
            string = defpackage.xhp.e(this);
        }
        int i = persistableBundle.getInt("com.android.onboarding.pending.TARGET_USER_ID", android.os.Process.myUid() / 100000);
        java.lang.Long lO = defpackage.xfh.o(persistableBundle, "com.android.onboarding.pending.TIMEOUT_IN_SECONDS");
        return "PendingContract.Task(contract=" + strB + ",package=" + string + ",targetUserId=" + i + ",timeout=" + (lO != null ? j$.time.Duration.ofSeconds(lO.longValue()) : null) + ",)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "p0");
        this.e.writeToParcel(parcel, i);
    }

    public PendingTaskContract(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "bundle");
        this.e = persistableBundle;
        persistableBundle.putString("com.android.onboarding.pending.TYPE", "TASK");
    }
}
